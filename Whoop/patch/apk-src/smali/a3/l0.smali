.class public final La3/l0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La3/l0;->w:I

    iput-object p1, p0, La3/l0;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    iget v0, v1, La3/l0;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, v1, La3/l0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lzl/a;

    check-cast v7, Lcom/google/accompanist/drawablepainter/DrawablePainter;

    invoke-direct {v0, v7}, Lzl/a;-><init>(Lcom/google/accompanist/drawablepainter/DrawablePainter;)V

    return-object v0

    :pswitch_0
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    check-cast v7, Lz53/g;

    iget-object v0, v7, Lz53/g;->y:Lz53/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    invoke-virtual {v2, v0}, Lbc3/z;->limitedParallelism(I)Lbc3/z;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v7, Lz2/d;

    iget-object v0, v7, Lz2/d;->c:Lr1/c;

    iget-object v2, v7, Lz2/d;->b:Lr1/c;

    iget-object v3, v7, Lz2/d;->e:Lr1/c;

    iput-boolean v4, v7, Lz2/d;->f:Z

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    iget-object v7, v7, Lz2/d;->d:Lr1/c;

    iget-object v8, v7, Lr1/c;->w:[Ljava/lang/Object;

    iget v9, v7, Lr1/c;->y:I

    move v10, v4

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    check-cast v11, La3/n0;

    iget-object v12, v3, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v12, v12, v10

    check-cast v12, Lz2/h;

    iget-object v11, v11, La3/n0;->e0:La3/l1;

    iget-object v11, v11, La3/l1;->g:Ljava/lang/Object;

    check-cast v11, Lb2/v;

    iget-boolean v13, v11, Lb2/v;->N:Z

    if-eqz v13, :cond_0

    invoke-static {v11, v12, v5}, Lz2/d;->b(Lb2/v;Lz2/h;Ljava/util/HashSet;)V

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v7}, Lr1/c;->g()V

    invoke-virtual {v3}, Lr1/c;->g()V

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v7, v2, Lr1/c;->y:I

    :goto_1
    if-ge v4, v7, :cond_3

    aget-object v8, v3, v4

    check-cast v8, La3/d;

    iget-object v9, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v9, v9, v4

    check-cast v9, Lz2/h;

    iget-boolean v10, v8, Lb2/v;->N:Z

    if-eqz v10, :cond_2

    invoke-static {v8, v9, v5}, Lz2/d;->b(Lb2/v;Lz2/h;Ljava/util/HashSet;)V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lr1/c;->g()V

    invoke-virtual {v0}, Lr1/c;->g()V

    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/d;

    invoke-virtual {v2}, La3/d;->Z0()V

    goto :goto_2

    :cond_4
    return-object v6

    :pswitch_2
    new-instance v0, Lbc3/e2;

    invoke-direct {v0, v3}, Lbc3/l1;-><init>(Lbc3/k1;)V

    new-instance v2, Lo63/g;

    sget-object v3, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v2, v3, v4}, Lo63/g;-><init>(Lq83/i;I)V

    invoke-static {v0, v2}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    check-cast v7, Ly53/c;

    check-cast v7, Lz53/g;

    iget-object v2, v7, Lz53/g;->z:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/z;

    invoke-interface {v0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v2, Lbc3/b0;

    const-string v3, "ktor-okhttp-context"

    invoke-direct {v2, v3}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v7, Ly2/u1;

    invoke-virtual {v7}, Ly2/u1;->a()Ly2/n0;

    move-result-object v0

    iget-object v3, v0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v3}, La3/n0;->r()Ljava/util/List;

    move-result-object v7

    check-cast v7, Lr1/b;

    iget-object v7, v7, Lr1/b;->w:Lr1/c;

    iget v7, v7, Lr1/c;->y:I

    iget v8, v0, Ly2/n0;->N:I

    if-eq v8, v7, :cond_a

    iget-object v0, v0, Ly2/n0;->F:La0/v0;

    iget-object v7, v0, La0/v0;->c:[Ljava/lang/Object;

    iget-object v0, v0, La0/v0;->a:[J

    array-length v8, v0

    sub-int/2addr v8, v2

    const/4 v2, 0x7

    if-ltz v8, :cond_8

    move v9, v4

    :goto_3
    aget-wide v10, v0, v9

    not-long v12, v10

    shl-long/2addr v12, v2

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_7

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move v14, v4

    :goto_4
    if-ge v14, v12, :cond_6

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_5

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    aget-object v15, v7, v15

    check-cast v15, Ly2/f0;

    iput-boolean v5, v15, Ly2/f0;->d:Z

    :cond_5
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_6
    if-ne v12, v13, :cond_8

    :cond_7
    if-eq v9, v8, :cond_8

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_8
    iget-object v0, v3, La3/n0;->G:La3/n0;

    if-eqz v0, :cond_9

    invoke-virtual {v3}, La3/n0;->x()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {v3, v4, v2}, La3/n0;->t0(La3/n0;ZI)V

    goto :goto_5

    :cond_9
    invoke-virtual {v3}, La3/n0;->A()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {v3, v4, v2}, La3/n0;->v0(La3/n0;ZI)V

    :cond_a
    :goto_5
    return-object v6

    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "| put parameters on stack "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v7, Luf3/a;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v7, Lt2/g;

    invoke-virtual {v7}, Lt2/g;->X0()Lbc3/c0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v7, Lt2/d;

    iget-object v0, v7, Lt2/d;->d:Lbc3/c0;

    return-object v0

    :pswitch_7
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    check-cast v7, Lq3/b0;

    iget-object v2, v7, Lq3/b0;->a:Landroid/view/View;

    invoke-direct {v0, v2, v4}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-object v0

    :pswitch_8
    check-cast v7, La3/p;

    iget-object v0, v7, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0

    :pswitch_9
    check-cast v7, Landroidx/compose/ui/graphics/vector/VectorPainter;

    iget v0, v7, Landroidx/compose/ui/graphics/vector/VectorPainter;->K:I

    iget-object v2, v7, Landroidx/compose/ui/graphics/vector/VectorPainter;->H:Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v3

    if-ne v0, v3, :cond_b

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v0

    add-int/2addr v0, v5

    invoke-virtual {v2, v0}, Lp1/h1;->y(I)V

    :cond_b
    return-object v6

    :pswitch_a
    check-cast v7, Lkk/b;

    iget-object v0, v7, Lkk/b;->e:Lik/b;

    iget-object v2, v7, Lkk/b;->a:Lgj/d;

    iget-object v3, v2, Lgj/d;->a:Lgj/g;

    iget-object v4, v7, Lkk/b;->f:Lbc3/c0;

    iget-object v2, v2, Lgj/d;->f:Lbc3/z;

    invoke-interface {v0, v7, v3, v4, v2}, Lik/b;->g(Lkk/b;Lgj/g;Lbc3/c0;Lbc3/z;)Lnk/m;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v7, Lj3/b;

    iput-object v3, v7, Lj3/b;->g:Lb2/b;

    const-string v0, "OnPositionedDispatch"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v7}, Lj3/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v6

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :pswitch_c
    new-instance v0, Lio/sentry/j0;

    invoke-direct {v0, v5}, Lio/sentry/j0;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v2, Lio/sentry/android/replay/util/d;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v7, Lio/sentry/android/replay/ReplayIntegration;

    iget-object v4, v7, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v4, :cond_c

    invoke-direct {v2, v0, v4}, Lio/sentry/android/replay/util/d;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/q6;)V

    return-object v2

    :cond_c
    const-string v0, "options"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :pswitch_d
    check-cast v7, Landroidx/navigation/fragment/NavHostFragment;

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v5, Leb/u0;

    invoke-direct {v5, v0}, Leb/a0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v7}, Leb/u0;->O(Landroidx/lifecycle/g0;)V

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    const-string v6, "viewModelStore"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Leb/u0;->P(Landroidx/lifecycle/e2;)V

    new-instance v0, Lhb/d;

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v6

    const-string v8, "requireContext()"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v9

    const-string v10, "childFragmentManager"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v6, v9}, Lhb/d;-><init>(Landroid/content/Context;Landroidx/fragment/app/o1;)V

    iget-object v6, v5, Leb/a0;->w:Leb/j1;

    invoke-virtual {v6, v0}, Leb/j1;->a(Leb/i1;)V

    new-instance v0, Lhb/f;

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getId()I

    move-result v10

    if-eqz v10, :cond_d

    const/4 v11, -0x1

    if-eq v10, v11, :cond_d

    goto :goto_6

    :cond_d
    const v10, 0x7f0a0946

    :goto_6
    invoke-direct {v0, v9, v8, v10}, Lhb/f;-><init>(Landroid/content/Context;Landroidx/fragment/app/o1;I)V

    invoke-virtual {v6, v0}, Leb/j1;->a(Leb/i1;)V

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    const-string v6, "android-support-nav:fragment:navControllerState"

    invoke-virtual {v0, v6}, Lpb/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v0}, Leb/a0;->H(Landroid/os/Bundle;)V

    :cond_e
    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    new-instance v8, Lb3/z1;

    invoke-direct {v8, v5, v2}, Lb3/z1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v6, v8}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    const-string v2, "android-support-nav:fragment:graphId"

    invoke-virtual {v0, v2}, Lpb/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v7, Landroidx/navigation/fragment/NavHostFragment;->y:I

    :cond_f
    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    new-instance v6, Lb3/z1;

    const/4 v8, 0x3

    invoke-direct {v6, v7, v8}, Lb3/z1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2, v6}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    iget v0, v7, Landroidx/navigation/fragment/NavHostFragment;->y:I

    iget-object v6, v5, Leb/a0;->D:Ll83/p;

    if-eqz v0, :cond_10

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/v0;

    invoke-virtual {v2, v0}, Leb/v0;->b(I)Leb/r0;

    move-result-object v0

    invoke-virtual {v5, v0, v3}, Leb/a0;->K(Leb/r0;Landroid/os/Bundle;)V

    goto :goto_7

    :cond_10
    invoke-virtual {v7}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    :cond_11
    if-eqz v0, :cond_12

    const-string v2, "android-support-nav:fragment:startDestinationArgs"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    :cond_12
    if-eqz v4, :cond_13

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/v0;

    invoke-virtual {v0, v4}, Leb/v0;->b(I)Leb/r0;

    move-result-object v0

    invoke-virtual {v5, v0, v3}, Leb/a0;->K(Leb/r0;Landroid/os/Bundle;)V

    :cond_13
    :goto_7
    return-object v5

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "NavController cannot be created before the fragment is attached"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_e
    new-instance v0, Lgk/a;

    check-cast v7, Leb/k;

    invoke-direct {v0, v7}, Lgk/a;-><init>(Leb/k;)V

    return-object v0

    :pswitch_f
    check-cast v7, Lp1/t2;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Leb/q;

    iget-object v4, v4, Leb/q;->x:Leb/n0;

    iget-object v4, v4, Leb/n0;->w:Ljava/lang/String;

    const-string v5, "composable"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_16
    return-object v2

    :pswitch_10
    check-cast v7, Landroid/content/Context;

    invoke-static {v7}, Lge3/g;->d(Landroid/content/Context;)Leb/u0;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v7, Lwe/o;

    iget-object v0, v7, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v0, v0, Lgj/d;->k:Lfk/a;

    const-string v2, "androidx.fragment.app.FragmentActivity"

    invoke-static {v2, v0}, Lvd/e;->H(Ljava/lang/String;Lfk/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v7, Ljava/lang/String;

    const-string v0, "uriPattern"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/f0;

    invoke-direct {v0, v7, v3, v3}, Leb/f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_13
    check-cast v7, Leb/a0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Leb/v0;

    iget-object v2, v7, Leb/a0;->a:Landroid/content/Context;

    iget-object v3, v7, Leb/a0;->w:Leb/j1;

    invoke-direct {v0, v2, v3}, Leb/v0;-><init>(Landroid/content/Context;Leb/j1;)V

    return-object v0

    :pswitch_14
    check-cast v7, Ld0/z1;

    iget-object v0, v7, Ld0/z1;->a:Lal/a;

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lc0/q0;->y:Lc0/q0;

    if-ne v0, v2, :cond_17

    iget-object v0, v7, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_17

    move v4, v5

    :cond_17
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v7, Lkotlin/jvm/internal/g0;

    iget-object v0, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :pswitch_16
    return-object v6

    :pswitch_17
    check-cast v7, La63/o;

    iget-boolean v0, v7, La63/o;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Li2/x0;->O:Li2/a1;

    iget-wide v3, v0, Li2/x0;->R:J

    iget-object v5, v0, Li2/x0;->T:Ly3/m;

    iget-object v7, v0, Li2/x0;->S:Ly3/c;

    invoke-interface {v2, v3, v4, v5, v7}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v2

    iput-object v2, v0, Li2/x0;->W:Li2/p0;

    return-object v6

    :pswitch_19
    check-cast v7, La3/n0;

    invoke-virtual {v7}, La3/n0;->t()La3/r0;

    move-result-object v0

    iget-object v2, v0, La3/r0;->p:La3/g1;

    iput-boolean v5, v2, La3/g1;->a0:Z

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_18

    iput-boolean v5, v0, La3/c1;->U:Z

    :cond_18
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
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
