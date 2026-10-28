.class public final Lp6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final d:Ldc3/h;

.field public final e:Lp6/g0;

.field public final f:Lp6/b;

.field public final g:Ly6/a;

.field public final h:Lp6/u1;

.field public final i:Z

.field public final j:Lp1/k1;

.field public final k:Lp1/k1;

.field public l:Ljava/lang/Object;

.field public final m:Lbc3/l1;

.field public final n:Lec3/h2;


# direct methods
.method public constructor <init>(Lp6/g0;Lp6/b;Landroid/os/Bundle;)V
    .locals 5

    sget-object v0, Ly6/f;->a:Ly6/f;

    invoke-virtual {p1}, Lp6/g0;->g()Lp6/u1;

    move-result-object v1

    iget v2, p2, Lp6/b;->a:I

    invoke-static {v2}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lp6/l;->a:Ljava/lang/String;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x6

    const v4, 0x7fffffff

    invoke-static {v4, v3, v2}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v2

    iput-object v2, p0, Lp6/l;->d:Ldc3/h;

    iput-object p1, p0, Lp6/l;->e:Lp6/g0;

    iput-object p2, p0, Lp6/l;->f:Lp6/b;

    iput-object v0, p0, Lp6/l;->g:Ly6/a;

    iput-object v1, p0, Lp6/l;->h:Lp6/u1;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp6/l;->i:Z

    iget p1, p2, Lp6/b;->a:I

    const/high16 p2, -0x80000000

    if-gt p2, p1, :cond_1

    const/4 p2, -0x1

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Lp1/v0;->y:Lp1/v0;

    new-instance p2, Lp1/k1;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object p2, p0, Lp6/l;->j:Lp1/k1;

    new-instance p2, Lp1/k1;

    invoke-direct {p2, p3, p1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object p2, p0, Lp6/l;->k:Lp1/k1;

    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lp6/l;->l:Ljava/lang/Object;

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object p1

    iput-object p1, p0, Lp6/l;->m:Lbc3/l1;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lp6/l;->n:Lec3/h2;

    return-void
.end method

.method public static a(Lp6/l;Landroid/content/Context;Ln6/k;Ls83/c;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "No app widget info for "

    instance-of v5, v3, Lp6/h;

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Lp6/h;

    iget v6, v5, Lp6/h;->F:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lp6/h;->F:I

    goto :goto_0

    :cond_0
    new-instance v5, Lp6/h;

    invoke-direct {v5, v0, v3}, Lp6/h;-><init>(Lp6/l;Ls83/c;)V

    :goto_0
    iget-object v3, v5, Lp6/h;->z:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lp6/h;->F:I

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x2

    if-eqz v7, :cond_4

    if-eq v7, v11, :cond_3

    if-eq v7, v12, :cond_2

    if-eq v7, v10, :cond_2

    if-eq v7, v9, :cond_2

    if-eq v7, v8, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lp6/h;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-object v0, v5, Lp6/h;->y:Ln6/k;

    iget-object v1, v5, Lp6/h;->x:Landroid/content/Context;

    iget-object v2, v5, Lp6/h;->w:Ljava/lang/Object;

    check-cast v2, Lp6/l;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    move-object v13, v1

    goto :goto_2

    :cond_4
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {v2}, Lo73/a;->Y(Ln6/i;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_5
    const-string v3, "null cannot be cast to non-null type androidx.glance.appwidget.RemoteViewsRoot"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v2

    check-cast v3, Lp6/m1;

    iget-object v3, v0, Lp6/l;->f:Lp6/b;

    iget v3, v3, Lp6/b;->a:I

    iput-object v0, v5, Lp6/h;->w:Ljava/lang/Object;

    iput-object v1, v5, Lp6/h;->x:Landroid/content/Context;

    iput-object v2, v5, Lp6/h;->y:Ln6/k;

    iput v11, v5, Lp6/h;->F:I

    sget-object v7, Lp6/z0;->g:Lp6/t;

    invoke-virtual {v7, v1, v3, v5}, Lp6/t;->d(Landroid/content/Context;ILs83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_6

    goto/16 :goto_a

    :cond_6
    move-object v13, v2

    move-object v2, v0

    move-object v0, v13

    goto :goto_1

    :goto_2
    check-cast v3, Lp6/z0;

    const-string v1, "appwidget"

    invoke-virtual {v13, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "null cannot be cast to non-null type android.appwidget.AppWidgetManager"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/appwidget/AppWidgetManager;

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v11, v2, Lp6/l;->f:Lp6/b;

    :try_start_1
    iget v14, v11, Lp6/b;->a:I

    invoke-virtual {v1, v14}, Landroid/appwidget/AppWidgetManager;->getAppWidgetInfo(I)Landroid/appwidget/AppWidgetProviderInfo;

    move-result-object v14

    if-eqz v14, :cond_a

    iget-object v4, v14, Landroid/appwidget/AppWidgetProviderInfo;->provider:Landroid/content/ComponentName;

    move-object v14, v0

    check-cast v14, Lp6/m1;

    invoke-static {v14}, Lbi/g;->N(Lp6/m1;)V

    invoke-static {v0}, Lbi/g;->c0(Ln6/k;)Ljava/util/LinkedHashMap;

    move-result-object v14

    iput-object v14, v2, Lp6/l;->l:Ljava/lang/Object;

    iget v14, v11, Lp6/b;->a:I

    move-object v15, v0

    check-cast v15, Lp6/m1;

    invoke-virtual {v3, v0}, Lp6/z0;->a(Ln6/k;)I

    move-result v17

    iget-object v0, v2, Lp6/l;->e:Lp6/g0;

    invoke-virtual {v0, v13}, Lp6/g0;->c(Landroid/content/Context;)Lp6/t0;

    move-result-object v0

    if-nez v0, :cond_7

    new-instance v0, Lp6/t0;

    new-instance v10, Landroid/content/ComponentName;

    const-class v8, Landroidx/glance/appwidget/action/ActionTrampolineActivity;

    invoke-direct {v10, v13, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v8, Landroid/content/ComponentName;

    const-class v9, Landroidx/glance/appwidget/action/InvisibleActionTrampolineActivity;

    invoke-direct {v8, v13, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v9, Landroid/content/ComponentName;

    const-class v12, Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;

    invoke-direct {v9, v13, v12}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v12, Landroid/content/ComponentName;

    const-class v7, Landroidx/glance/appwidget/GlanceRemoteViewsService;

    invoke-direct {v12, v13, v7}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {v0, v10, v8, v9, v12}, Lp6/t0;-><init>(Landroid/content/ComponentName;Landroid/content/ComponentName;Landroid/content/ComponentName;Landroid/content/ComponentName;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_7
    move-object/from16 v19, v0

    move-object/from16 v16, v3

    move-object/from16 v18, v4

    goto :goto_4

    :catch_0
    :goto_3
    const/4 v1, 0x0

    goto/16 :goto_9

    :goto_4
    :try_start_2
    invoke-static/range {v13 .. v19}, Lce/w;->l0(Landroid/content/Context;ILp6/m1;Lp6/z0;ILandroid/content/ComponentName;Lp6/t0;)Landroid/widget/RemoteViews;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v3, v16

    :try_start_3
    iget-boolean v4, v2, Lp6/l;->i:Z

    if-eqz v4, :cond_8

    iget v4, v11, Lp6/b;->a:I

    invoke-virtual {v1, v4, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_8
    :goto_5
    iget-object v1, v2, Lp6/l;->n:Lec3/h2;

    invoke-virtual {v1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v1, 0x0

    iput-object v1, v5, Lp6/h;->w:Ljava/lang/Object;

    iput-object v1, v5, Lp6/h;->x:Landroid/content/Context;

    iput-object v1, v5, Lp6/h;->y:Ln6/k;

    const/4 v0, 0x2

    iput v0, v5, Lp6/h;->F:I

    invoke-virtual {v3, v5}, Lp6/z0;->b(Lp6/h;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_9

    goto/16 :goto_a

    :cond_9
    :goto_6
    invoke-static {}, Lp6/w1;->b()V

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object/from16 v3, v16

    goto :goto_7

    :catch_1
    move-object/from16 v3, v16

    goto :goto_3

    :cond_a
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v11, Lp6/b;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_7
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "GlanceAppWidget"

    const-string v4, "Error in Glance App Widget"

    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-boolean v1, v2, Lp6/l;->i:Z

    if-eqz v1, :cond_b

    iget-object v1, v2, Lp6/l;->e:Lp6/g0;

    iget-object v2, v2, Lp6/l;->f:Lp6/b;

    iget v4, v2, Lp6/b;->a:I

    invoke-virtual {v1, v13, v2, v4, v0}, Lp6/g0;->i(Landroid/content/Context;Ln6/l;ILjava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v1, 0x0

    iput-object v1, v5, Lp6/h;->w:Ljava/lang/Object;

    iput-object v1, v5, Lp6/h;->x:Landroid/content/Context;

    iput-object v1, v5, Lp6/h;->y:Ln6/k;

    const/4 v1, 0x4

    iput v1, v5, Lp6/h;->F:I

    invoke-virtual {v3, v5}, Lp6/z0;->b(Lp6/h;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_9

    goto :goto_a

    :cond_b
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    iput-object v0, v5, Lp6/h;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v5, Lp6/h;->x:Landroid/content/Context;

    iput-object v1, v5, Lp6/h;->y:Ln6/k;

    const/4 v1, 0x5

    iput v1, v5, Lp6/h;->F:I

    invoke-virtual {v3, v5}, Lp6/z0;->b(Lp6/h;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_c

    goto :goto_a

    :cond_c
    :goto_8
    invoke-static {}, Lp6/w1;->b()V

    throw v0

    :goto_9
    iput-object v1, v5, Lp6/h;->w:Ljava/lang/Object;

    iput-object v1, v5, Lp6/h;->x:Landroid/content/Context;

    iput-object v1, v5, Lp6/h;->y:Ln6/k;

    const/4 v0, 0x3

    iput v0, v5, Lp6/h;->F:I

    invoke-virtual {v3, v5}, Lp6/z0;->b(Lp6/h;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_9

    :goto_a
    return-object v6

    :goto_b
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public static b(Lp6/l;Landroid/content/Context;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lp6/i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lp6/i;

    iget v1, v0, Lp6/i;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/i;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/i;

    invoke-direct {v0, p0, p3}, Lp6/i;-><init>(Lp6/l;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lp6/i;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/i;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const-string v4, "Cannot create a mutable snapshot of an read-only snapshot"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p0, v0, Lp6/i;->w:Lp6/l;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p3, p2, Lp6/f;

    if-eqz p3, :cond_7

    iget-object p2, p0, Lp6/l;->e:Lp6/g0;

    invoke-virtual {p2}, Lp6/g0;->h()Ly6/g;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p3, p0, Lp6/l;->g:Ly6/a;

    iget-object v2, p0, Lp6/l;->a:Ljava/lang/String;

    iput-object p0, v0, Lp6/i;->w:Lp6/l;

    iput v5, v0, Lp6/i;->z:I

    check-cast p3, Ly6/f;

    invoke-virtual {p3, p1, p2, v2, v0}, Ly6/f;->c(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_3
    move-object p3, v6

    :cond_4
    :goto_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p1

    instance-of p2, p1, Lz1/b;

    if-eqz p2, :cond_5

    check-cast p1, Lz1/b;

    goto :goto_2

    :cond_5
    move-object p1, v6

    :goto_2
    if-eqz p1, :cond_6

    invoke-virtual {p1, v6, v6}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object p1

    if-eqz p1, :cond_6

    :try_start_0
    invoke-virtual {p1}, Lz1/f;->j()Lz1/f;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p0, p0, Lp6/l;->j:Lp1/k1;

    invoke-virtual {p0, p3}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {p2}, Lz1/f;->q(Lz1/f;)V

    invoke-virtual {p1}, Lz1/b;->w()Lz1/q;

    move-result-object p0

    invoke-virtual {p0}, Lz1/q;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1}, Lz1/b;->c()V

    return-object v3

    :catchall_0
    move-exception p0

    goto :goto_3

    :catchall_1
    move-exception p0

    :try_start_3
    invoke-static {p2}, Lz1/f;->q(Lz1/f;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    invoke-virtual {p1}, Lz1/b;->c()V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    instance-of p1, p2, Lp6/e;

    if-eqz p1, :cond_a

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p1

    instance-of p3, p1, Lz1/b;

    if-eqz p3, :cond_8

    check-cast p1, Lz1/b;

    goto :goto_4

    :cond_8
    move-object p1, v6

    :goto_4
    if-eqz p1, :cond_9

    invoke-virtual {p1, v6, v6}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object p1

    if-eqz p1, :cond_9

    :try_start_4
    invoke-virtual {p1}, Lz1/f;->j()Lz1/f;

    move-result-object p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    check-cast p2, Lp6/e;

    iget-object p2, p2, Lp6/e;->a:Landroid/os/Bundle;

    iget-object p0, p0, Lp6/l;->k:Lp1/k1;

    invoke-virtual {p0, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-static {p3}, Lz1/f;->q(Lz1/f;)V

    invoke-virtual {p1}, Lz1/b;->w()Lz1/q;

    move-result-object p0

    invoke-virtual {p0}, Lz1/q;->d()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {p1}, Lz1/b;->c()V

    return-object v3

    :catchall_2
    move-exception p0

    goto :goto_5

    :catchall_3
    move-exception p0

    :try_start_7
    invoke-static {p3}, Lz1/f;->q(Lz1/f;)V

    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_5
    invoke-virtual {p1}, Lz1/b;->c()V

    throw p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    instance-of p1, p2, Lp6/d;

    if-eqz p1, :cond_f

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p1

    instance-of p3, p1, Lz1/b;

    if-eqz p3, :cond_b

    check-cast p1, Lz1/b;

    goto :goto_6

    :cond_b
    move-object p1, v6

    :goto_6
    if-eqz p1, :cond_e

    invoke-virtual {p1, v6, v6}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object p1

    if-eqz p1, :cond_e

    :try_start_8
    invoke-virtual {p1}, Lz1/f;->j()Lz1/f;

    move-result-object p3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :try_start_9
    iget-object v0, p0, Lp6/l;->l:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Lp6/d;

    iget-object v1, v1, Lp6/d;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_d

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_c

    move-object v6, v3

    goto :goto_7

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo6/e;

    throw v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception p0

    goto :goto_8

    :cond_d
    :goto_7
    :try_start_a
    invoke-static {p3}, Lz1/f;->q(Lz1/f;)V

    invoke-virtual {p1}, Lz1/b;->w()Lz1/q;

    move-result-object p3

    invoke-virtual {p3}, Lz1/q;->d()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    invoke-virtual {p1}, Lz1/b;->c()V

    if-nez v6, :cond_10

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Triggering Action("

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p2, Lp6/d;

    iget-object p2, p2, Lp6/d;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ") for session("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lp6/l;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") failed"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "AppWidgetSession"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Lhg3/i;->v(I)Ljava/lang/Integer;

    return-object v3

    :catchall_5
    move-exception p0

    goto :goto_9

    :goto_8
    :try_start_b
    invoke-static {p3}, Lz1/f;->q(Lz1/f;)V

    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :goto_9
    invoke-virtual {p1}, Lz1/b;->c()V

    throw p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_f
    instance-of p0, p2, Lp6/g;

    if-eqz p0, :cond_11

    check-cast p2, Lp6/g;

    iget-object p0, p2, Lp6/g;->a:Lbc3/l1;

    invoke-virtual {p0}, Lbc3/t1;->isActive()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Lbc3/l1;->complete()Z

    :cond_10
    return-object v3

    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Sent unrecognized event type "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to AppWidgetSession"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lp6/l;Ljava/util/ArrayList;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lp6/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp6/j;

    iget v1, v0, Lp6/j;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/j;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/j;

    invoke-direct {v0, p0, p2}, Lp6/j;-><init>(Lp6/l;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lp6/j;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/j;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lp6/j;->E:I

    iget p1, v0, Lp6/j;->z:I

    iget-object v2, v0, Lp6/j;->y:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object v4, v0, Lp6/j;->x:Lp6/l;

    iget-object v5, v0, Lp6/j;->w:Lp6/l;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lp6/d;

    if-eqz v5, :cond_3

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lp6/e;

    if-eqz v5, :cond_5

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp6/e;

    if-eqz p1, :cond_7

    iget-object p1, p1, Lp6/e;->a:Landroid/os/Bundle;

    goto :goto_3

    :cond_7
    const/4 p1, 0x0

    :goto_3
    new-instance v2, Lp6/l;

    iget-object v4, p0, Lp6/l;->e:Lp6/g0;

    iget-object p0, p0, Lp6/l;->f:Lp6/b;

    invoke-direct {v2, v4, p0, p1}, Lp6/l;-><init>(Lp6/g0;Lp6/b;Landroid/os/Bundle;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 p1, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v2, p2

    :goto_4
    if-ge p1, p0, :cond_9

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp6/d;

    iput-object v5, v0, Lp6/j;->w:Lp6/l;

    iput-object v4, v0, Lp6/j;->x:Lp6/l;

    move-object v6, v2

    check-cast v6, Ljava/util/List;

    iput-object v6, v0, Lp6/j;->y:Ljava/util/List;

    iput p1, v0, Lp6/j;->z:I

    iput p0, v0, Lp6/j;->E:I

    iput v3, v0, Lp6/j;->H:I

    invoke-virtual {v4, p2, v0}, Lp6/l;->e(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_8
    :goto_5
    add-int/2addr p1, v3

    goto :goto_4

    :cond_9
    return-object v5
.end method


# virtual methods
.method public final c(Landroid/content/Context;Lwc/e1;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lx6/e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx6/e;

    iget v1, v0, Lx6/e;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/e;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/e;

    invoke-direct {v0, p0, p3}, Lx6/e;-><init>(Lp6/l;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lx6/e;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/e;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lx6/e;->y:Ldc3/c;

    iget-object p2, v0, Lx6/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lx6/e;->w:Landroid/content/Context;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    move-object v5, v2

    move-object v2, p1

    move-object p1, v5

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, v0, Lx6/e;->y:Ldc3/c;

    iget-object p2, v0, Lx6/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lx6/e;->w:Landroid/content/Context;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p3, p0, Lp6/l;->d:Ldc3/h;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ldc3/c;

    invoke-direct {v2, p3}, Ldc3/c;-><init>(Ldc3/h;)V

    :goto_1
    iput-object p1, v0, Lx6/e;->w:Landroid/content/Context;

    iput-object p2, v0, Lx6/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object v2, v0, Lx6/e;->y:Ldc3/c;

    iput v4, v0, Lx6/e;->F:I

    invoke-virtual {v2, v0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v2

    move-object v2, p1

    move-object p1, v5

    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p1}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, v0, Lx6/e;->w:Landroid/content/Context;

    iput-object p2, v0, Lx6/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p1, v0, Lx6/e;->y:Ldc3/c;

    iput v3, v0, Lx6/e;->F:I

    invoke-static {p0, v2, p3, v0}, Lp6/l;->b(Lp6/l;Landroid/content/Context;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catch Lkotlinx/coroutines/channels/ClosedReceiveChannelException; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p3, v1, :cond_1

    :goto_3
    return-object v1

    :catch_0
    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp6/l;->d:Ldc3/h;

    invoke-interface {v0, p1, p2}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lp6/k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp6/k;

    iget v1, v0, Lp6/k;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/k;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/k;

    invoke-direct {v0, p0, p1}, Lp6/k;-><init>(Lp6/l;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lp6/k;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/k;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lp6/k;->w:Lp6/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lp6/g;

    new-instance v2, Lbc3/l1;

    iget-object v4, p0, Lp6/l;->m:Lbc3/l1;

    invoke-direct {v2, v4}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-direct {p1, v2}, Lp6/g;-><init>(Lbc3/l1;)V

    iput-object p1, v0, Lp6/k;->w:Lp6/g;

    iput v3, v0, Lp6/k;->z:I

    invoke-virtual {p0, p1, v0}, Lp6/l;->e(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    iget-object p1, v0, Lp6/g;->a:Lbc3/l1;

    return-object p1
.end method
