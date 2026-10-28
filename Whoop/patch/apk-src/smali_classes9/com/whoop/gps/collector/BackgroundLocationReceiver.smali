.class public final Lcom/whoop/gps/collector/BackgroundLocationReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/gps/collector/BackgroundLocationReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "Lsh1/f;",
        "a",
        "Ll83/h;",
        "b",
        "()Lsh1/f;",
        "koinHelper",
        "gps-tracking_release"
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
.field private final a:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Ls51/p;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ls51/p;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/gps/collector/BackgroundLocationReceiver;->a:Ll83/h;

    return-void
.end method

.method public static synthetic a()Lsh1/f;
    .locals 1

    invoke-static {}, Lcom/whoop/gps/collector/BackgroundLocationReceiver;->c()Lsh1/f;

    move-result-object v0

    return-object v0
.end method

.method private final b()Lsh1/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/collector/BackgroundLocationReceiver;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh1/f;

    return-object v0
.end method

.method private static final c()Lsh1/f;
    .locals 3

    new-instance v0, Lsh1/f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lsh1/f;-><init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/location/LocationResult;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string p1, "com.google.android.gms.location.EXTRA_LOCATION_RESULT"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/LocationResult;

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/location/LocationResult;->w:Ljava/util/List;

    invoke-direct {p0}, Lcom/whoop/gps/collector/BackgroundLocationReceiver;->b()Lsh1/f;

    move-result-object p2

    invoke-virtual {p2}, Lsh1/f;->c()Ltr2/n;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, "GPS RECEIVER: Received "

    const-string v2, " location(s)"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/gps/collector/BackgroundLocationReceiver;->b()Lsh1/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lsh1/f;->d(Ljava/util/List;)V

    :cond_1
    return-void
.end method
