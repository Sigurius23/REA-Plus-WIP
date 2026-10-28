.class public final Lqp0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqp0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ5\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lqp0/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "startTimestamp",
        "endTimestamp",
        "Ljava/time/ZoneId;",
        "zone",
        "",
        "d",
        "(JJLjava/time/ZoneId;)Ljava/lang/String;",
        "",
        "b",
        "(JJLjava/time/ZoneId;)Ljava/util/Map;",
        "Ljava/time/format/DateTimeFormatter;",
        "activityNavigationFormatter",
        "Ljava/time/format/DateTimeFormatter;",
        "add-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqp0/a$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Lqp0/a$a;JJLjava/time/ZoneId;ILjava/lang/Object;)Ljava/util/Map;
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object p5

    const-string p6, "systemDefault(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lqp0/a$a;->b(JJLjava/time/ZoneId;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lqp0/a$a;JJLjava/time/ZoneId;ILjava/lang/Object;)Ljava/lang/String;
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object p5

    const-string p6, "systemDefault(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lqp0/a$a;->d(JJLjava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJ)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-static/range {v0 .. v7}, Lqp0/a$a;->c(Lqp0/a$a;JJLjava/time/ZoneId;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final b(JJLjava/time/ZoneId;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/time/ZoneId;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "zone"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    invoke-static {p1, p5}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p2

    invoke-static {p2, p5}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    move-result-object p2

    const-string p3, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-static {p3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ll83/k;

    const-string p4, "startDate"

    invoke-direct {p3, p4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string p4, "endDate"

    invoke-direct {p1, p4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final d(JJLjava/time/ZoneId;)Ljava/lang/String;
    .locals 1

    const-string v0, "zone"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    invoke-static {p1, p5}, Ljava/time/OffsetDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/OffsetDateTime;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p2

    invoke-static {p2, p5}, Ljava/time/OffsetDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/OffsetDateTime;

    move-result-object p2

    invoke-static {}, Lqp0/a;->c()Ljava/time/format/DateTimeFormatter;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lqp0/a;->c()Ljava/time/format/DateTimeFormatter;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "https://app.whoop.com/ADD_ACTIVITY?start_time="

    const-string p4, "&end_time="

    invoke-static {p3, p1, p4, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
