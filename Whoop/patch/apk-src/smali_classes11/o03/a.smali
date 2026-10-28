.class public abstract Lo03/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u001d\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "",
        "level",
        "Li2/x;",
        "c",
        "(Ljava/lang/Integer;)J",
        "d",
        "(Ljava/lang/Integer;)I",
        "",
        "stateName",
        "h",
        "(Ljava/lang/String;)I",
        "g",
        "(Ljava/lang/String;)J",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "f",
        "(Landroid/content/Context;)Landroid/content/Intent;",
        "Lo6/a;",
        "a",
        "(Landroid/content/Context;)Lo6/a;",
        "deepLink",
        "e",
        "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;",
        "b",
        "(Landroid/content/Context;Ljava/lang/String;)Lo6/a;",
        "",
        "percent",
        "",
        "isCalibrating",
        "j",
        "(FZ)J",
        "i",
        "(Landroid/content/Context;F)Ljava/lang/String;",
        "widget_release"
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
.method public static final a(Landroid/content/Context;)Lo6/a;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lo03/a;->f(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    const/4 v0, 0x0

    new-array v1, v0, [Lo6/d;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo6/d;

    invoke-static {v0}, Lx43/j;->P([Lo6/d;)Lo6/f;

    move-result-object v0

    new-instance v1, Lq6/c;

    invoke-direct {v1, p0, v0}, Lq6/c;-><init>(Landroid/content/Intent;Lo6/f;)V

    return-object v1
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;)Lo6/a;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lo03/a;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    const/4 p1, 0x0

    new-array v0, p1, [Lo6/d;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lo6/d;

    invoke-static {p1}, Lx43/j;->P([Lo6/d;)Lo6/f;

    move-result-object p1

    new-instance v0, Lq6/c;

    invoke-direct {v0, p0, p1}, Lq6/c;-><init>(Landroid/content/Intent;Lo6/f;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/Integer;)J
    .locals 2

    if-nez p0, :cond_0

    sget p0, Li2/x;->o:I

    sget-wide v0, Li2/x;->d:J

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_1

    const-wide v0, 0xffff0026L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    sget p0, Li2/x;->o:I

    sget-wide v0, Li2/x;->f:J

    return-wide v0
.end method

.method public static final d(Ljava/lang/Integer;)I
    .locals 2

    if-nez p0, :cond_0

    sget p0, Ld03/a;->f:I

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x14

    if-gt v0, v1, :cond_1

    sget p0, Ld03/a;->b:I

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x28

    if-gt v0, v1, :cond_2

    sget p0, Ld03/a;->c:I

    return p0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3c

    if-gt v0, v1, :cond_3

    sget p0, Ld03/a;->d:I

    return p0

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x50

    if-gt p0, v0, :cond_4

    sget p0, Ld03/a;->e:I

    return p0

    :cond_4
    sget p0, Ld03/a;->a:I

    return p0
.end method

.method public static final e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lo03/a;->f(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p0
.end method

.method private static final f(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "getPackageManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final g(Ljava/lang/String;)J
    .locals 2

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x66924ead

    if-eq v0, v1, :cond_4

    const v1, -0x4414a2f8

    if-eq v0, v1, :cond_2

    const v1, 0x6bcb370f

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "RELAXED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-wide v0, 0xff67aee6L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_2
    const-string v0, "BALANCED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const-wide v0, 0xff00f19fL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_4
    const-string v0, "STRESSED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const-wide v0, 0xffffa722L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_6
    :goto_0
    sget p0, Li2/x;->o:I

    sget-wide v0, Li2/x;->f:J

    return-wide v0
.end method

.method public static final h(Ljava/lang/String;)I
    .locals 1

    const-string v0, "RELAXED"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget p0, Lgy0/a;->I3:I

    return p0

    :cond_0
    sget p0, Lgy0/a;->H3:I

    return p0
.end method

.method public static final i(Landroid/content/Context;F)Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/16 p0, 0x64

    int-to-float p0, p0

    mul-float/2addr p1, p0

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p0

    const-string p1, "%"

    invoke-static {p0, p1}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    sget p1, Ld03/b;->b:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final j(FZ)J
    .locals 1

    if-eqz p1, :cond_0

    const-wide p0, 0xffdcdcdcL

    invoke-static {p0, p1}, Li2/w0;->e(J)J

    move-result-wide p0

    return-wide p0

    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    cmpg-float p1, p0, p1

    const v0, 0x4dffffff    # 5.3687088E8f

    if-nez p1, :cond_1

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide p0

    return-wide p0

    :cond_1
    const/4 p1, 0x0

    cmpg-float p1, p0, p1

    if-nez p1, :cond_2

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide p0

    return-wide p0

    :cond_2
    const p1, 0x3ea8f5c3    # 0.33f

    cmpg-float p1, p0, p1

    if-gtz p1, :cond_3

    const-wide p0, 0xffff0026L

    invoke-static {p0, p1}, Li2/w0;->e(J)J

    move-result-wide p0

    return-wide p0

    :cond_3
    const p1, 0x3f28f5c3    # 0.66f

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_4

    const-wide p0, 0xffffde00L

    invoke-static {p0, p1}, Li2/w0;->e(J)J

    move-result-wide p0

    return-wide p0

    :cond_4
    const-wide p0, 0xff19ec06L

    invoke-static {p0, p1}, Li2/w0;->e(J)J

    move-result-wide p0

    return-wide p0
.end method
