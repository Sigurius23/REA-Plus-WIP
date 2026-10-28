.class public final Lkotlinx/datetime/FixedOffsetTimeZone;
.super Lkotlinx/datetime/TimeZone;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000c8FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkotlinx/datetime/FixedOffsetTimeZone;",
        "Lkotlinx/datetime/TimeZone;",
        "Lkotlinx/datetime/UtcOffset;",
        "offset",
        "Ljava/time/ZoneId;",
        "zoneId",
        "<init>",
        "(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V",
        "(Lkotlinx/datetime/UtcOffset;)V",
        "Lkotlinx/datetime/UtcOffset;",
        "getOffset",
        "()Lkotlinx/datetime/UtcOffset;",
        "",
        "getTotalSeconds",
        "()I",
        "getTotalSeconds$annotations",
        "()V",
        "totalSeconds",
        "Companion",
        "pc3/e",
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
    with = Lvc3/h;
.end annotation


# static fields
.field public static final Companion:Lpc3/e;


# instance fields
.field private final offset:Lkotlinx/datetime/UtcOffset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/datetime/FixedOffsetTimeZone;->Companion:Lpc3/e;

    return-void
.end method

.method public constructor <init>(Lkotlinx/datetime/UtcOffset;)V
    .locals 1

    const-string v0, "offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lkotlinx/datetime/UtcOffset;->getZoneOffset$kotlinx_datetime()Ljava/time/ZoneOffset;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lkotlinx/datetime/FixedOffsetTimeZone;-><init>(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V

    return-void
.end method

.method public constructor <init>(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V
    .locals 1

    const-string v0, "offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Lkotlinx/datetime/TimeZone;-><init>(Ljava/time/ZoneId;)V

    iput-object p1, p0, Lkotlinx/datetime/FixedOffsetTimeZone;->offset:Lkotlinx/datetime/UtcOffset;

    return-void
.end method

.method public static synthetic getTotalSeconds$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getOffset()Lkotlinx/datetime/UtcOffset;
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/FixedOffsetTimeZone;->offset:Lkotlinx/datetime/UtcOffset;

    return-object v0
.end method

.method public final getTotalSeconds()I
    .locals 1

    iget-object v0, p0, Lkotlinx/datetime/FixedOffsetTimeZone;->offset:Lkotlinx/datetime/UtcOffset;

    invoke-virtual {v0}, Lkotlinx/datetime/UtcOffset;->getTotalSeconds()I

    move-result v0

    return v0
.end method
