.class public final Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/DateFormatter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$Companion;,
        Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;,
        Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0001\u0018\u0000 82\u00020\u0001:\u000389:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0019\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u000c*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u000c*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010$R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010$R\u001b\u0010,\u001a\u00020\'8BX\u0083\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001b\u0010/\u001a\u00020\'8BX\u0083\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010)\u001a\u0004\u0008.\u0010+R\u001b\u00102\u001a\u00020\'8BX\u0083\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010)\u001a\u0004\u00081\u0010+R\u0014\u00105\u001a\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R\u0014\u00107\u001a\u00020\'8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010+\u00a8\u0006;"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;",
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;",
        "dateContext",
        "Ljava/util/Locale;",
        "locale",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;Ljava/util/Locale;)V",
        "Landroid/content/Context;",
        "context",
        "(Landroid/content/Context;Ljava/util/Locale;)V",
        "Ljava/util/Date;",
        "",
        "isToday",
        "(Ljava/util/Date;)Z",
        "isYesterday",
        "isWithinLastWeek",
        "",
        "days",
        "isWithinDays",
        "(Ljava/util/Date;I)Z",
        "Ljava/util/Calendar;",
        "calendar",
        "isBeforeDay",
        "(Ljava/util/Calendar;Ljava/util/Calendar;)Z",
        "date",
        "",
        "formatDate",
        "(Ljava/util/Date;)Ljava/lang/String;",
        "formatTime",
        "formatRelativeTime",
        "formatRelativeDate",
        "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;",
        "Ljava/util/Locale;",
        "Ljava/text/SimpleDateFormat;",
        "timeFormatter12h",
        "Ljava/text/SimpleDateFormat;",
        "timeFormatter24h",
        "dateFormatterDayOfWeek",
        "Ljava/time/format/DateTimeFormatter;",
        "timeFormatter12hNew$delegate",
        "Ll83/h;",
        "getTimeFormatter12hNew",
        "()Ljava/time/format/DateTimeFormatter;",
        "timeFormatter12hNew",
        "timeFormatter24hNew$delegate",
        "getTimeFormatter24hNew",
        "timeFormatter24hNew",
        "dateFormatterDayOfWeekNew$delegate",
        "getDateFormatterDayOfWeekNew",
        "dateFormatterDayOfWeekNew",
        "getDateFormatterFullDate",
        "()Ljava/text/SimpleDateFormat;",
        "dateFormatterFullDate",
        "getDateFormatterFullDateNew",
        "dateFormatterFullDateNew",
        "Companion",
        "DateContext",
        "DefaultDateContext",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field private static final Companion:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$Companion;

.field public static final DATE_FORMAT_DAY_OF_WEEK:Ljava/lang/String; = "EEEE"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TIME_FORMAT_12H:Ljava/lang/String; = "h:mm a"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TIME_FORMAT_24H:Ljava/lang/String; = "HH:mm"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

.field private final dateFormatterDayOfWeek:Ljava/text/SimpleDateFormat;

.field private final dateFormatterDayOfWeekNew$delegate:Ll83/h;

.field private final locale:Ljava/util/Locale;

.field private final timeFormatter12h:Ljava/text/SimpleDateFormat;

.field private final timeFormatter12hNew$delegate:Ll83/h;

.field private final timeFormatter24h:Ljava/text/SimpleDateFormat;

.field private final timeFormatter24hNew$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Locale;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;-><init>(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;Ljava/util/Locale;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;Ljava/util/Locale;)V
    .locals 1

    const-string v0, "dateContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->locale:Ljava/util/Locale;

    .line 4
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string v0, "h:mm a"

    invoke-direct {p1, v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter12h:Ljava/text/SimpleDateFormat;

    .line 5
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {p1, v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter24h:Ljava/text/SimpleDateFormat;

    .line 6
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string v0, "EEEE"

    invoke-direct {p1, v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateFormatterDayOfWeek:Ljava/text/SimpleDateFormat;

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/common/helper/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/common/helper/a;-><init>(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter12hNew$delegate:Ll83/h;

    .line 8
    new-instance p1, Lio/getstream/chat/android/ui/common/helper/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/common/helper/a;-><init>(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter24hNew$delegate:Ll83/h;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/common/helper/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/common/helper/a;-><init>(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateFormatterDayOfWeekNew$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter24hNew_delegate$lambda$1(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateFormatterDayOfWeekNew_delegate$lambda$2(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter12hNew_delegate$lambda$0(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    return-object p0
.end method

.method private static final dateFormatterDayOfWeekNew_delegate$lambda$2(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;
    .locals 1

    const-string v0, "EEEE"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->locale:Ljava/util/Locale;

    invoke-virtual {v0, p0}, Ljava/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    return-object p0
.end method

.method private final getDateFormatterDayOfWeekNew()Ljava/time/format/DateTimeFormatter;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateFormatterDayOfWeekNew$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private final getDateFormatterFullDate()Ljava/text/SimpleDateFormat;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->dateTimePattern()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->locale:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method private final getDateFormatterFullDateNew()Ljava/time/format/DateTimeFormatter;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->dateTimePattern()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->locale:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "withZone(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getTimeFormatter12hNew()Ljava/time/format/DateTimeFormatter;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter12hNew$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private final getTimeFormatter24hNew()Ljava/time/format/DateTimeFormatter;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->timeFormatter24hNew$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private final isBeforeDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ge v1, v2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x0

    if-le v1, v2, :cond_1

    return v3

    :cond_1
    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    if-ge p1, p2, :cond_2

    return v0

    :cond_2
    return v3
.end method

.method private final isToday(Ljava/util/Date;)Z
    .locals 4

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->now()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isWithinDays(Ljava/util/Date;I)Z
    .locals 3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->now()Ljava/util/Date;

    move-result-object p1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v2, 0x6

    neg-int p2, p2

    invoke-virtual {v1, v2, p2}, Ljava/util/Calendar;->add(II)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isBeforeDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isBeforeDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isWithinLastWeek(Ljava/util/Date;)Z
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isWithinDays(Ljava/util/Date;I)Z

    move-result p1

    return p1
.end method

.method private final isYesterday(Ljava/util/Date;)Z
    .locals 5

    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-wide/32 v3, 0x5265c00

    add-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isToday(Ljava/util/Date;)Z

    move-result p1

    return p1
.end method

.method private static final timeFormatter12hNew_delegate$lambda$0(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;
    .locals 1

    const-string v0, "h:mm a"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->locale:Ljava/util/Locale;

    invoke-virtual {v0, p0}, Ljava/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    return-object p0
.end method

.method private static final timeFormatter24hNew_delegate$lambda$1(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;
    .locals 1

    const-string v0, "HH:mm"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->locale:Ljava/util/Locale;

    invoke-virtual {v0, p0}, Ljava/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final formatDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isToday(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->formatTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isYesterday(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->yesterdayString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v0, 0x6

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->isWithinDays(Ljava/util/Date;I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->getDateFormatterDayOfWeekNew()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->getDateFormatterFullDateNew()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final formatRelativeDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->relativeDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final formatRelativeTime(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->isWithinLastMinute(Ljava/util/Date;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->justNowString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->relativeTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final formatTime(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->dateContext:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;->is24Hour()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->getTimeFormatter24hNew()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->getTimeFormatter12hNew()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
