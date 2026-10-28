.class public final Ll1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll1/g1;

.field public final synthetic y:Ll1/y;


# direct methods
.method public synthetic constructor <init>(Ll1/g1;Ll1/y;I)V
    .locals 0

    iput p3, p0, Ll1/r0;->w:I

    iput-object p1, p0, Ll1/r0;->x:Ll1/g1;

    iput-object p2, p0, Ll1/r0;->y:Ll1/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll1/r0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lb2/t;->w:Lb2/t;

    sget-object p2, Ll1/f1;->d:Ll0/l1;

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object p1, p0, Ll1/r0;->x:Ll1/g1;

    move-object p2, p1

    check-cast p2, Ll1/h1;

    invoke-virtual {p2}, Ll1/h1;->a()I

    move-result v2

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_2

    :cond_1
    new-instance v0, Ll1/s0;

    const/4 p2, 0x0

    invoke-direct {v0, p1, p2}, Ll1/s0;-><init>(Ll1/g1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll1/r0;->y:Ll1/y;

    const/4 v6, 0x6

    invoke-static/range {v1 .. v6}, Ll1/f1;->f(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p2, v2

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object v1, Ll1/b0;->a:Ll1/b0;

    iget-object p1, p0, Ll1/r0;->x:Ll1/g1;

    check-cast p1, Ll1/h1;

    invoke-virtual {p1}, Ll1/h1;->a()I

    move-result v5

    sget-object p1, Lb2/t;->w:Lb2/t;

    sget-object p2, Ll1/f1;->e:Ll0/l1;

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    iget-object p1, p0, Ll1/r0;->y:Ll1/y;

    iget-wide v2, p1, Ll1/y;->b:J

    const/16 v7, 0xc30

    invoke-virtual/range {v1 .. v7}, Ll1/b0;->b(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
