.class public final Lor2/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/u0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u001cB#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0019\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001dR\u0014\u0010!\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010$\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lor2/u0;",
        "",
        "Lkotlin/Function0;",
        "",
        "is24HourFormatFetcher",
        "Ljava/util/Locale;",
        "localeFetcher",
        "<init>",
        "(Lc93/a;Lc93/a;)V",
        "Landroid/content/Context;",
        "context",
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "languageRepository",
        "(Landroid/content/Context;Lcom/whoop/data/repositories/LanguageRepository;)V",
        "time",
        "Lorg/joda/time/format/DateTimeFormatter;",
        "twelveHourClockPattern",
        "twentyFourHourClockPattern",
        "",
        "f",
        "(Ljava/lang/Object;Lorg/joda/time/format/DateTimeFormatter;Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;",
        "Lorg/joda/time/ReadableInstant;",
        "spaceAfterMinute",
        "g",
        "(Lorg/joda/time/ReadableInstant;Z)Ljava/lang/String;",
        "Lorg/joda/time/ReadablePartial;",
        "h",
        "(Lorg/joda/time/ReadablePartial;Z)Ljava/lang/String;",
        "a",
        "Lc93/a;",
        "b",
        "k",
        "()Ljava/util/Locale;",
        "locale",
        "l",
        "()Z",
        "isUsing24HourTime",
        "c",
        "feature_release"
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
.field public static final c:Lor2/u0$a;

.field public static final d:I

.field private static final e:Lorg/joda/time/format/DateTimeFormatter;

.field private static final f:Lorg/joda/time/format/DateTimeFormatter;

.field private static final g:Lorg/joda/time/format/DateTimeFormatter;


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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lor2/u0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lor2/u0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lor2/u0;->c:Lor2/u0$a;

    const-string v0, "h:mma"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "forPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u0;->e:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "h:mm a"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u0;->f:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "HH:mm"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/u0;->g:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/whoop/data/repositories/LanguageRepository;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/notifications/handler/c;-><init>(Landroid/content/Context;I)V

    new-instance p1, Lm83/p;

    const/4 v1, 0x5

    invoke-direct {p1, p2, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, v0, p1}, Lor2/u0;-><init>(Lc93/a;Lc93/a;)V

    return-void
.end method

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

    const-string v0, "is24HourFormatFetcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localeFetcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lor2/u0;->a:Lc93/a;

    .line 3
    iput-object p2, p0, Lor2/u0;->b:Lc93/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/data/repositories/LanguageRepository;)Ljava/util/Locale;
    .locals 0

    invoke-static {p0}, Lor2/u0;->d(Lcom/whoop/data/repositories/LanguageRepository;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, Lor2/u0;->c(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private static final c(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lcom/whoop/data/repositories/LanguageRepository;)Ljava/util/Locale;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/data/repositories/LanguageRepository;->getAllowedLanguage()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lor2/u0;->g:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private final f(Ljava/lang/Object;Lorg/joda/time/format/DateTimeFormatter;Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lor2/u0;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p2, p3

    :cond_0
    invoke-direct {p0}, Lor2/u0;->k()Ljava/util/Locale;

    move-result-object p3

    invoke-virtual {p2, p3}, Lorg/joda/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p2

    instance-of p3, p1, Ljava/lang/Long;

    const-string v0, "print(...)"

    if-eqz p3, :cond_1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    instance-of p3, p1, Lorg/joda/time/ReadablePartial;

    if-eqz p3, :cond_2

    check-cast p1, Lorg/joda/time/ReadablePartial;

    invoke-virtual {p2, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    instance-of p3, p1, Lorg/joda/time/ReadableInstant;

    if-eqz p3, :cond_3

    check-cast p1, Lorg/joda/time/ReadableInstant;

    invoke-virtual {p2, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object p3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p3, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Joda time DateTimeFormatter doesn\'t know how to parse a "

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic i(Lor2/u0;Lorg/joda/time/ReadableInstant;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lor2/u0;->g(Lorg/joda/time/ReadableInstant;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lor2/u0;Lorg/joda/time/ReadablePartial;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lor2/u0;->h(Lorg/joda/time/ReadablePartial;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final k()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lor2/u0;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    return-object v0
.end method


# virtual methods
.method public final g(Lorg/joda/time/ReadableInstant;Z)Ljava/lang/String;
    .locals 1

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object p2, Lor2/u0;->f:Lorg/joda/time/format/DateTimeFormatter;

    goto :goto_0

    :cond_0
    sget-object p2, Lor2/u0;->e:Lorg/joda/time/format/DateTimeFormatter;

    :goto_0
    sget-object v0, Lor2/u0;->g:Lorg/joda/time/format/DateTimeFormatter;

    invoke-direct {p0, p1, p2, v0}, Lor2/u0;->f(Ljava/lang/Object;Lorg/joda/time/format/DateTimeFormatter;Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lorg/joda/time/ReadablePartial;Z)Ljava/lang/String;
    .locals 1

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object p2, Lor2/u0;->f:Lorg/joda/time/format/DateTimeFormatter;

    goto :goto_0

    :cond_0
    sget-object p2, Lor2/u0;->e:Lorg/joda/time/format/DateTimeFormatter;

    :goto_0
    sget-object v0, Lor2/u0;->g:Lorg/joda/time/format/DateTimeFormatter;

    invoke-direct {p0, p1, p2, v0}, Lor2/u0;->f(Ljava/lang/Object;Lorg/joda/time/format/DateTimeFormatter;Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lor2/u0;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
