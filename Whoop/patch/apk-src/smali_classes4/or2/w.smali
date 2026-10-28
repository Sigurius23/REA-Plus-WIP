.class public final Lor2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/w$a;,
        Lor2/w$b;,
        Lor2/w$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0003#\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lor2/w;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Ltr2/n;)V",
        "Ll83/a0;",
        "g",
        "()V",
        "f",
        "",
        "c",
        "()Ljava/lang/String;",
        "b",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "",
        "e",
        "()Z",
        "w",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "x",
        "Ltr2/n;",
        "d",
        "()Ltr2/n;",
        "Landroid/os/PowerManager;",
        "y",
        "Landroid/os/PowerManager;",
        "pm",
        "a",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Landroid/content/Context;

.field private final x:Ltr2/n;

.field private final y:Landroid/os/PowerManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/w;->w:Landroid/content/Context;

    iput-object p2, p0, Lor2/w;->x:Ltr2/n;

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lor2/w;->y:Landroid/os/PowerManager;

    return-void
.end method

.method public static final synthetic a(Lor2/w;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lor2/w;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final b()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lor2/w;->w:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getRestrictBackgroundStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "Data saver status could not be determined"

    return-object v0

    :cond_0
    const-string v0, "Background data usage is blocked for this app."

    return-object v0

    :cond_1
    const-string v0, "This app is whitelisted"

    return-object v0

    :cond_2
    const-string v0, "Data Saver is disabled"

    return-object v0

    :cond_3
    const-string v0, "The device is not on a metered network, data usage not restricted"

    return-object v0
.end method

.method private final c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lor2/w;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "is"

    return-object v0

    :cond_0
    const-string v0, "is not"

    return-object v0
.end method

.method private final f()V
    .locals 4

    iget-object v0, p0, Lor2/w;->x:Ltr2/n;

    invoke-direct {p0}, Lor2/w;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "This app "

    const-string v3, " ignoring battery optimizations"

    invoke-static {v2, v1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final g()V
    .locals 3

    iget-object v0, p0, Lor2/w;->x:Ltr2/n;

    invoke-direct {p0}, Lor2/w;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Background app connectivity restriction is "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lor2/w$a;

    iget-object v1, p0, Lor2/w;->w:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lor2/w$a;-><init>(Lor2/w;Landroid/content/Context;)V

    invoke-virtual {v0}, Lor2/w$a;->a()V

    new-instance v0, Lor2/w$c;

    iget-object v1, p0, Lor2/w;->w:Landroid/content/Context;

    iget-object v2, p0, Lor2/w;->y:Landroid/os/PowerManager;

    invoke-direct {v0, p0, v1, v2}, Lor2/w$c;-><init>(Lor2/w;Landroid/content/Context;Landroid/os/PowerManager;)V

    invoke-virtual {v0}, Lor2/w$c;->a()V

    new-instance v0, Lor2/w$b;

    iget-object v1, p0, Lor2/w;->w:Landroid/content/Context;

    iget-object v2, p0, Lor2/w;->y:Landroid/os/PowerManager;

    invoke-direct {v0, p0, v1, v2}, Lor2/w$b;-><init>(Lor2/w;Landroid/content/Context;Landroid/os/PowerManager;)V

    invoke-virtual {v0}, Lor2/w$b;->a()V

    return-void
.end method


# virtual methods
.method public final d()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lor2/w;->x:Ltr2/n;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Lor2/w;->y:Landroid/os/PowerManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lor2/w;->w:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lor2/w;->g()V

    invoke-direct {p0}, Lor2/w;->f()V

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
