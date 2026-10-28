.class public final Lzr2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzr2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lzr2/c;",
        "Lzr2/a;",
        "Lkotlin/Function0;",
        "",
        "nowProvider",
        "Lorg/joda/time/DateTimeZone;",
        "timeZoneProvider",
        "<init>",
        "(Lc93/a;Lc93/a;)V",
        "Lorg/joda/time/LocalDate;",
        "d",
        "()Lorg/joda/time/LocalDate;",
        "Lorg/joda/time/LocalDateTime;",
        "a",
        "()Lorg/joda/time/LocalDateTime;",
        "b",
        "()J",
        "Lorg/joda/time/DateTime;",
        "c",
        "()Lorg/joda/time/DateTime;",
        "Lorg/joda/time/Instant;",
        "f",
        "()Lorg/joda/time/Instant;",
        "Lc93/a;",
        "e",
        "()Lorg/joda/time/DateTimeZone;",
        "defaultZone",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final b:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "nowProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzr2/c;->a:Lc93/a;

    iput-object p2, p0, Lzr2/c;->b:Lc93/a;

    return-void
.end method


# virtual methods
.method public a()Lorg/joda/time/LocalDateTime;
    .locals 4

    new-instance v0, Lorg/joda/time/LocalDateTime;

    iget-object v1, p0, Lzr2/c;->a:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p0}, Lzr2/c;->e()Lorg/joda/time/DateTimeZone;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/joda/time/LocalDateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lzr2/c;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Lorg/joda/time/DateTime;
    .locals 4

    new-instance v0, Lorg/joda/time/DateTime;

    iget-object v1, p0, Lzr2/c;->a:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p0}, Lzr2/c;->e()Lorg/joda/time/DateTimeZone;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    return-object v0
.end method

.method public d()Lorg/joda/time/LocalDate;
    .locals 4

    new-instance v0, Lorg/joda/time/LocalDate;

    iget-object v1, p0, Lzr2/c;->a:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p0}, Lzr2/c;->e()Lorg/joda/time/DateTimeZone;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/joda/time/LocalDate;-><init>(JLorg/joda/time/DateTimeZone;)V

    return-object v0
.end method

.method public e()Lorg/joda/time/DateTimeZone;
    .locals 1

    iget-object v0, p0, Lzr2/c;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/DateTimeZone;

    return-object v0
.end method

.method public f()Lorg/joda/time/Instant;
    .locals 3

    new-instance v0, Lorg/joda/time/Instant;

    iget-object v1, p0, Lzr2/c;->a:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lorg/joda/time/Instant;-><init>(J)V

    return-object v0
.end method
