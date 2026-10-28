.class public Lkotlinx/datetime/TimeZone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000c\u001a\u00020\u0006*\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkotlinx/datetime/TimeZone;",
        "",
        "Ljava/time/ZoneId;",
        "zoneId",
        "<init>",
        "(Ljava/time/ZoneId;)V",
        "Lkotlin/time/Instant;",
        "Lkotlinx/datetime/LocalDateTime;",
        "toLocalDateTime",
        "(Lkotlin/time/Instant;)Lkotlinx/datetime/LocalDateTime;",
        "Lpc3/n;",
        "youShallNotPass",
        "toInstant",
        "(Lkotlinx/datetime/LocalDateTime;Lpc3/n;)Lkotlin/time/Instant;",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Ljava/time/ZoneId;",
        "getZoneId$kotlinx_datetime",
        "()Ljava/time/ZoneId;",
        "getId",
        "id",
        "Companion",
        "pc3/p",
        "kotlinx-datetime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lvc3/n;
.end annotation


# static fields
.field public static final Companion:Lpc3/p;

.field private static final UTC:Lkotlinx/datetime/FixedOffsetTimeZone;


# instance fields
.field private final zoneId:Ljava/time/ZoneId;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lpc3/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/datetime/TimeZone;->Companion:Lpc3/p;

    new-instance v0, Lkotlinx/datetime/FixedOffsetTimeZone;

    sget-object v1, Lkotlinx/datetime/UtcOffset;->Companion:Lpc3/q;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lkotlinx/datetime/UtcOffset;->access$getZERO$cp()Lkotlinx/datetime/UtcOffset;

    move-result-object v1

    const-string v2, "UTC"

    invoke-static {v2}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    move-result-object v2

    const-string v3, "of(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lkotlinx/datetime/FixedOffsetTimeZone;-><init>(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V

    sput-object v0, Lkotlinx/datetime/TimeZone;->UTC:Lkotlinx/datetime/FixedOffsetTimeZone;

    return-void
.end method

.method public constructor <init>(Ljava/time/ZoneId;)V
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    return-void
.end method

.method public static final synthetic access$getUTC$cp()Lkotlinx/datetime/FixedOffsetTimeZone;
    .locals 1

    sget-object v0, Lkotlinx/datetime/TimeZone;->UTC:Lkotlinx/datetime/FixedOffsetTimeZone;

    return-object v0
.end method

.method public static synthetic toInstant$default(Lkotlinx/datetime/TimeZone;Lkotlinx/datetime/LocalDateTime;Lpc3/n;ILjava/lang/Object;)Lkotlin/time/Instant;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p2, Lpc3/n;->a:Lpc3/n;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlinx/datetime/TimeZone;->toInstant(Lkotlinx/datetime/LocalDateTime;Lpc3/n;)Lkotlin/time/Instant;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toInstant"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lkotlinx/datetime/TimeZone;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    check-cast p1, Lkotlinx/datetime/TimeZone;

    iget-object p1, p1, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    invoke-virtual {v0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getZoneId$kotlinx_datetime()Ljava/time/ZoneId;
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    invoke-virtual {v0}, Ljava/time/ZoneId;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toInstant(Lkotlinx/datetime/LocalDateTime;Lpc3/n;)Lkotlin/time/Instant;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "youShallNotPass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlinx/datetime/LocalDateTime;->getValue$kotlinx_datetime()Ljava/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/datetime/TimeZone;->getZoneId$kotlinx_datetime()Ljava/time/ZoneId;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object p1

    const-string p2, "toInstant(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/time/jdk8/InstantConversionsJDK8Kt;->toKotlinInstant(Ljava/time/Instant;)Lkotlin/time/Instant;

    move-result-object p1

    return-object p1
.end method

.method public final toLocalDateTime(Lkotlin/time/Instant;)Lkotlinx/datetime/LocalDateTime;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lkotlin/time/jdk8/InstantConversionsJDK8Kt;->toJavaInstant(Lkotlin/time/Instant;)Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/datetime/TimeZone;->getZoneId$kotlinx_datetime()Ljava/time/ZoneId;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    move-result-object p1

    new-instance v0, Lkotlinx/datetime/LocalDateTime;

    invoke-direct {v0, p1}, Lkotlinx/datetime/LocalDateTime;-><init>(Ljava/time/LocalDateTime;)V
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lkotlinx/datetime/DateTimeArithmeticException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lkotlinx/datetime/TimeZone;->zoneId:Ljava/time/ZoneId;

    invoke-virtual {v0}, Ljava/time/ZoneId;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
