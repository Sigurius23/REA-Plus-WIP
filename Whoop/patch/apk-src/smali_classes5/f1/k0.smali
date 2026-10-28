.class public final Lf1/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf1/k0;->w:I

    iput-object p2, p0, Lf1/k0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lf1/k0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu0/d1;Lf1/s1;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lf1/k0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/k0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lf1/k0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lf1/k0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ld0;

    iget-object v0, p0, Lf1/k0;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lu0/d1;

    iget-object v0, p0, Lf1/k0;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lf1/s1;

    const/4 v5, 0x0

    const/16 v6, 0x8

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    move-object v0, p1

    iget-object p1, p0, Lf1/k0;->x:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    iget-object v1, p0, Lf1/k0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v4, Lp40/b;

    const/16 v2, 0x8

    invoke-direct {v4, p1, v1, v2}, Lp40/b;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    const/4 v6, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, p2

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_1
    move-object v0, p1

    move-object v5, p2

    iget-object p1, p0, Lf1/k0;->x:Ljava/lang/Object;

    check-cast p1, Lh0/z3;

    iget-object v9, p1, Lh0/z3;->U:Ldc3/h;

    iget-object p1, p0, Lf1/k0;->y:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Le10/k0;

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v7

    new-instance v6, Lbc3/r1;

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-direct/range {v6 .. v11}, Lbc3/r1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object p1, v0

    check-cast p1, Lu2/h0;

    invoke-virtual {p1, v6, v5}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    move-object p1, v0

    :goto_2
    if-ne p1, p2, :cond_3

    move-object v0, p1

    :cond_3
    return-object v0

    :pswitch_2
    move-object v0, p1

    move-object v5, p2

    new-instance p1, Lf1/v0;

    iget-object p2, p0, Lf1/k0;->x:Ljava/lang/Object;

    check-cast p2, Lf1/w0;

    iget-object v1, p0, Lf1/k0;->y:Ljava/lang/Object;

    check-cast v1, Lf1/d0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, p2, v1, v2, v3}, Lf1/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1, v5}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    goto :goto_3

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object p1

    :pswitch_3
    move-object v0, p1

    move-object v5, p2

    new-instance v8, Lab/h0;

    move-object p1, v0

    check-cast p1, Lu2/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    iget-object p1, p1, La3/n0;->Z:Lb3/j3;

    invoke-direct {v8, p1}, Lab/h0;-><init>(Lb3/j3;)V

    new-instance v6, Lbc3/r1;

    iget-object p1, p0, Lf1/k0;->x:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lf1/j;

    iget-object p1, p0, Lf1/k0;->y:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Lu0/d1;

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lbc3/r1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v6, v5}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    goto :goto_4

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
