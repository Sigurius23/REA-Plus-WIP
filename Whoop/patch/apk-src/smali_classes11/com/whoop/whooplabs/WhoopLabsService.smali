.class public final Lcom/whoop/whooplabs/WhoopLabsService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/WhoopLabsService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001aB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0004J\u000f\u0010\u000c\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0004J)\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\n2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010\u0004J\u0010\u0010 \u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008 \u0010\u0014J\u0010\u0010!\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008!\u0010\u0014J\u0010\u0010\"\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\"\u0010\u0014J\u0010\u0010#\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008#\u0010\u0014J\u000f\u0010$\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008$\u0010\u0004J\u000f\u0010%\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008%\u0010\u0004J\u000f\u0010&\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008&\u0010\u0004J\u000f\u0010\'\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0004J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\u0008/\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010;R(\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\n0=8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0011\u0010T\u001a\u00020Q8F\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010SR\u0011\u0010X\u001a\u00020U8F\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010WR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010[R\u0013\u0010`\u001a\u0004\u0018\u00010]8F\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_\u00a8\u0006b"
    }
    d2 = {
        "Lcom/whoop/whooplabs/WhoopLabsService;",
        "Landroid/app/Service;",
        "Lbc3/c0;",
        "<init>",
        "()V",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "Ll83/a0;",
        "onCreate",
        "onDestroy",
        "",
        "flags",
        "startId",
        "onStartCommand",
        "(Landroid/content/Intent;II)I",
        "",
        "A",
        "(Lq83/d;)Ljava/lang/Object;",
        "n",
        "i",
        "w",
        "",
        "note",
        "h",
        "(Ljava/lang/String;)V",
        "address",
        "t",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "m",
        "x",
        "l",
        "B",
        "D",
        "s",
        "z",
        "C",
        "k",
        "Lcom/whoop/design/util/TextResource;",
        "error",
        "y",
        "(Lcom/whoop/design/util/TextResource;)V",
        "Landroid/content/Context;",
        "context",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "j",
        "(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "Lyw2/h;",
        "Lyw2/h;",
        "serviceModel",
        "Lin2/d;",
        "Lin2/d;",
        "dispatcherFactory",
        "Lbc3/u;",
        "Lbc3/u;",
        "supervisorJob",
        "Lbc3/s;",
        "E",
        "Lbc3/s;",
        "q",
        "()Lbc3/s;",
        "setStartupCompleted",
        "(Lbc3/s;)V",
        "startupCompleted",
        "Lbc3/k1;",
        "F",
        "Lbc3/k1;",
        "serviceModelJob",
        "Lm32/a;",
        "G",
        "Lm32/a;",
        "permissionChecker",
        "Landroidx/core/app/NotificationManagerCompat;",
        "H",
        "Landroidx/core/app/NotificationManagerCompat;",
        "notificationManager",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "r",
        "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "study",
        "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
        "o",
        "()Lcom/whoop/whooplabs/io/HrDeviceConnection;",
        "hrDeviceConnection",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "Lorg/joda/time/DateTime;",
        "p",
        "()Lorg/joda/time/DateTime;",
        "lastBtHrReceivedTime",
        "a",
        "whooplabs_release"
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
.field private E:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field private F:Lbc3/k1;

.field private final G:Lm32/a;

.field private final H:Landroidx/core/app/NotificationManagerCompat;

.field private final w:Ltr2/n;

.field private final x:Lyw2/h;

.field private final y:Lin2/d;

.field private final z:Lbc3/u;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v0, "WhoopLabsService"

    invoke-static {v0}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lyw2/h;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyw2/h;

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lin2/d;

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->y:Lin2/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->z:Lbc3/u;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->E:Lbc3/s;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lm32/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm32/a;

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->G:Lm32/a;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/NotificationManagerCompat;

    iput-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->H:Landroidx/core/app/NotificationManagerCompat;

    return-void
.end method

.method private final C()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/whooplabs/WhoopLabsService;->k()V

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->LOW:Lc12/b;

    sget v2, Lyw2/e;->w:I

    const-string v3, "06625_WhoopLabs"

    invoke-direct {v0, v1, v3, v2}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc12/d;->k(Z)Lc12/d;

    move-result-object v0

    invoke-direct {p0, p0}, Lcom/whoop/whooplabs/WhoopLabsService;->j(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    sget v2, Lyw2/e;->y:I

    invoke-static {p0, v2}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    sget v2, Lyw2/e;->x:I

    invoke-static {p0, v2}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const-string v2, "setOnlyAlertOnce(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    const/16 v3, 0x6d

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {p0, v3, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    return-void

    :cond_0
    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/whooplabs/WhoopLabsService;Ll83/a0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/WhoopLabsService;->u(Lcom/whoop/whooplabs/WhoopLabsService;Ll83/a0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/whooplabs/WhoopLabsService;Lcom/whoop/design/util/TextResource;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/WhoopLabsService;->v(Lcom/whoop/whooplabs/WhoopLabsService;Lcom/whoop/design/util/TextResource;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/whooplabs/WhoopLabsService;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/whooplabs/WhoopLabsService;)Lyw2/h;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/whooplabs/WhoopLabsService;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/WhoopLabsService;->s()V

    return-void
.end method

.method public static final synthetic f(Lcom/whoop/whooplabs/WhoopLabsService;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplabs/WhoopLabsService;->y(Lcom/whoop/design/util/TextResource;)V

    return-void
.end method

.method public static final synthetic g(Lcom/whoop/whooplabs/WhoopLabsService;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/WhoopLabsService;->z()V

    return-void
.end method

.method private final j(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 2

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    const-string v1, "00100_General"

    invoke-direct {v0, p1, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Luv0/b;->a:I

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Luv0/a;->a:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setColor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final k()V
    .locals 4

    new-instance v0, Landroid/app/NotificationChannel;

    sget v1, Lyw2/e;->w:I

    invoke-static {p0, v1}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    const-string v3, "06625_WhoopLabs"

    invoke-direct {v0, v3, v1, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    const-string v1, "notification"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/app/NotificationManager;

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method private final s()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Hiding missing bthr notification"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->G:Lm32/a;

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-interface {v0, v1}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->H:Landroidx/core/app/NotificationManagerCompat;

    const/16 v1, 0x6d

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    :cond_0
    return-void
.end method

.method private static final u(Lcom/whoop/whooplabs/WhoopLabsService;Ll83/a0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lcom/whoop/whooplabs/WhoopLabsService;Lcom/whoop/design/util/TextResource;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/whoop/whooplabs/WhoopLabsService;->y(Lcom/whoop/design/util/TextResource;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final y(Lcom/whoop/design/util/TextResource;)V
    .locals 3

    invoke-virtual {p1, p0}, Lcom/whoop/design/util/TextResource;->resolve(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->y:Lin2/d;

    invoke-interface {v0}, Lin2/d;->a()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/whooplabs/WhoopLabsService$i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/whooplabs/WhoopLabsService$i;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {p0, v0, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final z()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Showing missing bthr notification"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->G:Lm32/a;

    const-string v2, "android.permission.POST_NOTIFICATIONS"

    invoke-interface {v0, v2}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lc12/d;

    sget-object v2, Lc12/b;->MEDIUM:Lc12/b;

    const-string v3, "06625_WhoopLabs"

    sget v4, Lyw2/e;->p:I

    invoke-direct {v0, v2, v3, v4}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lc12/d;->k(Z)Lc12/d;

    move-result-object v0

    invoke-direct {p0, p0}, Lcom/whoop/whooplabs/WhoopLabsService;->j(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    sget v2, Luv0/b;->a:I

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    sget v2, Lyw2/e;->p:I

    invoke-static {p0, v2}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    sget v2, Lyw2/e;->o:I

    invoke-static {p0, v2}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    new-instance v2, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v2}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    sget v3, Lyw2/e;->p:I

    invoke-static {p0, v3}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v2

    sget v3, Lyw2/e;->o:I

    invoke-static {p0, v3}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const-string v2, "setStyle(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->H:Landroidx/core/app/NotificationManagerCompat;

    const/16 v2, 0x6d

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/whooplabs/WhoopLabsService$j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService$j;

    iget v1, v0, Lcom/whoop/whooplabs/WhoopLabsService$j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/WhoopLabsService$j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/WhoopLabsService$j;

    invoke-direct {v0, p0, p1}, Lcom/whoop/whooplabs/WhoopLabsService$j;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/whooplabs/WhoopLabsService$j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/WhoopLabsService$j;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    iput v3, v0, Lcom/whoop/whooplabs/WhoopLabsService$j;->y:I

    invoke-virtual {p1, v0}, Lyw2/h;->d0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/whoop/whooplabs/WhoopLabsService;->C()V

    :cond_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0, p1}, Lyw2/h;->e0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final D(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0, p1}, Lyw2/h;->k0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->y:Lin2/d;

    invoke-interface {v0}, Lin2/d;->getDefault()Lq83/j;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplabs/WhoopLabsService;->z:Lbc3/u;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0, p1}, Lyw2/h;->q(Ljava/lang/String;)V

    return-void
.end method

.method public final i(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/whooplabs/WhoopLabsService$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService$b;

    iget v1, v0, Lcom/whoop/whooplabs/WhoopLabsService$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/WhoopLabsService$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/WhoopLabsService$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/whooplabs/WhoopLabsService$b;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/whooplabs/WhoopLabsService$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/WhoopLabsService$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    iput v3, v0, Lcom/whoop/whooplabs/WhoopLabsService$b;->y:I

    invoke-virtual {p1, v0}, Lyw2/h;->r(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-virtual {p0, v3}, Landroid/app/Service;->stopForeground(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final l(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0, p1}, Lyw2/h;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->x()V

    return-void
.end method

.method public final n(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {p1}, Lyw2/h;->y()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/app/Service;->stopForeground(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final o()Lcom/whoop/whooplabs/io/HrDeviceConnection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->E()Lcom/whoop/whooplabs/io/HrDeviceConnection;

    move-result-object v0

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    new-instance p1, Lcom/whoop/whooplabs/WhoopLabsService$a;

    invoke-direct {p1, p0}, Lcom/whoop/whooplabs/WhoopLabsService$a;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;)V

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "creating service"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/whooplabs/WhoopLabsService$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/whooplabs/WhoopLabsService$e;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    invoke-static {v0}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    new-instance v0, Lcom/whoop/whooplabs/WhoopLabsService$f;

    invoke-direct {v0, p0, v1}, Lcom/whoop/whooplabs/WhoopLabsService$f;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p0, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lcom/whoop/whooplabs/WhoopLabsService$g;

    invoke-direct {v0, p0, v1}, Lcom/whoop/whooplabs/WhoopLabsService$g;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    invoke-static {p0, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->H()Lor2/r0;

    move-result-object v0

    new-instance v1, Lyw2/g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lyw2/g;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;I)V

    new-instance v2, Lcom/whoop/whooplabs/b$a;

    invoke-direct {v2, v1}, Lcom/whoop/whooplabs/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->B()Lor2/s0;

    move-result-object v0

    new-instance v1, Lyw2/g;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lyw2/g;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;I)V

    new-instance v2, Lcom/whoop/whooplabs/b$a;

    invoke-direct {v2, v1}, Lcom/whoop/whooplabs/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->P()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    iget-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    const/4 p3, 0x0

    new-array v0, p3, [Lqr2/a$a;

    const-string v1, "onStartCommand"

    invoke-interface {p2, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->y:Lin2/d;

    invoke-interface {v0}, Lin2/d;->getDefault()Lq83/j;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "default scheduler is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array p3, p3, [Lqr2/a$a;

    invoke-interface {p2, v0, p3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService;->E:Lbc3/s;

    iget-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService;->F:Lbc3/k1;

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2, p3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string p2, "labs_campaign"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    goto :goto_0

    :cond_1
    move-object p1, p3

    :goto_0
    new-instance p2, Lcom/whoop/whooplabs/WhoopLabsService$h;

    invoke-direct {p2, p1, p0, p3}, Lcom/whoop/whooplabs/WhoopLabsService$h;-><init>(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, p3, p3, p2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService;->F:Lbc3/k1;

    return p1
.end method

.method public final p()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->G()Lorg/joda/time/DateTime;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lbc3/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc3/s;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->E:Lbc3/s;

    return-object v0
.end method

.method public final r()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0}, Lyw2/h;->I()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v0

    return-object v0
.end method

.method public final t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/whooplabs/WhoopLabsService$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService$c;

    iget v1, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/WhoopLabsService$c;

    invoke-direct {v0, p0, p2}, Lcom/whoop/whooplabs/WhoopLabsService$c;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lcom/whoop/whooplabs/b;->a()J

    move-result-wide v4

    new-instance p2, Lcom/whoop/whooplabs/WhoopLabsService$d;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lcom/whoop/whooplabs/WhoopLabsService$d;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->w:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/whooplabs/WhoopLabsService$c;->z:I

    invoke-static {v4, v5, p2, v0}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService;->w:Ltr2/n;

    const-string v0, "Device connection attempt timeout "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lcom/whoop/whooplabs/WhoopLabsService;->m()V

    move p1, v0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0, p1}, Lyw2/h;->S(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService;->x:Lyw2/h;

    invoke-virtual {v0, p1}, Lyw2/h;->T(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
