.class public final Lug/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final E:Ljava/time/format/DateTimeFormatter;

.field public static final F:Lug/b;

.field public static final x:Lt9/p;

.field public static final y:Ljava/time/format/DateTimeFormatter;

.field public static final z:Ljava/time/format/DateTimeFormatter;


# instance fields
.field public final w:Ljava/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    new-instance v0, Lt9/p;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    sput-object v0, Lug/b;->x:Lt9/p;

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "Mon"

    invoke-direct {v2, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v3, 0x2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    new-instance v3, Ll83/k;

    const-string v4, "Tue"

    invoke-direct {v3, v9, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v4, 0x3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    new-instance v4, Ll83/k;

    const-string v5, "Wed"

    invoke-direct {v4, v10, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v5, 0x4

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    new-instance v5, Ll83/k;

    const-string v6, "Thu"

    invoke-direct {v5, v11, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v6, 0x5

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    new-instance v6, Ll83/k;

    const-string v7, "Fri"

    invoke-direct {v6, v12, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v7, 0x6

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    new-instance v7, Ll83/k;

    const-string v8, "Sat"

    invoke-direct {v7, v13, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v14, 0x7

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    new-instance v8, Ll83/k;

    const-string v15, "Sun"

    invoke-direct {v8, v14, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v2 .. v8}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    new-instance v15, Ll83/k;

    const-string v3, "Jan"

    invoke-direct {v15, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v3, "Feb"

    invoke-direct {v1, v9, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "Mar"

    invoke-direct {v3, v10, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "Apr"

    invoke-direct {v4, v11, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "May"

    invoke-direct {v5, v12, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "Jun"

    invoke-direct {v6, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v8, "Jul"

    invoke-direct {v7, v14, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v8, 0x8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v9, Ll83/k;

    const-string v10, "Aug"

    invoke-direct {v9, v8, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v10, 0x9

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v10, Ll83/k;

    const-string v11, "Sep"

    invoke-direct {v10, v8, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v11, 0xa

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v11, Ll83/k;

    const-string v12, "Oct"

    invoke-direct {v11, v8, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v12, 0xb

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v12, Ll83/k;

    const-string v13, "Nov"

    invoke-direct {v12, v8, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v13, 0xc

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v13, Ll83/k;

    const-string v14, "Dec"

    invoke-direct {v13, v8, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    move-object/from16 v25, v12

    move-object/from16 v26, v13

    filled-new-array/range {v15 .. v26}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Ljava/time/format/DateTimeFormatterBuilder;

    invoke-direct {v3}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/format/DateTimeFormatterBuilder;->parseLenient()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/format/DateTimeFormatterBuilder;->optionalStart()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v3

    sget-object v4, Ljava/time/temporal/ChronoField;->DAY_OF_WEEK:Ljava/time/temporal/ChronoField;

    invoke-virtual {v3, v4, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendText(Ljava/time/temporal/TemporalField;Ljava/util/Map;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v2

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/time/format/DateTimeFormatterBuilder;->optionalEnd()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v2

    sget-object v3, Ljava/time/temporal/ChronoField;->DAY_OF_MONTH:Ljava/time/temporal/ChronoField;

    sget-object v4, Ljava/time/format/SignStyle;->NOT_NEGATIVE:Ljava/time/format/SignStyle;

    const/4 v5, 0x2

    invoke-virtual {v2, v3, v5, v5, v4}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;IILjava/time/format/SignStyle;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v2

    sget-object v4, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    invoke-virtual {v2, v4, v1}, Ljava/time/format/DateTimeFormatterBuilder;->appendText(Ljava/time/temporal/TemporalField;Ljava/util/Map;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    sget-object v2, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    const/4 v4, 0x4

    invoke-virtual {v1, v2, v4}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    sget-object v2, Ljava/time/temporal/ChronoField;->HOUR_OF_DAY:Ljava/time/temporal/ChronoField;

    invoke-virtual {v1, v2, v5}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    sget-object v4, Ljava/time/temporal/ChronoField;->MINUTE_OF_HOUR:Ljava/time/temporal/ChronoField;

    invoke-virtual {v1, v4, v5}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/format/DateTimeFormatterBuilder;->optionalStart()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    sget-object v2, Ljava/time/temporal/ChronoField;->SECOND_OF_MINUTE:Ljava/time/temporal/ChronoField;

    invoke-virtual {v1, v2, v5}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/format/DateTimeFormatterBuilder;->optionalEnd()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    const-string v2, "+HHMM"

    const-string v3, "GMT"

    invoke-virtual {v1, v2, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sget-object v2, Ljava/time/chrono/IsoChronology;->INSTANCE:Ljava/time/chrono/IsoChronology;

    invoke-virtual {v1, v2}, Ljava/time/format/DateTimeFormatter;->withChronology(Ljava/time/chrono/Chronology;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    const-string v2, "withChronology(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Lug/b;->y:Ljava/time/format/DateTimeFormatter;

    const-string v1, "Z"

    invoke-static {v1}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    move-result-object v1

    const-string v2, "yyyyMMdd\'T\'HHmmss\'Z\'"

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    const-string v3, "withZone(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v2, Lug/b;->z:Ljava/time/format/DateTimeFormatter;

    const-string v2, "yyyyMMdd"

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Lug/b;->E:Ljava/time/format/DateTimeFormatter;

    sget-object v1, Lkotlin/time/Instant;->Companion:Lkotlin/time/Instant$Companion;

    invoke-virtual {v1}, Lkotlin/time/Instant$Companion;->getDISTANT_PAST()Lkotlin/time/Instant;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/time/Instant;->toEpochMilliseconds()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lug/c;->a(Lt9/p;J)Lug/b;

    invoke-virtual {v1}, Lkotlin/time/Instant$Companion;->getDISTANT_FUTURE()Lkotlin/time/Instant;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/time/Instant;->toEpochMilliseconds()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lug/c;->a(Lt9/p;J)Lug/b;

    move-result-object v0

    sput-object v0, Lug/b;->F:Lug/b;

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug/b;->w:Ljava/time/Instant;

    return-void
.end method


# virtual methods
.method public final a(Lug/b;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lug/b;->w:Ljava/time/Instant;

    iget-object p1, p1, Lug/b;->w:Ljava/time/Instant;

    invoke-virtual {v0, p1}, Ljava/time/Instant;->compareTo(Ljava/time/Instant;)I

    move-result p1

    return p1
.end method

.method public final b(Lug/t;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const-string v0, "format(...)"

    iget-object v1, p0, Lug/b;->w:Ljava/time/Instant;

    if-eqz p1, :cond_9

    const/4 v2, 0x1

    if-eq p1, v2, :cond_8

    const/4 v3, 0x2

    if-eq p1, v3, :cond_7

    const/4 v3, 0x3

    if-eq p1, v3, :cond_6

    const/4 v3, 0x4

    if-eq p1, v3, :cond_5

    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    new-instance p1, Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/time/Instant;->getNano()I

    move-result v0

    if-lez v0, :cond_3

    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/time/Instant;->getNano()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    rsub-int/lit8 v1, v1, 0x9

    const-string v3, "0"

    invoke-static {v1, v3}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-array v0, v2, [C

    const/16 v1, 0x30

    const/4 v3, 0x0

    aput-char v1, v0, v3

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    :goto_0
    add-int/lit8 v4, v1, -0x1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v5

    invoke-static {v0, v5}, Lm83/n;->Y([CC)Z

    move-result v5

    if-nez v5, :cond_0

    add-int/2addr v1, v2

    invoke-virtual {p1, v3, v1}, Ljava/lang/StringBuffer;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_2

    :cond_0
    if-gez v4, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, ""

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    sget-object p1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-static {v1, p1}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    sget-object v1, Lug/b;->y:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {v1, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    sget-object p1, Ljava/time/format/DateTimeFormatter;->ISO_INSTANT:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_7
    sget-object p1, Lug/b;->E:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_8
    sget-object p1, Lug/b;->z:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_9
    sget-object p1, Ljava/time/format/DateTimeFormatter;->ISO_INSTANT:Ljava/time/format/DateTimeFormatter;

    sget-object v2, Ljava/time/temporal/ChronoUnit;->MICROS:Ljava/time/temporal/ChronoUnit;

    invoke-virtual {v1, v2}, Ljava/time/Instant;->truncatedTo(Ljava/time/temporal/TemporalUnit;)Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c(J)Lug/b;
    .locals 0

    invoke-static {p1, p2}, Lkotlin/time/Duration;->unaryMinus-UwyO8pc(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lug/b;->d(J)Lug/b;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lug/b;

    invoke-virtual {p0, p1}, Lug/b;->a(Lug/b;)I

    move-result p1

    return p1
.end method

.method public final d(J)Lug/b;
    .locals 4

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v0

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getNanosecondsComponent-impl(J)I

    move-result p1

    iget-object p2, p0, Lug/b;->w:Ljava/time/Instant;

    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v2

    add-long/2addr v2, v0

    invoke-virtual {p2}, Ljava/time/Instant;->getNano()I

    move-result p2

    add-int/2addr p2, p1

    invoke-static {p2, v2, v3}, Lt9/p;->n(IJ)Lug/b;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lug/b;

    if-eqz v0, :cond_0

    check-cast p1, Lug/b;

    iget-object p1, p1, Lug/b;->w:Ljava/time/Instant;

    iget-object v0, p0, Lug/b;->w:Ljava/time/Instant;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lug/b;->w:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lug/t;->w:Lug/t;

    invoke-virtual {p0, v0}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
