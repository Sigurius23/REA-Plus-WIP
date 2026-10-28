.class public final synthetic Lof2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lof2/d;->w:I

    iput-object p1, p0, Lof2/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lof2/d;->x:Ljava/lang/Object;

    iput p3, p0, Lof2/d;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq0/o;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    const/16 p4, 0x17

    iput p4, p0, Lof2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof2/d;->z:Ljava/lang/Object;

    iput p2, p0, Lof2/d;->y:I

    iput-object p3, p0, Lof2/d;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lof2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lq81/j;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lq81/g;->l(Lq81/j;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lj71/b$f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lq61/a;->a(Landroidx/compose/ui/Modifier;Lj71/b$f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Ll0/s1;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkd1/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lq21/c;->d(Ll0/s1;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Ll0/s1;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lq21/c;->c(Ll0/s1;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Ly00/x;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lof2/d;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lse/a;->c(Landroidx/compose/ui/Modifier;Ly00/x;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Ly00/c0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lof2/d;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lse/a;->j(Landroidx/compose/ui/Modifier;Ly00/c0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lq0/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v1, p0, Lof2/d;->y:I

    iget-object v2, p0, Lof2/d;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, p2}, Lq0/o;->d(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Leq2/b;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lpq2/a;->g(Leq2/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Liq1/a$a;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lpq1/b;->b(Liq1/a$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lnp2/c$d;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lpp2/n;->c(Lnp2/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lnp2/c$c;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lpp2/h;->h(Lnp2/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Ld41/h;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lpj2/q;->D(Ld41/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lnj2/p;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lpj2/i;->E(Lnj2/p;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stress/view/StressMonitorFragment;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lnj2/p;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/stress/view/StressMonitorFragment;->E(Lcom/whoop/stress/view/StressMonitorFragment;Lnj2/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lm62/g$a;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lp62/b;->a(Lm62/g$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lp31/p$d;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lp31/n;->g(Lp31/p$d;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lp31/p$c;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lp31/n;->h(Lp31/p$c;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lhy0/o1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lp21/e;->h(Lcom/whoop/design/util/TextResource;Lhy0/o1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Ld10/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lof2/d;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Le4/a;->k(Ljava/lang/String;Ld10/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lpx2/j;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lox2/i;->c(Lpx2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lox0/e;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lox0/c;->e(Lox0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Llw2/c;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Llw2/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Low2/f;->f(Llw2/c;Llw2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Ll0/y;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/whattoexpect/domain/models/DailyProgress;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Low2/a;->a(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Low0/a;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Low0/d;->a(Low0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lnt1/i;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lot1/d;->b(Lnt1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lnt1/d;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lot1/c;->j(Lnt1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lnt1/d$a;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lot1/c;->i(Lnt1/d$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lor1/a;->c(Lc93/m;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Llf2/m;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lof2/f;->a(Llf2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lof2/d;->z:Ljava/lang/Object;

    check-cast v0, Llf2/j;

    iget-object v1, p0, Lof2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lof2/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lof2/e;->b(Llf2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

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
