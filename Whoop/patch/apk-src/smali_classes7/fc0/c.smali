.class public final synthetic Lfc0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lfc0/c;->w:I

    iput-object p1, p0, Lfc0/c;->x:Ljava/lang/Object;

    iput-object p2, p0, Lfc0/c;->y:Ljava/lang/Object;

    iput-object p3, p0, Lfc0/c;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lfc0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkm0/e;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg2/i;

    move-object v4, p1

    check-cast v4, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Luw0/l;->g(Lkm0/e;Lkotlin/jvm/functions/Function1;Lg2/i;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt21/d;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/t2;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/t2;

    move-object v4, p1

    check-cast v4, Lc0/o;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lt21/g;->n(Lt21/d;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lpu2/h$e;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lin2/e;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Lbm/m;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lqu2/h;->O(Lpu2/h$e;Lin2/e;Lkotlin/jvm/functions/Function1;Lbm/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnj2/p;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/stress/view/StressMonitorFragment;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Leb/u0;

    move-object v4, p1

    check-cast v4, Lc0/o;

    move-object v5, p2

    check-cast v5, Leb/q;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lcom/whoop/stress/view/StressMonitorFragment;->F(Lnj2/p;Lcom/whoop/stress/view/StressMonitorFragment;Leb/u0;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnj2/p;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/stress/view/StressMonitorFragment;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Llj2/c;

    move-object v4, p1

    check-cast v4, Lc0/o;

    move-object v5, p2

    check-cast v5, Leb/q;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lcom/whoop/stress/view/StressMonitorFragment;->M(Lnj2/p;Lcom/whoop/stress/view/StressMonitorFragment;Llj2/c;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/t2;

    move-object v4, p1

    check-cast v4, Lc0/o;

    move-object v5, p2

    check-cast v5, Leb/q;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lcom/whoop/membership/management/navigation/a;->e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhd2/d$a;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lid2/t;->i(Lhd2/d$a;Ljava/util/List;Lp1/c1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgd0/c$e;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lid0/c;->n(Lgd0/c$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lfc0/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfc0/h;

    iget-object v0, p0, Lfc0/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly3/c;

    iget-object v0, p0, Lfc0/c;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/a1;

    move-object v4, p1

    check-cast v4, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lfc0/g;->e(Lfc0/h;Ly3/c;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
