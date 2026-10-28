.class public final Lm1/q;
.super Lm1/o;
.source "SourceFile"


# static fields
.field public static final e:Ljava/time/ZoneId;


# instance fields
.field public final c:I

.field public final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTC"

    invoke-static {v0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    move-result-object v0

    sput-object v0, Lm1/q;->e:Ljava/time/ZoneId;

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 7

    invoke-direct {p0, p1}, Lm1/o;-><init>(Ljava/util/Locale;)V

    invoke-static {p1}, Ljava/time/temporal/WeekFields;->of(Ljava/util/Locale;)Ljava/time/temporal/WeekFields;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/temporal/WeekFields;->getFirstDayOfWeek()Ljava/time/DayOfWeek;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/DayOfWeek;->getValue()I

    move-result v0

    iput v0, p0, Lm1/q;->c:I

    sget-object v0, Lm1/p;->a:Lt83/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lt83/b;->a()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Lt83/b;->a()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v0, v3}, Lt83/b;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/time/DayOfWeek;

    sget-object v5, Ljava/time/format/TextStyle;->FULL_STANDALONE:Ljava/time/format/TextStyle;

    invoke-virtual {v4, v5, p1}, Ljava/time/DayOfWeek;->getDisplayName(Ljava/time/format/TextStyle;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/time/format/TextStyle;->NARROW_STANDALONE:Ljava/time/format/TextStyle;

    invoke-virtual {v4, v6, p1}, Ljava/time/DayOfWeek;->getDisplayName(Ljava/time/format/TextStyle;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lm1/q;->d:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(J)Lm1/r;
    .locals 0

    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    sget-object p2, Lm1/q;->e:Ljava/time/ZoneId;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/time/ZonedDateTime;->withDayOfMonth(I)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lm1/n;
    .locals 7

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v0

    new-instance v1, Lm1/n;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    move-result v2

    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v3

    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v6

    sget-object v4, Ljava/time/LocalTime;->MIDNIGHT:Ljava/time/LocalTime;

    invoke-virtual {v0, v4}, Ljava/time/LocalDate;->atTime(Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v0

    sget-object v4, Lm1/q;->e:Ljava/time/ZoneId;

    invoke-virtual {v0, v4}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    invoke-direct/range {v1 .. v6}, Lm1/n;-><init>(IIJI)V

    return-object v1
.end method

.method public final c(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lm1/n;
    .locals 6

    iget-object v0, p0, Lm1/o;->b:Ljava/util/LinkedHashMap;

    invoke-static {p3, p1, v0}, Lm1/e0;->g(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    :try_start_0
    invoke-static {p2, p1}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    move-result-object p1

    new-instance v0, Lm1/n;

    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    move-result v1

    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonth()Ljava/time/Month;

    move-result-object p2

    invoke-virtual {p2}, Ljava/time/Month;->getValue()I

    move-result v2

    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v5

    sget-object p2, Ljava/time/LocalTime;->MIDNIGHT:Ljava/time/LocalTime;

    invoke-virtual {p1, p2}, Ljava/time/LocalDate;->atTime(Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object p1

    sget-object p2, Lm1/q;->e:Ljava/time/ZoneId;

    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v3

    invoke-direct/range {v0 .. v5}, Lm1/n;-><init>(IIJI)V
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(J)Lm1/n;
    .locals 6

    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    sget-object p2, Lm1/q;->e:Ljava/time/ZoneId;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p1

    new-instance v0, Lm1/n;

    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    move-result v1

    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v2

    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v5

    invoke-virtual {p1}, Ljava/time/LocalDate;->atStartOfDay()Ljava/time/LocalDateTime;

    move-result-object p1

    sget-object p2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-interface {p1, p2}, Ljava/time/chrono/ChronoLocalDateTime;->toEpochSecond(Ljava/time/ZoneOffset;)J

    move-result-wide p1

    const/16 v3, 0x3e8

    int-to-long v3, v3

    mul-long/2addr v3, p1

    invoke-direct/range {v0 .. v5}, Lm1/n;-><init>(IIJI)V

    return-object v0
.end method

.method public final e(Ljava/time/LocalDate;)Lm1/r;
    .locals 8

    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfWeek()Ljava/time/DayOfWeek;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/DayOfWeek;->getValue()I

    move-result v0

    iget v1, p0, Lm1/q;->c:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v0, v0, 0x7

    :cond_0
    move v7, v0

    sget-object v0, Ljava/time/LocalTime;->MIDNIGHT:Ljava/time/LocalTime;

    invoke-virtual {p1, v0}, Ljava/time/LocalDate;->atTime(Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v0

    sget-object v1, Lm1/q;->e:Ljava/time/ZoneId;

    invoke-virtual {v0, v1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    new-instance v1, Lm1/r;

    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    move-result v2

    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v3

    invoke-virtual {p1}, Ljava/time/LocalDate;->lengthOfMonth()I

    move-result v4

    invoke-direct/range {v1 .. v7}, Lm1/r;-><init>(IIIJI)V

    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CalendarModel"

    return-object v0
.end method
