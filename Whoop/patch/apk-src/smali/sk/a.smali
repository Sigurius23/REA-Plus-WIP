.class public abstract Lsk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lxg3/g;
    .locals 3

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v1, Lch3/q;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, v0}, Lch3/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lxg3/g;->j(Lxg3/e;)Lxg3/g;

    move-result-object p0

    new-instance v0, Ljc/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    invoke-virtual {p0, v0}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method
