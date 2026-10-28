.class public final Lw71/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw71/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lw71/c0$a;",
        "",
        "<init>",
        "()V",
        "",
        "millis",
        "a",
        "(J)J",
        "design_release"
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
    invoke-direct {p0}, Lw71/c0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    new-instance v0, Lorg/joda/time/DateTime;

    invoke-direct {v0, p1, p2}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getMinuteOfHour()I

    move-result p1

    div-int/lit8 p1, p1, 0x1e

    mul-int/lit8 p1, p1, 0x1e

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTime;->withMinuteOfHour(I)Lorg/joda/time/DateTime;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lorg/joda/time/DateTime;->withSecondOfMinute(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/joda/time/DateTime;->withMillisOfSecond(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide p1

    return-wide p1
.end method
