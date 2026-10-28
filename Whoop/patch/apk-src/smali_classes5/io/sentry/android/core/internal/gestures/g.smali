.class public final Lio/sentry/android/core/internal/gestures/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field public E:Lio/sentry/n1;

.field public F:Lio/sentry/android/core/internal/gestures/e;

.field public final G:Lio/sentry/android/core/internal/gestures/f;

.field public final w:Ljava/lang/ref/WeakReference;

.field public final x:Lio/sentry/d1;

.field public final y:Lio/sentry/android/core/SentryAndroidOptions;

.field public z:Lio/sentry/internal/gestures/c;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/sentry/i4;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->z:Lio/sentry/internal/gestures/c;

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    sget-object v0, Lio/sentry/android/core/internal/gestures/e;->Unknown:Lio/sentry/android/core/internal/gestures/e;

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->F:Lio/sentry/android/core/internal/gestures/e;

    new-instance v1, Lio/sentry/android/core/internal/gestures/f;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    const/4 v0, 0x0

    iput v0, v1, Lio/sentry/android/core/internal/gestures/f;->c:F

    iput v0, v1, Lio/sentry/android/core/internal/gestures/f;->d:F

    iput-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->G:Lio/sentry/android/core/internal/gestures/f;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->w:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->x:Lio/sentry/d1;

    iput-object p3, p0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/internal/gestures/c;Lio/sentry/android/core/internal/gestures/e;Ljava/util/Map;Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->isEnableUserInteractionBreadcrumbs()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/sentry/android/core/internal/gestures/d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const-string p2, "unknown"

    goto :goto_0

    :cond_1
    const-string p2, "swipe"

    goto :goto_0

    :cond_2
    const-string p2, "scroll"

    goto :goto_0

    :cond_3
    const-string p2, "click"

    :goto_0
    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    const-string v1, "android:motionEvent"

    invoke-virtual {v0, p4, v1}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "android:view"

    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->d()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p4, v1, p1, p3}, Lio/sentry/e;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/sentry/e;

    move-result-object p1

    iget-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->x:Lio/sentry/d1;

    invoke-interface {p2, p1, v0}, Lio/sentry/d1;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)Landroid/view/View;
    .locals 6

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, ". No breadcrumb captured."

    iget-object v4, p0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_0

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Activity is null in "

    invoke-static {v5, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, p1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Window is null in "

    invoke-static {v5, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, p1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "DecorView is null in "

    invoke-static {v5, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, p1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final c(Lio/sentry/internal/gestures/c;Lio/sentry/android/core/internal/gestures/e;)V
    .locals 10

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->F:Lio/sentry/android/core/internal/gestures/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->z:Lio/sentry/internal/gestures/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/gestures/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object v3, Lio/sentry/android/core/internal/gestures/e;->Click:Lio/sentry/android/core/internal/gestures/e;

    if-ne p2, v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    :goto_1
    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iget-object v3, p0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v3}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result v4

    iget-object v5, p0, Lio/sentry/android/core/internal/gestures/g;->x:Lio/sentry/d1;

    if-eqz v4, :cond_b

    invoke-virtual {v3}, Lio/sentry/q6;->isEnableUserInteractionTracing()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_5

    :cond_3
    iget-object v4, p0, Lio/sentry/android/core/internal/gestures/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    if-nez v4, :cond_4

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "Activity is null, no transaction captured."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->b()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    if-eqz v7, :cond_6

    if-nez v0, :cond_5

    invoke-interface {v7}, Lio/sentry/l1;->e()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "The view with id: "

    const-string v2, " already has an ongoing transaction assigned. Rescheduling finish"

    invoke-static {v0, v6, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v3}, Lio/sentry/q6;->getIdleTimeout()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    invoke-interface {p1}, Lio/sentry/n1;->r()V

    return-void

    :cond_5
    sget-object v0, Lio/sentry/i7;->OK:Lio/sentry/i7;

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/gestures/g;->d(Lio/sentry/i7;)V

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/sentry/android/core/internal/gestures/d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    if-eq v1, v2, :cond_9

    const/4 v4, 0x2

    if-eq v1, v4, :cond_8

    const/4 v4, 0x3

    if-eq v1, v4, :cond_7

    const-string v1, "unknown"

    goto :goto_3

    :cond_7
    const-string v1, "swipe"

    goto :goto_3

    :cond_8
    const-string v1, "scroll"

    goto :goto_3

    :cond_9
    const-string v1, "click"

    :goto_3
    const-string v4, "ui.action."

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lio/sentry/n7;

    invoke-direct {v4}, Lio/sentry/n7;-><init>()V

    iput-boolean v2, v4, Lio/sentry/n7;->f:Z

    invoke-virtual {v3}, Lio/sentry/q6;->getDeadlineTimeout()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    const/4 v9, 0x0

    if-gtz v8, :cond_a

    move-object v6, v9

    goto :goto_4

    :cond_a
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_4
    iput-object v6, v4, Lio/sentry/n7;->h:Ljava/lang/Long;

    invoke-virtual {v3}, Lio/sentry/q6;->getIdleTimeout()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lio/sentry/n7;->g:Ljava/lang/Long;

    iput-boolean v2, v4, Leh/a;->a:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "auto.ui.gesture_listener."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Leh/a;->d:Ljava/lang/Object;

    new-instance v2, Lio/sentry/m7;

    sget-object v3, Lio/sentry/protocol/g0;->COMPONENT:Lio/sentry/protocol/g0;

    invoke-direct {v2, v0, v3, v1, v9}, Lio/sentry/m7;-><init>(Ljava/lang/String;Lio/sentry/protocol/g0;Ljava/lang/String;Laa3/i1;)V

    invoke-interface {v5, v2, v4}, Lio/sentry/d1;->x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;

    move-result-object v0

    new-instance v1, Lc9/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2, p0, v0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v1}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->z:Lio/sentry/internal/gestures/c;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->F:Lio/sentry/android/core/internal/gestures/e;

    return-void

    :cond_b
    :goto_5
    if-eqz v0, :cond_d

    invoke-virtual {v3}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v0, Li7/g;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    invoke-interface {v5, v0}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    :cond_c
    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->z:Lio/sentry/internal/gestures/c;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->F:Lio/sentry/android/core/internal/gestures/e;

    :cond_d
    return-void
.end method

.method public final d(Lio/sentry/i7;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/sentry/l1;->c()Lio/sentry/i7;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    invoke-interface {v0, p1}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    invoke-interface {p1}, Lio/sentry/l1;->g()V

    :cond_1
    :goto_0
    new-instance p1, Lcom/whoop/data/repositories/c;

    const/16 v0, 0x8

    invoke-direct {p1, p0, v0}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->x:Lio/sentry/d1;

    invoke-interface {v0, p1}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->z:Lio/sentry/internal/gestures/c;

    if-eqz v0, :cond_2

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->z:Lio/sentry/internal/gestures/c;

    :cond_2
    sget-object p1, Lio/sentry/android/core/internal/gestures/e;->Unknown:Lio/sentry/android/core/internal/gestures/e;

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->F:Lio/sentry/android/core/internal/gestures/e;

    return-void
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/g;->G:Lio/sentry/android/core/internal/gestures/f;

    iput-object v1, v2, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/internal/gestures/c;

    sget-object v1, Lio/sentry/android/core/internal/gestures/e;->Unknown:Lio/sentry/android/core/internal/gestures/e;

    iput-object v1, v2, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    const/4 v1, 0x0

    iput v1, v2, Lio/sentry/android/core/internal/gestures/f;->c:F

    iput v1, v2, Lio/sentry/android/core/internal/gestures/f;->d:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v2, Lio/sentry/android/core/internal/gestures/f;->c:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, v2, Lio/sentry/android/core/internal/gestures/f;->d:F

    return v0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->G:Lio/sentry/android/core/internal/gestures/f;

    sget-object p2, Lio/sentry/android/core/internal/gestures/e;->Swipe:Lio/sentry/android/core/internal/gestures/e;

    iput-object p2, p1, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    const-string p2, "onScroll"

    invoke-virtual {p0, p2}, Lio/sentry/android/core/internal/gestures/g;->b(Ljava/lang/String;)Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p4, p0, Lio/sentry/android/core/internal/gestures/g;->G:Lio/sentry/android/core/internal/gestures/f;

    iget-object v0, p4, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    sget-object v1, Lio/sentry/android/core/internal/gestures/e;->Unknown:Lio/sentry/android/core/internal/gestures/e;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    sget-object v1, Lio/sentry/internal/gestures/b;->SCROLLABLE:Lio/sentry/internal/gestures/b;

    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v2, p2, v0, p1, v1}, Lio/sentry/android/core/internal/gestures/i;->a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/b;)Lio/sentry/internal/gestures/c;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "Unable to find scroll target. No breadcrumb captured."

    new-array v1, p3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/android/core/internal/gestures/e;->Scroll:Lio/sentry/android/core/internal/gestures/e;

    iput-object p1, p4, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    return p3

    :cond_1
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {p1}, Lio/sentry/internal/gestures/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Scroll target found: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, p3, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p4, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/internal/gestures/c;

    sget-object p1, Lio/sentry/android/core/internal/gestures/e;->Scroll:Lio/sentry/android/core/internal/gestures/e;

    iput-object p1, p4, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    :cond_2
    :goto_0
    return p3
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 6

    const-string v0, "onSingleTapUp"

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/gestures/g;->b(Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    sget-object v4, Lio/sentry/internal/gestures/b;->CLICKABLE:Lio/sentry/internal/gestures/b;

    iget-object v5, p0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v5, v0, v2, v3, v4}, Lio/sentry/android/core/internal/gestures/i;->a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/b;)Lio/sentry/internal/gestures/c;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "Unable to find click target. No breadcrumb captured."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_1
    sget-object v2, Lio/sentry/android/core/internal/gestures/e;->Click:Lio/sentry/android/core/internal/gestures/e;

    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {p0, v0, v2, v3, p1}, Lio/sentry/android/core/internal/gestures/g;->a(Lio/sentry/internal/gestures/c;Lio/sentry/android/core/internal/gestures/e;Ljava/util/Map;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v0, v2}, Lio/sentry/android/core/internal/gestures/g;->c(Lio/sentry/internal/gestures/c;Lio/sentry/android/core/internal/gestures/e;)V

    :cond_2
    :goto_0
    return v1
.end method
