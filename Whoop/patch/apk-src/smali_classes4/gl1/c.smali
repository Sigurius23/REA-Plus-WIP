.class public abstract Lgl1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgl1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lb11/i;",
        "status",
        "",
        "e",
        "(Lb11/i;)Ljava/lang/String;",
        "Lsl1/a;",
        "indicatorResult",
        "d",
        "(Lsl1/a;)Ljava/lang/String;",
        "Lsl1/b;",
        "tileType",
        "f",
        "(Lsl1/b;)Ljava/lang/String;",
        "Lfm1/g;",
        "g",
        "(Lfm1/g;)Ljava/lang/String;",
        "h",
        "home_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lsl1/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lgl1/c;->d(Lsl1/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lb11/i;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lgl1/c;->e(Lb11/i;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lsl1/b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lgl1/c;->f(Lsl1/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lsl1/a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lsl1/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Bluetooth is off"

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lsl1/a;->f()Ltd1/f;

    move-result-object v0

    sget-object v1, Ltd1/f;->PAIR_DEVICE:Ltd1/f;

    if-ne v0, v1, :cond_1

    const-string p0, "Pair a Whoop device"

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lsl1/a;->f()Ltd1/f;

    move-result-object v0

    sget-object v1, Ltd1/f;->CONNECTING:Ltd1/f;

    if-ne v0, v1, :cond_2

    const-string p0, "Connecting"

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lsl1/a;->f()Ltd1/f;

    move-result-object v0

    sget-object v1, Ltd1/f;->CONNECTED:Ltd1/f;

    if-ne v0, v1, :cond_3

    const-string p0, "Connected"

    return-object p0

    :cond_3
    invoke-virtual {p0}, Lsl1/a;->f()Ltd1/f;

    move-result-object v0

    sget-object v1, Ltd1/f;->CONNECTION_FAILED:Ltd1/f;

    if-ne v0, v1, :cond_4

    const-string p0, "Connection failed"

    return-object p0

    :cond_4
    invoke-virtual {p0}, Lsl1/a;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "No network connection"

    return-object p0

    :cond_5
    invoke-virtual {p0}, Lsl1/a;->d()Lca2/a;

    move-result-object v0

    invoke-virtual {v0}, Lca2/a;->c()Lca2/c;

    move-result-object v0

    sget-object v1, Lca2/c;->CATCHING_UP:Lca2/c;

    if-ne v0, v1, :cond_6

    const-string p0, "Data catching up"

    return-object p0

    :cond_6
    invoke-virtual {p0}, Lsl1/a;->d()Lca2/a;

    move-result-object p0

    invoke-virtual {p0}, Lca2/a;->c()Lca2/c;

    move-result-object p0

    sget-object v0, Lca2/c;->CAUGHT_UP:Lca2/c;

    if-ne p0, v0, :cond_7

    const-string p0, "Data caught up"

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final e(Lb11/i;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Lb11/i$a;

    if-nez v0, :cond_7

    sget-object v0, Lb11/i$b;->f:Lb11/i$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    instance-of v0, p0, Lb11/i$c;

    if-nez v0, :cond_6

    sget-object v0, Lb11/i$d;->f:Lb11/i$d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lb11/i$e;->f:Lb11/i$e;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Disconnected"

    return-object p0

    :cond_2
    instance-of v0, p0, Lb11/i$f;

    if-nez v0, :cond_5

    sget-object v0, Lb11/i$g;->f:Lb11/i$g;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Lb11/i$h;->f:Lb11/i$h;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "Off body"

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    const-string p0, "Low Battery"

    return-object p0

    :cond_6
    :goto_1
    const-string p0, "Connected"

    return-object p0

    :cond_7
    :goto_2
    const-string p0, "Charging"

    return-object p0
.end method

.method private static final f(Lsl1/b;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Lsl1/b$a;

    if-eqz v0, :cond_0

    const-string p0, "bluetoothOff"

    return-object p0

    :cond_0
    instance-of v0, p0, Lsl1/b$p;

    if-eqz v0, :cond_1

    const-string p0, "noService"

    return-object p0

    :cond_1
    instance-of v0, p0, Lsl1/b$d;

    if-eqz v0, :cond_2

    const-string p0, "dataCatchingUp"

    return-object p0

    :cond_2
    instance-of v0, p0, Lsl1/b$e;

    if-eqz v0, :cond_3

    const-string p0, "dataCaughtUp"

    return-object p0

    :cond_3
    instance-of v0, p0, Lsl1/b$q;

    if-eqz v0, :cond_4

    const-string p0, "pairADevice"

    return-object p0

    :cond_4
    instance-of v0, p0, Lsl1/b$g;

    if-eqz v0, :cond_5

    const-string p0, "connected"

    return-object p0

    :cond_5
    instance-of v0, p0, Lsl1/b$b;

    if-eqz v0, :cond_6

    const-string p0, "connecting"

    return-object p0

    :cond_6
    instance-of v0, p0, Lsl1/b$c;

    if-eqz v0, :cond_7

    const-string p0, "failedToConnect"

    return-object p0

    :cond_7
    instance-of v0, p0, Lsl1/b$r;

    if-eqz v0, :cond_8

    const-string p0, "wearYourWhoop"

    return-object p0

    :cond_8
    instance-of v0, p0, Lsl1/b$k;

    if-eqz v0, :cond_9

    const-string p0, "firmwareUpdateAvailable"

    return-object p0

    :cond_9
    instance-of v0, p0, Lsl1/b$m;

    if-eqz v0, :cond_a

    const-string p0, "firmwareInstalling"

    return-object p0

    :cond_a
    instance-of v0, p0, Lsl1/b$l;

    if-eqz v0, :cond_b

    const-string p0, "firmwareUpdateComplete"

    return-object p0

    :cond_b
    instance-of p0, p0, Lsl1/b$i;

    if-eqz p0, :cond_c

    const-string p0, "firmwareUpdateFailed"

    return-object p0

    :cond_c
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final g(Lfm1/g;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgl1/c$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const-string p0, "Sleep Pillar"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "Recovery Pillar"

    return-object p0

    :cond_2
    const-string p0, "Strain Pillar"

    return-object p0

    :cond_3
    const-string p0, "Overview Pillar"

    return-object p0
.end method

.method public static final h(Lfm1/g;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgl1/c$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Ls01/a;->SLEEP_ACTIVITY:Ls01/a;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ls01/a;->RECOVERY_ACTIVITY:Ls01/a;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Ls01/a;->STRAIN_ACTIVITY:Ls01/a;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Ls01/a;->OVERVIEW:Ls01/a;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
