.class public final synthetic Lio/sentry/android/core/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic w:Lio/sentry/android/core/o1;

.field public final synthetic x:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/o1;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/m1;->w:Lio/sentry/android/core/o1;

    iput-object p2, p0, Lio/sentry/android/core/m1;->x:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/m1;->w:Lio/sentry/android/core/o1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lio/sentry/android/core/m1;->x:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    const/4 v1, 0x0

    iput-object v1, v0, Lio/sentry/android/core/o1;->x:Lio/sentry/protocol/v;

    iget-object v0, v0, Lio/sentry/android/core/o1;->y:Landroid/content/DialogInterface$OnDismissListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
