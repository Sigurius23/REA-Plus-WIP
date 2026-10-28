.class public abstract Lj02/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\u0008\u001a\u00020\u0007*\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "",
        "a",
        "(Ljava/lang/String;)Z",
        "c",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "launchSingleTop",
        "Leb/x0;",
        "e",
        "(Ljava/lang/String;Z)Leb/x0;",
        "Landroid/os/Bundle;",
        "b",
        "(Landroid/os/Bundle;)Ljava/lang/String;",
        "d",
        "navigation_release"
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
.method public static final a(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "PRESENT"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "navigationStyle"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    const-string p0, "PRESENT"

    return-object p0
.end method

.method public static final d(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "settingsSource"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Z)Leb/x0;
    .locals 1

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    invoke-static {p0}, Lj02/n0;->a(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {v0}, Lor2/c1;->d(Leb/w0;)Leb/w0;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    :goto_0
    iput-boolean p1, v0, Leb/w0;->a:Z

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;ZILjava/lang/Object;)Leb/x0;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Lj02/n0;->e(Ljava/lang/String;Z)Leb/x0;

    move-result-object p0

    return-object p0
.end method
