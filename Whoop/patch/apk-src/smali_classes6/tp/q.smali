.class public final Ltp/q;
.super Ltp/g;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcq/i;

.field public final synthetic b:Lcom/google/android/gms/location/FusedLocationProviderClient;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Lcq/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/q;->b:Lcom/google/android/gms/location/FusedLocationProviderClient;

    iput-object p2, p0, Ltp/q;->a:Lcq/i;

    return-void
.end method


# virtual methods
.method public final onLocationAvailability(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 0

    return-void
.end method

.method public final onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 1

    iget-object v0, p0, Ltp/q;->a:Lcq/i;

    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->b()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcq/i;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Ltp/q;->b:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
