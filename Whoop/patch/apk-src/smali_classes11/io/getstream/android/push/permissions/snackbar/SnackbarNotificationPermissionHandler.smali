.class public final Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;
.super La13/a;
.source "SourceFile"

# interfaces
.implements La13/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0008J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0004R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;",
        "La13/c;",
        "La13/a;",
        "<init>",
        "()V",
        "Landroid/app/Activity;",
        "Ll83/a0;",
        "showNotificationBlocked",
        "(Landroid/app/Activity;)V",
        "Landroid/content/Context;",
        "openSystemSettings",
        "(Landroid/content/Context;)V",
        "activity",
        "onActivityStarted",
        "onLastActivityStopped",
        "onPermissionRequested",
        "onPermissionGranted",
        "onPermissionDenied",
        "onPermissionRationale",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "currentActivity",
        "Landroid/app/Activity;",
        "Companion",
        "b13/b",
        "stream-android-push-permissions-snackbar_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lb13/b;


# instance fields
.field private currentActivity:Landroid/app/Activity;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb13/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->Companion:Lb13/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "Push:Snackbar-NPH"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->showNotificationBlocked$lambda$1(Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;Landroid/app/Activity;Landroid/view/View;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final openSystemSettings(Landroid/content/Context;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "package"

    invoke-static {v3, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "fromParts(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final showNotificationBlocked(Landroid/app/Activity;)V
    .locals 3

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget-object v1, Lmr/n;->F:[I

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f140d9d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lmr/n;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Lmr/n;

    move-result-object v0

    new-instance v1, Lb13/a;

    invoke-direct {v1, v2, p0, p1}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f140d9e

    invoke-virtual {v0, p1, v1}, Lmr/n;->i(ILandroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lmr/n;->j()V

    return-void
.end method

.method private static final showNotificationBlocked$lambda$1(Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->openSystemSettings(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, La13/a;->onActivityStarted(Landroid/app/Activity;)V

    iput-object p1, p0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->currentActivity:Landroid/app/Activity;

    return-void
.end method

.method public onLastActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->currentActivity:Landroid/app/Activity;

    return-void
.end method

.method public onPermissionDenied()V
    .locals 6

    invoke-direct {p0}, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->currentActivity:Landroid/app/Activity;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[onPermissionDenied] currentActivity: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->showNotificationBlocked(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public onPermissionGranted()V
    .locals 0

    return-void
.end method

.method public onPermissionRationale()V
    .locals 0

    return-void
.end method

.method public onPermissionRequested()V
    .locals 0

    return-void
.end method
