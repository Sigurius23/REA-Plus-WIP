.class public final synthetic Lio/sentry/android/core/internal/util/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic w:Lio/sentry/android/core/internal/util/i;

.field public final synthetic x:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/util/i;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/util/h;->w:Lio/sentry/android/core/internal/util/i;

    iput-object p2, p0, Lio/sentry/android/core/internal/util/h;->x:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/util/h;->w:Lio/sentry/android/core/internal/util/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lio/sentry/android/core/internal/util/h;->x:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    return-void
.end method
