.class public final Lkotlin/time/MeasureTimeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a.\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0007\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00082\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u0004\u0010\t\u001a:\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\n2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a>\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\n*\u00020\u00062\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u000e\u001a>\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\n*\u00020\u00082\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u000f\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0010"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "block",
        "Lkotlin/time/Duration;",
        "measureTime",
        "(Lc93/a;)J",
        "Lkotlin/time/TimeSource;",
        "(Lkotlin/time/TimeSource;Lc93/a;)J",
        "Lkotlin/time/TimeSource$Monotonic;",
        "(Lkotlin/time/TimeSource$Monotonic;Lc93/a;)J",
        "T",
        "Lkotlin/time/TimedValue;",
        "measureTimedValue",
        "(Lc93/a;)Lkotlin/time/TimedValue;",
        "(Lkotlin/time/TimeSource;Lc93/a;)Lkotlin/time/TimedValue;",
        "(Lkotlin/time/TimeSource$Monotonic;Lc93/a;)Lkotlin/time/TimedValue;",
        "kotlin-stdlib"
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
.method public static final measureTime(Lc93/a;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")J"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    .line 2
    invoke-virtual {v0}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    .line 3
    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    .line 4
    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final measureTime(Lkotlin/time/TimeSource$Monotonic;Lc93/a;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/time/TimeSource$Monotonic;",
            "Lc93/a;",
            ")J"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    .line 9
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    .line 10
    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final measureTime(Lkotlin/time/TimeSource;Lc93/a;)J
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/time/TimeSource;",
            "Lc93/a;",
            ")J"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {p0}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p0

    .line 6
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    .line 7
    invoke-interface {p0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide p0

    return-wide p0
.end method

.method public static final measureTimedValue(Lc93/a;)Lkotlin/time/TimedValue;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc93/a;",
            ")",
            "Lkotlin/time/TimedValue<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    .line 2
    invoke-virtual {v0}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    .line 3
    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 4
    new-instance v2, Lkotlin/time/TimedValue;

    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide v0

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v1, v3}, Lkotlin/time/TimedValue;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static final measureTimedValue(Lkotlin/time/TimeSource$Monotonic;Lc93/a;)Lkotlin/time/TimedValue;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/time/TimeSource$Monotonic;",
            "Lc93/a;",
            ")",
            "Lkotlin/time/TimedValue<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    .line 9
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 10
    new-instance p1, Lkotlin/time/TimedValue;

    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lkotlin/time/TimedValue;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static final measureTimedValue(Lkotlin/time/TimeSource;Lc93/a;)Lkotlin/time/TimedValue;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/time/TimeSource;",
            "Lc93/a;",
            ")",
            "Lkotlin/time/TimedValue<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {p0}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p0

    .line 6
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    .line 7
    new-instance v0, Lkotlin/time/TimedValue;

    invoke-interface {p0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v1

    const/4 p0, 0x0

    invoke-direct {v0, p1, v1, v2, p0}, Lkotlin/time/TimedValue;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
