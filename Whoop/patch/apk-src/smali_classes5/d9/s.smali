.class public final synthetic Ld9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRouting$OnRoutingChangedListener;


# instance fields
.field public final synthetic a:La33/d;


# direct methods
.method public synthetic constructor <init>(La33/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/s;->a:La33/d;

    return-void
.end method


# virtual methods
.method public final onRoutingChanged(Landroid/media/AudioRouting;)V
    .locals 2

    iget-object v0, p0, Ld9/s;->a:La33/d;

    iget-object v1, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Ld9/s;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroid/media/AudioRouting;->getRoutedDevice()Landroid/media/AudioDeviceInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ld30/h;

    invoke-virtual {v0, p1}, Ld30/h;->c(Landroid/media/AudioDeviceInfo;)V

    :cond_1
    :goto_0
    return-void
.end method
