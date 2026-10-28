.class public final Lb30/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(ILc93/a;Z)V
    .locals 0

    iput p1, p0, Lb30/i;->w:I

    iput-object p2, p0, Lb30/i;->x:Lc93/a;

    iput-boolean p3, p0, Lb30/i;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb30/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p3, -0xbba9706

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {p2, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lf1/y1;

    iget-wide v0, p3, Lf1/y1;->a:J

    invoke-virtual {p2, v0, v1}, Lp1/q;->f(J)Z

    move-result p3

    iget-object v2, p0, Lb30/i;->x:Lc93/a;

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p3, v3

    iget-boolean v3, p0, Lb30/i;->y:Z

    invoke-virtual {p2, v3}, Lp1/q;->h(Z)Z

    move-result v4

    or-int/2addr p3, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p3, :cond_0

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v4, p3, :cond_1

    :cond_0
    new-instance v4, Lf1/e;

    invoke-direct {v4, v0, v1, v2, v3}, Lf1/e;-><init>(JLc93/a;Z)V

    invoke-virtual {p2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v4}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/s1;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string p3, "$this$TopAppBar"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p2, 0x11

    const/16 p2, 0x10

    if-ne p1, p2, :cond_3

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_3
    :goto_0
    new-instance p1, Lb30/h;

    iget-boolean p2, p0, Lb30/i;->y:Z

    invoke-direct {p1, p2}, Lb30/h;-><init>(Z)V

    const p2, 0x2ea02a55

    invoke-static {p2, v4, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x6000

    const/16 v6, 0xe

    iget-object v0, p0, Lb30/i;->x:Lc93/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
