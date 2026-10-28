.class public final Lcom/whoop/data/remote/domain/dto/LocalDateRange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/LocalDateRange$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0014\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010\u0019\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/LocalDateRange;",
        "",
        "during",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getDuring",
        "()Ljava/lang/String;",
        "lower",
        "Lorg/joda/time/LocalDate;",
        "getLower",
        "()Lorg/joda/time/LocalDate;",
        "lowerBoundType",
        "Lcom/whoop/data/remote/domain/dto/BoundType;",
        "upper",
        "getUpper",
        "upperBoundType",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "parseUpper",
        "parseUpperBoundType",
        "toLowerOnly",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/LocalDateRange$Companion;

.field private static final localDateFormatter:Lorg/joda/time/format/DateTimeFormatter;

.field public static final rangeDelimiter:C = '\''


# instance fields
.field private final during:Ljava/lang/String;

.field private final lower:Lorg/joda/time/LocalDate;

.field private final lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

.field private final upper:Lorg/joda/time/LocalDate;

.field private final upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/LocalDateRange$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/LocalDateRange$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->Companion:Lcom/whoop/data/remote/domain/dto/LocalDateRange$Companion;

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "forPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->localDateFormatter:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    const-string v0, "during"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v1, v0, [C

    const/4 v2, 0x0

    const/16 v3, 0x27

    aput-char v3, v1, v2

    const/4 v4, 0x6

    invoke-static {p1, v1, v2, v4}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v5, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->localDateFormatter:Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {v1, v5}, Lorg/joda/time/LocalDate;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/LocalDate;

    move-result-object v1

    const-string v5, "parse(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lower:Lorg/joda/time/LocalDate;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/BoundType;->Companion:Lcom/whoop/data/remote/domain/dto/BoundType$Companion;

    new-array v0, v0, [C

    aput-char v3, v0, v2

    invoke-static {p1, v0, v2, v4}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/whoop/data/remote/domain/dto/BoundType$Companion;->fromBound(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->parseUpper()Lorg/joda/time/LocalDate;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upper:Lorg/joda/time/LocalDate;

    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->parseUpperBoundType()Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-void
.end method

.method public static final synthetic access$getLocalDateFormatter$cp()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->localDateFormatter:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private final parseUpper()Lorg/joda/time/LocalDate;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

    new-array v1, v1, [C

    aput-char v4, v1, v3

    invoke-static {v0, v1, v3, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->localDateFormatter:Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {v0, v1}, Lorg/joda/time/LocalDate;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/LocalDate;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final parseUpperBoundType()Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

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
    const/4 v0, 0x0

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
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;

    :goto_0
    if-eqz v1, :cond_2

    check-cast p1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    const/4 v1, 0x0

    if-nez p1, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lower:Lorg/joda/time/LocalDate;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lower:Lorg/joda/time/LocalDate;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upper:Lorg/joda/time/LocalDate;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upper:Lorg/joda/time/LocalDate;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-ne v2, p1, :cond_4

    return v0

    :cond_4
    return v1
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getLower()Lorg/joda/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lower:Lorg/joda/time/LocalDate;

    return-object v0
.end method

.method public final getUpper()Lorg/joda/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upper:Lorg/joda/time/LocalDate;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lower:Lorg/joda/time/LocalDate;

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->lowerBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upper:Lorg/joda/time/LocalDate;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upperBoundType:Lcom/whoop/data/remote/domain/dto/BoundType;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v1, v2

    return v1
.end method

.method public final toLowerOnly()Lcom/whoop/data/remote/domain/dto/LocalDateRange;
    .locals 7

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->upper:Lorg/joda/time/LocalDate;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x27

    const/4 v3, 0x0

    aput-char v2, v1, v3

    const/4 v2, 0x6

    invoke-static {v0, v1, v3, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v3, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, "\'"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/remote/domain/dto/LocalDateRange;

    invoke-direct {v1, v0}, Lcom/whoop/data/remote/domain/dto/LocalDateRange;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/LocalDateRange;->during:Ljava/lang/String;

    return-object v0
.end method
