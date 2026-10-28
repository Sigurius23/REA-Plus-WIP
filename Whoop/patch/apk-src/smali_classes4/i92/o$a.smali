.class public final Li92/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li92/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JB\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Li92/o$a;",
        "",
        "<init>",
        "()V",
        "",
        "using24HourTime",
        "Lorg/joda/time/DateTimeZone;",
        "zone",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "usersPreferenceApi",
        "Ltr2/n;",
        "logger",
        "",
        "timestamp",
        "Lu02/a;",
        "Ll83/a0;",
        "a",
        "(ZLorg/joda/time/DateTimeZone;Lcom/whoop/service/network/UsersPreferenceApi;Ltr2/n;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;",
        "",
        "TWENTY_FOUR_HOUR_FORMAT",
        "Ljava/lang/String;",
        "TWELVE_HOUR_FORMAT",
        "TIMEZONE_DATE_FORMAT_PATTERN",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li92/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLorg/joda/time/DateTimeZone;Lcom/whoop/service/network/UsersPreferenceApi;Ltr2/n;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lorg/joda/time/DateTimeZone;",
            "Lcom/whoop/service/network/UsersPreferenceApi;",
            "Ltr2/n;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p5, :cond_0

    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p5, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-static {p5}, Lorg/joda/time/DateTime;->now(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p5

    invoke-virtual {p5}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    :goto_0
    if-eqz p1, :cond_1

    const-string p1, "TWENTY_FOUR_HOUR_FORMAT"

    goto :goto_1

    :cond_1
    const-string p1, "TWELVE_HOUR_FORMAT"

    :goto_1
    invoke-virtual {p2}, Lorg/joda/time/DateTimeZone;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p5, "toString(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"

    invoke-static {p5}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p5

    const-string v2, "forPattern(...)"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lorg/joda/time/DateTime;

    sget-object v3, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v2, v0, v1, v3}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    invoke-virtual {v2, p5}, Lorg/joda/time/base/AbstractInstant;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p5

    const-string v0, "+0000"

    invoke-static {p5, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    new-instance v0, Lcom/whoop/data/local/room/entity/UpdateUserTimeZone;

    invoke-direct {v0, p1, p2, p5}, Lcom/whoop/data/local/room/entity/UpdateUserTimeZone;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    const-string p1, "Failed to update user time zone "

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Li92/o$a$a;

    const/4 p1, 0x0

    invoke-direct {v5, p3, v0, p1}, Li92/o$a$a;-><init>(Lcom/whoop/service/network/UsersPreferenceApi;Lcom/whoop/data/local/room/entity/UpdateUserTimeZone;Lq83/d;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v2, p4

    move-object v6, p6

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
