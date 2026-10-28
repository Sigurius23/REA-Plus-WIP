.class public final synthetic Loq1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Loq1/c;->w:I

    iput-object p2, p0, Loq1/c;->y:Ljava/lang/Object;

    iput-object p3, p0, Loq1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/t2;)V
    .locals 1

    .line 2
    const/16 v0, 0x10

    iput v0, p0, Loq1/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loq1/c;->x:Ljava/lang/Object;

    iput-object p2, p0, Loq1/c;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Loq1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lg51/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lvo1/d;->d(Lg51/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lhy0/i0;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lg51/c;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lv81/c;->b(Lhy0/i0;Lg51/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lv51/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lv51/b;->e(Lv51/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Lh2/b;

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lv41/d0;->i(Lp1/c1;Lp1/c1;FLh2/b;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lr51/f;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Luz1/h;->i(Lr51/f;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Luu2/b0;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Luu2/l;->u(Luu2/b0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Ltd2/i$b;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lud2/e;->a(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lt51/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lt51/b;->c(Lt51/c;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lt01/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lt01/f;->d(Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lsz0/m;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/s0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lsz0/l;->b(Lsz0/m;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lux1/d;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lsx1/j;->c(Ljava/lang/String;Lux1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lux1/b;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lsx1/j;->o(Lux1/b;Lc93/m;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lrv2/h$b;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lsv2/e;->z(Lrv2/h$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lsv0/b;->d(Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lrt1/k;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    check-cast p1, Ll0/s0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lst1/n;->e(Lrt1/k;Ljava/util/Map;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lpo2/c$a;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lso2/g;->b(Lpo2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lrz0/f;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lt0/i;

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lrz0/e;->a(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lrq2/a;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lrq2/d;->a(Lrq2/a;Lp1/t2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lz51/l;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lrm1/m;->k(Lz51/l;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lpu2/a;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lqu2/h;->K(Lpu2/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lqm1/e;->g(Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Log0/c$b;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lqg0/d;->e(Log0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Log0/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lqg0/c;->a(Log0/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lq0/y;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Ly3/m;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    invoke-static {v0, p1}, Ltx/f;->R(Lq0/y;F)Z

    move-result v2

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v3

    iget-object v3, v3, Lq0/q;->e:Lh0/d2;

    sget-object v4, Lh0/d2;->w:Lh0/d2;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Ly3/m;->w:Ly3/m;

    if-ne v1, v3, :cond_1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    move v2, v6

    goto :goto_0

    :cond_2
    move v2, v5

    :goto_0
    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v1

    iget v1, v1, Lq0/q;->b:I

    const/4 v3, 0x0

    if-nez v1, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    invoke-static {v0}, Ltx/f;->G(Lq0/y;)F

    move-result v4

    int-to-float v1, v1

    div-float/2addr v4, v1

    :goto_1
    float-to-int v1, v4

    int-to-float v1, v1

    sub-float v1, v4, v1

    iget-object v7, v0, Lq0/y;->q:Ly3/c;

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v8

    sget v9, Li0/k;->a:F

    invoke-interface {v7, v9}, Ly3/c;->q0(F)F

    move-result v7

    cmpg-float v7, v8, v7

    const/4 v8, 0x2

    if-gez v7, :cond_4

    goto :goto_2

    :cond_4
    cmpl-float p1, p1, v3

    if-lez p1, :cond_5

    move v5, v6

    goto :goto_2

    :cond_5
    move v5, v8

    :goto_2
    if-nez v5, :cond_8

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float p1, p1, v1

    if-lez p1, :cond_6

    if-eqz v2, :cond_c

    goto :goto_3

    :cond_6
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object v1, v0, Lq0/y;->q:Ly3/c;

    sget v3, Lq0/c0;->a:F

    invoke-interface {v1, v3}, Ly3/c;->q0(F)F

    move-result v1

    invoke-virtual {v0}, Lq0/y;->n()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-virtual {v0}, Lq0/y;->n()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_7

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_7
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_9

    goto :goto_4

    :cond_8
    if-ne v5, v6, :cond_a

    :cond_9
    :goto_3
    move p2, p3

    goto :goto_4

    :cond_a
    if-ne v5, v8, :cond_b

    goto :goto_4

    :cond_b
    move p2, v3

    :cond_c
    :goto_4
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lot2/m$i;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lpt2/v;->k(Lot2/m$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lnp2/c$b;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lpp2/n;->d(Lnp2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lnh1/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lph1/g;->b(Lnh1/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Lp31/h;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lp31/f;->m(Lp31/h;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Low0/a;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Low0/d;->c(Low0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Loq1/c;->y:Ljava/lang/Object;

    check-cast v0, Llq1/c;

    iget-object v1, p0, Loq1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Loq1/d;->h(Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

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
