.class public abstract Lio/sentry/android/core/internal/gestures/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Lio/sentry/android/core/internal/gestures/i;->a:[I

    return-void
.end method

.method public static a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/b;)Lio/sentry/internal/gestures/c;
    .locals 8

    invoke-virtual {p0}, Lio/sentry/q6;->getGestureTargetLocators()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-lez v1, :cond_5

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lio/sentry/android/core/internal/gestures/i;->a:[I

    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v3, 0x0

    aget v4, v2, v3

    const/4 v5, 0x1

    aget v2, v2, v5

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v7, v4

    cmpg-float v7, p2, v7

    if-ltz v7, :cond_0

    add-int/2addr v4, v5

    int-to-float v4, v4

    cmpl-float v4, p2, v4

    if-gtz v4, :cond_0

    int-to-float v4, v2

    cmpg-float v4, p3, v4

    if-ltz v4, :cond_0

    add-int/2addr v2, v6

    int-to-float v2, v2

    cmpl-float v2, p3, v2

    if-gtz v2, :cond_0

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Landroid/view/ViewGroup;

    move v4, v3

    :goto_1
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/internal/gestures/a;

    invoke-interface {v2, v1, p2, p3, p4}, Lio/sentry/internal/gestures/a;->a(Landroid/view/View;FFLio/sentry/internal/gestures/b;)Lio/sentry/internal/gestures/c;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v4, Lio/sentry/internal/gestures/b;->CLICKABLE:Lio/sentry/internal/gestures/b;

    if-ne p4, v4, :cond_3

    move-object p1, v2

    goto :goto_3

    :cond_3
    sget-object v4, Lio/sentry/internal/gestures/b;->SCROLLABLE:Lio/sentry/internal/gestures/b;

    if-ne p4, v4, :cond_4

    return-object v2

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    return-object p1
.end method

.method public static b(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    const v1, 0xffffff

    and-int/2addr v1, v0

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, ""

    return-object p0

    :cond_2
    new-instance p0, Landroid/content/res/Resources$NotFoundException;

    invoke-direct {p0}, Landroid/content/res/Resources$NotFoundException;-><init>()V

    throw p0
.end method
