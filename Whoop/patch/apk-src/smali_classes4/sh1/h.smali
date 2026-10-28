.class public final Lsh1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh1/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0097@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lsh1/h;",
        "Lsh1/g;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/google/android/gms/location/LocationRequest;",
        "request",
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "Ll83/a0;",
        "a",
        "(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;",
        "",
        "priority",
        "Landroid/location/Location;",
        "c",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "kotlin.jvm.PlatformType",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "delegate",
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
.field private final a:Lcom/google/android/gms/location/FusedLocationProviderClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    new-instance v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-direct {v0, p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lsh1/h;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Landroid/app/PendingIntent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lsh1/h;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "requestLocationUpdates(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Landroid/app/PendingIntent;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lsh1/h;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "removeLocationUpdates(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c(ILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Landroid/location/Location;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lsh1/h;->a:Lcom/google/android/gms/location/FusedLocationProviderClient;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->getCurrentLocation(ILcq/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "getCurrentLocation(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
