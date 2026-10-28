.class public final Lw71/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw71/c0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0017"
    }
    d2 = {
        "Lw71/c0;",
        "",
        "",
        "curTime",
        "startTime",
        "endTime",
        "<init>",
        "(JJJ)V",
        "",
        "a",
        "()F",
        "sliderValue",
        "b",
        "(F)J",
        "J",
        "getCurTime",
        "()J",
        "flooredStartTime",
        "c",
        "flooredEndTime",
        "d",
        "ticks",
        "e",
        "design_release"
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
.field public static final e:Lw71/c0$a;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw71/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw71/c0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lw71/c0;->e:Lw71/c0$a;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lw71/c0;->a:J

    sget-object p1, Lw71/c0;->e:Lw71/c0$a;

    invoke-virtual {p1, p3, p4}, Lw71/c0$a;->a(J)J

    move-result-wide p2

    iput-wide p2, p0, Lw71/c0;->b:J

    invoke-virtual {p1, p5, p6}, Lw71/c0$a;->a(J)J

    move-result-wide p4

    iput-wide p4, p0, Lw71/c0;->c:J

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sub-long/2addr p4, p2

    invoke-static {p4, p5}, Ljava/lang/Math;->abs(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide p1

    const/16 p3, 0x1e

    int-to-long p3, p3

    div-long/2addr p1, p3

    const-wide/16 p3, 0x1

    add-long/2addr p1, p3

    iput-wide p1, p0, Lw71/c0;->d:J

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 7

    iget-wide v0, p0, Lw71/c0;->a:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    move-wide v0, v2

    goto :goto_0

    :cond_0
    sget-object v4, Lw71/c0;->e:Lw71/c0$a;

    invoke-virtual {v4, v0, v1}, Lw71/c0$a;->a(J)J

    move-result-wide v0

    :goto_0
    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    long-to-float v0, v0

    goto :goto_2

    :cond_1
    iget-wide v2, p0, Lw71/c0;->b:J

    cmp-long v2, v0, v2

    const/high16 v3, 0x41f00000    # 30.0f

    if-gez v2, :cond_2

    new-instance v2, Lorg/joda/time/DateTime;

    invoke-direct {v2, v0, v1}, Lorg/joda/time/DateTime;-><init>(J)V

    new-instance v4, Lorg/joda/time/DateTime;

    iget-wide v5, p0, Lw71/c0;->b:J

    invoke-direct {v4, v5, v6}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-static {v2, v4}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Days;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/Days;->getDays()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-instance v4, Lorg/joda/time/DateTime;

    invoke-direct {v4, v0, v1}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-virtual {v4, v2}, Lorg/joda/time/DateTime;->plusDays(I)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    new-instance v2, Lorg/joda/time/Duration;

    iget-wide v4, p0, Lw71/c0;->b:J

    invoke-direct {v2, v4, v5, v0, v1}, Lorg/joda/time/Duration;-><init>(JJ)V

    invoke-virtual {v2}, Lorg/joda/time/Duration;->getStandardMinutes()J

    move-result-wide v0

    :goto_1
    long-to-float v0, v0

    div-float/2addr v0, v3

    goto :goto_2

    :cond_2
    new-instance v2, Lorg/joda/time/Duration;

    iget-wide v4, p0, Lw71/c0;->b:J

    invoke-direct {v2, v4, v5, v0, v1}, Lorg/joda/time/Duration;-><init>(JJ)V

    invoke-virtual {v2}, Lorg/joda/time/Duration;->getStandardMinutes()J

    move-result-wide v0

    goto :goto_1

    :goto_2
    iget-wide v1, p0, Lw71/c0;->d:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    long-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Le93/b;->m(FFF)F

    move-result v0

    return v0
.end method

.method public final b(F)J
    .locals 3

    new-instance v0, Lorg/joda/time/DateTime;

    iget-wide v1, p0, Lw71/c0;->b:J

    invoke-direct {v0, v1, v2}, Lorg/joda/time/DateTime;-><init>(J)V

    float-to-int p1, p1

    mul-int/lit8 p1, p1, 0x1e

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTime;->plusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lw71/c0;->d:J

    return-wide v0
.end method
