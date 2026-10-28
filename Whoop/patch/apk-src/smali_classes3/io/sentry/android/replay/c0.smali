.class public final Lio/sentry/android/replay/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic w:Lio/sentry/android/replay/e0;

.field public final synthetic x:Landroid/view/View;


# direct methods
.method public constructor <init>(Lio/sentry/android/replay/e0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/c0;->w:Lio/sentry/android/replay/e0;

    iput-object p2, p0, Lio/sentry/android/replay/c0;->x:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 6

    iget-object v0, p0, Lio/sentry/android/replay/c0;->w:Lio/sentry/android/replay/e0;

    iget-object v1, v0, Lio/sentry/android/replay/e0;->H:Landroid/graphics/Point;

    iget-object v2, v0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lio/sentry/android/replay/c0;->x:Landroid/view/View;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x1

    if-nez v2, :cond_1

    invoke-static {v3, p0}, La4/a;->z(Landroid/view/View;Lio/sentry/android/replay/c0;)V

    return v4

    :cond_1
    const-string v2, "<this>"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v2

    if-lez v2, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v2

    if-lez v2, :cond_4

    invoke-static {v3, p0}, La4/a;->z(Landroid/view/View;Lio/sentry/android/replay/c0;)V

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v5, v1, Landroid/graphics/Point;->x:I

    if-ne v2, v5, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v2

    iget v5, v1, Landroid/graphics/Point;->y:I

    if-eq v2, v5, :cond_2

    goto :goto_1

    :cond_2
    return v4

    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v1, v2, v5}, Landroid/graphics/Point;->set(II)V

    iget-object v0, v0, Lio/sentry/android/replay/e0;->y:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/replay/ReplayIntegration;->o0(II)V

    :cond_4
    return v4
.end method
