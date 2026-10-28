.class public final enum Lpu/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lpu/b;

.field public static final enum F:Lpu/b;

.field public static final synthetic G:[Lpu/b;

.field public static final enum z:Lpu/b;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lpu/b;

    const-string v4, "com.mapbox.common.module"

    const-string v5, "LibraryLoader"

    const-string v1, "CommonLibraryLoader"

    const/4 v2, 0x0

    const-string v3, "LibraryLoader"

    invoke-direct/range {v0 .. v5}, Lpu/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lpu/b;->z:Lpu/b;

    new-instance v1, Lpu/b;

    const-string v5, "com.mapbox.base.common.logger"

    const-string v6, "Logger"

    const-string v2, "CommonLogger"

    const/4 v3, 0x1

    const-string v4, "Logger"

    invoke-direct/range {v1 .. v6}, Lpu/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lpu/b;->E:Lpu/b;

    new-instance v2, Lpu/b;

    const-string v6, "com.mapbox.maps.module"

    const-string v7, "MapTelemetry"

    const-string v3, "MapTelemetry"

    const/4 v4, 0x2

    const-string v5, "MapTelemetry"

    invoke-direct/range {v2 .. v7}, Lpu/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lpu/b;->F:Lpu/b;

    new-instance v3, Lpu/b;

    const-string v7, "com.mapbox.navigation.base.trip.notification"

    const-string v8, "TripNotification"

    const-string v4, "NavigationTripNotification"

    const/4 v5, 0x3

    const-string v6, "TripNotification"

    invoke-direct/range {v3 .. v8}, Lpu/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v0, v1, v2, v3}, [Lpu/b;

    move-result-object v0

    sput-object v0, Lpu/b;->G:[Lpu/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lpu/b;->w:Ljava/lang/String;

    iput-object p4, p0, Lpu/b;->x:Ljava/lang/String;

    iput-object p5, p0, Lpu/b;->y:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpu/b;
    .locals 1

    const-class v0, Lpu/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpu/b;

    return-object p0
.end method

.method public static values()[Lpu/b;
    .locals 1

    sget-object v0, Lpu/b;->G:[Lpu/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpu/b;

    return-object v0
.end method
