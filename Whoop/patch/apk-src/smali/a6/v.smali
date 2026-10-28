.class public final La6/v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La6/i0;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La6/v;->w:I

    .line 1
    iput-object p1, p0, La6/v;->z:Ljava/lang/Object;

    iput-object p2, p0, La6/v;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lbc3/t;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, La6/v;->w:I

    .line 2
    iput-object p1, p0, La6/v;->E:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lc93/m;Ld4/i;Lq83/d;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, La6/v;->w:I

    .line 3
    check-cast p1, Ls83/i;

    iput-object p1, p0, La6/v;->E:Ljava/lang/Object;

    iput-object p2, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh0/z;Lf0/z0;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, La6/v;->w:I

    .line 4
    iput-object p1, p0, La6/v;->E:Ljava/lang/Object;

    iput-object p2, p0, La6/v;->y:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 5
    iput p5, p0, La6/v;->w:I

    iput-object p1, p0, La6/v;->E:Ljava/lang/Object;

    iput-object p2, p0, La6/v;->y:Ljava/lang/Object;

    iput-object p3, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 6
    iput p4, p0, La6/v;->w:I

    iput-object p1, p0, La6/v;->E:Ljava/lang/Object;

    iput-object p2, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 7
    iput p3, p0, La6/v;->w:I

    iput-object p1, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lec3/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, La6/v;->w:I

    .line 8
    check-cast p1, Ls83/i;

    iput-object p1, p0, La6/v;->E:Ljava/lang/Object;

    iput-object p2, p0, La6/v;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    iget v0, p0, La6/v;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/v;

    iget-object v1, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v1, Lq83/j;

    iget-object v2, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v2, Lec3/l;

    const/16 v3, 0x12

    invoke-direct {v0, v1, v2, p2, v3}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/v;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, La6/v;

    iget-object v1, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v1, Lp1/x1;

    iget-object v2, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v2, Lp1/w0;

    const/16 v3, 0x11

    invoke-direct {v0, v1, v2, p2, v3}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/v;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v4, La6/v;

    iget-object p1, p0, La6/v;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lmc/h;

    iget-object p1, p0, La6/v;->y:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lqc/q;

    iget-object p1, p0, La6/v;->z:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lmc/f;

    const/16 v9, 0x10

    move-object v8, p2

    invoke-direct/range {v4 .. v9}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v4

    :pswitch_2
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/t;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p2, v0, v1, v9}, La6/v;-><init>(Lbc3/t;Lc93/m;Lq83/d;)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_3
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Lw73/e;

    const/16 v2, 0xe

    invoke-direct {p2, v0, v1, v9, v2}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_4
    move-object v9, p2

    new-instance v5, La6/v;

    iget-object p1, p0, La6/v;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljc/i0;

    iget-object p1, p0, La6/v;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lic/v;

    iget-object p1, p0, La6/v;->z:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lrc/m;

    const/16 v10, 0xd

    invoke-direct/range {v5 .. v10}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_5
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Ls83/i;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Ld4/i;

    invoke-direct {p2, v0, v1, v9}, La6/v;-><init>(Lc93/m;Ld4/i;Lq83/d;)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_6
    move-object v9, p2

    new-instance p1, La6/v;

    iget-object p2, p0, La6/v;->E:Ljava/lang/Object;

    check-cast p2, Lh0/z;

    iget-object v0, p0, La6/v;->y:Ljava/lang/Object;

    check-cast v0, Lf0/z0;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p1, p2, v0, v1, v9}, La6/v;-><init>(Lh0/z;Lf0/z0;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_7
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Lc93/n;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Lh0/p;

    const/16 v2, 0xa

    invoke-direct {p2, v0, v1, v9, v2}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_8
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    const/16 v2, 0x9

    invoke-direct {p2, v0, v1, v9, v2}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_9
    move-object v9, p2

    new-instance v5, La6/v;

    iget-object p1, p0, La6/v;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lc93/m;

    iget-object v7, p0, La6/v;->y:Ljava/lang/Object;

    iget-object p1, p0, La6/v;->z:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lbc3/c0;

    const/16 v10, 0x8

    invoke-direct/range {v5 .. v10}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v5

    :pswitch_a
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Ls83/i;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-direct {p2, v0, v1, v9}, La6/v;-><init>(Lkotlin/jvm/functions/Function3;Lec3/m;Lq83/d;)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_b
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Lfc3/d;

    const/4 v2, 0x6

    invoke-direct {p2, v0, v1, v9, v2}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_c
    move-object v9, p2

    new-instance p1, La6/v;

    iget-object p2, p0, La6/v;->z:Ljava/lang/Object;

    check-cast p2, Lal/a;

    const/4 v0, 0x5

    invoke-direct {p1, p2, v9, v0}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Ld0/z1;

    iget-object v1, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/4 v2, 0x4

    invoke-direct {p2, v0, v1, v9, v2}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_e
    move-object v9, p2

    new-instance p1, La6/v;

    iget-object p2, p0, La6/v;->z:Ljava/lang/Object;

    check-cast p2, Ldc3/h;

    const/4 v0, 0x3

    invoke-direct {p1, p2, v9, v0}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_f
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/room/i2;

    const/4 v1, 0x2

    invoke-direct {p2, v0, v9, v1}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_10
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v0, La6/i0;

    iget-object v1, p0, La6/v;->E:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-direct {p2, v0, v1, v9}, La6/v;-><init>(La6/i0;Lc93/m;Lq83/d;)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_11
    move-object v9, p2

    new-instance p2, La6/v;

    iget-object v0, p0, La6/v;->z:Ljava/lang/Object;

    check-cast v0, La6/i0;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v9, v1}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La6/v;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, La6/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ll83/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroidx/room/x1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 20

    move-object/from16 v1, p0

    iget v0, v1, La6/v;->w:I

    const/4 v2, 0x5

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v2, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v2, Lq83/j;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v7, v1, La6/v;->x:I

    if-eqz v7, :cond_2

    if-eq v7, v8, :cond_1

    if-ne v7, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v7, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v7, Lp1/r1;

    sget-object v9, Lq83/k;->w:Lq83/k;

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    new-instance v2, La6/z;

    invoke-direct {v2, v7, v4}, La6/z;-><init>(Ljava/lang/Object;I)V

    iput v8, v1, La6/v;->x:I

    invoke-interface {v0, v2, v1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto :goto_2

    :cond_3
    new-instance v4, Lj8/b;

    invoke-direct {v4, v0, v7, v6, v8}, Lj8/b;-><init>(Lec3/l;Lp1/r1;Lq83/d;I)V

    iput v5, v1, La6/v;->x:I

    invoke-static {v2, v4, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v3

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_6

    if-ne v2, v8, :cond_5

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v3, Lp1/x1;

    iget-object v4, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v4, Lp1/w0;

    iput v8, v1, La6/v;->x:I

    invoke-virtual {v3, v2, v4, v1}, Lp1/x1;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    return-object v0

    :pswitch_1
    iget-object v0, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v0, Lqc/q;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v5, v1, La6/v;->x:I

    if-eqz v5, :cond_8

    if-ne v5, v8, :cond_7

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v5, Lmc/h;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "spec"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v5, Lmc/h;->a:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lnc/d;

    invoke-interface {v10, v0}, Lnc/d;->b(Lqc/q;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnc/d;

    iget-object v10, v0, Lqc/q;->j:Lic/e;

    invoke-interface {v9, v10}, Lnc/d;->a(Lic/e;)Lec3/c;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    new-array v6, v7, [Lec3/l;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lec3/l;

    new-instance v6, La6/u;

    invoke-direct {v6, v5, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {v6}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v4

    new-instance v5, Lec3/e0;

    iget-object v6, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v6, Lmc/f;

    invoke-direct {v5, v2, v6, v0}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v8, v1, La6/v;->x:I

    invoke-interface {v4, v5, v1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    goto :goto_7

    :cond_c
    :goto_6
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v3

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_e

    if-ne v2, v8, :cond_d

    iget-object v0, v1, La6/v;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/s;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v2

    move-object/from16 v2, p1

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v3, Lbc3/t;

    iget-object v4, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v4, Ls83/i;

    :try_start_1
    iput-object v3, v1, La6/v;->y:Ljava/lang/Object;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v4, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v0, :cond_f

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v3

    :goto_8
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    move-object v3, v2

    move-object v2, v0

    :cond_f
    :goto_9
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v3, Lbc3/t;

    if-nez v0, :cond_10

    invoke-virtual {v3, v2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_10
    invoke-virtual {v3, v0}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v0

    :pswitch_3
    iget-object v0, v1, La6/v;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lw73/e;

    iget-object v0, v2, Lw73/e;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll73/d;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, v1, La6/v;->x:I

    if-eqz v5, :cond_12

    if-ne v5, v8, :cond_11

    iget-object v0, v1, La6/v;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    goto :goto_d

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    :try_start_3
    iget-object v6, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v6, Lec3/l;

    new-instance v7, La6/z;

    invoke-direct {v7, v2, v3}, La6/z;-><init>(Ljava/lang/Object;I)V

    iput-object v5, v1, La6/v;->y:Ljava/lang/Object;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v6, v7, v1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-ne v3, v0, :cond_13

    goto :goto_f

    :cond_13
    move-object v3, v5

    :goto_c
    :try_start_4
    invoke-virtual {v2}, Lw73/e;->isDisposed()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-nez v0, :cond_15

    :try_start_5
    invoke-interface {v4}, Ll73/d;->onComplete()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-static {v2}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    goto :goto_e

    :catchall_3
    move-exception v0

    invoke-static {v2}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_4
    move-exception v0

    move-object v3, v5

    :goto_d
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    if-nez v5, :cond_14

    invoke-virtual {v2, v0}, Lw73/e;->a(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_15

    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v2

    invoke-static {v2, v0}, Lbi/g;->G(Lq83/j;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_14
    invoke-virtual {v2}, Lw73/e;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_15

    :try_start_7
    invoke-interface {v4}, Ll73/d;->onComplete()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    invoke-static {v2}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    goto :goto_e

    :catchall_5
    move-exception v0

    invoke-static {v2}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    throw v0

    :cond_15
    :goto_e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_f
    return-object v0

    :pswitch_4
    iget-object v0, v1, La6/v;->y:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lic/v;

    iget-object v0, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Ljc/i0;

    iget-object v11, v0, Ljc/i0;->a:Lqc/q;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/v;->x:I

    if-eqz v3, :cond_18

    if-eq v3, v8, :cond_17

    if-ne v3, v5, :cond_16

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_13

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_11

    :cond_18
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v13, v0, Ljc/i0;->b:Landroid/content/Context;

    iget-object v3, v1, La6/v;->z:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Lrc/m;

    iget-object v0, v0, Ljc/i0;->e:Lsc/b;

    iput v8, v1, La6/v;->x:I

    sget-object v3, Lrc/l;->a:Ljava/lang/String;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-boolean v4, v11, Lqc/q;->q:Z

    if-eqz v4, :cond_1a

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    if-lt v4, v6, :cond_19

    goto :goto_10

    :cond_19
    iget-object v0, v0, Lsc/b;->d:Lcq/s;

    const-string v4, "getMainThreadExecutor(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object v0

    new-instance v9, Lp33/m;

    const/4 v14, 0x0

    const/4 v15, 0x5

    invoke-direct/range {v9 .. v15}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v9, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1a

    move-object v3, v0

    :cond_1a
    :goto_10
    if-ne v3, v2, :cond_1b

    goto :goto_12

    :cond_1b
    :goto_11
    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Starting work for "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v11, Lqc/q;->c:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10}, Lic/v;->startWork()Lds/v;

    move-result-object v0

    const-string v3, "startWork(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v5, v1, La6/v;->x:I

    invoke-static {v0, v10, v1}, Ljc/j0;->a(Lds/v;Lic/v;Ls83/i;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1c

    :goto_12
    move-object v0, v2

    :cond_1c
    :goto_13
    return-object v0

    :pswitch_5
    iget-object v0, v1, La6/v;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ld4/i;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/v;->x:I

    if-eqz v3, :cond_1e

    if-ne v3, v8, :cond_1d

    :try_start_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    move-object/from16 v3, p1

    goto :goto_14

    :catchall_6
    move-exception v0

    goto :goto_15

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    :try_start_9
    iget-object v4, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v4, Ls83/i;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v4, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_1f

    goto :goto_17

    :cond_1f
    :goto_14
    invoke-virtual {v2, v3}, Ld4/i;->a(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_16

    :goto_15
    invoke-virtual {v2, v0}, Ld4/i;->b(Ljava/lang/Throwable;)V

    goto :goto_16

    :catch_0
    iput-boolean v8, v2, Ld4/i;->d:Z

    iget-object v0, v2, Ld4/i;->b:Ld4/l;

    if-eqz v0, :cond_20

    iget-object v0, v0, Ld4/l;->x:Ld4/k;

    invoke-virtual {v0, v8}, Ld4/h;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_20

    iput-object v6, v2, Ld4/i;->a:Ljava/lang/Object;

    iput-object v6, v2, Ld4/i;->b:Ld4/l;

    iput-object v6, v2, Ld4/i;->c:Ld4/n;

    :cond_20
    :goto_16
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_17
    return-object v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_22

    if-ne v2, v8, :cond_21

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_18

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v2, Lh0/z;

    iget-object v11, v2, Lh0/z;->c:Lf0/c1;

    iget-object v13, v2, Lh0/z;->b:Lh0/y;

    iget-object v2, v1, La6/v;->y:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lf0/z0;

    iget-object v2, v1, La6/v;->z:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Ls83/i;

    iput v8, v1, La6/v;->x:I

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Lf0/b1;

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lf0/b1;-><init>(Lf0/z0;Lf0/c1;Lc93/m;Ljava/lang/Object;Lq83/d;)V

    invoke-static {v9, v1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_23

    goto :goto_19

    :cond_23
    :goto_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_19
    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_25

    if-ne v2, v8, :cond_24

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v2, Ll83/k;

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lh0/h1;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    iget-object v4, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v4, Lc93/n;

    iget-object v5, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v5, Lh0/p;

    iget-object v5, v5, Lh0/p;->j:Lh0/o;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v4, v5, v3, v2, v1}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_26

    goto :goto_1b

    :cond_26
    :goto_1a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1b
    return-object v0

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/v;->x:I

    if-eqz v3, :cond_28

    if-ne v3, v8, :cond_27

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v5, Lc93/a;

    invoke-static {v5}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v5

    new-instance v6, Lc0/a0;

    iget-object v7, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    invoke-direct {v6, v4, v3, v7, v2}, Lc0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v8, v1, La6/v;->x:I

    invoke-virtual {v5, v6, v1}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_29

    goto :goto_1d

    :cond_29
    :goto_1c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1d
    return-object v0

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_2b

    if-ne v2, v8, :cond_2a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1e

    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v2, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2c

    goto :goto_1f

    :cond_2c
    :goto_1e
    iget-object v0, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    new-instance v2, Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal;

    invoke-direct {v2}, Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal;-><init>()V

    invoke-static {v0, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1f
    return-object v0

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_2e

    if-ne v2, v8, :cond_2d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v3, Ls83/i;

    iget-object v4, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v3, v2, v4, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2f

    goto :goto_21

    :cond_2f
    :goto_20
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_21
    return-object v0

    :pswitch_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/v;->x:I

    if-eqz v3, :cond_31

    if-ne v3, v8, :cond_30

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iget-object v4, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v5, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v5, Lfc3/d;

    invoke-virtual {v5, v3}, Lfc3/d;->h(Lbc3/c0;)Ldc3/w;

    move-result-object v3

    iput v8, v1, La6/v;->x:I

    invoke-static {v4, v3, v8, v1}, Lec3/v;->x(Lec3/m;Ldc3/w;ZLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_32

    goto :goto_22

    :cond_32
    move-object v3, v0

    :goto_22
    if-ne v3, v2, :cond_33

    move-object v0, v2

    :cond_33
    :goto_23
    return-object v0

    :pswitch_c
    iget-object v0, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v0, Lal/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/v;->x:I

    if-eqz v3, :cond_35

    if-ne v3, v8, :cond_34

    iget-object v0, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v0, Lal/a;

    iget-object v2, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v2, Lmc3/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_24

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Ld0/f1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ld0/d2;->b:Ljava/lang/Object;

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz1/v;

    sget-object v5, Ld0/d2;->a:Lcom/whoop/data/repositories/f;

    iget-object v7, v3, Ld0/f1;->H:La6/l0;

    invoke-virtual {v4, v7, v5, v3}, Lz1/v;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    iget-object v3, v3, Ld0/f1;->K:Lmc3/c;

    iput-object v3, v1, La6/v;->E:Ljava/lang/Object;

    iput-object v0, v1, La6/v;->y:Ljava/lang/Object;

    iput v8, v1, La6/v;->x:I

    invoke-virtual {v3, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_36

    goto :goto_26

    :cond_36
    move-object v2, v3

    :goto_24
    :try_start_a
    move-object v3, v0

    check-cast v3, Ld0/f1;

    move-object v4, v0

    check-cast v4, Ld0/f1;

    iget-object v4, v4, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v3, Ld0/f1;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ld0/f1;

    iget-object v3, v3, Ld0/f1;->J:Lbc3/m;

    if-eqz v3, :cond_37

    move-object v4, v0

    check-cast v4, Ld0/f1;

    iget-object v4, v4, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_25

    :catchall_7
    move-exception v0

    goto :goto_27

    :cond_37
    :goto_25
    check-cast v0, Ld0/f1;

    iput-object v6, v0, Ld0/f1;->J:Lbc3/m;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_26
    return-object v2

    :goto_27
    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :pswitch_d
    iget-object v0, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v0, Ld0/z1;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, La6/v;->x:I

    if-eqz v4, :cond_39

    if-ne v4, v8, :cond_38

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_28

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v4, Lp1/r1;

    new-instance v5, La3/l0;

    invoke-direct {v5, v0, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v2

    new-instance v5, Lc0/a0;

    iget-object v6, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v6, Lp1/c1;

    invoke-direct {v5, v4, v0, v6, v7}, Lc0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v8, v1, La6/v;->x:I

    invoke-virtual {v2, v5, v1}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_3a

    goto :goto_29

    :cond_3a
    :goto_28
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_29
    return-object v3

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La6/v;->x:I

    if-eqz v2, :cond_3c

    if-ne v2, v8, :cond_3b

    iget-object v2, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v2, Ldc3/c;

    iget-object v3, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v3, Ldc3/w;

    :try_start_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    move-object/from16 v4, p1

    goto :goto_2b

    :catchall_8
    move-exception v0

    move-object v2, v0

    goto :goto_2e

    :cond_3b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, La6/v;->z:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Ldc3/h;

    :try_start_c
    new-instance v2, Ldc3/c;

    invoke-direct {v2, v3}, Ldc3/c;-><init>(Ldc3/h;)V

    :cond_3d
    :goto_2a
    iput-object v3, v1, La6/v;->E:Ljava/lang/Object;

    iput-object v2, v1, La6/v;->y:Ljava/lang/Object;

    iput v8, v1, La6/v;->x:I

    invoke-virtual {v2, v1}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3e

    goto :goto_2d

    :cond_3e
    :goto_2b
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_40

    invoke-virtual {v2}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/a0;

    sget-object v4, Lb3/e2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v4, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    :try_start_d
    sget-object v5, Lz1/l;->j:Lz1/a;

    iget-object v5, v5, Lz1/b;->h:La0/w0;

    if-eqz v5, :cond_3f

    invoke-virtual {v5}, La0/w0;->h()Z

    move-result v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    if-ne v5, v8, :cond_3f

    move v5, v8

    goto :goto_2c

    :cond_3f
    move v5, v7

    :goto_2c
    :try_start_e
    monitor-exit v4

    if-eqz v5, :cond_3d

    invoke-static {}, Lz1/l;->a()V

    goto :goto_2a

    :catchall_9
    move-exception v0

    monitor-exit v4

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :cond_40
    invoke-interface {v3, v6}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2d
    return-object v0

    :goto_2e
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    :catchall_a
    move-exception v0

    invoke-static {v3, v2}, Lts/o;->f(Ldc3/w;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/v;->x:I

    if-eqz v3, :cond_43

    if-eq v3, v8, :cond_42

    if-ne v3, v5, :cond_41

    iget-object v2, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/locks/ReentrantLock;

    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/room/g0;

    :try_start_10
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    goto/16 :goto_36

    :catchall_b
    move-exception v0

    move v4, v7

    goto/16 :goto_38

    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_42
    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/room/x1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_2f

    :cond_43
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/room/x1;

    iput-object v3, v1, La6/v;->y:Ljava/lang/Object;

    iput v8, v1, La6/v;->x:I

    invoke-interface {v3, v1}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v4

    if-ne v4, v2, :cond_44

    goto/16 :goto_35

    :cond_44
    :goto_2f
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_45

    goto/16 :goto_3a

    :cond_45
    iget-object v4, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v4, Landroidx/room/i2;

    iget-object v9, v4, Landroidx/room/i2;->h:Landroidx/room/g0;

    iget-object v10, v9, Landroidx/room/g0;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_11
    iput-boolean v8, v9, Landroidx/room/g0;->f:Z

    iget-object v11, v9, Landroidx/room/g0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_f

    :try_start_12
    iget-boolean v12, v9, Landroidx/room/g0;->d:Z

    if-nez v12, :cond_47

    :cond_46
    move-object v13, v6

    goto :goto_34

    :cond_47
    iput-boolean v7, v9, Landroidx/room/g0;->d:Z

    iget-object v12, v9, Landroidx/room/g0;->b:[J

    array-length v12, v12

    new-array v13, v12, [Landroidx/room/f0;

    move v14, v7

    move v15, v14

    :goto_30
    if-ge v14, v12, :cond_4b

    iget-object v8, v9, Landroidx/room/g0;->b:[J

    aget-wide v16, v8, v14

    const-wide/16 v18, 0x0

    cmp-long v8, v16, v18

    if-lez v8, :cond_48

    const/4 v8, 0x1

    goto :goto_31

    :cond_48
    move v8, v7

    :goto_31
    iget-object v7, v9, Landroidx/room/g0;->c:[Z

    aget-boolean v5, v7, v14

    if-eq v8, v5, :cond_4a

    aput-boolean v8, v7, v14

    if-eqz v8, :cond_49

    sget-object v5, Landroidx/room/f0;->x:Landroidx/room/f0;

    :goto_32
    const/4 v15, 0x1

    goto :goto_33

    :catchall_c
    move-exception v0

    goto :goto_3b

    :cond_49
    sget-object v5, Landroidx/room/f0;->y:Landroidx/room/f0;

    goto :goto_32

    :cond_4a
    sget-object v5, Landroidx/room/f0;->w:Landroidx/room/f0;

    :goto_33
    aput-object v5, v13, v14
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    add-int/lit8 v14, v14, 0x1

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto :goto_30

    :cond_4b
    if-eqz v15, :cond_46

    :goto_34
    :try_start_13
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    if-eqz v13, :cond_4e

    :try_start_14
    array-length v5, v13

    if-nez v5, :cond_4c

    goto :goto_37

    :cond_4c
    sget-object v5, Landroidx/room/w1;->x:Landroidx/room/w1;

    new-instance v7, Landroidx/room/h2;

    invoke-direct {v7, v13, v4, v3, v6}, Landroidx/room/h2;-><init>([Landroidx/room/f0;Landroidx/room/i2;Landroidx/room/x1;Lq83/d;)V

    iput-object v9, v1, La6/v;->y:Ljava/lang/Object;

    iput-object v10, v1, La6/v;->E:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v1, La6/v;->x:I

    invoke-interface {v3, v5, v7, v1}, Landroidx/room/x1;->b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    if-ne v3, v2, :cond_4d

    :goto_35
    move-object v0, v2

    goto :goto_3a

    :cond_4d
    move-object v3, v9

    move-object v2, v10

    :goto_36
    move-object v10, v2

    move-object v9, v3

    :cond_4e
    :goto_37
    const/4 v4, 0x0

    goto :goto_39

    :catchall_d
    move-exception v0

    move-object v3, v9

    move-object v2, v10

    const/4 v4, 0x0

    :goto_38
    :try_start_15
    iput-boolean v4, v3, Landroidx/room/g0;->f:Z

    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    :catchall_e
    move-exception v0

    move-object v10, v2

    goto :goto_3c

    :goto_39
    :try_start_16
    iput-boolean v4, v9, Landroidx/room/g0;->f:Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    :goto_3a
    return-object v0

    :catchall_f
    move-exception v0

    goto :goto_3c

    :goto_3b
    :try_start_17
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_f

    :goto_3c
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :pswitch_10
    iget-object v0, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v0, La6/i0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v5, v1, La6/v;->x:I

    if-eqz v5, :cond_50

    const/4 v7, 0x1

    if-ne v5, v7, :cond_4f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_3d

    :cond_4f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_50
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v7

    iget-object v8, v0, La6/i0;->g:Lbu/c;

    invoke-virtual {v8}, Lbu/c;->C()La6/e1;

    move-result-object v8

    instance-of v9, v8, La6/b;

    if-eqz v9, :cond_51

    new-instance v9, La6/u0;

    check-cast v8, La6/b;

    iget v8, v8, La6/e1;->a:I

    invoke-direct {v9, v8}, La6/e1;-><init>(I)V

    move-object v8, v9

    :cond_51
    new-instance v9, La6/t0;

    iget-object v10, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v10, Lc93/m;

    invoke-interface {v5}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v5

    invoke-direct {v9, v10, v7, v8, v5}, La6/t0;-><init>(Lc93/m;Lbc3/t;La6/e1;Lq83/j;)V

    iget-object v0, v0, La6/i0;->k:Lzt/q;

    iget-object v5, v0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v5, Ldc3/h;

    invoke-interface {v5, v9}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v8, v5, Ldc3/m;

    if-eqz v8, :cond_53

    check-cast v5, Ldc3/m;

    iget-object v0, v5, Ldc3/m;->a:Ljava/lang/Throwable;

    if-nez v0, :cond_52

    new-instance v0, Lkotlinx/coroutines/channels/ClosedSendChannelException;

    const-string v2, "Channel was closed normally"

    invoke-direct {v0, v2}, Lkotlinx/coroutines/channels/ClosedSendChannelException;-><init>(Ljava/lang/String;)V

    :cond_52
    throw v0

    :cond_53
    instance-of v5, v5, Ldc3/n;

    if-nez v5, :cond_56

    iget-object v5, v0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v5, Laj/d;

    iget-object v5, v5, Laj/d;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v5

    if-nez v5, :cond_54

    iget-object v5, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    new-instance v8, La6/c;

    invoke-direct {v8, v0, v6, v4}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v6, v6, v8, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_54
    const/4 v0, 0x1

    iput v0, v1, La6/v;->x:I

    invoke-virtual {v7, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_55

    move-object v0, v2

    :cond_55
    :goto_3d
    return-object v0

    :cond_56
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_11
    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v5, v1, La6/v;->z:Ljava/lang/Object;

    check-cast v5, La6/i0;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v1, La6/v;->x:I

    if-eqz v8, :cond_5a

    const/4 v9, 0x1

    if-eq v8, v9, :cond_59

    const/4 v9, 0x2

    if-eq v8, v9, :cond_58

    if-ne v8, v3, :cond_57

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_41

    :cond_57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_58
    iget-object v0, v1, La6/v;->E:Ljava/lang/Object;

    check-cast v0, La6/b;

    iget-object v8, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_59
    iget-object v8, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    goto :goto_3e

    :cond_5a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v8, v1, La6/v;->y:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iput-object v8, v1, La6/v;->y:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v1, La6/v;->x:I

    iget-object v9, v5, La6/i0;->b:Lbc3/c0;

    invoke-interface {v9}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v9

    new-instance v10, La6/o;

    const/4 v11, 0x2

    invoke-direct {v10, v5, v6, v11}, La6/o;-><init>(La6/i0;Lq83/d;I)V

    invoke-static {v9, v10, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_5b

    goto :goto_40

    :cond_5b
    :goto_3e
    check-cast v9, La6/e1;

    instance-of v10, v9, La6/b;

    if-eqz v10, :cond_5d

    move-object v0, v9

    check-cast v0, La6/b;

    iget-object v10, v0, La6/b;->b:Ljava/lang/Object;

    iput-object v8, v1, La6/v;->y:Ljava/lang/Object;

    iput-object v0, v1, La6/v;->E:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v1, La6/v;->x:I

    invoke-interface {v8, v10, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5c

    goto :goto_40

    :cond_5c
    move-object v0, v9

    :goto_3f
    iget-object v9, v5, La6/i0;->g:Lbu/c;

    iget-object v9, v9, Lbu/c;->w:Ljava/lang/Object;

    check-cast v9, Lec3/h2;

    new-instance v10, La6/o;

    const/4 v11, 0x0

    invoke-direct {v10, v5, v6, v11}, La6/o;-><init>(La6/i0;Lq83/d;I)V

    new-instance v12, Lec3/a0;

    invoke-direct {v12, v10, v9}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    new-instance v9, La6/p;

    const/4 v10, 0x2

    invoke-direct {v9, v10, v11, v6}, La6/p;-><init>(IILq83/d;)V

    new-instance v10, Lec3/a0;

    invoke-direct {v10, v4, v9, v12}, Lec3/a0;-><init>(ILc93/m;Lec3/l;)V

    new-instance v4, La6/q;

    invoke-direct {v4, v0, v6, v11}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v0, Lec3/a0;

    invoke-direct {v0, v3, v4, v10}, Lec3/a0;-><init>(ILc93/m;Lec3/l;)V

    new-instance v4, La6/u;

    invoke-direct {v4, v0, v11}, La6/u;-><init>(Ljava/lang/Object;I)V

    new-instance v0, La6/r;

    invoke-direct {v0, v5, v6}, La6/r;-><init>(La6/i0;Lq83/d;)V

    new-instance v5, Lec3/y;

    invoke-direct {v5, v4, v0}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    iput-object v6, v1, La6/v;->y:Ljava/lang/Object;

    iput-object v6, v1, La6/v;->E:Ljava/lang/Object;

    iput v3, v1, La6/v;->x:I

    invoke-static {v8, v5, v1}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5e

    :goto_40
    move-object v2, v7

    goto :goto_41

    :cond_5d
    instance-of v3, v9, La6/h1;

    if-nez v3, :cond_62

    instance-of v3, v9, La6/v0;

    if-nez v3, :cond_61

    instance-of v3, v9, La6/s0;

    if-eqz v3, :cond_5f

    :cond_5e
    :goto_41
    return-object v2

    :cond_5f
    instance-of v2, v9, La6/u0;

    if-eqz v2, :cond_60

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_60
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_61
    check-cast v9, La6/v0;

    iget-object v0, v9, La6/v0;->b:Ljava/lang/Throwable;

    throw v0

    :cond_62
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
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
