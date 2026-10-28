.class public final Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound$a;",
        "",
        "<init>",
        "()V",
        "Lorg/joda/time/DateTime;",
        "time",
        "Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;",
        "a",
        "(Lorg/joda/time/DateTime;)Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "smart-alarm_release"
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
    invoke-direct {p0}, Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/joda/time/DateTime;)Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;
    .locals 3

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;

    invoke-virtual {p1}, Lorg/joda/time/DateTime;->toLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v1

    sget-object v2, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {v2}, Lor2/u$a;->k()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/joda/time/base/AbstractPartial;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lor2/n0;->c(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "dateTimeZoneToUserOffset(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound$$serializer;->INSTANCE:Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound$$serializer;

    return-object v0
.end method
