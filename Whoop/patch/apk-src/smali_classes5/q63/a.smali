.class public abstract Lq63/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/TimeZone;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Lq63/a;->a:Ljava/util/TimeZone;

    return-void
.end method

.method public static final a(Ljava/lang/Long;)Lq63/b;
    .locals 12

    sget-object v0, Lq63/a;->a:Ljava/util/TimeZone;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v0, v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    :cond_0
    const/16 p0, 0xd

    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 p0, 0xc

    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/16 p0, 0xb

    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 p0, 0x7

    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v5, 0x5

    add-int/2addr v1, v5

    rem-int/2addr v1, p0

    invoke-static {}, Lq63/c;->_values()[I

    move-result-object p0

    aget p0, p0, v1

    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-static {}, Lnh3/a;->_values()[I

    move-result-object v5

    aget v8, v5, v1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v9

    new-instance v1, Lq63/b;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    move v5, p0

    invoke-direct/range {v1 .. v11}, Lq63/b;-><init>(IIIIIIIIJ)V

    return-object v1
.end method
