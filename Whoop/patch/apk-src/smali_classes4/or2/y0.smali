.class public final Lor2/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJQ\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lor2/y0;",
        "",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "systemLogger",
        "<init>",
        "(Landroid/content/Context;Ltr2/n;)V",
        "",
        "e",
        "()Z",
        "Landroid/app/Activity;",
        "activity",
        "Lj/d;",
        "Lj/l;",
        "checkLocationSettingsLauncher",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onSuccess",
        "onError",
        "onCanceled",
        "f",
        "(Landroid/app/Activity;Lj/d;Lc93/a;Lc93/a;Lc93/a;)V",
        "a",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Ltr2/o;",
        "b",
        "Ltr2/o;",
        "getLogger",
        "()Ltr2/o;",
        "logger",
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
.field private final a:Landroid/content/Context;

.field private final b:Ltr2/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2/n;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systemLogger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/y0;->a:Landroid/content/Context;

    new-instance v1, Ltr2/o;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "LocationServicesHelper"

    const/4 v4, 0x0

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lor2/y0;->b:Ltr2/o;

    return-void
.end method

.method public static synthetic a(Lor2/y0;Lc93/a;)V
    .locals 0

    invoke-static {p0, p1}, Lor2/y0;->k(Lor2/y0;Lc93/a;)V

    return-void
.end method

.method public static synthetic b(Lor2/y0;Lc93/a;Ltp/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lor2/y0;->h(Lor2/y0;Lc93/a;Ltp/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lor2/q;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lor2/y0;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lj/d;Landroid/app/Activity;Lor2/y0;Lc93/a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lor2/y0;->j(Lj/d;Landroid/app/Activity;Lor2/y0;Lc93/a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic g(Lor2/y0;Landroid/app/Activity;Lj/d;Lc93/a;Lc93/a;Lc93/a;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lor2/y0;->f(Landroid/app/Activity;Lj/d;Lc93/a;Lc93/a;Lc93/a;)V

    return-void
.end method

.method private static final h(Lor2/y0;Lc93/a;Ltp/k;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lor2/y0;->b:Ltr2/o;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "checkLocationSettings -> success"

    invoke-virtual {p0, v0, p2}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final j(Lj/d;Landroid/app/Activity;Lor2/y0;Lc93/a;Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "e"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p4

    check-cast v0, Lcom/google/android/gms/common/api/ApiException;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/ApiException;->a()I

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 p0, 0x2136

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object p0, p2, Lor2/y0;->b:Ltr2/o;

    const-string p1, "checkLocationSettings -> can\'t change settings"

    new-array p2, v2, [Lqr2/a$a;

    invoke-virtual {p0, p1, p4, p2}, Ltr2/o;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_1
    :try_start_0
    check-cast p4, Lcom/google/android/gms/common/api/ResolvableApiException;

    if-eqz p0, :cond_2

    new-instance p1, Lcom/google/android/material/textfield/p;

    invoke-virtual {p4}, Lcom/google/android/gms/common/api/ResolvableApiException;->b()Landroid/app/PendingIntent;

    move-result-object p4

    const-string v0, "getResolution(...)"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p4}, Lcom/google/android/material/textfield/p;-><init>(Landroid/app/PendingIntent;)V

    invoke-virtual {p1}, Lcom/google/android/material/textfield/p;->a()Lj/l;

    move-result-object p1

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p4}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_2
    const/16 p0, 0xd6

    invoke-virtual {p4, p1, p0}, Lcom/google/android/gms/common/api/ResolvableApiException;->c(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    iget-object p1, p2, Lor2/y0;->b:Ltr2/o;

    const-string p2, "checkLocationSettings -> can\'t send intent"

    new-array p4, v2, [Lqr2/a$a;

    invoke-virtual {p1, p2, p0, p4}, Ltr2/o;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final k(Lor2/y0;Lc93/a;)V
    .locals 2

    iget-object p0, p0, Lor2/y0;->b:Ltr2/o;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "checkLocationSettings -> onCanceled"

    invoke-virtual {p0, v1, v0}, Ltr2/o;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 2

    iget-object v0, p0, Lor2/y0;->a:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/location/LocationManager;->isLocationEnabled()Z

    move-result v0

    return v0
.end method

.method public final f(Landroid/app/Activity;Lj/d;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lj/d;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCanceled"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltp/i;

    invoke-direct {v0}, Ltp/i;-><init>()V

    new-instance v1, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v1}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Lcom/google/android/gms/location/LocationRequest;->k(I)V

    invoke-virtual {v0, v1}, Ltp/i;->a(Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {v0}, Ltp/i;->c()V

    invoke-virtual {v0}, Ltp/i;->d()V

    invoke-virtual {v0}, Ltp/i;->b()Ltp/j;

    move-result-object v0

    new-instance v1, Lqo/a;

    invoke-direct {v1, p1}, Lqo/a;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1, v0}, Lqo/a;->c(Ltp/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lor2/q;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, p3}, Lor2/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p3, Lor2/w0;

    invoke-direct {p3, v1}, Lor2/w0;-><init>(Lor2/q;)V

    invoke-virtual {v0, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    new-instance v0, Lio/getstream/chat/android/ui/utils/a;

    const/4 v5, 0x2

    move-object v3, p0

    move-object v2, p1

    move-object v1, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p3, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lor2/x0;

    invoke-direct {p2, p0, p5}, Lor2/x0;-><init>(Lor2/y0;Lc93/a;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCanceledListener(Lcq/c;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
