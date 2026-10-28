.class public final Lc4/q;
.super Lkotlin/jvm/internal/m;
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
    iput p1, p0, Lc4/q;->w:I

    iput-object p2, p0, Lc4/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc4/q;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;Landroidx/compose/ui/Modifier;JI)V
    .locals 0

    const/4 p3, 0x6

    iput p3, p0, Lc4/q;->w:I

    .line 2
    iput-object p1, p0, Lc4/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc4/q;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p4, p0, Lc4/q;->w:I

    iput-object p1, p0, Lc4/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc4/q;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v1, p0

    iget v0, v1, Lc4/q;->w:I

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Ly2/f0;

    iget-object v2, v2, Ly2/f0;->g:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v4, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v4, Lc93/m;

    invoke-virtual {v0, v2}, Lp1/q;->h0(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v3, :cond_1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v0, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    iget v3, v0, Lp1/q;->l:I

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "No nodes can be emitted before calling dactivateToEndGroup"

    invoke-static {v3}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_1
    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_4

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lp1/q;->W()V

    goto :goto_2

    :cond_3
    iget-object v2, v0, Lp1/q;->G:Lp1/e2;

    iget v3, v2, Lp1/e2;->g:I

    iget v2, v2, Lp1/e2;->h:I

    iget-object v4, v0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v5}, Lq1/b;->d(Z)V

    iget-object v4, v4, Lq1/b;->b:Lq1/a;

    iget-object v4, v4, Lq1/a;->a:Lq1/l0;

    sget-object v6, Lq1/i;->d:Lq1/i;

    invoke-virtual {v4, v6}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v4, v0, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-static {v3, v2, v4}, Lp1/r;->a(IILjava/util/List;)V

    iget-object v2, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2}, Lp1/e2;->t()V

    :cond_4
    :goto_2
    iget-boolean v2, v0, Lp1/q;->y:Z

    if-eqz v2, :cond_5

    iget-object v2, v0, Lp1/q;->G:Lp1/e2;

    iget v2, v2, Lp1/e2;->i:I

    iget v3, v0, Lp1/q;->z:I

    if-ne v2, v3, :cond_5

    const/4 v2, -0x1

    iput v2, v0, Lp1/q;->z:I

    iput-boolean v5, v0, Lp1/q;->y:Z

    :cond_5
    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ljava/util/List;

    move-object/from16 v2, p2

    check-cast v2, Lz40/e;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/g0;

    const-string v4, "<this>"

    const-string v5, "devices"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v5, Lt23/a2;

    invoke-virtual {v5}, Lt23/a2;->c()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->z:Lb23/g;

    iget-object v9, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    const/4 v10, 0x0

    if-eqz v7, :cond_7

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v11, "[audioSwitch] audio devices. selected "

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", available devices are "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v8, v9, v7, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v6, v5, Lt23/a2;->p:Lec3/h2;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz40/e;

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v9, v8, Lz40/a;

    if-eqz v9, :cond_8

    new-instance v9, Lc33/h;

    invoke-direct {v9, v8}, Lc33/h;-><init>(Lz40/e;)V

    goto :goto_5

    :cond_8
    instance-of v9, v8, Lz40/d;

    if-eqz v9, :cond_9

    new-instance v9, Lc33/k;

    invoke-direct {v9, v8}, Lc33/k;-><init>(Lz40/e;)V

    goto :goto_5

    :cond_9
    instance-of v9, v8, Lz40/b;

    if-eqz v9, :cond_a

    new-instance v9, Lc33/i;

    invoke-direct {v9, v8}, Lc33/i;-><init>(Lz40/e;)V

    goto :goto_5

    :cond_a
    instance-of v9, v8, Lz40/c;

    if-eqz v9, :cond_b

    new-instance v9, Lc33/j;

    invoke-direct {v9, v8}, Lc33/j;-><init>(Lz40/e;)V

    :goto_5
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v10, v7}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v5, Lt23/a2;->m:Lec3/h2;

    if-eqz v2, :cond_11

    instance-of v4, v2, Lz40/a;

    if-eqz v4, :cond_d

    new-instance v4, Lc33/h;

    invoke-direct {v4, v2}, Lc33/h;-><init>(Lz40/e;)V

    goto :goto_6

    :cond_d
    instance-of v4, v2, Lz40/d;

    if-eqz v4, :cond_e

    new-instance v4, Lc33/k;

    invoke-direct {v4, v2}, Lc33/k;-><init>(Lz40/e;)V

    goto :goto_6

    :cond_e
    instance-of v4, v2, Lz40/b;

    if-eqz v4, :cond_f

    new-instance v4, Lc33/i;

    invoke-direct {v4, v2}, Lc33/i;-><init>(Lz40/e;)V

    goto :goto_6

    :cond_f
    instance-of v4, v2, Lz40/c;

    if-eqz v4, :cond_10

    new-instance v4, Lc33/j;

    invoke-direct {v4, v2}, Lc33/j;-><init>(Lz40/e;)V

    goto :goto_6

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_11
    move-object v4, v10

    :goto_6
    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, v5, Lt23/a2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_12
    iput-object v10, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Lsj/l;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/16 v4, 0x9

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v0, v4}, Ls3/d;->b(Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/Marker;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    const/4 v4, 0x1

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v0, v4}, Lse/g;->k(Lcom/amplitude/android/engagement/types/Marker;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Rect;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/16 v4, 0x39

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v0, v4}, Lvp/c;->o(Landroid/graphics/Rect;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Lx1/b;

    const/16 v4, 0x37

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v0, v4}, Lx43/j;->g(Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    iget-object v5, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v5, Lmj/g;

    iget-object v6, v5, Lmj/g;->a:Lcom/amplitude/android/engagement/a;

    and-int/lit8 v3, v3, 0xb

    const/4 v7, 0x2

    if-ne v3, v7, :cond_14

    move-object v3, v2

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_13

    goto :goto_7

    :cond_13
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_14
    :goto_7
    move-object v14, v2

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_15

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v2, Lp1/c1;

    iget-object v3, v6, Lcom/amplitude/android/engagement/a;->j:Lec3/r1;

    const/16 v8, 0x8

    invoke-static {v3, v14, v8}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amplitude/android/engagement/types/SimulationContext;

    const/4 v8, 0x0

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getSimulatedNudge()Lcom/amplitude/android/engagement/types/Nudge;

    move-result-object v9

    if-nez v9, :cond_16

    goto :goto_d

    :cond_16
    iget-object v6, v6, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesCooldown()Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesSnoozedConditions()Z

    move-result v9

    if-nez v9, :cond_18

    :cond_17
    if-eqz v6, :cond_19

    :cond_18
    sget-object v9, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_8

    :cond_19
    sget-object v9, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    :goto_8
    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getBypassCustomThrottles()Z

    move-result v10

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesCustomThrottles()Z

    move-result v11

    if-nez v10, :cond_1b

    if-nez v11, :cond_1b

    if-eqz v6, :cond_1a

    goto :goto_9

    :cond_1a
    sget-object v6, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_a

    :cond_1b
    :goto_9
    sget-object v6, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    :goto_a
    invoke-static {v3}, Loj/v;->b(Lcom/amplitude/android/engagement/types/SimulationContext;)Lcom/amplitude/android/engagement/types/DebugStatus;

    move-result-object v3

    filled-new-array {v9, v6, v3}, [Lcom/amplitude/android/engagement/types/DebugStatus;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/amplitude/android/engagement/types/DebugStatus;

    sget-object v10, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    if-eq v9, v10, :cond_1c

    goto :goto_b

    :cond_1d
    move-object v6, v8

    :goto_b
    check-cast v6, Lcom/amplitude/android/engagement/types/DebugStatus;

    if-nez v6, :cond_1e

    sget-object v6, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    :cond_1e
    :goto_c
    move-object v11, v6

    goto :goto_e

    :cond_1f
    :goto_d
    sget-object v6, Lcom/amplitude/android/engagement/types/DebugStatus;->ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_c

    :goto_e
    sget-object v3, Lmj/d;->a:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v3, v3, v6

    const/4 v6, 0x1

    if-eq v3, v6, :cond_23

    if-eq v3, v7, :cond_22

    const/4 v6, 0x3

    if-eq v3, v6, :cond_21

    const/4 v6, 0x4

    if-ne v3, v6, :cond_20

    sget-wide v9, Li2/x;->g:J

    goto :goto_f

    :cond_20
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_21
    sget-wide v9, Luj/g;->l:J

    goto :goto_f

    :cond_22
    sget-wide v9, Luj/g;->l:J

    goto :goto_f

    :cond_23
    sget-wide v9, Luj/g;->u:J

    :goto_f
    sget-object v3, Lb2/t;->w:Lb2/t;

    new-instance v6, Lh20/i0;

    iget-object v12, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v12, Landroidx/compose/ui/platform/ComposeView;

    const/16 v13, 0x1b

    invoke-direct {v6, v12, v8, v13}, Lh20/i0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3, v0, v6}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_24

    if-ne v6, v4, :cond_25

    :cond_24
    new-instance v6, Lmj/e;

    const/4 v3, 0x0

    invoke-direct {v6, v3, v2}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object v13, v6

    check-cast v13, Lc93/a;

    const/4 v15, 0x0

    invoke-static/range {v9 .. v15}, Ldp/d;->j(JLcom/amplitude/android/engagement/types/DebugStatus;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_28

    const/4 v3, 0x6

    invoke-static {v3, v8, v14, v7}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v11

    sget-wide v6, Luj/g;->e:J

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_26

    if-ne v8, v4, :cond_27

    :cond_26
    new-instance v8, Lmj/e;

    const/4 v3, 0x1

    invoke-direct {v8, v3, v2}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v9, v8

    check-cast v9, Lc93/a;

    new-instance v3, Lmj/f;

    invoke-direct {v3, v5, v2}, Lmj/f;-><init>(Lmj/g;Lp1/c1;)V

    const v2, 0x244850ed

    invoke-static {v2, v14, v3}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v24

    const/high16 v26, 0x30000

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v25, v14

    move-wide v14, v6

    invoke-static/range {v9 .. v26}, Ll1/n2;->b(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :cond_28
    :goto_10
    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/android/replay/k;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    const-string v4, "$this$onScreenshotRecorded"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Bitmap;

    iget-object v5, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/g0;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "bitmap"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_2c

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v6

    if-eqz v6, :cond_29

    goto :goto_12

    :cond_29
    invoke-virtual {v0}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_2a

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    :cond_2a
    new-instance v6, Ljava/io/File;

    invoke-virtual {v0}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, ".jpg"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z

    monitor-enter v4

    :try_start_0
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_2b

    monitor-exit v4

    goto :goto_12

    :cond_2b
    :try_start_1
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v9, v0, Lio/sentry/android/replay/k;->w:Lio/sentry/q6;

    invoke-virtual {v9}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v9

    iget-object v9, v9, Lio/sentry/u6;->g:Lio/sentry/t6;

    iget v9, v9, Lio/sentry/t6;->screenshotQuality:I

    invoke-virtual {v4, v8, v9, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v0, v6, v2, v3, v5}, Lio/sentry/android/replay/k;->b(Ljava/io/File;JLjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v4

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_11

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v7, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_11
    monitor-exit v4

    throw v0

    :cond_2c
    :goto_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x1

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v0, v4}, Landroidx/room/c1;->b(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2e

    move-object v2, v0

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2d

    goto :goto_13

    :cond_2d
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_14

    :cond_2e
    :goto_13
    iget-object v2, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v2, Lgb/p;

    iget-object v2, v2, Lgb/p;->M:Lx1/b;

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Leb/q;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v0, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v1, Lc4/q;->x:Ljava/lang/Object;

    check-cast v3, Lc4/f0;

    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_2f

    move v4, v7

    goto :goto_15

    :cond_2f
    move v4, v6

    :goto_15
    and-int/2addr v2, v7

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_38

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_30

    sget-object v4, Lc4/d;->E:Lc4/d;

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v6, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_31

    if-ne v8, v5, :cond_32

    :cond_31
    new-instance v8, Lc4/n;

    const/4 v4, 0x1

    invoke-direct {v8, v3, v4}, Lc4/n;-><init>(Lc4/f0;I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v8}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v3}, Lc4/f0;->getCanCalculatePosition()Z

    move-result v3

    if-eqz v3, :cond_33

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_16

    :cond_33
    const/4 v3, 0x0

    :goto_16
    invoke-static {v3, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v1, Lc4/q;->y:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc93/m;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_34

    sget-object v4, Lc4/h;->c:Lc4/h;

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v4, Ly2/r0;

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_35

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_35
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_17
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_36

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_37

    :cond_36
    invoke-static {v5, v0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_37
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v3, v0, v7}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_18

    :cond_38
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
