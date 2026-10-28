.class public final Lkotlinx/datetime/LocalDate;
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
        "Lkotlinx/datetime/LocalDate;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 C2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002DEB\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u000bB!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000c\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\rB!\u0008\u0017\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\"\u0010!J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0016H\u0096\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008,\u0010-J\r\u0010/\u001a\u00020.\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008/\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00083\u00104R\u001a\u00108\u001a\u00020\u00078FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u00086\u00107\u001a\u0004\u00085\u0010(R\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008:\u00107\u001a\u0004\u00089\u0010(R\u0011\u0010\u0008\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010(R\u0011\u0010\t\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010<R\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010(R\u0011\u0010@\u001a\u00020>8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010?R\u0011\u0010B\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010(\u00a8\u0006F"
    }
    d2 = {
        "Lkotlinx/datetime/LocalDate;",
        "",
        "Ljava/io/Serializable;",
        "Ljava/time/LocalDate;",
        "value",
        "<init>",
        "(Ljava/time/LocalDate;)V",
        "",
        "year",
        "month",
        "day",
        "(III)V",
        "Lpc3/m;",
        "(ILpc3/m;I)V",
        "Ljava/time/Month;",
        "dayOfMonth",
        "(ILjava/time/Month;I)V",
        "Ljava/io/ObjectInputStream;",
        "ois",
        "Ll83/a0;",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "",
        "writeReplace",
        "()Ljava/lang/Object;",
        "getMonth",
        "()Ljava/time/Month;",
        "Ljava/time/DayOfWeek;",
        "getDayOfWeek",
        "()Ljava/time/DayOfWeek;",
        "that",
        "Lkotlinx/datetime/g;",
        "rangeTo",
        "(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;",
        "rangeUntil",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "compareTo",
        "(Lkotlinx/datetime/LocalDate;)I",
        "",
        "toEpochDays",
        "()J",
        "toEpochDaysJvm",
        "Ljava/time/LocalDate;",
        "getValue$kotlinx_datetime",
        "()Ljava/time/LocalDate;",
        "getMonthNumber",
        "getMonthNumber$annotations",
        "()V",
        "monthNumber",
        "getDayOfMonth",
        "getDayOfMonth$annotations",
        "getYear",
        "()Lpc3/m;",
        "getDay",
        "Lpc3/d;",
        "()Lpc3/d;",
        "dayOfWeek",
        "getDayOfYear",
        "dayOfYear",
        "Companion",
        "pc3/f",
        "pc3/g",
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
    with = Lvc3/i;
.end annotation


# static fields
.field public static final Companion:Lpc3/f;

.field private static final MAX:Lkotlinx/datetime/LocalDate;

.field private static final MIN:Lkotlinx/datetime/LocalDate;

.field private static final serialVersionUID:J


# instance fields
.field private final value:Ljava/time/LocalDate;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpc3/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/datetime/LocalDate;->Companion:Lpc3/f;

    new-instance v0, Lkotlinx/datetime/LocalDate;

    sget-object v1, Ljava/time/LocalDate;->MIN:Ljava/time/LocalDate;

    const-string v2, "MIN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    sput-object v0, Lkotlinx/datetime/LocalDate;->MIN:Lkotlinx/datetime/LocalDate;

    new-instance v0, Lkotlinx/datetime/LocalDate;

    sget-object v1, Ljava/time/LocalDate;->MAX:Ljava/time/LocalDate;

    const-string v2, "MAX"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    sput-object v0, Lkotlinx/datetime/LocalDate;->MAX:Lkotlinx/datetime/LocalDate;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 5
    :try_start_0
    invoke-static {p1, p2, p3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p1
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    return-void

    :catch_0
    move-exception p1

    .line 7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(ILjava/time/Month;I)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "month"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {p2}, Lkotlin/jvm/internal/j;->R(Ljava/time/Month;)Lpc3/m;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Lkotlinx/datetime/LocalDate;-><init>(ILpc3/m;I)V

    return-void
.end method

.method public constructor <init>(ILpc3/m;I)V
    .locals 1

    const-string v0, "month"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/datetime/LocalDate;-><init>(III)V

    return-void
.end method

.method public constructor <init>(Ljava/time/LocalDate;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    return-void
.end method

.method public static final synthetic access$getMAX$cp()Lkotlinx/datetime/LocalDate;
    .locals 1

    sget-object v0, Lkotlinx/datetime/LocalDate;->MAX:Lkotlinx/datetime/LocalDate;

    return-object v0
.end method

.method public static final synthetic access$getMIN$cp()Lkotlinx/datetime/LocalDate;
    .locals 1

    sget-object v0, Lkotlinx/datetime/LocalDate;->MIN:Lkotlinx/datetime/LocalDate;

    return-object v0
.end method

.method public static synthetic getDayOfMonth$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getMonthNumber$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lpc3/o;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Lpc3/o;-><init>(ILjava/io/Serializable;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/datetime/LocalDate;

    invoke-virtual {p0, p1}, Lkotlinx/datetime/LocalDate;->compareTo(Lkotlinx/datetime/LocalDate;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lkotlinx/datetime/LocalDate;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    iget-object p1, p1, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0, p1}, Ljava/time/LocalDate;->compareTo(Ljava/time/chrono/ChronoLocalDate;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lkotlinx/datetime/LocalDate;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    check-cast p1, Lkotlinx/datetime/LocalDate;

    iget-object p1, p1, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

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

.method public final getDay()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v0

    return v0
.end method

.method public final getDayOfMonth()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v0

    return v0
.end method

.method public final getDayOfWeek()Ljava/time/DayOfWeek;
    .locals 2

    .line 4
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfWeek()Ljava/time/DayOfWeek;

    move-result-object v0

    const-string v1, "getDayOfWeek(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDayOfWeek()Lpc3/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfWeek()Ljava/time/DayOfWeek;

    move-result-object v0

    const-string v1, "getDayOfWeek(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lpc3/d;->x:Lt83/b;

    .line 3
    invoke-virtual {v0}, Ljava/time/DayOfWeek;->getValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lt83/b;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc3/d;

    return-object v0
.end method

.method public final getDayOfYear()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfYear()I

    move-result v0

    return v0
.end method

.method public final getMonth()Ljava/time/Month;
    .locals 2

    .line 2
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonth()Ljava/time/Month;

    move-result-object v0

    const-string v1, "getMonth(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMonth()Lpc3/m;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonth()Ljava/time/Month;

    move-result-object v0

    const-string v1, "getMonth(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/j;->R(Ljava/time/Month;)Lpc3/m;

    move-result-object v0

    return-object v0
.end method

.method public final getMonthNumber()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v0

    return v0
.end method

.method public final getValue$kotlinx_datetime()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    return-object v0
.end method

.method public final getYear()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->hashCode()I

    move-result v0

    return v0
.end method

.method public final rangeTo(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;
    .locals 1

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/datetime/g;

    invoke-direct {v0, p0, p1}, Lpc3/h;-><init>(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalDate;)V

    return-object v0
.end method

.method public final rangeUntil(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;
    .locals 3

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/datetime/g;->z:Lkotlinx/datetime/g;

    sget-object v0, Lkotlinx/datetime/LocalDate;->Companion:Lpc3/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMIN$cp()Lkotlinx/datetime/LocalDate;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlinx/datetime/LocalDate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkotlinx/datetime/g;->z:Lkotlinx/datetime/g;

    return-object p1

    :cond_0
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->Companion:Lkotlinx/datetime/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lkotlinx/datetime/DateTimeUnit;->access$getDAY$cp()Lkotlinx/datetime/DateTimeUnit$DayBased;

    move-result-object v0

    const-string v1, "unit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    int-to-long v1, v1

    neg-long v1, v1

    invoke-static {p1, v1, v2, v0}, Lkotlinx/datetime/f;->a(Lkotlinx/datetime/LocalDate;JLkotlinx/datetime/DateTimeUnit$DayBased;)Lkotlinx/datetime/LocalDate;

    move-result-object p1

    new-instance v0, Lkotlinx/datetime/g;

    invoke-direct {v0, p0, p1}, Lpc3/h;-><init>(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalDate;)V

    return-object v0
.end method

.method public final toEpochDays()I
    .locals 4

    .line 2
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->toEpochDay()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    const v0, 0x7fffffff

    return v0

    :cond_0
    const-wide/32 v2, -0x80000000

    cmp-long v2, v0, v2

    if-gez v2, :cond_1

    const/high16 v0, -0x80000000

    return v0

    :cond_1
    long-to-int v0, v0

    return v0
.end method

.method public final toEpochDays()J
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->toEpochDay()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lkotlinx/datetime/LocalDate;->value:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
