.class public final Lur/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lur/b;


# instance fields
.field public final a:Lur/g;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lur/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lur/d;->b:Landroid/os/Handler;

    iput-object p1, p0, Lur/d;->a:Lur/g;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lur/a;)Lcq/u;
    .locals 3

    check-cast p2, Lur/c;

    iget-boolean v0, p2, Lur/c;->x:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p2, p2, Lur/c;->w:Landroid/app/PendingIntent;

    const-string v1, "confirmation_intent"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result p2

    const-string v1, "window_flags"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    new-instance p2, Lcq/i;

    invoke-direct {p2}, Lcq/i;-><init>()V

    new-instance v1, Lr5/d;

    iget-object v2, p0, Lur/d;->b:Landroid/os/Handler;

    invoke-direct {v1, v2, p2}, Lr5/d;-><init>(Landroid/os/Handler;Lcq/i;)V

    const-string v2, "result_receiver"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p2, Lcq/i;->a:Lcq/u;

    return-object p1
.end method

.method public final b()Lcq/u;
    .locals 9

    iget-object v0, p0, Lur/d;->a:Lur/g;

    iget-object v1, v0, Lur/g;->b:Ljava/lang/String;

    sget-object v2, Lur/g;->c:Ldb/j0;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "requestInAppReview (%s)"

    invoke-virtual {v2, v3, v1}, Ldb/j0;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v0, Lur/g;->a:Lvr/i;

    if-nez v1, :cond_2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x6

    const-string v3, "PlayCore"

    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v2, Ldb/j0;->x:Ljava/lang/String;

    const-string v2, "Play Store app is either not installed or not the official version"

    invoke-static {v1, v2, v0}, Ldb/j0;->s(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Lcom/google/android/play/core/review/ReviewException;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lwr/a;->a:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    const-string v5, ""

    goto :goto_0

    :cond_1
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v7, Lwr/a;->b:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"

    const-string v8, ")"

    invoke-static {v5, v7, v6, v8}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_0
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Review Error(%d): %s"

    invoke-static {v2, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->c(Ljava/lang/Exception;)Lcq/u;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v2, Lcq/i;

    invoke-direct {v2}, Lcq/i;-><init>()V

    new-instance v3, Lur/e;

    invoke-direct {v3, v0, v2, v2}, Lur/e;-><init>(Lur/g;Lcq/i;Lcq/i;)V

    new-instance v0, Lvr/g;

    invoke-direct {v0, v1, v2, v2, v3}, Lvr/g;-><init>(Lvr/i;Lcq/i;Lcq/i;Lur/e;)V

    invoke-virtual {v1}, Lvr/i;->a()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v0, v2, Lcq/i;->a:Lcq/u;

    return-object v0
.end method
