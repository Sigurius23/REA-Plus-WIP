.class public abstract Llp0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\u000c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lorg/joda/time/Instant;",
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "scale",
        "",
        "c",
        "(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I",
        "Landroid/app/Activity;",
        "d",
        "(Landroid/app/Activity;)I",
        "totalTimeDurationOnScreen",
        "Llp0/l;",
        "timeInBedWindow",
        "b",
        "(ILlp0/l;)Lorg/joda/time/Instant;",
        "sleep-coach_release"
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
.method public static final synthetic a(ILlp0/l;)Lorg/joda/time/Instant;
    .locals 0

    invoke-static {p0, p1}, Llp0/i;->b(ILlp0/l;)Lorg/joda/time/Instant;

    move-result-object p0

    return-object p0
.end method

.method private static final b(ILlp0/l;)Lorg/joda/time/Instant;
    .locals 3

    invoke-virtual {p1}, Llp0/l;->d()Lorg/joda/time/Instant;

    move-result-object p1

    div-int/lit8 p0, p0, 0x2

    new-instance v0, Lorg/joda/time/Instant;

    invoke-virtual {p1}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v1

    int-to-long p0, p0

    sub-long/2addr v1, p0

    invoke-direct {v0, v1, v2}, Lorg/joda/time/Instant;-><init>(J)V

    return-object v0
.end method

.method public static final c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b()Lorg/joda/time/Instant;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide p0

    mul-double/2addr p0, v0

    double-to-int p0, p0

    return p0
.end method

.method public static final d(Landroid/app/Activity;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/view/WindowManager;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot get screen info without WindowManager"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p0

    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_3
    iget p0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return p0
.end method
