.class public final Lcom/whoop/data/remote/domain/dto/DateTimeRange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B-\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0004\u0010\u000cJ\u0014\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\u0008\u0010\u0018\u001a\u00020\u0007H\u0002J\u0008\u0010\u0019\u001a\u00020\nH\u0002J\n\u0010\u001a\u001a\u00020\u0003H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "",
        "during",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "lower",
        "Lorg/joda/time/DateTime;",
        "upper",
        "lowerBoundType",
        "Lcom/whoop/data/remote/domain/dto/BoundType;",
        "upperBoundType",
        "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)V",
        "getDuring",
        "()Ljava/lang/String;",
        "getLower",
        "()Lorg/joda/time/DateTime;",
        "getUpper",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "parseUpper",
        "parseLower",
        "parseUpperBoundType",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

.field private static final dateTimeFormatter:Lorg/joda/time/format/DateTimeFormatter;

.field private static final dateTimeRangeFormatter:Lorg/joda/time/format/DateTimeFormatter;

.field public static final lowerUpperDelimiter:C = ','

.field public static final rangeDelimiter:C = '\''


# instance fields
.field private final during:Ljava/lang/String;

.field private final lower:Lorg/joda/time/DateTime;

.field private final lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

.field private final upper:Lorg/joda/time/DateTime;

.field private final upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "forPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->dateTimeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTimeParser()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/format/DateTimeFormatter;->withOffsetParsed()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "withOffsetParsed(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->dateTimeRangeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    const-string v0, "during"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->parseLower()Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lower:Lorg/joda/time/DateTime;

    .line 3
    sget-object v0, Lcom/whoop/data/remote/domain/dto/BoundType;->Companion:Lcom/whoop/data/remote/domain/dto/BoundType$Companion;

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/4 v2, 0x0

    const/16 v3, 0x27

    aput-char v3, v1, v2

    const/4 v3, 0x6

    invoke-static {p1, v1, v2, v3}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/whoop/data/remote/domain/dto/BoundType$Companion;->fromBound(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    .line 4
    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->parseUpper()Lorg/joda/time/DateTime;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upper:Lorg/joda/time/DateTime;

    .line 5
    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->parseUpperBoundType()Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)V
    .locals 3

    const-string v0, "lower"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowerBoundType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBoundType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/BoundType;->getLowerChar()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x27

    .line 11
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    sget-object v1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->dateTimeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p1, v2}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    const-string p1, "\',\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-virtual {p2, v2}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {p4}, Lcom/whoop/data/remote/domain/dto/BoundType;->getUpperChar()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    sget-object p3, Lcom/whoop/data/remote/domain/dto/BoundType;->CLOSED:Lcom/whoop/data/remote/domain/dto/BoundType;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    sget-object p4, Lcom/whoop/data/remote/domain/dto/BoundType;->OPEN:Lcom/whoop/data/remote/domain/dto/BoundType;

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)V

    return-void
.end method

.method public static final synthetic access$getDateTimeFormatter$cp()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->dateTimeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0
.end method

.method private final parseLower()Lorg/joda/time/DateTime;
    .locals 5

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x27

    aput-char v4, v2, v3

    const/4 v4, 0x6

    invoke-static {v0, v2, v3, v4}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->dateTimeRangeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v1, v0}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    const-string v1, "parseDateTime(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final parseUpper()Lorg/joda/time/DateTime;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x27

    aput-char v4, v2, v3

    const/4 v5, 0x6

    invoke-static {v0, v2, v3, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->dateTimeRangeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    new-array v1, v1, [C

    aput-char v4, v1, v3

    invoke-static {v2, v1, v3, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final parseUpperBoundType()Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x27

    aput-char v4, v2, v3

    const/4 v5, 0x6

    invoke-static {v0, v2, v3, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    sget-object v0, Lcom/whoop/data/remote/domain/dto/BoundType;->Companion:Lcom/whoop/data/remote/domain/dto/BoundType$Companion;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    new-array v1, v1, [C

    aput-char v4, v1, v3

    invoke-static {v2, v1, v3, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whoop/data/remote/domain/dto/BoundType$Companion;->fromBound(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/whoop/data/remote/domain/dto/BoundType;->Companion:Lcom/whoop/data/remote/domain/dto/BoundType$Companion;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->j0(Ljava/lang/CharSequence;)C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/remote/domain/dto/BoundType$Companion;->fromBound(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    :goto_0
    if-eqz v1, :cond_2

    check-cast p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    const/4 v1, 0x0

    if-nez p1, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lower:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lower:Lorg/joda/time/DateTime;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upper:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upper:Lorg/joda/time/DateTime;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-ne v2, p1, :cond_4

    return v0

    :cond_4
    return v1
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getLower()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lower:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getUpper()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upper:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lower:Lorg/joda/time/DateTime;

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upper:Lorg/joda/time/DateTime;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->during:Ljava/lang/String;

    return-object v0
.end method
