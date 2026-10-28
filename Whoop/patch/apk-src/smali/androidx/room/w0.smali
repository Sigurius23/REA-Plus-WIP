.class public final synthetic Landroidx/room/w0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Landroidx/room/w0;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Landroidx/room/w0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg2/v;

    check-cast p2, Lg2/v;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lf0/i0;

    iget-boolean v1, v0, Lb2/v;->N:Z

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    check-cast p2, Lg2/w;

    invoke-virtual {p2}, Lg2/w;->b()Z

    move-result p2

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    if-ne p2, p1, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object p1, v0, Lf0/i0;->R:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const/4 p1, 0x0

    if-eqz p2, :cond_4

    invoke-virtual {v0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v1

    new-instance v2, La20/b;

    const/16 v3, 0x10

    invoke-direct {v2, v0, p1, v3}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v1, p1, p1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ld30/l;

    const/16 v3, 0x17

    invoke-direct {v2, v3, v1, v0}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, La3/g;->l(Lb2/v;Lc93/a;)V

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lp0/g0;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lp0/g0;->a()Lp0/g0;

    goto :goto_0

    :cond_3
    move-object v1, p1

    :goto_0
    iput-object v1, v0, Lf0/i0;->T:Lp0/g0;

    iget-object v1, v0, Lf0/i0;->U:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lf0/i0;->b1()Lf0/j0;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, v0, Lf0/i0;->U:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v1, v2}, Lf0/j0;->X0(Ly2/y;)V

    goto :goto_1

    :cond_4
    iget-object v1, v0, Lf0/i0;->T:Lp0/g0;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lp0/g0;->b()V

    :cond_5
    iput-object p1, v0, Lf0/i0;->T:Lp0/g0;

    invoke-virtual {v0}, Lf0/i0;->b1()Lf0/j0;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1, p1}, Lf0/j0;->X0(Ly2/y;)V

    :cond_6
    :goto_1
    invoke-static {v0}, La3/g;->j(La3/j2;)V

    iget-object v1, v0, Lf0/i0;->Q:Lj0/i;

    if-eqz v1, :cond_9

    if-eqz p2, :cond_8

    iget-object p2, v0, Lf0/i0;->S:Lj0/d;

    if-eqz p2, :cond_7

    new-instance v2, Lj0/e;

    invoke-direct {v2, p2}, Lj0/e;-><init>(Lj0/d;)V

    invoke-virtual {v0, v1, v2}, Lf0/i0;->a1(Lj0/i;Lj0/h;)V

    iput-object p1, v0, Lf0/i0;->S:Lj0/d;

    :cond_7
    new-instance p1, Lj0/d;

    invoke-direct {p1}, Lj0/d;-><init>()V

    invoke-virtual {v0, v1, p1}, Lf0/i0;->a1(Lj0/i;Lj0/h;)V

    iput-object p1, v0, Lf0/i0;->S:Lj0/d;

    goto :goto_2

    :cond_8
    iget-object p2, v0, Lf0/i0;->S:Lj0/d;

    if-eqz p2, :cond_9

    new-instance v2, Lj0/e;

    invoke-direct {v2, p2}, Lj0/e;-><init>(Lj0/d;)V

    invoke-virtual {v0, v1, v2}, Lf0/i0;->a1(Lj0/i;Lj0/h;)V

    iput-object p1, v0, Lf0/i0;->S:Lj0/d;

    :cond_9
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lyc3/g;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lbd3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Lyc3/g;->isElementOptional(I)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->isNullable()Z

    move-result p1

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_3

    :cond_a
    const/4 p1, 0x0

    :goto_3
    iput-boolean p1, v0, Lbd3/p;->b:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lkotlin/jvm/functions/Function1;

    check-cast p2, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Landroidx/room/z0;

    invoke-static {v0, p1, p2}, Lpf/c;->q(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
