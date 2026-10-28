.class public final Lcom/whoop/trackactivity/service/TrackSessionService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trackactivity/service/TrackSessionService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\r\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/trackactivity/service/TrackSessionService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "",
        "gpsTrackingEnabled",
        "",
        "a",
        "(Z)I",
        "Landroid/content/Intent;",
        "intent",
        "flags",
        "startId",
        "onStartCommand",
        "(Landroid/content/Intent;II)I",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "w",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lcom/whoop/trackactivity/service/TrackSessionService$a;

.field public static final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trackactivity/service/TrackSessionService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trackactivity/service/TrackSessionService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trackactivity/service/TrackSessionService;->w:Lcom/whoop/trackactivity/service/TrackSessionService$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trackactivity/service/TrackSessionService;->x:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private final a(Z)I
    .locals 0

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    return p1

    :cond_0
    const/16 p1, 0x10

    return p1
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const-string p3, "com.whoop.trackactivity.EXTRA_GPS_TRACKING_ENABLED"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    :cond_0
    sget-object p1, Lvk2/c;->a:Lvk2/c;

    invoke-virtual {p1, p0}, Lvk2/c;->a(Landroid/content/Context;)Landroid/app/Notification;

    move-result-object p1

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/16 v1, 0x80

    if-lt p3, v0, :cond_1

    invoke-direct {p0, p2}, Lcom/whoop/trackactivity/service/TrackSessionService;->a(Z)I

    move-result p2

    invoke-virtual {p0, v1, p1, p2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    const/4 p1, 0x2

    return p1
.end method
