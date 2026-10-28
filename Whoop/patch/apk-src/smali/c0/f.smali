.class public final Lc0/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lc0/f;->w:I

    iput-object p1, p0, Lc0/f;->x:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lc0/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld0/t1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p1, 0x38f969d6

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lc0/f;->x:Ljava/lang/Object;

    check-cast p1, Ld0/c0;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget-wide v0, p3, Ly3/a;->a:J

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget v0, p2, Ly2/j1;->x:I

    new-instance v1, Lb3/t0;

    iget-object v2, p0, Lc0/f;->x:Ljava/lang/Object;

    check-cast v2, Lc0/l0;

    const/4 v3, 0x5

    invoke-direct {v1, v3, p2, v2}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, v0, p2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
