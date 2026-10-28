.class final Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->requestLocationUpdates(Landroid/app/PendingIntent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ljava/lang/Void;",
        "kotlin.jvm.PlatformType",
        "it",
        "Ll83/a0;",
        "invoke",
        "(Ljava/lang/Void;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;

    invoke-direct {v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;-><init>()V

    sput-object v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;->INSTANCE:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;->invoke(Ljava/lang/Void;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Void;)V
    .locals 2

    .line 2
    sget-object p1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v0, "GoogleDeviceLocationProvider"

    const-string v1, "Location update requested"

    invoke-virtual {p1, v0, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
