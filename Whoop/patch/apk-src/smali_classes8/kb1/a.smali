.class public final Lkb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0007\u0018\u0000 -2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001bR\u001c\u0010 \u001a\n \u001a*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u0016\u0010#R\u0017\u0010&\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\"\u001a\u0004\u0008%\u0010#R\u0017\u0010(\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\"\u001a\u0004\u0008!\u0010#R\u0017\u0010,\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008\u001e\u0010+\u00a8\u0006."
    }
    d2 = {
        "Lkb1/a;",
        "",
        "Lh91/a;",
        "monthState",
        "<init>",
        "(Lh91/a;)V",
        "Ljava/time/LocalDate;",
        "date",
        "",
        "a",
        "(Ljava/time/LocalDate;)Ljava/lang/String;",
        "",
        "day",
        "b",
        "(I)Ljava/time/LocalDate;",
        "Lh91/a;",
        "d",
        "()Lh91/a;",
        "",
        "Z",
        "isCurrentYear",
        "Ljava/util/Locale;",
        "c",
        "Ljava/util/Locale;",
        "formattingLocale",
        "Ljava/time/format/DateTimeFormatter;",
        "kotlin.jvm.PlatformType",
        "Ljava/time/format/DateTimeFormatter;",
        "titleFormatter",
        "Ljava/time/DayOfWeek;",
        "e",
        "Ljava/time/DayOfWeek;",
        "startingWeekDay",
        "f",
        "I",
        "()I",
        "daysInMonth",
        "g",
        "slotsBeforeFirstDay",
        "h",
        "slotsAfterLastDay",
        "i",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "monthTitle",
        "j",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final j:Lkb1/a$a;

.field public static final k:I


# instance fields
.field private final a:Lh91/a;

.field private final b:Z

.field private final c:Ljava/util/Locale;

.field private final d:Ljava/time/format/DateTimeFormatter;

.field private final e:Ljava/time/DayOfWeek;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkb1/a;->j:Lkb1/a$a;

    const/16 v0, 0x8

    sput v0, Lkb1/a;->k:I

    return-void
.end method

.method public constructor <init>(Lh91/a;)V
    .locals 5

    const-string v0, "monthState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb1/a;->a:Lh91/a;

    invoke-virtual {p1}, Lh91/a;->a()Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    invoke-virtual {p1}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/LocalDate;->getYear()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lkb1/a;->b:Z

    invoke-virtual {p1}, Lh91/a;->b()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1}, Lkb1/b;->a(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object v1

    iput-object v1, p0, Lkb1/a;->c:Ljava/util/Locale;

    if-eqz v0, :cond_1

    const-string v0, "MMMM"

    invoke-virtual {p1}, Lh91/a;->b()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v0, "MMMM yyyy"

    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lkb1/a;->d:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/LocalDate;->getDayOfWeek()Ljava/time/DayOfWeek;

    move-result-object v1

    iput-object v1, p0, Lkb1/a;->e:Ljava/time/DayOfWeek;

    invoke-virtual {p1}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Ljava/time/LocalDate;->lengthOfMonth()I

    move-result v2

    iput v2, p0, Lkb1/a;->f:I

    invoke-virtual {v1}, Ljava/time/DayOfWeek;->getValue()I

    move-result v1

    sget-object v3, Lkb1/i;->a:Lkb1/i;

    invoke-virtual {p1}, Lh91/a;->b()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkb1/i;->b(Ljava/util/Locale;)Ljava/time/DayOfWeek;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/DayOfWeek;->getValue()I

    move-result v3

    sub-int/2addr v1, v3

    const/4 v3, 0x7

    invoke-static {v1, v3}, Liv1/a;->a(II)I

    move-result v1

    iput v1, p0, Lkb1/a;->g:I

    add-int/2addr v1, v2

    rsub-int/lit8 v1, v1, 0x2a

    iput v1, p0, Lkb1/a;->h:I

    invoke-virtual {p1}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh91/a;->b()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkb1/a;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/time/LocalDate;)Ljava/lang/String;
    .locals 2

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EEEE, MMMM d"

    iget-object v1, p0, Lkb1/a;->c:Ljava/util/Locale;

    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(I)Ljava/time/LocalDate;
    .locals 2

    iget-object v0, p0, Lkb1/a;->a:Lh91/a;

    invoke-virtual {v0}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    iget-object v1, p0, Lkb1/a;->a:Lh91/a;

    invoke-virtual {v1}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/LocalDate;->getMonth()Ljava/time/Month;

    move-result-object v1

    invoke-static {v0, v1, p1}, Ljava/time/LocalDate;->of(ILjava/time/Month;I)Ljava/time/LocalDate;

    move-result-object p1

    const-string v0, "of(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lkb1/a;->f:I

    return v0
.end method

.method public final d()Lh91/a;
    .locals 1

    iget-object v0, p0, Lkb1/a;->a:Lh91/a;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkb1/a;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lkb1/a;->h:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lkb1/a;->g:I

    return v0
.end method
