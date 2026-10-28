.class public final Lib/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lib/i;->c:Ljava/lang/Object;

    .line 10
    new-instance v0, Lx/a;

    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object v0, p0, Lib/i;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lib/i;->a:I

    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lib/i;->b:Z

    return-void
.end method

.method public constructor <init>(Lib/a0;ILjava/util/concurrent/Executor;Lib/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lib/i;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lib/i;->b:Z

    .line 4
    iput-object p1, p0, Lib/i;->c:Ljava/lang/Object;

    .line 5
    iput p2, p0, Lib/i;->a:I

    .line 6
    iput-object p3, p0, Lib/i;->f:Ljava/lang/Object;

    .line 7
    iput-object p4, p0, Lib/i;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lq3/i;
    .locals 8

    iget-object v0, p0, Lib/i;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    const-string v1, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    iget-boolean v2, p0, Lib/i;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v1, p0, Lib/i;->d:Ljava/lang/Object;

    check-cast v1, Lx/a;

    invoke-virtual {v1}, Lx/a;->a()Lx/a;

    move-result-object v1

    invoke-virtual {v1}, Lx/a;->c()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v1, p0, Lib/i;->f:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_1
    const-string v1, "androidx.browser.customtabs.extra.SHARE_STATE"

    iget v2, p0, Lib/i;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {}, Lx/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "com.android.browser.headers"

    invoke-virtual {v0, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    goto :goto_0

    :cond_2
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v6, "Accept-Language"

    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    const/16 v2, 0x22

    if-lt v1, v2, :cond_5

    iget-object v1, p0, Lib/i;->e:Ljava/lang/Object;

    check-cast v1, Landroid/app/ActivityOptions;

    if-nez v1, :cond_4

    invoke-static {}, Lx/b;->a()Landroid/app/ActivityOptions;

    move-result-object v1

    iput-object v1, p0, Lib/i;->e:Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lib/i;->e:Ljava/lang/Object;

    check-cast v1, Landroid/app/ActivityOptions;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lx/d;->a(Landroid/app/ActivityOptions;Z)V

    :cond_5
    iget-object v1, p0, Lib/i;->e:Ljava/lang/Object;

    check-cast v1, Landroid/app/ActivityOptions;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v3

    :cond_6
    new-instance v1, Lq3/i;

    invoke-direct {v1, v0, v3}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public b(Lib/l;)V
    .locals 4

    iget-object v0, p0, Lib/i;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lib/i;->b:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Lib/i;->b:Z

    iget-object v1, p0, Lib/i;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    new-instance v0, Lds/s;

    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3, v2}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lib/i;->d:Ljava/lang/Object;

    check-cast v0, Lib/k;

    iget v1, p0, Lib/i;->a:I

    invoke-virtual {v0, v1, p1}, Lib/k;->a(ILib/l;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "callback.onResult already called, cannot call again."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Lx/a;)V
    .locals 0

    invoke-virtual {p1}, Lx/a;->c()Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lib/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lib/i;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    const/4 v1, 0x2

    iput v1, p0, Lib/i;->a:I

    const/4 v1, 0x0

    const-string v2, "android.support.customtabs.extra.SHARE_MENU_ITEM"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lib/i;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    const-string v1, "android.support.customtabs.extra.TITLE_VISIBILITY"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method
