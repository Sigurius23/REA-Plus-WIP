.class public final synthetic Lj21/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lj21/d;->w:I

    iput-object p2, p0, Lj21/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lj21/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lj21/d;->w:I

    iput-object p1, p0, Lj21/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj21/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lgr1/b;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lj21/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj21/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lj21/d;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lj21/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lm62/g$c;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lp62/c;->a(Lm62/g$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lx1/h;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lp1/i2;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    instance-of v2, p2, Lp1/i;

    if-eqz v2, :cond_0

    check-cast p2, Lp1/i;

    iget-object p1, v0, Lx1/h;->f:Lr1/c;

    invoke-virtual {p1, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v2, p2, Lp1/a2;

    if-eqz v2, :cond_1

    move-object v2, p2

    check-cast v2, Lp1/a2;

    iget-object v3, v2, Lp1/a2;->a:Lp1/z1;

    instance-of v3, v3, Lp1/n;

    if-nez v3, :cond_2

    invoke-static {v1, p1, p2}, Lp1/r;->g(Lp1/i2;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lx1/h;->e(Lp1/a2;)V

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lp1/v1;

    if-eqz v0, :cond_2

    invoke-static {v1, p1, p2}, Lp1/r;->g(Lp1/i2;ILjava/lang/Object;)V

    check-cast p2, Lp1/v1;

    invoke-virtual {p2}, Lp1/v1;->d()V

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lp0/a0;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lp0/c0;

    check-cast p1, Ly2/v1;

    check-cast p2, Ly3/a;

    new-instance v2, Lp0/d0;

    invoke-direct {v2, v0, p1}, Lp0/d0;-><init>(Lp0/a0;Ly2/v1;)V

    iget-wide p1, p2, Ly3/a;->a:J

    invoke-interface {v1, v2, p1, p2}, Lp0/c0;->a(Lp0/d0;J)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lpx2/j;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lox2/i;->d(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Llw2/d;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Llw2/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Low2/f;->c(Llw2/d;Llw2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lo0/b;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ll0/i;

    move-object v3, p1

    check-cast v3, Ly3/c;

    check-cast p2, Ly3/a;

    iget-wide v4, p2, Ly3/a;->a:J

    invoke-static {v4, v5}, Ly3/a;->i(J)I

    move-result p1

    const v1, 0x7fffffff

    if-eq p1, v1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, "LazyVerticalGrid\'s width should be bound by parent."

    invoke-static {p1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_1
    iget-wide p1, p2, Ly3/a;->a:J

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v4

    invoke-interface {v2}, Ll0/i;->a()F

    move-result p1

    invoke-interface {v3, p1}, Ly3/c;->F(F)I

    move-result p1

    iget p2, v0, Lo0/b;->a:I

    add-int/lit8 v0, p2, -0x1

    mul-int/2addr v0, p1

    sub-int p1, v4, v0

    div-int v0, p1, p2

    rem-int/2addr p1, p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    if-ge v6, p2, :cond_5

    if-ge v6, p1, :cond_4

    const/4 v7, 0x1

    goto :goto_3

    :cond_4
    move v7, v5

    :goto_3
    add-int/2addr v7, v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v5

    array-length p1, v5

    new-array v7, p1, [I

    sget-object v6, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v2 .. v7}, Ll0/i;->c(Ly3/c;I[ILy3/m;[I)V

    new-instance p1, Ld1/j;

    const/16 p2, 0x17

    invoke-direct {p1, p2, v5, v7}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lmw0/d$d;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lhy0/a2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lnw0/j;->l(Lmw0/d$d;Lhy0/a2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lnk1/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lnk1/c;->d(Ljava/lang/String;Lnk1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Ln71/q;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ln71/o;->n(Landroidx/compose/ui/Modifier;Ln71/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lse/b;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/payments/domain/models/Card;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/whoop/payments/domain/models/Card;

    invoke-static {v0, v1, p1, p2}, Lmx1/m;->r(Lcom/whoop/payments/domain/models/Card;Lkotlin/jvm/functions/Function1;ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lmm1/k;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lmm1/i;->c(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lmm1/c;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lmm1/b;->e(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->b(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Llf0/r2;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Llf0/q2;->d(Llf0/r2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lld0/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Llf0/f2;->j(Lc93/a;Lld0/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Llf0/t1;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Llf0/s1;->b(Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Llf0/m0;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Llf0/l0;->b(Llf0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Llf0/h;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Llf0/g;->d(Llf0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lj72/j;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ll72/o;->H(Lj72/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Ll21/c;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ll21/b;->b(Ll21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Ll1/j1;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, La00/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v0, v1, p1, p2}, Ll1/j1;->a(La00/g;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Liw1/b;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    invoke-static {v0, v1, p1, p2}, Lkw1/d;->m(Liw1/b;Lkotlin/jvm/functions/Function1;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lgr1/r;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lkr1/d;->a(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkd1/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lkd1/q;->a(Lc93/a;Lkd1/o;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lj02/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lkd1/d;->b(Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lk11/f;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lk11/d;->c(Lk11/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lk00/a;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lse/b;->k(Lk00/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v1, Lgr1/b;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ljr1/d;->b(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lj21/d;->y:Ljava/lang/Object;

    check-cast v0, Lj21/i;

    iget-object v1, p0, Lj21/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lj21/e;->c(Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
