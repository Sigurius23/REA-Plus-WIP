.class public final synthetic Lbq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lbq/b;->w:I

    iput-object p1, p0, Lbq/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lbq/b;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/common/a;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/a;-><init>(I)V

    iget-object v2, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v2, Lto/i0;

    iget-object v2, v2, Lto/i0;->m:Lcd3/g;

    invoke-virtual {v2, v0}, Lcd3/g;->K(Lcom/google/android/gms/common/a;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lq30/u0;

    iget-object v0, v0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lto/v;

    iget-object v2, v0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, " disconnecting because it was signed out."

    iget-object v0, v0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v0, Luo/c;

    invoke-virtual {v0, v2}, Luo/c;->f(Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lto/v;

    invoke-virtual {v0}, Lto/v;->a()V

    return-void

    :pswitch_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ltd3/a;

    iget-object v4, v0, Ltd3/a;->a:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ltd3/a;

    iget-object v0, v0, Ltd3/a;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltd3/m;

    iget-wide v6, v5, Ltd3/m;->z:J

    iget-object v8, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v8, Ltd3/a;

    iget-object v8, v8, Ltd3/a;->g:Ltd3/n;

    iget-wide v8, v8, Ltd3/n;->K:J

    sub-long v8, v2, v8

    cmp-long v6, v6, v8

    if-gez v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v6, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v6, Ltd3/a;

    iget-object v6, v6, Ltd3/a;->i:Landroid/os/Handler;

    new-instance v7, Lr5/b;

    const/16 v8, 0xc

    invoke-direct {v7, v8, v1, v5}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ltd3/a;

    iget-object v0, v0, Ltd3/a;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ltd3/a;

    iget-object v2, v0, Ltd3/a;->i:Landroid/os/Handler;

    iget-object v0, v0, Ltd3/a;->g:Ltd3/n;

    iget-wide v5, v0, Ltd3/n;->L:J

    invoke-virtual {v2, v1, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    monitor-exit v4

    return-void

    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_3
    const-string v0, "Service disconnected"

    iget-object v2, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v2, Lso/m;

    invoke-virtual {v2, v0}, Lso/m;->a(Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->J()Z

    return-void

    :pswitch_5
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->F:Z

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "input_method"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    iput-boolean v3, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->F:Z

    :cond_3
    return-void

    :pswitch_6
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ls/k1;

    iput-object v2, v0, Ls/k1;->L:Lbq/b;

    invoke-virtual {v0}, Ls/k1;->drawableStateChanged()V

    return-void

    :pswitch_7
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lp9/j;

    invoke-interface {v0}, Lp9/j;->g()V

    return-void

    :pswitch_8
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lmx/c;

    invoke-virtual {v0}, Lmx/c;->G()V

    return-void

    :pswitch_9
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lm/i0;

    iget-object v4, v0, Lm/i0;->b:Landroid/view/Window$Callback;

    invoke-virtual {v0}, Lm/i0;->z()Landroid/view/Menu;

    move-result-object v0

    instance-of v5, v0, Lr/l;

    if-eqz v5, :cond_4

    move-object v5, v0

    check-cast v5, Lr/l;

    goto :goto_2

    :cond_4
    move-object v5, v2

    :goto_2
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lr/l;->z()V

    :cond_5
    :try_start_1
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    invoke-interface {v4, v3, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4, v3, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_6
    :goto_3
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lr/l;->y()V

    :cond_8
    return-void

    :goto_4
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lr/l;->y()V

    :cond_9
    throw v0

    :pswitch_a
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lm/a0;

    iget-object v2, v0, Lm/a0;->W:Landroid/widget/PopupWindow;

    iget-object v4, v0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v5, 0x37

    invoke-virtual {v2, v4, v5, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v2, v0, Lm/a0;->Y:Lh5/t0;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lh5/t0;->b()V

    :cond_a
    iget-boolean v2, v0, Lm/a0;->Z:Z

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v2, :cond_b

    iget-object v2, v0, Lm/a0;->a0:Landroid/view/ViewGroup;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, v0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    iget-object v2, v0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lh5/p0;->a(Landroid/view/View;)Lh5/t0;

    move-result-object v2

    invoke-virtual {v2, v4}, Lh5/t0;->a(F)V

    iput-object v2, v0, Lm/a0;->Y:Lh5/t0;

    new-instance v0, Lm/r;

    invoke-direct {v0, v1, v3}, Lm/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Lh5/t0;->d(Lh5/u0;)V

    goto :goto_5

    :cond_b
    iget-object v2, v0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, v0, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_5
    return-void

    :pswitch_b
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Llx/c;

    iget-object v0, v0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void

    :pswitch_c
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ll5/d;

    iget-object v2, v0, Ll5/d;->y:Ls/k1;

    iget-object v4, v0, Ll5/d;->w:Ll5/a;

    iget-boolean v5, v0, Ll5/d;->O:Z

    if-nez v5, :cond_c

    goto/16 :goto_7

    :cond_c
    iget-boolean v5, v0, Ll5/d;->M:Z

    if-eqz v5, :cond_d

    iput-boolean v3, v0, Ll5/d;->M:Z

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v5

    iput-wide v5, v4, Ll5/a;->e:J

    const-wide/16 v7, -0x1

    iput-wide v7, v4, Ll5/a;->g:J

    iput-wide v5, v4, Ll5/a;->f:J

    const/high16 v5, 0x3f000000    # 0.5f

    iput v5, v4, Ll5/a;->h:F

    :cond_d
    iget-wide v5, v4, Ll5/a;->g:J

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-lez v5, :cond_e

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v5

    iget-wide v9, v4, Ll5/a;->g:J

    iget v11, v4, Ll5/a;->i:I

    int-to-long v11, v11

    add-long/2addr v9, v11

    cmp-long v5, v5, v9

    if-lez v5, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {v0}, Ll5/d;->e()Z

    move-result v5

    if-nez v5, :cond_f

    :goto_6
    iput-boolean v3, v0, Ll5/d;->O:Z

    goto :goto_7

    :cond_f
    iget-boolean v5, v0, Ll5/d;->N:Z

    if-eqz v5, :cond_10

    iput-boolean v3, v0, Ll5/d;->N:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-wide v11, v9

    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls/k1;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    :cond_10
    iget-wide v5, v4, Ll5/a;->f:J

    cmp-long v3, v5, v7

    if-eqz v3, :cond_11

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ll5/a;->a(J)F

    move-result v3

    const/high16 v7, -0x3f800000    # -4.0f

    mul-float/2addr v7, v3

    mul-float/2addr v7, v3

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v3, v8

    add-float/2addr v3, v7

    iget-wide v7, v4, Ll5/a;->f:J

    sub-long v7, v5, v7

    iput-wide v5, v4, Ll5/a;->f:J

    long-to-float v5, v7

    mul-float/2addr v5, v3

    iget v3, v4, Ll5/a;->d:F

    mul-float/2addr v5, v3

    float-to-int v3, v5

    iget-object v0, v0, Ll5/d;->Q:Ls/k1;

    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_7
    return-void

    :cond_11
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_d
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lko/b0;

    invoke-interface {v0}, Lko/b0;->g()V

    return-void

    :pswitch_e
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, La30/w0;

    :cond_12
    invoke-virtual {v0}, La30/w0;->q()V

    iget-object v2, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v2

    const/16 v4, 0x64

    if-ge v2, v4, :cond_12

    iget-object v2, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_2
    iget-object v4, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_13

    invoke-virtual {v0, v3}, La30/w0;->u(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v3, v0

    goto :goto_9

    :cond_13
    :goto_8
    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-void

    :goto_9
    :try_start_3
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v3

    :pswitch_f
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/a;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_10
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/a;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_11
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/a;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_12
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/a;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_13
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/a;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_14
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/a;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_15
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/l;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v2, v3}, La30/w0;->d(J)V

    return-void

    :pswitch_16
    :try_start_4
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    const-string v2, "Executor"

    const-string v3, "Background execution failure."

    invoke-static {v2, v3, v0}, Ldp/d;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_b
    return-void

    :pswitch_17
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v3}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->w()V

    return-void

    :pswitch_18
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lcq/o;

    iget-object v2, v0, Lcq/o;->y:Ljava/lang/Object;

    monitor-enter v2

    :try_start_5
    iget-object v0, v0, Lcq/o;->z:Ljava/lang/Object;

    check-cast v0, Lcq/c;

    if-eqz v0, :cond_14

    invoke-interface {v0}, Lcq/c;->d()V

    goto :goto_c

    :catchall_4
    move-exception v0

    goto :goto_d

    :cond_14
    :goto_c
    monitor-exit v2

    return-void

    :goto_d
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw v0

    :pswitch_19
    const-string v0, "IterableInAppFragmentHTMLNotification"

    const-string v2, "Orientation changed, triggering resize"

    invoke-static {v0, v2}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/s0;

    iget-object v0, v0, Lcom/iterable/iterableapi/s0;->b:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v0;->G()V

    return-void

    :pswitch_1a
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/bumptech/glide/h;

    iget-object v2, v0, Lcom/bumptech/glide/h;->y:Lml/c;

    invoke-interface {v2, v0}, Lml/c;->h(Lml/d;)V

    return-void

    :pswitch_1b
    iget-object v0, v1, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Lbq/a;

    iget-object v2, v0, Lbq/a;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_6
    invoke-virtual {v0}, Lbq/a;->b()Z

    move-result v3

    if-nez v3, :cond_15

    monitor-exit v2

    goto :goto_e

    :catchall_5
    move-exception v0

    goto :goto_f

    :cond_15
    const-string v3, "WakeLock"

    iget-object v4, v0, Lbq/a;->j:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, " ** IS FORCE-RELEASED ON TIMEOUT **"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Lbq/a;->d()V

    invoke-virtual {v0}, Lbq/a;->b()Z

    move-result v3

    if-nez v3, :cond_16

    monitor-exit v2

    goto :goto_e

    :cond_16
    const/4 v3, 0x1

    iput v3, v0, Lbq/a;->c:I

    invoke-virtual {v0}, Lbq/a;->e()V

    monitor-exit v2

    :goto_e
    return-void

    :goto_f
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
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
