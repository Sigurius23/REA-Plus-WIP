.class public final synthetic Ljp2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Loj2/d;Lp1/c1;)V
    .locals 1

    .line 1
    const/16 v0, 0x16

    iput v0, p0, Ljp2/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ljp2/l;->z:Ljava/lang/Object;

    iput-object p1, p0, Ljp2/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljp2/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljp2/l;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Ljp2/l;->w:I

    iput-object p1, p0, Ljp2/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljp2/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljp2/l;->z:Ljava/lang/Object;

    iput-object p4, p0, Ljp2/l;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;I)V
    .locals 0

    .line 3
    iput p5, p0, Ljp2/l;->w:I

    iput-object p1, p0, Ljp2/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljp2/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljp2/l;->E:Ljava/lang/Object;

    iput-object p4, p0, Ljp2/l;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/List;ILo0/o;)V
    .locals 0

    .line 4
    const/16 p4, 0xe

    iput p4, p0, Ljp2/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp2/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljp2/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljp2/l;->z:Ljava/lang/Object;

    iput-object p5, p0, Ljp2/l;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ljp2/l;->w:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lii0/a;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Leb/u0;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lc93/a;

    check-cast v1, Leb/s0;

    invoke-static {v2, v3, v4, v5, v1}, Lrm2/e;->D(Lii0/a;Lc93/a;Leb/u0;Lc93/a;Leb/s0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lr90/j;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v2, v3, v4, v5, v1}, Lr90/c;->f(Lr90/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lr41/i;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Ltr2/n;

    check-cast v1, Lu0/p0;

    invoke-static {v2, v3, v4, v5, v1}, Lr41/h;->d(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lr41/i;Ltr2/n;Lu0/p0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lc00/a;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    move-object v6, v3

    check-cast v6, Ld00/l;

    iget-object v3, v0, Ljp2/l;->z:Ljava/lang/Object;

    move-object v14, v3

    check-cast v14, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->E:Ljava/lang/Object;

    move-object v15, v3

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ll8/c;

    const-string v3, "$this$initializer"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v2, Lc00/a;->J:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La00/i;

    invoke-virtual {v2}, Lc00/a;->c()Lwz/y;

    move-result-object v3

    iget-object v3, v3, Lwz/y;->N:Le10/r0;

    invoke-virtual {v1, v3}, La00/i;->a(Le10/r0;)La00/g;

    move-result-object v1

    iget-object v5, v2, Lc00/a;->a:Lwz/g0;

    invoke-virtual {v2}, Lc00/a;->b()Lxz/x;

    move-result-object v7

    new-instance v8, La00/g;

    invoke-virtual {v2}, Lc00/a;->b()Lxz/x;

    move-result-object v3

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v4

    iget-object v9, v2, Lc00/a;->f:Lwz/n0;

    invoke-direct {v8, v1, v3, v4, v9}, La00/g;-><init>(La00/g;Lxz/x;Lwz/m1;Lwz/n0;)V

    iget-object v1, v2, Lc00/a;->h0:Lv03/e;

    iget-object v1, v1, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Lq00/g;

    iget-object v1, v1, Lq00/g;->a:Lxl/a;

    iget-object v3, v1, Lxl/a;->x:Ljava/lang/Object;

    check-cast v3, Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwz/g0;

    iget-object v1, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/n0;

    new-instance v9, Lla/b;

    invoke-direct {v9, v6, v3, v1}, Lla/b;-><init>(Ld00/l;Lwz/g0;Lwz/n0;)V

    iget-object v1, v2, Lc00/a;->u:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lqy/d;

    iget-object v1, v2, Lc00/a;->f0:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ln40/g;

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v13

    iget-object v12, v2, Lc00/a;->f:Lwz/n0;

    new-instance v4, Lq00/p0;

    invoke-direct/range {v4 .. v15}, Lq00/p0;-><init>(Lwz/g0;Ld00/l;Lxz/x;La00/g;Lla/b;Lqy/d;Ln40/g;Lwz/n0;Lwz/m1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v4

    :pswitch_3
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lot2/a;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lbc3/c0;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lv41/f$a;

    check-cast v1, Ln0/q;

    invoke-static {v2, v3, v4, v5, v1}, Lpt2/i;->v(Lot2/a;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lnj2/b;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v2, v3, v4, v5, v1}, Lpj2/q;->l(Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;Lnj2/b;Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lg1/y3;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Loj2/d;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lm91/u;

    invoke-static {v2, v3, v4, v5, v1}, Lpj2/i;->f(Lbc3/c0;Lg1/y3;Loj2/d;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    iget-object v2, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iget-object v4, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v4, Lg1/y3;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Loj2/d;

    check-cast v1, Ln0/q;

    invoke-static {v2, v3, v4, v5, v1}, Lpj2/i;->A(Lp1/c1;Lbc3/c0;Lg1/y3;Loj2/d;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lnj2/p;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/stress/view/StressMonitorFragment;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Llj2/c;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Leb/u0;

    check-cast v1, Leb/s0;

    invoke-static {v2, v3, v4, v5, v1}, Lcom/whoop/stress/view/StressMonitorFragment;->H(Lnj2/p;Lcom/whoop/stress/view/StressMonitorFragment;Llj2/c;Leb/u0;Leb/s0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lp0/l0;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lp0/a0;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Ly2/u1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lp0/a1;

    check-cast v1, Lp1/i0;

    new-instance v1, Lb9/b;

    invoke-direct {v1, v3, v4, v5}, Lb9/b;-><init>(Lp0/a0;Ly2/u1;Lp0/a1;)V

    iput-object v1, v2, Lp0/l0;->c:Lb9/b;

    new-instance v1, Lb1/e;

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :pswitch_9
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lot2/h;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Ljt2/d;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Ljt2/m$i;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    check-cast v1, Ljb1/b;

    invoke-static {v2, v3, v4, v5, v1}, Lot2/h;->a(Lot2/h;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lot2/g;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Ljt2/d;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Ljt2/m$i;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    check-cast v1, Ljb1/b;

    invoke-static {v2, v3, v4, v5, v1}, Lot2/g;->b(Lot2/g;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Ld21/c;

    iget-object v4, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v4, Lp1/a1;

    iget-object v5, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v3, v4, v5, v1}, Lo71/c;->h(Lkotlin/jvm/functions/Function1;Ld21/c;Lp1/a1;Lp1/c1;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Ls41/b;

    iget-object v4, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v4, Lp1/a1;

    iget-object v5, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v3, v4, v5, v1}, Lo71/c;->c(Lkotlin/jvm/functions/Function1;Ls41/b;Lp1/a1;Lp1/c1;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lc00/a;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->z:Ljava/lang/Object;

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    iget-object v3, v0, Ljp2/l;->E:Ljava/lang/Object;

    move-object v14, v3

    check-cast v14, Lwz/a1;

    check-cast v1, Ll8/c;

    const-string v3, "$this$initializer"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lo00/b;

    iget-object v1, v2, Lc00/a;->u:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lqy/d;

    invoke-virtual {v2}, Lc00/a;->b()Lxz/x;

    move-result-object v6

    iget-object v1, v2, Lc00/a;->f0:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ln40/g;

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v8

    iget-object v9, v2, Lc00/a;->a:Lwz/g0;

    iget-object v10, v2, Lc00/a;->f:Lwz/n0;

    new-instance v11, La00/g;

    iget-object v1, v2, Lc00/a;->J:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La00/i;

    invoke-virtual {v2}, Lc00/a;->c()Lwz/y;

    move-result-object v3

    iget-object v3, v3, Lwz/y;->N:Le10/r0;

    invoke-virtual {v1, v3}, La00/i;->a(Le10/r0;)La00/g;

    move-result-object v1

    invoke-virtual {v2}, Lc00/a;->b()Lxz/x;

    move-result-object v3

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v15

    iget-object v2, v2, Lc00/a;->f:Lwz/n0;

    invoke-direct {v11, v1, v3, v15, v2}, La00/g;-><init>(La00/g;Lxz/x;Lwz/m1;Lwz/n0;)V

    invoke-direct/range {v4 .. v14}, Lo00/b;-><init>(Lqy/d;Lxz/x;Ln40/g;Lwz/m1;Lwz/g0;Lwz/n0;La00/g;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lwz/a1;)V

    return-object v4

    :pswitch_e
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/e0;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lo0/o;

    check-cast v1, Lp0/k0;

    check-cast v1, Lp0/y0;

    iget-object v6, v1, Lp0/y0;->e:Ly2/s1;

    if-eqz v6, :cond_0

    invoke-interface {v6}, Ly2/s1;->b()I

    move-result v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x0

    move v8, v7

    :goto_1
    if-ge v7, v6, :cond_2

    iget-object v9, v5, Lo0/o;->q:Lh0/d2;

    sget-object v10, Lh0/d2;->w:Lh0/d2;

    if-ne v9, v10, :cond_1

    invoke-virtual {v1, v7}, Lp0/y0;->e(I)J

    move-result-wide v9

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    :goto_2
    long-to-int v9, v9

    goto :goto_3

    :cond_1
    invoke-virtual {v1, v7}, Lp0/y0;->e(I)J

    move-result-wide v9

    const/16 v11, 0x20

    shr-long/2addr v9, v11

    goto :goto_2

    :goto_3
    add-int/2addr v8, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iget v1, v3, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_4

    goto :goto_4

    :cond_4
    iget v1, v3, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v3, Lkotlin/jvm/internal/e0;->w:I

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_f
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Ljx1/l$b;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v2, v3, v4, v5, v1}, Lnx1/c;->f(Ljx1/l$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lg2/i;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lio0/u;

    check-cast v1, Lc31/c;

    invoke-static {v2, v3, v4, v5, v1}, Lno0/l0;->i(Lg2/i;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lio0/u;Lc31/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v4, Ln81/f;

    iget-object v5, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v3, v4, v5, v1}, Ln81/c;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln81/f;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lc00/a;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->z:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->E:Ljava/lang/Object;

    move-object v14, v3

    check-cast v14, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ll8/c;

    const-string v3, "$this$initializer"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ln00/k;

    iget-object v5, v2, Lc00/a;->a:Lwz/g0;

    iget-object v1, v2, Lc00/a;->C:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lyz/b;

    iget-object v1, v2, Lc00/a;->u:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lqy/d;

    invoke-virtual {v2}, Lc00/a;->b()Lxz/x;

    move-result-object v8

    iget-object v9, v2, Lc00/a;->e:Landroidx/lifecycle/k1;

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v10

    iget-object v13, v2, Lc00/a;->f:Lwz/n0;

    new-instance v15, Lb30/i0;

    invoke-virtual {v2}, Lc00/a;->c()Lwz/y;

    move-result-object v17

    const/16 v21, 0x0

    const/16 v22, 0x1a

    const/16 v16, 0x0

    const-class v18, Lwz/y;

    const-string v19, "verifyDuringSignUp"

    const-string v20, "verifyDuringSignUp()V"

    invoke-direct/range {v15 .. v22}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct/range {v4 .. v15}, Ln00/k;-><init>(Lwz/g0;Lyz/b;Lqy/d;Lxz/x;Landroidx/lifecycle/k1;Lwz/m1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lwz/n0;Lkotlin/jvm/functions/Function1;Lb30/i0;)V

    return-object v4

    :pswitch_13
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lm80/e;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Lg2/v;

    invoke-static {v2, v3, v4, v5, v1}, Lm80/d;->j(Lkotlin/jvm/functions/Function1;Lm80/e;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lz1/p;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lin1/d$c;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lj31/k;

    check-cast v1, Ln0/q;

    invoke-static {v2, v3, v4, v5, v1}, Lln1/k;->g(Lz1/p;Lin1/d$c;Lkotlin/jvm/functions/Function1;Lj31/k;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lde0/a;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Llf0/a2;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lo0/s;

    invoke-static {v2, v3, v4, v5, v1}, Llf0/z1;->h(Ljava/util/List;Lde0/a;Llf0/a2;Lkotlin/jvm/functions/Function1;Lo0/s;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Llf0/m;

    invoke-static {v2, v3, v4, v5, v1}, Llf0/l;->g(Lkotlin/jvm/functions/Function1;Landroid/content/Context;Ljava/lang/String;Llf0/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Liw1/k;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lew1/a;

    invoke-static {v2, v3, v4, v5, v1}, Lkw1/t;->g(Liw1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lew1/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lm91/u;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v4, v5, v1}, Lkk1/g;->D(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v2, v3, v4, v5, v1}, Lcom/whoop/startactivity/goals/a;->e(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/g0;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/v;

    iget-object v4, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v4, Lbc3/c0;

    iget-object v5, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Lp1/i0;

    invoke-static {v2, v3, v4, v5, v1}, Lkd1/e;->c(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;Lbc3/c0;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lzw2/b;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/feature/navigation/b;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lc93/a;

    check-cast v1, Leb/s0;

    invoke-static {v2, v3, v4, v5, v1}, Ljx2/f;->k(Lcom/whoop/data/repositories/FeatureFlagChecker;Lzw2/b;Lcom/whoop/whooplabs/feature/navigation/b;Lc93/a;Leb/s0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    iget-object v2, v0, Ljp2/l;->x:Ljava/lang/Object;

    check-cast v2, Lc2/l;

    iget-object v3, v0, Ljp2/l;->y:Ljava/lang/Object;

    check-cast v3, Lc2/h;

    iget-object v4, v0, Ljp2/l;->z:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    iget-object v5, v0, Ljp2/l;->E:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    check-cast v1, Ly2/y;

    invoke-static {v2, v3, v4, v5, v1}, Ljp2/n;->i(Lc2/l;Lc2/h;Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object v1

    return-object v1

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
