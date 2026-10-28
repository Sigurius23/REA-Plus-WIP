.class public final Lno/nordicsemi/android/ble/g0;
.super Lno/nordicsemi/android/ble/l0;
.source "SourceFile"


# instance fields
.field public n:Lio/sentry/android/replay/m;

.field public final o:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x1f

    invoke-direct {p0, v0}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    const/16 v0, 0x17

    if-ge p1, v0, :cond_0

    move p1, v0

    :cond_0
    const/16 v0, 0x205

    if-le p1, v0, :cond_1

    move p1, v0

    :cond_1
    iput p1, p0, Lno/nordicsemi/android/ble/g0;->o:I

    return-void
.end method


# virtual methods
.method public final a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    return-object p0
.end method

.method public final c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    return-object p0
.end method

.method public final d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    return-object p0
.end method

.method public final i(Landroid/os/Handler;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/k0;->i(Landroid/os/Handler;)Lno/nordicsemi/android/ble/k0;

    return-object p0
.end method

.method public final l(Ljc/x;)V
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    return-void
.end method
