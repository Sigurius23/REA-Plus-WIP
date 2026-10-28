.class public abstract Lnz2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "template",
        "Lorg/joda/time/DateTime;",
        "dateTime",
        "Ljava/util/Locale;",
        "locale",
        "Ltr2/n;",
        "logger",
        "a",
        "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/Locale;Ltr2/n;)Ljava/lang/String;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/Locale;Ltr2/n;)Ljava/lang/String;
    .locals 4

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    const-string v2, "h:mm a"

    invoke-static {v2}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v2, p2}, Lorg/joda/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "MMMM d"

    invoke-static {v3}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v3, p2}, Lorg/joda/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v3, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    const-string p2, "Error formatting template, "

    invoke-static {p2, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, v1, [Lqr2/a$a;

    invoke-interface {p3, p0, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v0

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "template or date are null: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v1, [Lqr2/a$a;

    invoke-interface {p3, p0, p1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/Locale;Ltr2/n;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string p5, "getDefault(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    const-string p3, "formatDeviceDisconnectionSubtitle"

    invoke-static {p3}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lnz2/a;->a(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/Locale;Ltr2/n;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
