.class final Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultDateContext"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR#\u0010\"\u001a\n \u001e*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\r\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;",
        "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;",
        "Landroid/content/Context;",
        "context",
        "Ljava/util/Locale;",
        "locale",
        "<init>",
        "(Landroid/content/Context;Ljava/util/Locale;)V",
        "Ljava/util/Date;",
        "now",
        "()Ljava/util/Date;",
        "",
        "yesterdayString",
        "()Ljava/lang/String;",
        "justNowString",
        "",
        "is24Hour",
        "()Z",
        "date",
        "isWithinLastMinute",
        "(Ljava/util/Date;)Z",
        "dateTimePattern",
        "relativeTime",
        "(Ljava/util/Date;)Ljava/lang/String;",
        "relativeDate",
        "Landroid/content/Context;",
        "Ljava/util/Locale;",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "oneMinuteDuration",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "kotlin.jvm.PlatformType",
        "dateTimePatternLazy$delegate",
        "Ll83/h;",
        "getDateTimePatternLazy",
        "dateTimePatternLazy",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private final dateTimePatternLazy$delegate:Ll83/h;

.field private final locale:Ljava/util/Locale;

.field private final oneMinuteDuration:Lio/getstream/chat/android/models/TimeDuration;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Locale;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->locale:Ljava/util/Locale;

    sget-object p1, Lio/getstream/chat/android/models/TimeDuration;->Companion:Lio/getstream/chat/android/models/TimeDuration$Companion;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/models/TimeDuration$Companion;->minutes(I)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->oneMinuteDuration:Lio/getstream/chat/android/models/TimeDuration;

    new-instance p1, Lio/getstream/chat/android/ui/common/helper/b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/common/helper/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->dateTimePatternLazy$delegate:Ll83/h;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;)Ljava/lang/String;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->locale:Ljava/util/Locale;

    const-string v0, "yy MM dd"

    invoke-static {p0, v0}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final dateTimePatternLazy_delegate$lambda$0(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;)Ljava/lang/String;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->locale:Ljava/util/Locale;

    const-string v0, "yy MM dd"

    invoke-static {p0, v0}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getDateTimePatternLazy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->dateTimePatternLazy$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final dateTimePattern()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->getDateTimePatternLazy()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<get-dateTimePatternLazy>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final is24Hour()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final isWithinLastMinute(Ljava/util/Date;)Z
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->oneMinuteDuration:Lio/getstream/chat/android/models/TimeDuration;

    if-eqz p1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/TimeDuration;->getMillis()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final justNowString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_footnote_edited_now:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final now()Ljava/util/Date;
    .locals 1

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public final relativeDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 8

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    const-wide/32 v5, 0x5265c00

    const/high16 v7, 0x40000

    invoke-static/range {v1 .. v7}, Landroid/text/format/DateUtils;->getRelativeTimeSpanString(JJJI)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final relativeTime(Ljava/util/Date;)Ljava/lang/String;
    .locals 9

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->context:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/32 v6, 0x240c8400

    const/4 v8, 0x0

    const-wide/32 v4, 0xea60

    invoke-static/range {v1 .. v8}, Landroid/text/format/DateUtils;->getRelativeDateTimeString(Landroid/content/Context;JJJI)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final yesterdayString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_yesterday:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
