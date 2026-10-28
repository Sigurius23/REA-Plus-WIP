.class public final Lfg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfg/b;

.field public final b:Lkotlin/time/TimeSource;

.field public c:D

.field public d:Lkotlin/time/TimeMark;

.field public e:Z

.field public f:D


# direct methods
.method public constructor <init>(Lfg/b;Lkotlin/time/TimeSource$Monotonic;)V
    .locals 7

    invoke-interface {p2}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object v0

    const-string v1, "timeSource"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lastThrottleTime"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/g;->a:Lfg/b;

    iput-object p2, p0, Lfg/g;->b:Lkotlin/time/TimeSource;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lfg/g;->c:D

    iput-object v0, p0, Lfg/g;->d:Lkotlin/time/TimeMark;

    const/4 p2, 0x1

    int-to-double v3, p2

    const-wide v5, 0x3fe6666666666666L    # 0.7

    sub-double/2addr v3, v5

    mul-double/2addr v3, v1

    iget-wide p1, p1, Lfg/b;->d:D

    div-double/2addr v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide p1

    iput-wide p1, p0, Lfg/g;->f:D

    return-void
.end method


# virtual methods
.method public final a(Lgg/f;DD)D
    .locals 4

    sget-object v0, Lgg/f;->y:Lgg/f;

    iget-object v1, p0, Lfg/g;->a:Lfg/b;

    if-ne p1, v0, :cond_1

    iget-boolean p1, p0, Lfg/g;->e:Z

    if-eqz p1, :cond_0

    invoke-static {p2, p3, p4, p5}, Ljava/lang/Math;->min(DD)D

    move-result-wide p2

    :cond_0
    iput-wide p2, p0, Lfg/g;->c:D

    const/4 p1, 0x1

    int-to-double p4, p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v2, 0x3fe6666666666666L    # 0.7

    sub-double/2addr p4, v2

    mul-double/2addr p4, p2

    iget-wide p2, v1, Lfg/b;->d:D

    div-double/2addr p4, p2

    invoke-static {p4, p5}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide p2

    iput-wide p2, p0, Lfg/g;->f:D

    iget-object p2, p0, Lfg/g;->b:Lkotlin/time/TimeSource;

    invoke-interface {p2}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p2

    iput-object p2, p0, Lfg/g;->d:Lkotlin/time/TimeMark;

    iput-boolean p1, p0, Lfg/g;->e:Z

    iget-wide p1, p0, Lfg/g;->c:D

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    mul-double/2addr p1, v2

    return-wide p1

    :cond_1
    iget-object p1, p0, Lfg/g;->d:Lkotlin/time/TimeMark;

    invoke-interface {p1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide p1

    sget-object p3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, p3}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide p1

    iget-wide p3, v1, Lfg/b;->d:D

    iget-wide v0, p0, Lfg/g;->f:D

    sub-double/2addr p1, v0

    const/4 p5, 0x3

    int-to-double v0, p5

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    mul-double/2addr p1, p3

    iget-wide p3, p0, Lfg/g;->c:D

    add-double/2addr p1, p3

    return-wide p1
.end method
