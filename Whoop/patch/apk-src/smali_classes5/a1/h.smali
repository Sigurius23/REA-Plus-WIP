.class public final La1/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La1/k;Lb1/g;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La1/h;->w:I

    .line 1
    iput-object p1, p0, La1/h;->E:Ljava/lang/Object;

    iput-object p2, p0, La1/h;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lec3/l;Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, La1/h;->w:I

    .line 2
    iput-object p1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, La1/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lf53/k;Lb3/z0;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, La1/h;->w:I

    .line 3
    iput-object p1, p0, La1/h;->z:Ljava/lang/Object;

    iput-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, La1/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lg1/n5;Lf0/z0;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, La1/h;->w:I

    .line 4
    iput-object p1, p0, La1/h;->z:Ljava/lang/Object;

    iput-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, La1/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 5
    iput p5, p0, La1/h;->w:I

    iput-object p1, p0, La1/h;->z:Ljava/lang/Object;

    iput-object p2, p0, La1/h;->y:Ljava/lang/Object;

    iput-object p3, p0, La1/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 6
    iput p4, p0, La1/h;->w:I

    iput-object p1, p0, La1/h;->y:Ljava/lang/Object;

    iput-object p2, p0, La1/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lrg/h;Lq83/d;Lvg/n;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, La1/h;->w:I

    .line 7
    iput-object p1, p0, La1/h;->y:Ljava/lang/Object;

    iput-object p3, p0, La1/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lmc3/i;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    iget-object v2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v2, Lfc3/w;

    iput v3, p0, La1/h;->x:I

    invoke-interface {p1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lmc3/h;->d()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_1
    invoke-virtual {v0}, Lmc3/h;->d()V

    throw p1
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

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

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast p1, Lg1/k3;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v3, Lg1/a0;

    iget-object v3, v3, Lg1/a0;->o:Lg1/w;

    iput v2, p0, La1/h;->x:I

    invoke-interface {v1, v3, p1, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

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

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast p1, Ll83/k;

    iget-object v1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lg1/k3;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Lc93/n;

    iget-object v4, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v4, Lg1/a0;

    iget-object v4, v4, Lg1/a0;->o:Lg1/w;

    iput v2, p0, La1/h;->x:I

    invoke-interface {v3, v4, v1, p1, p0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Lj0/i;

    check-cast v3, Lj0/j;

    iget-object v3, v3, Lj0/j;->a:Lec3/w1;

    new-instance v4, Lec3/f1;

    iget-object v5, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v5, Lg1/z2;

    const/4 v6, 0x2

    invoke-direct {v4, v1, p1, v5, v6}, Lec3/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v2, p0, La1/h;->x:I

    invoke-virtual {v3, v4, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    iget v0, p0, La1/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, La1/h;

    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v0, Lg1/n5;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Lf0/z0;

    iget-object v2, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    invoke-direct {p1, v0, v1, v2, p2}, La1/h;-><init>(Lg1/n5;Lf0/z0;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance v0, La1/h;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    iget-object v2, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v2, Lg1/z2;

    const/16 v3, 0x1c

    invoke-direct {v0, v1, v2, p2, v3}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La1/h;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, La1/h;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Lc93/n;

    iget-object v2, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v2, Lg1/a0;

    const/16 v3, 0x1b

    invoke-direct {v0, v1, v2, p2, v3}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La1/h;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance v0, La1/h;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v2, Lg1/a0;

    const/16 v3, 0x1a

    invoke-direct {v0, v1, v2, p2, v3}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La1/h;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_3
    new-instance v4, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lec3/l;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lfc3/w;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lmc3/i;

    const/16 v9, 0x19

    move-object v8, p2

    invoke-direct/range {v4 .. v9}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v4

    :pswitch_4
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->z:Ljava/lang/Object;

    check-cast p2, Lf53/k;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lb3/z0;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p1, p2, v0, v1, v9}, La1/h;-><init>(Lf53/k;Lb3/z0;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_5
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lf53/j;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    const/16 v2, 0x17

    invoke-direct {p2, v0, v1, v9, v2}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_6
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Ld0/e;

    const/16 v2, 0x16

    invoke-direct {p2, v0, v1, v9, v2}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_7
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lj0/i;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lj0/h;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lbc3/s0;

    const/16 v10, 0x15

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_8
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lj0/i;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lj0/l;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lf0/w;

    const/16 v10, 0x14

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_9
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/t;

    const/16 v2, 0x13

    invoke-direct {p2, v0, v1, v9, v2}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_a
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p2, v0, v1, v9}, La1/h;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_b
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Le10/i0;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Le10/l;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Le10/k;

    const/16 v10, 0x11

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_c
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Le00/w;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    const/16 v10, 0x10

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_d
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/x;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    const/16 v2, 0xf

    invoke-direct {p2, v0, v1, v9, v2}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_e
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ld33/h1;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lc43/v;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lio/getstream/video/android/core/model/IceCandidate;

    const/16 v10, 0xe

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_f
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ld33/h1;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    const/16 v10, 0xd

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_10
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Lio/getstream/android/video/generated/models/VideoEvent;

    const/16 v2, 0xc

    invoke-direct {p2, v0, v1, v9, v2}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_11
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lt23/c0;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lstream/video/sfu/models/Error;

    const/16 v10, 0xb

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_12
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ln53/e;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Le30/c;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ld30/u;

    const/16 v10, 0xa

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_13
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p2, Lq30/a0;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Ld20/c;

    const/16 v1, 0x9

    invoke-direct {p1, p2, v0, v9, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lrg/h;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Lvg/n;

    invoke-direct {p2, v0, v9, v1}, La1/h;-><init>(Lrg/h;Lq83/d;Lvg/n;)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_15
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/String;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Landroidx/room/c0;

    const/4 v1, 0x7

    invoke-direct {p1, p2, v0, v9, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/Long;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Le63/d;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lbc3/k1;

    const/4 v10, 0x6

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_17
    move-object v9, p2

    new-instance p2, La1/h;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    const/4 v1, 0x5

    iget-object v2, p0, La1/h;->y:Ljava/lang/Object;

    invoke-direct {p2, v2, v0, v9, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La1/h;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_18
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p2, La43/f;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    const/4 v1, 0x4

    invoke-direct {p1, p2, v0, v9, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p2, La20/j;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x3

    invoke-direct {p1, p2, v0, v9, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast p2, La20/j;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const/4 v1, 0x2

    invoke-direct {p1, p2, v0, v9, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    move-object v9, p2

    new-instance p1, La1/h;

    iget-object p2, p0, La1/h;->E:Ljava/lang/Object;

    check-cast p2, La1/k;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lb1/g;

    invoke-direct {p1, p2, v0, v9}, La1/h;-><init>(La1/k;Lb1/g;Lq83/d;)V

    return-object p1

    :pswitch_1c
    move-object v9, p2

    new-instance v5, La1/h;

    iget-object p1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, La1/i;

    iget-object p1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lb1/g;

    iget-object p1, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, La1/g;

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

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

    iget v0, p0, La1/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ll83/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lg1/k3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lio/ktor/utils/io/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La1/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La1/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 15

    iget v0, p0, La1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v0, Lg1/n5;

    iget-object v1, v0, Lg1/n5;->b:Lp1/k1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La1/h;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v7, v0, Lg1/n5;->d:Lf0/c1;

    iget-object v9, v0, Lg1/n5;->c:Lg1/y;

    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lf0/z0;

    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ls83/i;

    iput v4, p0, La1/h;->x:I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lf0/b1;

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Lf0/b1;-><init>(Lf0/z0;Lf0/c1;Lc93/m;Ljava/lang/Object;Lq83/d;)V

    invoke-static {v5, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v2

    :pswitch_0
    invoke-direct/range {p0 .. p1}, La1/h;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p1}, La1/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct/range {p0 .. p1}, La1/h;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct/range {p0 .. p1}, La1/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v0, Lf53/k;

    iget-object v0, v0, Lf53/k;->i:Lf53/j;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_7

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_4

    if-ne v2, v4, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    move-object v1, v3

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v6, p0, La1/h;->x:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lf53/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v2, v0, v7, v6}, Lf53/a;-><init>(Lf53/j;Lq83/d;I)V

    const-wide/16 v6, 0x2710

    invoke-static {v6, v7, v2, p0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_3

    :cond_8
    move-object v2, v3

    :goto_3
    if-ne v2, v1, :cond_9

    goto :goto_6

    :cond_9
    :goto_4
    iget-object v0, v0, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v0

    iget-object v0, v0, Ly43/b;->d:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg53/m;

    instance-of v2, v0, Lg53/c;

    if-eqz v2, :cond_a

    check-cast v0, Lg53/c;

    iget-object v0, v0, Lg53/c;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ConnectedEvent;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    iput v5, p0, La1/h;->x:I

    invoke-interface {v2, v0, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    goto :goto_6

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "This state doesn\'t contain connectionId"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    iget-object v2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v2, Lb3/z0;

    iput v4, p0, La1/h;->x:I

    invoke-virtual {v2, v0, p0}, Lb3/z0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v3, v1, :cond_5

    :goto_6
    return-object v1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_c

    if-ne v1, v2, :cond_b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_7

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lbc3/c0;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lf53/j;

    iget-object v1, v4, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    new-instance v3, Lb2/y;

    iget-object v6, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/g0;

    const/4 v7, 0x0

    const/4 v8, 0x6

    invoke-direct/range {v3 .. v8}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, La1/h;->x:I

    invoke-virtual {v1, v3, p0}, Lio/sentry/internal/debugmeta/c;->A(Lb2/y;Ls83/c;)V

    :goto_7
    return-object v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    if-ne v1, v2, :cond_d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Lp1/t2;

    new-instance v4, Lt;

    const/4 v5, 0x3

    invoke-direct {v4, v3, v5}, Lt;-><init>(Lp1/t2;I)V

    invoke-static {v4}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v3

    new-instance v4, Landroidx/room/x;

    iget-object v5, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v5, Ld0/e;

    const/4 v6, 0x5

    invoke-direct {v4, v6, v5, v1}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, La1/h;->x:I

    invoke-virtual {v3, v4, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_11

    if-ne v1, v2, :cond_10

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Lj0/h;

    iput v2, p0, La1/h;->x:I

    check-cast v1, Lj0/j;

    invoke-virtual {v1, v3, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_12

    goto :goto_b

    :cond_12
    :goto_a
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/s0;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Lbc3/s0;->dispose()V

    :cond_13
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v0

    :pswitch_8
    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lj0/l;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_16

    if-eq v2, v4, :cond_15

    if-ne v2, v3, :cond_14

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_16
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-wide v5, Lf0/x;->a:J

    iput v4, p0, La1/h;->x:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_17

    goto :goto_e

    :cond_17
    :goto_c
    iget-object v2, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v2, Lj0/i;

    iput v3, p0, La1/h;->x:I

    check-cast v2, Lj0/j;

    invoke-virtual {v2, v0, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_18

    goto :goto_e

    :cond_18
    :goto_d
    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Lf0/w;

    iput-object v0, v1, Lf0/h;->b0:Lj0/l;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_e
    return-object v1

    :pswitch_9
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/t;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1a

    if-ne v2, v3, :cond_19

    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_f

    :catchall_1
    move-exception v0

    goto :goto_11

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    :try_start_3
    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v5, Lec3/l;

    new-instance v6, Lec3/f1;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v2, v1, v7}, Lec3/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v4, p0, La1/h;->z:Ljava/lang/Object;

    iput v3, p0, La1/h;->x:I

    invoke-interface {v5, v6, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1b

    goto :goto_10

    :cond_1b
    move-object v0, v4

    :goto_f
    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v0, :cond_1c

    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Flow is empty"

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    new-instance v2, Ll83/n;

    invoke-direct {v2, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_10
    return-object v0

    :goto_11
    invoke-virtual {v1, v0}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    throw v0

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1e

    if-ne v1, v2, :cond_1d

    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lec3/s0;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_13

    :catch_0
    move-exception v0

    goto :goto_12

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Lec3/l;

    iget-object v4, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v4, Ls83/i;

    new-instance v5, Lec3/s0;

    invoke-direct {v5, v4, v1}, Lec3/s0;-><init>(Lkotlin/jvm/functions/Function3;Lec3/m;)V

    :try_start_5
    iput-object v5, p0, La1/h;->z:Ljava/lang/Object;

    iput v2, p0, La1/h;->x:I

    invoke-interface {v3, v5, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_5 .. :try_end_5} :catch_1

    if-ne v1, v0, :cond_1f

    goto :goto_14

    :catch_1
    move-exception v0

    move-object v1, v5

    :goto_12
    iget-object v2, v0, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v2, v1, :cond_20

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    :cond_1f
    :goto_13
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_14
    return-object v0

    :cond_20
    throw v0

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_22

    if-ne v1, v2, :cond_21

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_15

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Le10/i0;

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Le10/l;

    iget-object v4, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v4, Le10/k;

    iput v2, p0, La1/h;->x:I

    invoke-virtual {v1, v3, v4, p0}, Le10/i0;->a(Le10/l;Le10/k;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_23

    goto :goto_15

    :cond_23
    move-object v0, v1

    :goto_15
    return-object v0

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_25

    if-ne v1, v2, :cond_24

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_16

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Le00/w;

    iget-object v3, v1, Le00/w;->d:Lb10/c1;

    iget-object v4, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1}, Le00/w;->b()Lyy/f;

    move-result-object v1

    iput v2, p0, La1/h;->x:I

    check-cast v3, Lb10/z0;

    invoke-virtual {v3, v4, v1, p0}, Lb10/z0;->F(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_26

    goto :goto_17

    :cond_26
    move-object v0, v1

    :goto_16
    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_17
    return-object v0

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_28

    if-ne v1, v3, :cond_27

    :try_start_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_18

    :catchall_2
    move-exception v0

    goto :goto_19

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Ldc3/x;

    iget-object v4, p0, La1/h;->E:Ljava/lang/Object;

    :try_start_7
    iput v3, p0, La1/h;->x:I

    invoke-interface {v1, v4, p0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-ne v1, v0, :cond_29

    goto :goto_1c

    :cond_29
    :goto_18
    move-object v0, v2

    goto :goto_1a

    :goto_19
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1a
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_2a

    goto :goto_1b

    :cond_2a
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    new-instance v2, Ldc3/m;

    invoke-direct {v2, v0}, Ldc3/m;-><init>(Ljava/lang/Throwable;)V

    :goto_1b
    new-instance v0, Ldc3/o;

    invoke-direct {v0, v2}, Ldc3/o;-><init>(Ljava/lang/Object;)V

    :goto_1c
    return-object v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2c

    if-ne v1, v2, :cond_2b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1d

    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ld33/h1;

    iget-object v1, v4, Ld33/h1;->l:Ln53/x1;

    new-instance v3, La00/f;

    iget-object v5, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v5, Lc43/v;

    iget-object v6, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v6, Lio/getstream/video/android/core/model/IceCandidate;

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v3 .. v8}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, La1/h;->x:I

    const-string v2, "sendIceCandidate"

    invoke-virtual {v1, v2, v3, p0}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2d

    goto :goto_1e

    :cond_2d
    :goto_1d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1e
    return-object v0

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2f

    if-ne v1, v2, :cond_2e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_2e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    iget-object v1, v1, Ld33/h1;->b:Lt23/c0;

    iget-object v3, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v3, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v4, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iput v2, p0, La1/h;->x:I

    invoke-virtual {v1, v3, v4, p0}, Lt23/c0;->s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_30

    goto :goto_20

    :cond_30
    :goto_1f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_20
    return-object v0

    :pswitch_10
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/models/VideoEvent;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La1/h;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_32

    if-ne v3, v4, :cond_31

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_21

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iget-object v5, v1, Ld33/h1;->l:Ln53/x1;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/VideoEvent;->getEventType()Ljava/lang/String;

    move-result-object v6

    const-string v7, "handleSfuDataEvent: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ld33/f0;

    const/4 v8, 0x0

    invoke-direct {v7, v0, v1, v3, v8}, Ld33/f0;-><init>(Lio/getstream/android/video/generated/models/VideoEvent;Ld33/h1;Lbc3/c0;Lq83/d;)V

    iput v4, p0, La1/h;->x:I

    invoke-virtual {v5, v6, v7, p0}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_33

    goto :goto_22

    :cond_33
    :goto_21
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_22
    return-object v2

    :pswitch_11
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lstream/video/sfu/models/Error;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_35

    if-ne v2, v3, :cond_34

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v2, Lt23/c0;

    iget-object v4, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SfuApiError:"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput v3, p0, La1/h;->x:I

    invoke-virtual {v2, v4, v0, p0}, Lt23/c0;->s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_36

    goto :goto_24

    :cond_36
    :goto_23
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_24
    return-object v1

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_38

    if-ne v1, v2, :cond_37

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_25

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Ln53/e;

    new-instance v3, Landroidx/room/x;

    iget-object v4, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v4, Le30/c;

    iget-object v5, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v5, Ld30/u;

    const/4 v6, 0x1

    invoke-direct {v3, v6, v4, v5}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, La1/h;->x:I

    new-instance v2, Lw;

    const/4 v4, 0x4

    invoke-direct {v2, v3, v4}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v2, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_25
    return-object v0

    :pswitch_13
    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lq30/a0;

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Ld20/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La1/h;->x:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v3, :cond_3a

    if-ne v3, v6, :cond_39

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Lyy/f;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v1

    move-object/from16 v1, p1

    goto/16 :goto_28

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v0, Lq30/y;

    if-eqz v3, :cond_3b

    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->j0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-object v9, v0

    check-cast v9, Lq30/y;

    iget-object v9, v9, Lq30/y;->w:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Lb10/b;->b(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    goto/16 :goto_26

    :cond_3b
    instance-of v3, v0, Lq30/v;

    if-eqz v3, :cond_3c

    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->j0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-object v9, v0

    check-cast v9, Lq30/v;

    iget-object v9, v9, Lq30/v;->w:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Lb10/b;->b(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    goto :goto_26

    :cond_3c
    instance-of v3, v0, Lq30/u;

    if-eqz v3, :cond_3d

    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->i0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-object v9, v0

    check-cast v9, Lq30/u;

    iget-object v9, v9, Lq30/u;->w:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Lb10/b;->b(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    goto :goto_26

    :cond_3d
    instance-of v3, v0, Lq30/w;

    if-eqz v3, :cond_3e

    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->k0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v12, 0x0

    const/16 v13, 0x3e

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    goto :goto_26

    :cond_3e
    instance-of v3, v0, Lq30/x;

    if-eqz v3, :cond_3f

    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->k0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v12, 0x0

    const/16 v13, 0x3e

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    goto :goto_26

    :cond_3f
    instance-of v3, v0, Lq30/z;

    if-eqz v3, :cond_4a

    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->l0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-object v9, v0

    check-cast v9, Lq30/z;

    iget-object v9, v9, Lq30/z;->w:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Lb10/b;->b(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    :goto_26
    iget-object v3, v1, Ld20/c;->b:Lyy/j;

    iget-object v7, v1, Ld20/c;->c:Lb10/b;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->h0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v0}, Lq30/a0;->b()Lr30/j;

    move-result-object v9

    if-eqz v9, :cond_40

    iget-object v9, v9, Lr30/j;->w:Ljava/lang/String;

    goto :goto_27

    :cond_40
    const/4 v9, 0x0

    :goto_27
    if-nez v9, :cond_41

    const-string v9, ""

    :cond_41
    invoke-virtual {v7, v8, v9}, Lb10/b;->b(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lyy/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lyy/j;->a(Lyy/b;)V

    new-instance v3, Lyy/f;

    invoke-virtual {v0}, Lq30/a0;->f()Lq30/n0;

    move-result-object v7

    iget-object v7, v7, Lq30/n0;->y:Ljava/lang/String;

    invoke-virtual {v0}, Lq30/a0;->f()Lq30/n0;

    move-result-object v8

    iget-object v8, v8, Lq30/n0;->z:Ljava/lang/String;

    invoke-direct {v3, v7, v8, v4}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v3, p0, La1/h;->z:Ljava/lang/Object;

    iput v6, p0, La1/h;->x:I

    invoke-virtual {v1, v0, v3, v5, p0}, Ld20/c;->a(Lq30/a0;Lyy/f;ILs83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_42

    goto :goto_2b

    :cond_42
    :goto_28
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_44

    instance-of v1, v0, Lq30/y;

    if-eqz v1, :cond_43

    move v4, v6

    goto :goto_2a

    :cond_43
    instance-of v1, v0, Lq30/v;

    if-eqz v1, :cond_45

    :cond_44
    :goto_29
    move v4, v2

    goto :goto_2a

    :cond_45
    instance-of v1, v0, Lq30/u;

    if-eqz v1, :cond_46

    move v4, v5

    goto :goto_2a

    :cond_46
    instance-of v1, v0, Lq30/w;

    if-eqz v1, :cond_47

    goto :goto_29

    :cond_47
    instance-of v1, v0, Lq30/x;

    if-eqz v1, :cond_48

    goto :goto_29

    :cond_48
    instance-of v1, v0, Lq30/z;

    if-eqz v1, :cond_49

    goto :goto_2a

    :cond_49
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_2a
    invoke-virtual {v0}, Lq30/a0;->f()Lq30/n0;

    move-result-object v0

    iget-object v2, v0, Lq30/n0;->w:Ljava/lang/String;

    iget-object v7, v3, Lyy/f;->x:Ljava/lang/String;

    new-instance v1, Lv10/b;

    const/4 v6, 0x0

    const/16 v8, 0x3c

    move v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    move-object v2, v1

    :goto_2b
    return-object v2

    :cond_4a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_14
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lvg/n;

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La1/h;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_4c

    if-ne v3, v4, :cond_4b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2c

    :cond_4b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v3, "platform"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lce/h;

    sget-object v5, Lyd/f;->i:Ljf/a;

    invoke-static {v5, v0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_4d

    const-string v5, "default"

    :cond_4d
    sget-object v6, Lce/v;->z:Lce/v;

    invoke-virtual {v6, v0}, Lce/v;->a(Lvg/n;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lx30/s0;->z(Ljava/lang/String;Lvg/n;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lce/v;->E:Lce/v;

    invoke-virtual {v7, v0}, Lce/v;->a(Lvg/n;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lx30/s0;->z(Ljava/lang/String;Lvg/n;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v5, v6, v7}, Lce/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    const-string v5, "AwsConfigParser"

    invoke-static {v1, v5}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v1

    sget-object v5, Lzf/i;->a:Lkc3/d;

    new-instance v6, Lce/b;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v0, v3, v7}, Lce/b;-><init>(Lgm/r;Lvg/n;Lce/h;Lq83/d;)V

    iput-object v7, p0, La1/h;->z:Ljava/lang/Object;

    iput v4, p0, La1/h;->x:I

    invoke-static {v5, v6, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_4e

    move-object v0, v2

    :cond_4e
    :goto_2c
    return-object v0

    :pswitch_15
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Landroidx/room/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_50

    if-ne v2, v3, :cond_4f

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    check-cast v1, Ljava/util/Set;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_4f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_50
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    array-length v4, v2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v4, "elements"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    iget-object v4, v0, Landroidx/room/c0;->h:Lec3/w1;

    move-object v5, v2

    check-cast v5, Ljava/util/Set;

    iput-object v5, p0, La1/h;->z:Ljava/lang/Object;

    iput v3, p0, La1/h;->x:I

    invoke-virtual {v4, v2, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_51

    goto/16 :goto_32

    :cond_51
    move-object v1, v2

    :goto_2d
    iget-object v0, v0, Landroidx/room/c0;->b:Landroidx/room/v;

    const-string v2, "tables"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Landroidx/room/v;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_8
    iget-object v0, v0, Landroidx/room/v;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_52
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/room/i0;

    iget-object v4, v2, Landroidx/room/i0;->a:Landroidx/room/s;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v4, v4, Landroidx/room/a0;

    if-nez v4, :cond_52

    iget-object v4, v2, Landroidx/room/i0;->c:[Ljava/lang/String;

    array-length v5, v4

    sget-object v6, Lm83/a0;->w:Lm83/a0;

    if-eqz v5, :cond_59

    const/4 v7, 0x0

    if-eq v5, v3, :cond_56

    new-instance v5, Ln83/i;

    invoke-direct {v5}, Ln83/i;-><init>()V

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_53
    :goto_2f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_55

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    array-length v9, v4

    move v10, v7

    :goto_30
    if-ge v10, v9, :cond_53

    aget-object v11, v4, v10

    invoke-static {v11, v8, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_54

    invoke-virtual {v5, v11}, Ln83/i;->add(Ljava/lang/Object;)Z

    goto :goto_2f

    :cond_54
    add-int/lit8 v10, v10, 0x1

    goto :goto_30

    :cond_55
    invoke-static {v5}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v6

    goto :goto_31

    :cond_56
    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    instance-of v8, v5, Ljava/util/Collection;

    if-eqz v8, :cond_57

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_57

    goto :goto_31

    :cond_57
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_58
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_59

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    aget-object v9, v4, v7

    invoke-static {v8, v9, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_58

    iget-object v6, v2, Landroidx/room/i0;->d:Ljava/util/Set;

    :cond_59
    :goto_31
    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_52

    iget-object v2, v2, Landroidx/room/i0;->a:Landroidx/room/s;

    invoke-virtual {v2, v6}, Landroidx/room/s;->a(Ljava/util/Set;)V

    goto/16 :goto_2e

    :cond_5a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_32
    return-object v1

    :catchall_3
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :pswitch_16
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_5c

    if-ne v1, v2, :cond_5b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_33

    :cond_5b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput v2, p0, La1/h;->x:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5d

    goto :goto_35

    :cond_5d
    :goto_33
    new-instance v0, Lio/ktor/client/plugins/HttpRequestTimeoutException;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Le63/d;

    const-string v2, "request"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Le63/d;->a:Li63/z;

    invoke-virtual {v2}, Li63/z;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v3, La63/h0;->d:La63/g0;

    iget-object v1, v1, Le63/d;->f:Lo63/f;

    sget-object v4, Ly53/e;->a:Lo63/a;

    invoke-virtual {v1, v4}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const/4 v4, 0x0

    if-eqz v1, :cond_5e

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_34

    :cond_5e
    move-object v1, v4

    :goto_34
    check-cast v1, La63/f0;

    if-eqz v1, :cond_5f

    iget-object v4, v1, La63/f0;->a:Ljava/lang/Long;

    :cond_5f
    const-string v1, "Request timeout has expired [url="

    const-string v3, ", request_timeout="

    invoke-static {v1, v2, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_60

    const-string v4, "unknown"

    :cond_60
    const-string v2, " ms]"

    invoke-static {v1, v2, v4}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-interface {v1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_35
    return-object v0

    :pswitch_17
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf63/c;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_62

    if-ne v2, v3, :cond_61

    :try_start_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_36

    :catchall_4
    move-exception v0

    goto :goto_38

    :catch_2
    move-exception v0

    goto :goto_39

    :cond_61
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/u;

    :try_start_a
    iget-object v4, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/q;

    iget-object v2, v2, Lio/ktor/utils/io/u;->w:Lio/ktor/utils/io/m;

    iput v3, p0, La1/h;->x:I

    invoke-static {v4, v2, p0}, Lse/a;->w(Lio/ktor/utils/io/q;Lio/ktor/utils/io/m;La1/h;)Ljava/lang/Object;

    move-result-object v2
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    if-ne v2, v0, :cond_63

    goto :goto_37

    :cond_63
    :goto_36
    invoke-static {v1}, Lj93/l0;->q(Lf63/c;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_37
    return-object v0

    :goto_38
    :try_start_b
    const-string v2, "Receive failed"

    invoke-static {v2, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v2

    invoke-static {v1, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    throw v0

    :catchall_5
    move-exception v0

    goto :goto_3a

    :goto_39
    invoke-static {v1, v0}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :goto_3a
    invoke-static {v1}, Lj93/l0;->q(Lf63/c;)V

    throw v0

    :pswitch_18
    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, La43/f;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La1/h;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_65

    if-ne v2, v3, :cond_64

    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3b

    :cond_64
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_65
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La43/f;->y:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v4, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v4, Landroidx/lifecycle/g0;

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_66

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "[onStop] owner: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v2, v7, v6, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_66
    iget-object v0, v0, La43/f;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_67
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_68

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La43/b;

    iput-object v0, p0, La1/h;->z:Ljava/lang/Object;

    iput v3, p0, La1/h;->x:I

    invoke-interface {v2, p0}, La43/b;->a(La1/h;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_67

    goto :goto_3c

    :cond_68
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3c
    return-object v1

    :pswitch_19
    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, La20/j;

    iget-object v1, v0, La20/j;->w:Lz10/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La1/h;->x:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_6c

    if-eq v3, v6, :cond_6b

    if-eq v3, v5, :cond_6a

    if-ne v3, v4, :cond_69

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_69
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6a
    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_6b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3d

    :cond_6c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lz10/e;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6d

    const/4 v1, 0x0

    goto :goto_3d

    :cond_6d
    iget-object v7, v0, La20/j;->E:Ly10/h;

    invoke-virtual {v1}, Lz10/e;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lz10/e;->k()Ljava/lang/String;

    move-result-object v1

    iput v6, p0, La1/h;->x:I

    invoke-virtual {v7, v8, v1, v3, p0}, Ly10/h;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6e

    goto :goto_40

    :cond_6e
    :goto_3d
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_6f

    iput-object v1, p0, La1/h;->z:Ljava/lang/Object;

    iput v5, p0, La1/h;->x:I

    invoke-virtual {v0, v3, p0}, La20/j;->j(Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6f

    goto :goto_40

    :cond_6f
    :goto_3e
    iget-object v3, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    instance-of v5, v1, Ll83/m;

    if-nez v5, :cond_70

    move-object v5, v1

    check-cast v5, Ly00/c8;

    invoke-interface {v3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz10/n;

    new-instance v5, Lz10/p;

    invoke-direct {v5, v3}, Lz10/p;-><init>(Lz10/n;)V

    iput-object v1, p0, La1/h;->z:Ljava/lang/Object;

    iput v4, p0, La1/h;->x:I

    invoke-virtual {v0, v5, p0}, La20/j;->l(Lz10/r;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_70

    goto :goto_40

    :cond_70
    :goto_3f
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_40
    return-object v2

    :pswitch_1a
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, La20/j;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La1/h;->x:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_74

    if-eq v3, v7, :cond_73

    if-eq v3, v6, :cond_73

    if-eq v3, v5, :cond_72

    if-ne v3, v4, :cond_71

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_45

    :cond_71
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_72
    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_44

    :cond_73
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    check-cast v3, Ll83/n;

    iget-object v3, v3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_41

    :cond_74
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La20/j;->w:Lz10/e;

    instance-of v8, v3, Lz10/a;

    if-nez v8, :cond_7b

    instance-of v8, v3, Lz10/b;

    if-nez v8, :cond_7b

    instance-of v8, v3, Lz10/c;

    if-eqz v8, :cond_75

    iget-object v9, v1, La20/j;->z:Ly10/c;

    check-cast v3, Lz10/c;

    iget-object v10, v3, Lz10/c;->y:Ljava/lang/String;

    iget-object v13, v3, Lz10/c;->z:Ljava/lang/String;

    iget-object v12, v3, Lz10/c;->E:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v11

    iput v7, p0, La1/h;->x:I

    move-object v14, p0

    invoke-virtual/range {v9 .. v14}, Ly10/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_76

    goto/16 :goto_46

    :cond_75
    instance-of v7, v3, Lz10/d;

    if-eqz v7, :cond_7a

    iget-object v7, v1, La20/j;->z:Ly10/c;

    check-cast v3, Lz10/d;

    move-object v8, v7

    iget-object v7, v3, Lz10/d;->y:Ljava/lang/String;

    iget-object v10, v3, Lz10/d;->z:Ljava/lang/String;

    iget-object v9, v3, Lz10/d;->E:Ljava/lang/String;

    move-object v3, v8

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v8

    iput v6, p0, La1/h;->x:I

    move-object v11, p0

    move-object v6, v3

    invoke-virtual/range {v6 .. v11}, Ly10/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_76

    goto :goto_46

    :cond_76
    :goto_41
    instance-of v6, v3, Ll83/m;

    if-nez v6, :cond_77

    :try_start_c
    check-cast v3, Ly00/c8;

    new-instance v6, Lz10/p;

    new-instance v7, Lz10/n;

    new-instance v8, Lz10/m;

    invoke-direct {v8, v0}, Lz10/m;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    const/4 v0, 0x0

    invoke-direct {v7, v3, v8, v0}, Lz10/n;-><init>(Ly00/c8;Lz10/m;Lz10/l;)V

    invoke-direct {v6, v7}, Lz10/p;-><init>(Lz10/n;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_42

    :catchall_6
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v6

    :goto_42
    move-object v0, v6

    goto :goto_43

    :cond_77
    move-object v0, v3

    :goto_43
    nop

    instance-of v3, v0, Ll83/m;

    if-nez v3, :cond_78

    move-object v3, v0

    check-cast v3, Lz10/p;

    iget-object v6, v1, La20/j;->G:Lqy/d;

    const-string v7, "Bank account session attached to intent!!"

    invoke-virtual {v6, v7}, Lqy/d;->a(Ljava/lang/String;)V

    iput-object v0, p0, La1/h;->z:Ljava/lang/Object;

    iput v5, p0, La1/h;->x:I

    invoke-virtual {v1, v3, p0}, La20/j;->l(Lz10/r;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_78

    goto :goto_46

    :cond_78
    :goto_44
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_79

    iput-object v0, p0, La1/h;->z:Ljava/lang/Object;

    iput v4, p0, La1/h;->x:I

    invoke-virtual {v1, v3, p0}, La20/j;->j(Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_79

    goto :goto_46

    :cond_79
    :goto_45
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_46
    return-object v2

    :cond_7a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attach requires client secret"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1b
    iget-object v0, p0, La1/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, La1/k;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, p0, La1/h;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v0, :cond_80

    if-eq v0, v6, :cond_7f

    if-eq v0, v5, :cond_7e

    if-eq v0, v4, :cond_7d

    if-eq v0, v3, :cond_7c

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7c
    iget-object v0, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4c

    :cond_7d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_49

    :cond_7e
    :try_start_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_48

    :catchall_7
    move-exception v0

    goto :goto_4a

    :cond_7f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_47

    :cond_80
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_e
    iget-object v0, v1, La1/k;->R:Ls83/i;

    if-eqz v0, :cond_81

    iput v6, p0, La1/h;->x:I

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_81

    goto :goto_4b

    :cond_81
    :goto_47
    iget-object v0, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v0, Lb1/g;

    iput v5, p0, La1/h;->x:I

    invoke-interface {v0, v1, p0}, Lb1/g;->a(Lb1/f;Ls83/i;)Ljava/lang/Object;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    if-ne v0, v2, :cond_82

    goto :goto_4b

    :cond_82
    :goto_48
    iget-object v0, v1, La1/k;->S:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_83

    iput v4, p0, La1/h;->x:I

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_83

    goto :goto_4b

    :cond_83
    :goto_49
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    goto :goto_4b

    :goto_4a
    iget-object v1, v1, La1/k;->S:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_84

    iput-object v0, p0, La1/h;->z:Ljava/lang/Object;

    iput v3, p0, La1/h;->x:I

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_84

    :goto_4b
    return-object v2

    :cond_84
    :goto_4c
    throw v0

    :pswitch_1c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La1/h;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_87

    if-eq v1, v3, :cond_86

    if-ne v1, v2, :cond_85

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4e

    :cond_85
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_86
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_87
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, La1/h;->z:Ljava/lang/Object;

    check-cast v1, La1/i;

    iget-object v1, v1, La1/i;->Q:Ls83/i;

    if-eqz v1, :cond_88

    iput v3, p0, La1/h;->x:I

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_88

    goto :goto_4f

    :cond_88
    :goto_4d
    iget-object v1, p0, La1/h;->y:Ljava/lang/Object;

    check-cast v1, Lb1/g;

    iget-object v3, p0, La1/h;->E:Ljava/lang/Object;

    check-cast v3, La1/g;

    iput v2, p0, La1/h;->x:I

    invoke-interface {v1, v3, p0}, Lb1/g;->a(Lb1/f;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_89

    goto :goto_4f

    :cond_89
    :goto_4e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4f
    return-object v0

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
