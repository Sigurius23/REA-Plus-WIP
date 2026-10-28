.class public final synthetic Lev2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    iput p2, p0, Lev2/g;->w:I

    iput p1, p0, Lev2/g;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lev2/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lui0/p;->a(FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lsj1/a;->e(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lr71/b;->a(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lmi2/l;->a(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lm91/u;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lim1/c;->d(FLm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget v0, p0, Lev2/g;->x:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    iget-wide v1, p3, Ly3/a;->a:J

    mul-int/lit8 p3, v0, 0x2

    const/4 v3, 0x0

    invoke-static {v3, v1, v2, p3}, Ly3/b;->i(IJI)J

    move-result-wide v1

    invoke-interface {p2, v1, v2}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v1, p2, Ly2/j1;->x:I

    sub-int/2addr v1, p3

    iget p3, p2, Ly2/j1;->w:I

    new-instance v2, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v3, 0x5

    invoke-direct {v2, p2, v0, v3}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, v1, p2, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lez0/b;->a(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v0, p0, Lev2/g;->x:F

    invoke-static {v0, p1, p2, p3}, Lev2/n;->o(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
