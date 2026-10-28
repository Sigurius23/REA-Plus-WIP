.class public final Lor2/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lor2/b1;",
        "",
        "Lor2/u0;",
        "localizedDateTimeFormatter",
        "<init>",
        "(Lor2/u0;)V",
        "Lorg/joda/time/DateTime;",
        "syncTime",
        "",
        "a",
        "(Lorg/joda/time/DateTime;)Ljava/lang/String;",
        "Lor2/u0;",
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


# instance fields
.field private final a:Lor2/u0;


# direct methods
.method public constructor <init>(Lor2/u0;)V
    .locals 1

    const-string v0, "localizedDateTimeFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/b1;->a:Lor2/u0;

    return-void
.end method


# virtual methods
.method public final a(Lorg/joda/time/DateTime;)Ljava/lang/String;
    .locals 4

    const-string v0, "syncTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/b1;->a:Lor2/u0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lor2/u0;->i(Lor2/u0;Lorg/joda/time/ReadableInstant;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lor2/u$a;->m(J)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lor2/u$a;->i()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-virtual {v1, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method
