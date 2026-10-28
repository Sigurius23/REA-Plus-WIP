.class public abstract Le30/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lh20/x;

.field public final F:Lzx/o;

.field public final G:Z

.field public final H:Lny/d;

.field public final I:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field public final J:Li20/y0;

.field public final K:Lec3/h2;

.field public final L:Lec3/h2;

.field public final M:Lr20/d;

.field public final N:Ld1/j;

.field public final O:Lec3/w1;

.field public final P:Lec3/r1;

.field public final Q:Lec3/r1;

.field public final R:Lec3/h2;

.field public final S:Lec3/h2;

.field public final T:Lh20/z;

.field public final U:Lec3/h2;

.field public final V:Lec3/h2;

.field public final W:Lec3/h2;

.field public final X:Lec3/h2;

.field public final Y:Lk20/d;

.field public final Z:Lh20/f;

.field public final a0:Lh20/z4;

.field public final b0:Ln53/e;

.field public final w:Lh20/x1;

.field public final x:Lk20/a;

.field public final y:Lq83/j;

.field public final z:Landroidx/lifecycle/k1;


# direct methods
.method public constructor <init>(Lh20/x1;Lk20/a;Lz20/g;Lq83/j;Landroidx/lifecycle/k1;Lh20/x;Lzx/o;ZLny/d;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V
    .locals 24

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    move-object/from16 v9, p4

    move-object/from16 v4, p5

    move-object/from16 v10, p6

    move-object/from16 v1, p7

    move/from16 v11, p8

    move-object/from16 v3, p9

    move-object/from16 v6, p10

    const-string v7, "config"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "eventReporter"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "customerRepository"

    move-object/from16 v12, p3

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "workContext"

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "savedStateHandle"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkHandler"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cardAccountRangeRepositoryFactory"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "tapToAddCollectionHandler"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "mode"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v0, v2, Le30/c;->w:Lh20/x1;

    iput-object v5, v2, Le30/c;->x:Lk20/a;

    iput-object v9, v2, Le30/c;->y:Lq83/j;

    iput-object v4, v2, Le30/c;->z:Landroidx/lifecycle/k1;

    iput-object v10, v2, Le30/c;->E:Lh20/x;

    iput-object v1, v2, Le30/c;->F:Lzx/o;

    iput-boolean v11, v2, Le30/c;->G:Z

    iput-object v3, v2, Le30/c;->H:Lny/d;

    iput-object v6, v2, Le30/c;->I:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    new-instance v1, Li20/y0;

    new-instance v3, Li20/a0;

    iget-object v6, v0, Lh20/x1;->H:Lh20/h1;

    invoke-direct {v3, v6}, Li20/a0;-><init>(Lh20/h1;)V

    invoke-direct {v1, v3}, Li20/y0;-><init>(Li20/b0;)V

    iput-object v1, v2, Le30/c;->J:Li20/y0;

    const/4 v15, 0x0

    invoke-static {v15}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v13

    iput-object v13, v2, Le30/c;->K:Lec3/h2;

    iput-object v13, v2, Le30/c;->L:Lec3/h2;

    new-instance v3, Lr20/d;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v6

    sget-object v7, Lr20/j;->w:Lr20/j;

    new-instance v8, Ld30/f;

    const/4 v14, 0x3

    invoke-direct {v8, v2, v14}, Ld30/f;-><init>(Le30/c;I)V

    const/4 v14, 0x1

    invoke-direct {v3, v6, v7, v14, v8}, Lr20/d;-><init>(Lbc3/c0;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V

    iput-object v3, v2, Le30/c;->M:Lr20/d;

    new-instance v6, Ld1/j;

    new-instance v7, Lf1/p1;

    iget-object v8, v0, Lh20/x1;->V:Ljava/lang/String;

    move/from16 p9, v14

    sget-object v14, Li20/j;->a:Ljava/util/Set;

    invoke-direct {v7, v8, v14}, Lf1/p1;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-direct {v6, v1, v7}, Ld1/j;-><init>(Li20/y0;Lf1/p1;)V

    iput-object v6, v2, Le30/c;->N:Ld1/j;

    const/4 v14, 0x0

    const/4 v1, 0x7

    invoke-static {v14, v14, v15, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v6

    iput-object v6, v2, Le30/c;->O:Lec3/w1;

    const-string v6, "selection"

    invoke-virtual {v4, v15, v6}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object v7

    iput-object v7, v2, Le30/c;->P:Lec3/r1;

    const-string v6, "processing"

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v8, v6}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object v6

    iput-object v6, v2, Le30/c;->Q:Lec3/r1;

    invoke-static {v15}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v2, Le30/c;->R:Lec3/h2;

    invoke-static {v15}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v2, Le30/c;->S:Lec3/h2;

    new-instance v16, Lh20/z;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v17

    iget-object v0, v0, Lh20/x1;->w:Ljava/lang/String;

    new-instance v8, Le30/a;

    const/4 v15, 0x2

    invoke-direct {v8, v2, v15}, Le30/a;-><init>(Le30/c;I)V

    new-instance v1, Le30/a;

    const/4 v15, 0x3

    invoke-direct {v1, v2, v15}, Le30/a;-><init>(Le30/c;I)V

    move-object/from16 v19, v0

    move-object/from16 v21, v1

    move-object/from16 v18, v7

    move-object/from16 v20, v8

    invoke-direct/range {v16 .. v21}, Lh20/z;-><init>(Ln8/a;Lec3/r1;Ljava/lang/String;Le30/a;Le30/a;)V

    move-object/from16 v0, v16

    move-object/from16 v15, v18

    iput-object v0, v2, Le30/c;->T:Lh20/z;

    new-instance v0, Lx30/e0;

    new-instance v1, Ld0/o2;

    const/16 v7, 0xa

    invoke-direct {v1, v7}, Ld0/o2;-><init>(I)V

    sget-object v7, Ly00/i;->X:Ly00/i;

    invoke-static {v7}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v7

    const/4 v8, 0x4

    invoke-direct {v0, v1, v7, v8}, Lx30/e0;-><init>(Ld0/o2;Lec3/f2;I)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, v2, Le30/c;->U:Lec3/h2;

    iput-object v0, v2, Le30/c;->V:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, v2, Le30/c;->W:Lec3/h2;

    iput-object v0, v2, Le30/c;->X:Lec3/h2;

    new-instance v0, Lk20/d;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v7

    move v1, v8

    new-instance v8, Le30/a;

    invoke-direct {v8, v2, v14}, Le30/a;-><init>(Le30/c;I)V

    iget-object v3, v3, Lr20/d;->g:Ln53/e;

    move-object/from16 v23, v3

    move-object v3, v0

    move-object v0, v6

    move-object/from16 v6, v23

    invoke-direct/range {v3 .. v8}, Lk20/d;-><init>(Landroidx/lifecycle/k1;Lk20/a;Ln53/e;Ln8/a;Le30/a;)V

    move-object v8, v6

    iput-object v3, v2, Le30/c;->Y:Lk20/d;

    new-instance v3, Lh00/l0;

    const/4 v5, 0x5

    invoke-direct {v3, v5}, Lh00/l0;-><init>(I)V

    invoke-static {v13, v3}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v3

    new-instance v9, Lh20/f;

    invoke-direct {v9, v3, v4, v15}, Lh20/f;-><init>(Ln53/e;Landroidx/lifecycle/k1;Lec3/f2;)V

    iput-object v9, v2, Le30/c;->Z:Lh20/f;

    new-instance v16, Lh20/z4;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v17

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v18, Lhc3/o;->a:Lbc3/w1;

    move-object v3, v0

    new-instance v0, Lg40/f4;

    const/4 v6, 0x0

    const/4 v7, 0x6

    move v4, v1

    const/4 v1, 0x1

    move-object v5, v3

    const-class v3, Le30/c;

    move/from16 v19, v4

    const-string v4, "updateSelection"

    move-object/from16 v20, v5

    const-string v5, "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V"

    move-object/from16 v21, v15

    move/from16 v14, v19

    move-object/from16 v15, v20

    invoke-direct/range {v0 .. v7}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v6, v8

    move-object v8, v0

    move-object v0, v2

    new-instance v1, La6/e;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v14}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v11, Lou1/a;

    const/4 v3, 0x7

    invoke-direct {v11, v3}, Lou1/a;-><init>(I)V

    new-instance v12, Lb30/t0;

    const/4 v3, 0x3

    invoke-direct {v12, v0, v3}, Lb30/t0;-><init>(Ljava/lang/Object;I)V

    iget-object v4, v10, Lh20/x;->c:Lec3/h2;

    xor-int/lit8 v14, p8, 0x1

    move-object/from16 v2, p2

    move-object v10, v1

    move-object/from16 v22, v6

    move-object v1, v13

    move-object/from16 v3, v17

    move-object/from16 v5, v18

    move-object/from16 v7, v21

    move-object/from16 v6, p3

    move-object v15, v0

    move-object v13, v4

    move-object/from16 v0, v16

    move-object/from16 v4, p4

    invoke-direct/range {v0 .. v14}, Lh20/z4;-><init>(Lec3/f2;Lk20/a;Lbc3/c0;Lq83/j;Lq83/j;Lz20/g;Lec3/r1;Lkotlin/jvm/functions/Function1;Lh20/f;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/o;Lec3/f2;Z)V

    invoke-static {v15}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lh20/i0;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v15, v0, v3, v4}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput-object v0, v15, Le30/c;->a0:Lh20/z4;

    new-instance v0, Ldo0/c;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    move-object/from16 v6, v22

    invoke-static {v6, v0}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    new-instance v1, Ldw1/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ldw1/a;-><init>(I)V

    move-object/from16 v5, v20

    invoke-static {v5, v0, v1}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v0

    iput-object v0, v15, Le30/c;->b0:Ln53/e;

    invoke-static {v15}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Le30/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v15, v2, v3}, Le30/b;-><init>(Le30/c;Lq83/d;I)V

    invoke-static {v0, v2, v2, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public abstract g()V
.end method

.method public abstract j()Lec3/f2;
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Le30/c;->n()Lh20/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lh20/d0;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Le30/c;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lv00/c0;

    invoke-virtual {v0}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public abstract n()Lh20/d0;
.end method

.method public final o()Lh20/x2;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Le30/c;->w:Lh20/x1;

    iget-object v1, v1, Lh20/x1;->O:Lh20/x2;

    iget-object v2, v0, Le30/c;->L:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv00/c0;

    if-eqz v2, :cond_0

    iget-object v4, v2, Lv00/c0;->j0:Ly00/r1;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v2, :cond_1

    if-eqz v4, :cond_1

    iget-object v5, v4, Ly00/r1;->x:Ljava/util/Map;

    sget-object v6, Lh20/x2;->y:Lh20/x2;

    if-eq v1, v6, :cond_2

    :cond_1
    move-object/from16 v16, v1

    goto/16 :goto_7

    :cond_2
    sget-object v6, Ly00/q1;->E:Ly00/q1;

    sget-object v7, Ly00/q1;->F:Ly00/q1;

    sget-object v8, Ly00/q1;->G:Ly00/q1;

    filled-new-array {v6, v7, v8}, [Ly00/q1;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly00/q1;

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_7

    new-instance v9, Lhy/g;

    iget-object v10, v0, Le30/c;->Z:Lh20/f;

    iget-object v10, v10, Lh20/f;->c:Ln53/e;

    iget-object v10, v10, Ln53/e;->y:Ll83/e;

    check-cast v10, Lc93/a;

    invoke-interface {v10}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    const/4 v11, 0x1

    xor-int/2addr v10, v11

    const-string v12, "experiment"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mode"

    iget-object v13, v0, Le30/c;->I:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v4, Ly00/r1;->w:Ljava/lang/String;

    invoke-virtual {v2}, Lv00/c0;->J()Ljava/util/ArrayList;

    move-result-object v14

    new-instance v15, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v14, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lu00/f;

    iget-object v14, v14, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    iget-boolean v3, v2, Lv00/c0;->Q:Z

    iget-object v14, v2, Lv00/c0;->l0:La30/l0;

    if-eqz v14, :cond_4

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    :goto_3
    const/16 v19, 0x0

    const/16 v20, 0x3e

    const-string v16, ","

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v1

    new-instance v1, Ll83/k;

    move-object/from16 v17, v2

    const-string v2, "displayed_payment_method_types"

    invoke-direct {v1, v2, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v3, :cond_5

    const-string v2, "google_pay"

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    invoke-static {v2, v15}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v11, :cond_6

    const-string v3, "link"

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    invoke-static {v3, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v21

    const/16 v25, 0x0

    const/16 v26, 0x3e

    const-string v22, ","

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v11, "displayed_payment_method_types_including_wallets"

    invoke-direct {v3, v11, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v13, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->w:Ljava/lang/String;

    new-instance v11, Ll83/k;

    const-string v13, "in_app_elements_integration_type"

    invoke-direct {v11, v13, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3, v11}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v10, "has_saved_payment_method"

    invoke-direct {v3, v10, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v9, v7, v12, v8, v1}, Lhy/h;-><init>(Ly00/q1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v1, v0, Le30/c;->x:Lk20/a;

    invoke-virtual {v1, v9}, Lk20/a;->k(Lhy/h;)V

    goto :goto_6

    :cond_7
    move-object/from16 v16, v1

    move-object/from16 v17, v2

    :goto_6
    move-object/from16 v1, v16

    move-object/from16 v2, v17

    goto/16 :goto_1

    :cond_8
    move-object/from16 v16, v1

    sget-object v1, Ly00/q1;->G:Ly00/q1;

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    const-string v2, "control"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v1, Lh20/x2;->x:Lh20/x2;

    return-object v1

    :cond_9
    const-string v2, "treatment"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lh20/x2;->w:Lh20/x2;

    return-object v1

    :cond_a
    :goto_7
    return-object v16
.end method

.method public final onCleared()V
    .locals 3

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le30/c;->y(Lh20/d0;)V

    iget-object v1, p0, Le30/c;->z:Landroidx/lifecycle/k1;

    const-string v2, "selection"

    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract p()Ln53/e;
.end method

.method public abstract q()Lec3/f2;
.end method

.method public abstract r()Lec3/f2;
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, Le30/c;->Q:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le30/c;->M:Lr20/d;

    invoke-virtual {v0}, Lr20/d;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lr20/d;->b()V

    return-void

    :cond_1
    invoke-virtual {p0}, Le30/c;->w()V

    return-void
.end method

.method public abstract u(Lq20/y;)V
.end method

.method public abstract v(Lzy/c;)V
.end method

.method public abstract w()V
.end method

.method public abstract y(Lh20/d0;)V
.end method

.method public final z(Lq20/y;)V
    .locals 3

    instance-of v0, p1, Lq20/t;

    if-eqz v0, :cond_0

    new-instance v0, Lh20/c0;

    move-object v1, p1

    check-cast v1, Lq20/t;

    invoke-direct {v0, v1}, Lh20/c0;-><init>(Lq20/t;)V

    invoke-virtual {p0, v0}, Le30/c;->y(Lh20/d0;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lq20/g;

    if-eqz v0, :cond_1

    new-instance v0, Lh20/a0;

    move-object v1, p1

    check-cast v1, Lq20/g;

    invoke-direct {v0, v1}, Lh20/a0;-><init>(Lq20/g;)V

    invoke-virtual {p0, v0}, Le30/c;->y(Lh20/d0;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lq20/i;

    if-eqz v0, :cond_2

    new-instance v0, Lh20/b0;

    move-object v1, p1

    check-cast v1, Lq20/i;

    invoke-direct {v0, v1}, Lh20/b0;-><init>(Lq20/i;)V

    invoke-virtual {p0, v0}, Le30/c;->y(Lh20/d0;)V

    :cond_2
    :goto_0
    iget-object v0, p0, Le30/c;->z:Landroidx/lifecycle/k1;

    const-string v1, "selection"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lq20/w;

    if-eqz v0, :cond_5

    check-cast p1, Lq20/w;

    iget-object p1, p1, Lq20/w;->x:Ly00/o4;

    iget-object v0, p1, Ly00/o4;->E:Ly00/f4;

    sget-object v1, Ly00/f4;->I:Ly00/f4;

    if-ne v0, v1, :cond_5

    new-instance v0, Lx30/e0;

    new-instance v1, Ld0/o2;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ld0/o2;-><init>(I)V

    iget-object p1, p1, Ly00/o4;->H:Ly00/z3;

    if-eqz p1, :cond_3

    iget-object p1, p1, Ly00/z3;->w:Ly00/i;

    if-nez p1, :cond_4

    :cond_3
    sget-object p1, Ly00/i;->X:Ly00/i;

    :cond_4
    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    const/4 v2, 0x4

    invoke-direct {v0, v1, p1, v2}, Lx30/e0;-><init>(Ld0/o2;Lec3/f2;I)V

    iget-object p1, p0, Le30/c;->U:Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Le30/b;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Le30/b;-><init>(Le30/c;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    invoke-virtual {p0}, Le30/c;->g()V

    return-void
.end method
