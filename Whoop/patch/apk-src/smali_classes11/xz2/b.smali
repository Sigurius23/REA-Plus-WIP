.class public abstract Lxz2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/content/Context;IZ)I
    .locals 0

    invoke-static {p1, p2}, Lxz2/b;->c(IZ)I

    move-result p1

    invoke-static {p0, p1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method public static b(Landroid/content/Context;Lcom/whoop/service/network/model/cycles/Recovery;)I
    .locals 1

    invoke-static {p1}, Lxz2/b;->d(Lcom/whoop/service/network/model/cycles/Recovery;)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lxz2/b;->a(Landroid/content/Context;IZ)I

    move-result p0

    return p0
.end method

.method private static c(IZ)I
    .locals 1

    if-gtz p0, :cond_0

    sget p0, Lpz2/b;->g:I

    return p0

    :cond_0
    const/16 v0, 0x21

    if-gt p0, v0, :cond_2

    if-eqz p1, :cond_1

    sget p0, Lpz2/b;->d:I

    return p0

    :cond_1
    sget p0, Lpz2/b;->c:I

    return p0

    :cond_2
    const/16 v0, 0x42

    if-le p0, v0, :cond_4

    if-eqz p1, :cond_3

    sget p0, Lpz2/b;->b:I

    return p0

    :cond_3
    sget p0, Lpz2/b;->a:I

    return p0

    :cond_4
    if-eqz p1, :cond_5

    sget p0, Lpz2/b;->f:I

    return p0

    :cond_5
    sget p0, Lpz2/b;->e:I

    return p0
.end method

.method public static d(Lcom/whoop/service/network/model/cycles/Recovery;)I
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->isCurrentlyBlackedOut()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->isIncomplete()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->isCalibrating()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->getScore()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method
