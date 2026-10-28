.class public final Lvl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/time/temporal/TemporalAccessor;


# static fields
.field public static final K:Lxl/a;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:Lvl/d;

.field public final J:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxl/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxl/a;-><init>(I)V

    sput-object v0, Lvl/a;->K:Lxl/a;

    return-void
.end method

.method public constructor <init>(IIIIIIIILvl/d;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvl/a;->w:I

    iput p2, p0, Lvl/a;->x:I

    iput p3, p0, Lvl/a;->y:I

    iput p4, p0, Lvl/a;->z:I

    iput p5, p0, Lvl/a;->E:I

    iput p6, p0, Lvl/a;->F:I

    iput p7, p0, Lvl/a;->G:I

    iput p8, p0, Lvl/a;->H:I

    iput-object p9, p0, Lvl/a;->I:Lvl/d;

    iput p10, p0, Lvl/a;->J:I

    const/16 p10, 0x3b

    const/16 v0, 0x3c

    if-ne p7, v0, :cond_6

    invoke-static {p2, p3}, Ljava/time/YearMonth;->of(II)Ljava/time/YearMonth;

    move-result-object v1

    sget-object v2, Lvl/a;->K:Lxl/a;

    iget-object v3, v2, Lxl/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/TreeSet;

    invoke-virtual {v3, v1}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v2, v2, Lxl/a;->y:Ljava/lang/Object;

    check-cast v2, Ljava/time/YearMonth;

    invoke-virtual {v1, v2}, Ljava/time/YearMonth;->isAfter(Ljava/time/YearMonth;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_0
    sget-object v1, Lvl/d;->c:Lvl/d;

    if-nez p9, :cond_1

    move-object p9, v1

    :cond_1
    invoke-virtual {p9}, Lvl/d;->a()I

    move-result v2

    div-int/lit16 v2, v2, 0xe10

    sub-int v2, p5, v2

    invoke-virtual {p9}, Lvl/d;->a()I

    move-result v3

    rem-int/lit16 v3, v3, 0xe10

    div-int/2addr v3, v0

    sub-int v0, p6, v3

    sget-object v3, Ljava/time/Month;->DECEMBER:Ljava/time/Month;

    invoke-virtual {v3}, Ljava/time/Month;->getValue()I

    move-result v3

    if-ne p3, v3, :cond_2

    const/16 v3, 0x1f

    if-eq p4, v3, :cond_3

    :cond_2
    sget-object v3, Ljava/time/Month;->JUNE:Ljava/time/Month;

    invoke-virtual {v3}, Ljava/time/Month;->getValue()I

    move-result v3

    if-ne p3, v3, :cond_6

    const/16 v3, 0x1e

    if-ne p4, v3, :cond_6

    :cond_3
    const/16 v3, 0x17

    if-ne v2, v3, :cond_6

    if-eq v0, p10, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p9, v1}, Lvl/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    :goto_0
    move-object p9, p1

    goto :goto_1

    :cond_5
    iget p1, p9, Lvl/d;->a:I

    iget p7, p9, Lvl/d;->b:I

    invoke-static {p1, p7}, Ljava/time/ZoneOffset;->ofHoursMinutes(II)Ljava/time/ZoneOffset;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/16 p7, 0x3b

    invoke-static/range {p2 .. p9}, Ljava/time/OffsetDateTime;->of(IIIIIIILjava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    move-result-object p1

    const-wide/16 p2, 0x1

    invoke-virtual {p1, p2, p3}, Ljava/time/OffsetDateTime;->plusSeconds(J)Ljava/time/OffsetDateTime;

    new-instance p1, Lcom/ethlo/time/LeapSecondException;

    const-string p2, "Leap second detected in input"

    invoke-direct {p1, p2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    const/4 p5, 0x2

    if-lt p1, p5, :cond_7

    invoke-static {p2, p3, p4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    :cond_7
    if-gt p7, p10, :cond_8

    return-void

    :cond_8
    new-instance p1, Ljava/time/DateTimeException;

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Invalid value for SecondOfMinute (valid values 0 - 59): %d"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lvl/a;II)Ljava/lang/String;
    .locals 11

    invoke-static {p1}, Le4/p;->e(I)I

    move-result v0

    iget v1, p0, Lvl/a;->w:I

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v2

    if-gt v0, v2, :cond_d

    iget-object v0, p0, Lvl/a;->I:Lvl/d;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvl/d;

    const/16 v2, 0x23

    new-array v2, v2, [C

    iget v3, p0, Lvl/a;->x:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-static {v3, v4, v5, v2}, Lxl/b;->c(III[C)V

    const/4 v3, 0x1

    if-ne p1, v3, :cond_0

    invoke-static {v2, v5, v1}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1}, Le4/p;->e(I)I

    move-result v6

    const/4 v7, 0x5

    const/16 v8, 0x2d

    const/4 v9, 0x2

    if-lt v6, v3, :cond_1

    aput-char v8, v2, v5

    iget v6, p0, Lvl/a;->y:I

    invoke-static {v6, v7, v9, v2}, Lxl/b;->c(III[C)V

    :cond_1
    const/4 v6, 0x7

    if-ne p1, v9, :cond_2

    invoke-static {v2, v6, v1}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p1}, Le4/p;->e(I)I

    move-result v10

    if-lt v10, v9, :cond_3

    aput-char v8, v2, v6

    iget v6, p0, Lvl/a;->z:I

    const/16 v8, 0x8

    invoke-static {v6, v8, v9, v2}, Lxl/b;->c(III[C)V

    :cond_3
    const/4 v6, 0x3

    const/16 v8, 0xa

    if-ne p1, v6, :cond_4

    invoke-static {v2, v8, v1}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p1}, Le4/p;->e(I)I

    move-result v1

    if-lt v1, v6, :cond_5

    const/16 v1, 0x54

    aput-char v1, v2, v8

    iget v1, p0, Lvl/a;->E:I

    const/16 v6, 0xb

    invoke-static {v1, v6, v9, v2}, Lxl/b;->c(III[C)V

    :cond_5
    const/16 v1, 0xd

    if-ne p1, v5, :cond_6

    invoke-static {v2, v1, v0}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-static {p1}, Le4/p;->e(I)I

    move-result v6

    const/16 v8, 0x3a

    if-lt v6, v5, :cond_7

    aput-char v8, v2, v1

    iget v1, p0, Lvl/a;->F:I

    const/16 v5, 0xe

    invoke-static {v1, v5, v9, v2}, Lxl/b;->c(III[C)V

    :cond_7
    const/16 v1, 0x10

    if-ne p1, v7, :cond_8

    invoke-static {v2, v1, v0}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    invoke-static {p1}, Le4/p;->e(I)I

    move-result v5

    if-lt v5, v7, :cond_9

    aput-char v8, v2, v1

    iget v1, p0, Lvl/a;->G:I

    const/16 v5, 0x11

    invoke-static {v1, v5, v9, v2}, Lxl/b;->c(III[C)V

    :cond_9
    const/4 v1, 0x6

    const/16 v5, 0x13

    if-ne p1, v1, :cond_a

    invoke-static {v2, v5, v0}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    if-lez p2, :cond_b

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    if-lt p1, v1, :cond_b

    const/16 p1, 0x2e

    aput-char p1, v2, v5

    iget p0, p0, Lvl/a;->H:I

    const/16 p1, 0x14

    invoke-static {p0, p1, p2, v2}, Lxl/b;->c(III[C)V

    :cond_b
    if-lez p2, :cond_c

    move v4, v3

    :cond_c
    add-int/2addr v4, v5

    add-int/2addr v4, p2

    invoke-static {v2, v4, v0}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    new-instance p0, Lcom/ethlo/time/internal/DateTimeFormatException;

    invoke-static {p1}, Lvl/b;->y(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Lvl/b;->y(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Requested granularity was "

    const-string v1, ", but contains only granularity "

    invoke-static {v0, p1, v1, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lvl/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lvl/a;

    iget v0, p0, Lvl/a;->x:I

    iget v1, p1, Lvl/a;->x:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->y:I

    iget v1, p1, Lvl/a;->y:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->z:I

    iget v1, p1, Lvl/a;->z:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->E:I

    iget v1, p1, Lvl/a;->E:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->F:I

    iget v1, p1, Lvl/a;->F:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->G:I

    iget v1, p1, Lvl/a;->G:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->H:I

    iget v1, p1, Lvl/a;->H:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->J:I

    iget v1, p1, Lvl/a;->J:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lvl/a;->w:I

    iget v1, p1, Lvl/a;->w:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lvl/a;->I:Lvl/d;

    iget-object p1, p1, Lvl/a;->I:Lvl/d;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getLong(Ljava/time/temporal/TemporalField;)J
    .locals 14

    sget-object v0, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v1, p0, Lvl/a;->x:I

    if-eqz v0, :cond_0

    int-to-long v0, v1

    return-wide v0

    :cond_0
    sget-object v0, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v2, p0, Lvl/a;->y:I

    if-eqz v0, :cond_1

    int-to-long v0, v2

    return-wide v0

    :cond_1
    sget-object v0, Ljava/time/temporal/ChronoField;->DAY_OF_MONTH:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v3, p0, Lvl/a;->z:I

    if-eqz v0, :cond_2

    int-to-long v0, v3

    return-wide v0

    :cond_2
    sget-object v0, Ljava/time/temporal/ChronoField;->HOUR_OF_DAY:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v4, p0, Lvl/a;->E:I

    if-eqz v0, :cond_3

    int-to-long v0, v4

    return-wide v0

    :cond_3
    sget-object v0, Ljava/time/temporal/ChronoField;->MINUTE_OF_HOUR:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v5, p0, Lvl/a;->F:I

    if-eqz v0, :cond_4

    int-to-long v0, v5

    return-wide v0

    :cond_4
    sget-object v0, Ljava/time/temporal/ChronoField;->SECOND_OF_MINUTE:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v6, p0, Lvl/a;->G:I

    if-eqz v0, :cond_5

    int-to-long v0, v6

    return-wide v0

    :cond_5
    sget-object v0, Ljava/time/temporal/ChronoField;->NANO_OF_SECOND:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget v7, p0, Lvl/a;->H:I

    if-eqz v0, :cond_6

    int-to-long v0, v7

    return-wide v0

    :cond_6
    sget-object v0, Ljava/time/temporal/ChronoField;->NANO_OF_DAY:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v8, 0x3c

    const-wide/16 v10, 0xe10

    if-eqz v0, :cond_7

    int-to-long v0, v4

    mul-long/2addr v0, v10

    int-to-long v2, v5

    mul-long/2addr v2, v8

    add-long/2addr v2, v0

    int-to-long v0, v6

    add-long/2addr v2, v0

    const-wide/32 v0, 0x3b9aca00

    mul-long/2addr v2, v0

    int-to-long v0, v7

    add-long/2addr v2, v0

    return-wide v2

    :cond_7
    sget-object v0, Ljava/time/temporal/ChronoField;->INSTANT_SECONDS:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    int-to-long v12, v4

    mul-long/2addr v12, v10

    int-to-long v4, v5

    mul-long/2addr v4, v8

    add-long/2addr v4, v12

    int-to-long v6, v6

    add-long/2addr v4, v6

    const/4 p1, 0x1

    if-eqz v2, :cond_8

    goto :goto_0

    :cond_8
    move v2, p1

    :goto_0
    if-eqz v3, :cond_9

    goto :goto_1

    :cond_9
    move v3, p1

    :goto_1
    const/4 v0, 0x2

    if-gt v2, v0, :cond_a

    goto :goto_2

    :cond_a
    const/4 p1, 0x0

    :goto_2
    sub-int/2addr v1, p1

    if-ltz v1, :cond_b

    move p1, v1

    goto :goto_3

    :cond_b
    add-int/lit16 p1, v1, -0x18f

    :goto_3
    div-int/lit16 p1, p1, 0x190

    int-to-long v6, p1

    int-to-long v8, v1

    const-wide/16 v10, 0x190

    mul-long/2addr v10, v6

    sub-long/2addr v8, v10

    if-le v2, v0, :cond_c

    add-int/lit8 v2, v2, -0x3

    goto :goto_4

    :cond_c
    add-int/lit8 v2, v2, 0x9

    :goto_4
    int-to-long v0, v2

    const-wide/16 v10, 0x99

    mul-long/2addr v0, v10

    const-wide/16 v10, 0x2

    add-long/2addr v0, v10

    const-wide/16 v10, 0x5

    div-long/2addr v0, v10

    int-to-long v2, v3

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x16d

    mul-long/2addr v2, v8

    const-wide/16 v10, 0x4

    div-long v10, v8, v10

    add-long/2addr v10, v2

    const-wide/16 v2, 0x64

    div-long/2addr v8, v2

    sub-long/2addr v10, v8

    add-long/2addr v10, v0

    const-wide/32 v0, 0x23ab1

    mul-long/2addr v6, v0

    add-long/2addr v6, v10

    const-wide/32 v0, 0xafa6c

    sub-long/2addr v6, v0

    const-wide/32 v0, 0x15180

    mul-long/2addr v6, v0

    iget-object p1, p0, Lvl/a;->I:Lvl/d;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lvl/d;->a()I

    move-result p1

    int-to-long v0, p1

    goto :goto_5

    :cond_d
    const-wide/16 v0, 0x0

    :goto_5
    add-long/2addr v6, v4

    sub-long/2addr v6, v0

    return-wide v6

    :cond_e
    new-instance v0, Ljava/time/temporal/UnsupportedTemporalTypeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported field: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/time/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 11

    iget v0, p0, Lvl/a;->w:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v0, p0, Lvl/a;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, p0, Lvl/a;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v0, p0, Lvl/a;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v0, p0, Lvl/a;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v0, p0, Lvl/a;->F:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget v0, p0, Lvl/a;->G:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v0, p0, Lvl/a;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v0, p0, Lvl/a;->J:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v9, p0, Lvl/a;->I:Lvl/d;

    filled-new-array/range {v1 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final isSupported(Ljava/time/temporal/TemporalField;)Z
    .locals 3

    sget-object v0, Ljava/time/temporal/ChronoField;->NANO_OF_DAY:Ljava/time/temporal/ChronoField;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x2

    goto :goto_0

    :cond_2
    sget-object v0, Ljava/time/temporal/ChronoField;->DAY_OF_MONTH:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x3

    goto :goto_0

    :cond_3
    sget-object v0, Ljava/time/temporal/ChronoField;->HOUR_OF_DAY:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p1, 0x4

    goto :goto_0

    :cond_4
    sget-object v0, Ljava/time/temporal/ChronoField;->MINUTE_OF_HOUR:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p1, 0x5

    goto :goto_0

    :cond_5
    sget-object v0, Ljava/time/temporal/ChronoField;->SECOND_OF_MINUTE:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p1, 0x6

    goto :goto_0

    :cond_6
    sget-object v0, Ljava/time/temporal/ChronoField;->NANO_OF_SECOND:Ljava/time/temporal/ChronoField;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p1, 0x7

    :goto_0
    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    iget v0, p0, Lvl/a;->w:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    if-gt p1, v0, :cond_7

    :goto_1
    return v1

    :cond_7
    const/4 p1, 0x0

    return p1

    :cond_8
    new-instance v0, Ljava/time/temporal/UnsupportedTemporalTypeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported field: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/time/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lvl/a;->J:I

    if-lez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {p0, v1, v0}, Lvl/a;->a(Lvl/a;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget v0, p0, Lvl/a;->w:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lvl/a;->a(Lvl/a;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
