.class public final synthetic Lfg2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lfg2/l;->w:I

    iput-object p1, p0, Lfg2/l;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lfg2/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lnl0/m;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lfg2/l;->x:Lc93/a;

    invoke-static {v0, p1, p2, p3}, Ly12/c;->c(Lc93/a;Lnl0/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget-object v0, p0, Lfg2/l;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/f;

    iget v0, v0, Ly3/f;->w:F

    iget-wide v1, p3, Ly3/a;->a:J

    const/high16 v3, 0x7fc00000    # Float.NaN

    invoke-static {v0, v3}, Ly3/f;->b(FF)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Ly3/b;->f(IJ)I

    move-result v7

    iget-wide v3, p3, Ly3/a;->a:J

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget v0, p2, Ly2/j1;->x:I

    new-instance v1, Lch/m;

    const/4 v2, 0x5

    invoke-direct {v1, p2, v2}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, v0, p2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lfg2/l;->x:Lc93/a;

    invoke-static {v0, p1, p2, p3}, Lfg2/m;->a(Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
