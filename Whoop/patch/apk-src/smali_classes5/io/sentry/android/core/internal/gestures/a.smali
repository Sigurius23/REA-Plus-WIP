.class public final Lio/sentry/android/core/internal/gestures/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/internal/gestures/a;


# instance fields
.field public final a:Lio/sentry/util/f;


# direct methods
.method public constructor <init>(Lio/sentry/util/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/a;->a:Lio/sentry/util/f;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;FFLio/sentry/internal/gestures/b;)Lio/sentry/internal/gestures/c;
    .locals 7

    const/4 p2, 0x0

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object p3, Lio/sentry/internal/gestures/b;->CLICKABLE:Lio/sentry/internal/gestures/b;

    if-ne p4, p3, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-nez p3, :cond_1

    :try_start_0
    invoke-static {p1}, Lio/sentry/android/core/internal/gestures/i;->b(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lts/o;->v(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lio/sentry/internal/gestures/c;

    const-string v5, "old_view_system"

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/sentry/internal/gestures/c;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p2

    :cond_1
    move-object v1, p1

    sget-object p1, Lio/sentry/internal/gestures/b;->SCROLLABLE:Lio/sentry/internal/gestures/b;

    if-ne p4, p1, :cond_5

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/a;->a:Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p3, 0x0

    if-nez p1, :cond_2

    move p1, p3

    goto :goto_0

    :cond_2
    const-class p1, Landroidx/core/view/ScrollingView;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    :goto_0
    if-nez p1, :cond_3

    const-class p1, Landroid/widget/AbsListView;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_3

    const-class p1, Landroid/widget/ScrollView;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_4

    const/4 p3, 0x1

    :cond_4
    if-eqz p3, :cond_5

    :try_start_1
    invoke-static {v1}, Lio/sentry/android/core/internal/gestures/i;->b(Landroid/view/View;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Lts/o;->v(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v3

    move-object v2, v1

    new-instance v1, Lio/sentry/internal/gestures/c;

    const-string v6, "old_view_system"

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v6}, Lio/sentry/internal/gestures/c;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_1
    :cond_5
    :goto_1
    return-object p2
.end method
