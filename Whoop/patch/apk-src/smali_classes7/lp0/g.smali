.class public final Llp0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010 R\u0014\u0010\"\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Llp0/g;",
        "",
        "Lor2/u0;",
        "localizedDateTimeFormatter",
        "<init>",
        "(Lor2/u0;)V",
        "",
        "optimalSleepInTheScreenPixels",
        "",
        "totalPixelsOnScreen",
        "",
        "d",
        "(ID)Z",
        "Lorg/joda/time/Instant;",
        "startInstant",
        "endInstant",
        "",
        "a",
        "(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;",
        "Lkp0/a;",
        "alarmType",
        "Landroid/content/res/Resources;",
        "resources",
        "b",
        "(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;",
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "scale",
        "Llp0/l;",
        "optimalSleepWindow",
        "Llp0/f;",
        "c",
        "(Lcom/whoop/coaching/sleepcoach/harvard/view/a;Llp0/l;Landroid/content/res/Resources;Lkp0/a;)Llp0/f;",
        "Lor2/u0;",
        "D",
        "sixtyPercent",
        "sleep-coach_release"
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
.field public static final c:I


# instance fields
.field private final a:Lor2/u0;

.field private final b:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lor2/u0;->d:I

    sput v0, Llp0/g;->c:I

    return-void
.end method

.method public constructor <init>(Lor2/u0;)V
    .locals 2

    const-string v0, "localizedDateTimeFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp0/g;->a:Lor2/u0;

    const-wide v0, 0x3fe3333333333333L    # 0.6

    iput-wide v0, p0, Llp0/g;->b:D

    return-void
.end method

.method private final a(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lorg/joda/time/Instant;->toDateTime()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p2}, Lorg/joda/time/Instant;->toDateTime()Lorg/joda/time/DateTime;

    move-result-object p2

    iget-object v0, p0, Llp0/g;->a:Lor2/u0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lor2/u0;->g(Lorg/joda/time/ReadableInstant;Z)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Llp0/g;->a:Lor2/u0;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2, v1}, Lor2/u0;->g(Lorg/joda/time/ReadableInstant;Z)Ljava/lang/String;

    move-result-object p2

    const-string v0, " - "

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final b(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lkp0/c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lkp0/n;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lkp0/f;

    if-eqz p1, :cond_1

    sget p1, Lqe2/g;->v0:I

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lkp0/a;->a()Lkp0/o;

    move-result-object p1

    instance-of p1, p1, Lkp0/l;

    if-eqz p1, :cond_3

    sget p1, Lqe2/g;->v0:I

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    sget p1, Lqe2/g;->y0:I

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final d(ID)Z
    .locals 4

    int-to-double v0, p1

    iget-wide v2, p0, Llp0/g;->b:D

    mul-double/2addr p2, v2

    cmpl-double p1, v0, p2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final c(Lcom/whoop/coaching/sleepcoach/harvard/view/a;Llp0/l;Landroid/content/res/Resources;Lkp0/a;)Llp0/f;
    .locals 9

    const-string v0, "scale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/joda/time/Instant;

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b()Lorg/joda/time/Instant;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Lorg/joda/time/Instant;-><init>(J)V

    const/4 v1, 0x2

    const-string v2, "getString(...)"

    if-nez p2, :cond_0

    new-instance p2, Llp0/e;

    sget p4, Lqe2/g;->v0:I

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lqe2/g;->q0:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v0

    int-to-double v2, v0

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide v4

    mul-double/2addr v4, v2

    int-to-double v0, v1

    div-double/2addr v4, v0

    invoke-direct {p2, p4, p3, v4, v5}, Llp0/e;-><init>(Ljava/lang/String;Ljava/lang/String;D)V

    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v0

    invoke-static {v0, p1}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v0

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v1

    invoke-static {v1, p1}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result p1

    new-instance v1, Llp0/b;

    invoke-direct {p0, p4, p3}, Llp0/g;->b(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object p4

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p2

    invoke-direct {p0, p4, p2}, Llp0/g;->a(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p3, p2, v0, p1}, Llp0/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v0

    invoke-static {v0, p1}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v5

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v0

    invoke-static {v0, p1}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v6

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide v2

    mul-double/2addr v2, v0

    invoke-direct {p0, v6, v2, v3}, Llp0/g;->d(ID)Z

    move-result v7

    new-instance v1, Llp0/d;

    move-wide v3, v2

    invoke-direct {p0, p4, p3}, Llp0/g;->b(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object p1

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Llp0/g;->a(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;

    move-result-object p1

    move-wide p2, v3

    sget-object v4, Llp0/h;->LEFT:Llp0/h;

    double-to-int v8, p2

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Llp0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Llp0/h;IIZI)V

    return-object v1

    :cond_2
    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v0

    invoke-static {v0, p1}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v5

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v0

    invoke-static {v0, p1}, Llp0/i;->c(Lorg/joda/time/Instant;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)I

    move-result v6

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide v2

    mul-double/2addr v2, v0

    double-to-int v8, v2

    sub-int v0, v8, v5

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v1

    int-to-double v1, v1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide v3

    mul-double/2addr v3, v1

    invoke-direct {p0, v0, v3, v4}, Llp0/g;->d(ID)Z

    move-result v7

    new-instance v1, Llp0/d;

    invoke-direct {p0, p4, p3}, Llp0/g;->b(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object p1

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Llp0/g;->a(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Llp0/h;->RIGHT:Llp0/h;

    invoke-direct/range {v1 .. v8}, Llp0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Llp0/h;IIZI)V

    return-object v1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance p1, Llp0/c;

    invoke-direct {p0, p4, p3}, Llp0/g;->b(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object p4

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p2

    invoke-direct {p0, p4, p2}, Llp0/g;->a(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;

    move-result-object p2

    sget-object p4, Llp0/h;->LEFT:Llp0/h;

    const/4 v0, 0x0

    invoke-direct {p1, p3, p2, p4, v0}, Llp0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Llp0/h;I)V

    return-object p1

    :cond_4
    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Llp0/c;

    invoke-direct {p0, p4, p3}, Llp0/g;->b(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Llp0/l;->e()Lorg/joda/time/Instant;

    move-result-object p4

    invoke-virtual {p2}, Llp0/l;->c()Lorg/joda/time/Instant;

    move-result-object p2

    invoke-direct {p0, p4, p2}, Llp0/g;->a(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;

    move-result-object p2

    sget-object p4, Llp0/h;->RIGHT:Llp0/h;

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v1

    int-to-double v1, v1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide v3

    mul-double/2addr v3, v1

    double-to-int p1, v3

    invoke-direct {v0, p3, p2, p4, p1}, Llp0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Llp0/h;I)V

    return-object v0

    :cond_5
    new-instance p2, Llp0/e;

    sget p4, Lqe2/g;->v0:I

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lqe2/g;->q0:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c()I

    move-result v0

    int-to-double v2, v0

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a()D

    move-result-wide v4

    mul-double/2addr v4, v2

    int-to-double v0, v1

    div-double/2addr v4, v0

    invoke-direct {p2, p4, p3, v4, v5}, Llp0/e;-><init>(Ljava/lang/String;Ljava/lang/String;D)V

    return-object p2
.end method
