.class public final synthetic Liv/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Liv/e;

.field public final synthetic y:Li7/g;


# direct methods
.method public synthetic constructor <init>(Liv/e;Li7/g;I)V
    .locals 0

    iput p3, p0, Liv/c;->w:I

    iput-object p1, p0, Liv/c;->x:Liv/e;

    iput-object p2, p0, Liv/c;->y:Li7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget p2, p0, Liv/c;->w:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Liv/c;->x:Liv/e;

    iget-object p2, p2, Liv/e;->H:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    iget-object v1, p0, Liv/c;->y:Li7/g;

    invoke-interface {p2, v0, v1}, Lcom/mapbox/maps/geofencing/MapGeofencingConsent;->setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V

    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void

    :pswitch_0
    iget-object p2, p0, Liv/c;->x:Liv/e;

    iget-object p2, p2, Liv/e;->H:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    iget-object v1, p0, Liv/c;->y:Li7/g;

    invoke-interface {p2, v0, v1}, Lcom/mapbox/maps/geofencing/MapGeofencingConsent;->setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V

    :cond_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
