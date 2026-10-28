.class public final Lkotlinx/datetime/YearMonth;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlinx/datetime/YearMonth;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 92\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001:B\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\nB\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0008\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010$R\u0014\u0010*\u001a\u00020\u00078@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010$R\u0011\u0010\t\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0011\u00100\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0011\u00102\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010/R\u0011\u00104\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010$R\u0011\u00108\u001a\u0002058F\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u00a8\u0006;"
    }
    d2 = {
        "Lkotlinx/datetime/YearMonth;",
        "",
        "Ljava/io/Serializable;",
        "Ljava/time/YearMonth;",
        "value",
        "<init>",
        "(Ljava/time/YearMonth;)V",
        "",
        "year",
        "month",
        "(II)V",
        "Lpc3/m;",
        "(ILpc3/m;)V",
        "Ljava/io/ObjectInputStream;",
        "ois",
        "Ll83/a0;",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "",
        "writeReplace",
        "()Ljava/lang/Object;",
        "that",
        "Lkotlinx/datetime/i;",
        "rangeTo",
        "(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;",
        "rangeUntil",
        "other",
        "compareTo",
        "(Lkotlinx/datetime/YearMonth;)I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "Ljava/time/YearMonth;",
        "getValue$kotlinx_datetime",
        "()Ljava/time/YearMonth;",
        "getYear",
        "getMonthNumber$kotlinx_datetime",
        "monthNumber",
        "getMonth",
        "()Lpc3/m;",
        "Lkotlinx/datetime/LocalDate;",
        "getFirstDay",
        "()Lkotlinx/datetime/LocalDate;",
        "firstDay",
        "getLastDay",
        "lastDay",
        "getNumberOfDays",
        "numberOfDays",
        "Lkotlinx/datetime/g;",
        "getDays",
        "()Lkotlinx/datetime/g;",
        "days",
        "Companion",
        "pc3/t",
        "kotlinx-datetime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lvc3/p;
.end annotation


# static fields
.field public static final Companion:Lpc3/t;

.field private static final serialVersionUID:J


# instance fields
.field private final value:Ljava/time/YearMonth;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc3/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/datetime/YearMonth;->Companion:Lpc3/t;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 3
    :try_start_0
    invoke-static {p1, p2}, Ljava/time/YearMonth;->of(II)Ljava/time/YearMonth;

    move-result-object p1
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lkotlinx/datetime/YearMonth;-><init>(Ljava/time/YearMonth;)V

    return-void

    :catch_0
    move-exception p1

    .line 5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(ILpc3/m;)V
    .locals 1

    const-string v0, "month"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    .line 7
    invoke-static {p2}, Ljava/time/Month;->of(I)Ljava/time/Month;

    move-result-object p2

    const-string v0, "of(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {p1, p2}, Ljava/time/YearMonth;->of(ILjava/time/Month;)Ljava/time/YearMonth;

    move-result-object p1
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lkotlinx/datetime/YearMonth;-><init>(Ljava/time/YearMonth;)V

    return-void

    :catch_0
    move-exception p1

    .line 10
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Ljava/time/YearMonth;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lpc3/o;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0}, Lpc3/o;-><init>(ILjava/io/Serializable;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/datetime/YearMonth;

    invoke-virtual {p0, p1}, Lkotlinx/datetime/YearMonth;->compareTo(Lkotlinx/datetime/YearMonth;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lkotlinx/datetime/YearMonth;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    iget-object p1, p1, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0, p1}, Ljava/time/YearMonth;->compareTo(Ljava/time/YearMonth;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lkotlinx/datetime/YearMonth;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    check-cast p1, Lkotlinx/datetime/YearMonth;

    iget-object p1, p1, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

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

.method public final getDays()Lkotlinx/datetime/g;
    .locals 2

    invoke-virtual {p0}, Lkotlinx/datetime/YearMonth;->getFirstDay()Lkotlinx/datetime/LocalDate;

    move-result-object v0

    invoke-virtual {p0}, Lkotlinx/datetime/YearMonth;->getLastDay()Lkotlinx/datetime/LocalDate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlinx/datetime/LocalDate;->rangeTo(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;

    move-result-object v0

    return-object v0
.end method

.method public final getFirstDay()Lkotlinx/datetime/LocalDate;
    .locals 3

    new-instance v0, Lkotlinx/datetime/LocalDate;

    iget-object v1, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/time/YearMonth;->atDay(I)Ljava/time/LocalDate;

    move-result-object v1

    const-string v2, "atDay(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    return-object v0
.end method

.method public final getLastDay()Lkotlinx/datetime/LocalDate;
    .locals 3

    new-instance v0, Lkotlinx/datetime/LocalDate;

    iget-object v1, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v1}, Ljava/time/YearMonth;->atEndOfMonth()Ljava/time/LocalDate;

    move-result-object v1

    const-string v2, "atEndOfMonth(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    return-object v0
.end method

.method public final getMonth()Lpc3/m;
    .locals 2

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0}, Ljava/time/YearMonth;->getMonth()Ljava/time/Month;

    move-result-object v0

    const-string v1, "getMonth(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/j;->R(Ljava/time/Month;)Lpc3/m;

    move-result-object v0

    return-object v0
.end method

.method public final getMonthNumber$kotlinx_datetime()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0}, Ljava/time/YearMonth;->getMonthValue()I

    move-result v0

    return v0
.end method

.method public final getNumberOfDays()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0}, Ljava/time/YearMonth;->lengthOfMonth()I

    move-result v0

    return v0
.end method

.method public final getValue$kotlinx_datetime()Ljava/time/YearMonth;
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    return-object v0
.end method

.method public final getYear()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0}, Ljava/time/YearMonth;->getYear()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0}, Ljava/time/YearMonth;->hashCode()I

    move-result v0

    return v0
.end method

.method public final rangeTo(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;
    .locals 1

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/datetime/i;

    invoke-direct {v0, p0, p1}, Lpc3/v;-><init>(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V

    return-object v0
.end method

.method public final rangeUntil(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;
    .locals 5

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/datetime/i;->z:Lkotlinx/datetime/i;

    sget-object v0, Lkotlinx/datetime/YearMonth;->Companion:Lpc3/t;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/datetime/LocalDate;->Companion:Lpc3/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMIN$cp()Lkotlinx/datetime/LocalDate;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlinx/datetime/YearMonth;

    invoke-virtual {v0}, Lkotlinx/datetime/LocalDate;->getYear()I

    move-result v2

    invoke-virtual {v0}, Lkotlinx/datetime/LocalDate;->getMonth()Lpc3/m;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lkotlinx/datetime/YearMonth;-><init>(ILpc3/m;)V

    invoke-virtual {p1, v1}, Lkotlinx/datetime/YearMonth;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkotlinx/datetime/i;->z:Lkotlinx/datetime/i;

    return-object p1

    :cond_0
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->Companion:Lkotlinx/datetime/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lkotlinx/datetime/DateTimeUnit;->access$getMONTH$cp()Lkotlinx/datetime/DateTimeUnit$MonthBased;

    move-result-object v0

    const-string v1, "unit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    int-to-long v1, v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    neg-long v1, v1

    invoke-static {p1, v1, v2, v0}, Lkotlinx/datetime/h;->c(Lkotlinx/datetime/YearMonth;JLkotlinx/datetime/DateTimeUnit$MonthBased;)Lkotlinx/datetime/YearMonth;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-wide v3, 0x7fffffffffffffffL

    invoke-static {p1, v3, v4, v0}, Lkotlinx/datetime/h;->c(Lkotlinx/datetime/YearMonth;JLkotlinx/datetime/DateTimeUnit$MonthBased;)Lkotlinx/datetime/YearMonth;

    move-result-object p1

    invoke-static {p1, v1, v2, v0}, Lkotlinx/datetime/h;->c(Lkotlinx/datetime/YearMonth;JLkotlinx/datetime/DateTimeUnit$MonthBased;)Lkotlinx/datetime/YearMonth;

    move-result-object p1

    :goto_0
    new-instance v0, Lkotlinx/datetime/i;

    invoke-direct {v0, p0, p1}, Lpc3/v;-><init>(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lpc3/u;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/time/format/DateTimeFormatter;

    iget-object v1, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
