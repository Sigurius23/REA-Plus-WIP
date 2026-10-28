.class public final Lq92/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq92/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u0000 \u001c2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u000e\u00a2\u0006\u0004\u0008 \u0010\u0017J\r\u0010!\u001a\u00020\u000e\u00a2\u0006\u0004\u0008!\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lq92/h;",
        "",
        "Lu92/d;",
        "sharedPrefs",
        "Lc92/a;",
        "bluetoothHelper",
        "<init>",
        "(Lu92/d;Lc92/a;)V",
        "Landroid/bluetooth/BluetoothDevice;",
        "a",
        "()Landroid/bluetooth/BluetoothDevice;",
        "device",
        "Lst0/v;",
        "strapGeneration",
        "",
        "advertisingName",
        "strapSerialNumber",
        "maximVersion",
        "nordicVersion",
        "Ll83/a0;",
        "i",
        "(Landroid/bluetooth/BluetoothDevice;Lst0/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "f",
        "()Ljava/lang/String;",
        "g",
        "name",
        "j",
        "(Ljava/lang/String;)V",
        "c",
        "b",
        "()V",
        "h",
        "d",
        "e",
        "Lu92/d;",
        "Lc92/a;",
        "core_release"
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
.field public static final c:Lq92/h$a;


# instance fields
.field private final a:Lu92/d;

.field private final b:Lc92/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq92/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq92/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lq92/h;->c:Lq92/h$a;

    return-void
.end method

.method public constructor <init>(Lu92/d;Lc92/a;)V
    .locals 1

    const-string v0, "sharedPrefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq92/h;->a:Lu92/d;

    iput-object p2, p0, Lq92/h;->b:Lc92/a;

    return-void
.end method


# virtual methods
.method public final a()Landroid/bluetooth/BluetoothDevice;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "stored_device_address"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq92/h;->b:Lc92/a;

    invoke-virtual {v1}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v2

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    invoke-virtual {v0}, Lu92/d;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_known_whoop_device_advertising_name"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_maxim_version"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_nordic_version"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final f()Ljava/lang/String;
    .locals 5
    .annotation runtime Ll83/c;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_known_whoop_device_generation"

    sget-object v2, Lst0/v;->Companion:Lst0/v$a;

    sget-object v3, Lst0/v;->GEN_4:Lst0/v;

    invoke-virtual {v2, v3}, Lst0/v$a;->b(Lst0/v;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2, v3}, Lst0/v$a;->b(Lst0/v;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_known_whoop_device_generation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_whoop_serial_number"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final i(Landroid/bluetooth/BluetoothDevice;Lst0/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapGeneration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapSerialNumber"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maximVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nordicVersion"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "stored_device_name"

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "stored_device_address"

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_known_whoop_device_generation"

    sget-object v2, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {v2, p2}, Lst0/v$a;->b(Lst0/v;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lq92/h;->a:Lu92/d;

    const-string v0, "last_known_whoop_device_advertising_name"

    if-nez p3, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p2, v0, p3}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lq92/h;->a:Lu92/d;

    const-string p2, "last_whoop_serial_number"

    invoke-virtual {p1, p2, p4}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lq92/h;->a:Lu92/d;

    const-string p2, "last_maxim_version"

    invoke-virtual {p1, p2, p5}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lq92/h;->a:Lu92/d;

    const-string p2, "last_nordic_version"

    invoke-virtual {p1, p2, p6}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final j(Ljava/lang/String;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq92/h;->a:Lu92/d;

    const-string v1, "last_known_whoop_device_advertising_name"

    invoke-virtual {v0, v1, p1}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
