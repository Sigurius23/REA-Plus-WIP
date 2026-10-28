.class public final Lfg/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfg/b;

.field public b:Lkotlin/time/TimeMark;

.field public c:D

.field public d:I

.field public final e:D


# direct methods
.method public constructor <init>(Lfg/b;Lkotlin/time/TimeSource$Monotonic;)V
    .locals 3

    invoke-interface {p2}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object v0

    const-string v1, "timeSource"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "lastTxBucketMark"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/f;->a:Lfg/b;

    iput-object v0, p0, Lfg/f;->b:Lkotlin/time/TimeMark;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lfg/f;->c:D

    const/4 p2, 0x0

    iput p2, p0, Lfg/f;->d:I

    const/4 p2, 0x1

    int-to-double v0, p2

    iget-wide p1, p1, Lfg/b;->a:J

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide p1

    div-double/2addr v0, p1

    iput-wide v0, p0, Lfg/f;->e:D

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 12

    iget v0, p0, Lfg/f;->d:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lfg/f;->d:I

    iget-object v0, p0, Lfg/f;->b:Lkotlin/time/TimeMark;

    invoke-interface {v0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v2

    iget-object v0, p0, Lfg/f;->a:Lfg/b;

    iget-wide v4, v0, Lfg/b;->a:J

    invoke-static {v2, v3, v4, v5}, Lkotlin/time/Duration;->div-LRDsOJo(JJ)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v2, v4

    if-ltz v4, :cond_0

    iget v4, p0, Lfg/f;->d:I

    int-to-double v4, v4

    div-double/2addr v4, v2

    iget-wide v6, p0, Lfg/f;->e:D

    mul-double/2addr v4, v6

    iget-wide v6, v0, Lfg/b;->e:D

    mul-double/2addr v4, v6

    iget-wide v8, p0, Lfg/f;->c:D

    int-to-double v10, v1

    sub-double/2addr v10, v6

    mul-double/2addr v10, v8

    add-double/2addr v10, v4

    iput-wide v10, p0, Lfg/f;->c:D

    iget-object v1, p0, Lfg/f;->b:Lkotlin/time/TimeMark;

    iget-wide v4, v0, Lfg/b;->a:J

    invoke-static {v4, v5, v2, v3}, Lkotlin/time/Duration;->times-UwyO8pc(JD)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lkotlin/time/TimeMark;->plus-LRDsOJo(J)Lkotlin/time/TimeMark;

    move-result-object v0

    iput-object v0, p0, Lfg/f;->b:Lkotlin/time/TimeMark;

    const/4 v0, 0x0

    iput v0, p0, Lfg/f;->d:I

    :cond_0
    iget-wide v0, p0, Lfg/f;->c:D

    return-wide v0
.end method
