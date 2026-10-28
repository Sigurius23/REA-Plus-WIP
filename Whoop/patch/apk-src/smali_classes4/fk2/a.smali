.class public Lfk2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfk2/a$c;,
        Lfk2/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lfk2/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final y:Lorg/joda/time/format/DateTimeFormatter;

.field private static final z:Lorg/joda/time/format/DateTimeFormatter;


# instance fields
.field private w:J

.field private x:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "k:mm:ss.SSS"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lfk2/a;->y:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lfk2/a;->z:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 4
    invoke-static {}, Lorg/joda/time/DateTimeUtils;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lfk2/a$c;->MILLIS:Lfk2/a$c;

    invoke-direct {p0, v0, v1, v2}, Lfk2/a;-><init>(JLfk2/a$c;)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lfk2/a;->w:J

    .line 3
    iput-wide p3, p0, Lfk2/a;->x:J

    return-void
.end method

.method public constructor <init>(JLfk2/a$c;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lfk2/a;->h(JLfk2/a$c;)V

    return-void
.end method

.method public static g()Lfk2/a;
    .locals 1

    new-instance v0, Lfk2/a;

    invoke-direct {v0}, Lfk2/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lfk2/a;

    return p1
.end method

.method public b(Lfk2/a;)I
    .locals 8

    iget-wide v0, p0, Lfk2/a;->w:J

    iget-wide v2, p1, Lfk2/a;->w:J

    cmp-long v4, v0, v2

    const/4 v5, 0x1

    if-lez v4, :cond_0

    return v5

    :cond_0
    cmp-long v0, v0, v2

    const/4 v1, -0x1

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-wide v2, p0, Lfk2/a;->x:J

    iget-wide v6, p1, Lfk2/a;->x:J

    cmp-long p1, v2, v6

    if-lez p1, :cond_2

    return v5

    :cond_2
    cmp-long p1, v2, v6

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lfk2/a;)Lfk2/a$b;
    .locals 4

    invoke-virtual {p0, p1}, Lfk2/a;->d(Lfk2/a;)Lfk2/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lfk2/a$b;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Lfk2/a$b;->g()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lfk2/a$b;->a(Lfk2/a$b;)J

    move-result-wide v0

    neg-long v0, v0

    invoke-static {p1, v0, v1}, Lfk2/a$b;->c(Lfk2/a$b;J)V

    invoke-static {p1}, Lfk2/a$b;->b(Lfk2/a$b;)J

    move-result-wide v0

    neg-long v0, v0

    long-to-int v0, v0

    int-to-short v0, v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lfk2/a$b;->d(Lfk2/a$b;J)V

    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfk2/a;

    invoke-virtual {p0, p1}, Lfk2/a;->b(Lfk2/a;)I

    move-result p1

    return p1
.end method

.method public d(Lfk2/a;)Lfk2/a$b;
    .locals 8

    invoke-virtual {p0, p1}, Lfk2/a;->b(Lfk2/a;)I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    move-object v1, p1

    goto :goto_0

    :cond_0
    move-object v1, p0

    move-object v0, p1

    :goto_0
    iget-wide v2, v0, Lfk2/a;->w:J

    iget-wide v4, v1, Lfk2/a;->w:J

    sub-long/2addr v2, v4

    iget-wide v4, v0, Lfk2/a;->x:J

    iget-wide v6, v1, Lfk2/a;->x:J

    sub-long/2addr v4, v6

    long-to-int v1, v4

    int-to-short v1, v1

    int-to-long v4, v1

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-gez v1, :cond_1

    const-wide/16 v6, 0x1

    sub-long/2addr v2, v6

    const-wide/32 v6, 0x8000

    add-long/2addr v4, v6

    :cond_1
    if-ne v0, p1, :cond_2

    neg-long v2, v2

    neg-long v0, v4

    long-to-int p1, v0

    int-to-short p1, p1

    int-to-long v4, p1

    :cond_2
    new-instance p1, Lfk2/a$b;

    invoke-direct {p1, v2, v3, v4, v5}, Lfk2/a$b;-><init>(JJ)V

    invoke-virtual {p1}, Lfk2/a$b;->e()V

    return-object p1
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lfk2/a;->x:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfk2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfk2/a;

    invoke-virtual {p1, p0}, Lfk2/a;->a(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lfk2/a;->f()J

    move-result-wide v3

    invoke-virtual {p1}, Lfk2/a;->f()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lfk2/a;->e()J

    move-result-wide v3

    invoke-virtual {p1}, Lfk2/a;->e()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lfk2/a;->w:J

    return-wide v0
.end method

.method public h(JLfk2/a$c;)V
    .locals 7

    sget-object v0, Lfk2/a$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    const-wide/32 v1, 0x8000

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-eq p3, v0, :cond_0

    return-void

    :cond_0
    div-long v3, p1, v1

    long-to-int p3, v3

    int-to-long v3, p3

    iput-wide v3, p0, Lfk2/a;->w:J

    rem-long/2addr p1, v1

    long-to-int p1, p1

    int-to-short p1, p1

    int-to-long p1, p1

    iput-wide p1, p0, Lfk2/a;->x:J

    return-void

    :cond_1
    const-wide/16 v3, 0x3e8

    div-long v5, p1, v3

    long-to-int p3, v5

    int-to-long v5, p3

    iput-wide v5, p0, Lfk2/a;->w:J

    rem-long/2addr p1, v3

    mul-long/2addr p1, v1

    div-long/2addr p1, v3

    long-to-int p1, p1

    int-to-short p1, p1

    int-to-long p1, p1

    iput-wide p1, p0, Lfk2/a;->x:J

    return-void
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lfk2/a;->f()J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    const/16 v1, 0x3b

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lfk2/a;->e()J

    move-result-wide v3

    mul-int/2addr v0, v1

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 3

    sget-object v0, Lfk2/a;->z:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {p0}, Lfk2/a;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()J
    .locals 6

    iget-wide v0, p0, Lfk2/a;->w:J

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    iget-wide v4, p0, Lfk2/a;->x:J

    long-to-double v4, v4

    mul-double/2addr v4, v2

    const-wide/high16 v2, 0x40e0000000000000L    # 32768.0

    div-double/2addr v4, v2

    add-double/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TimeStamp(Time="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lfk2/a;->y:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {p0}, Lfk2/a;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", wholeSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lfk2/a;->w:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", subseconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lfk2/a;->x:J

    const-string v3, ")"

    invoke-static {v1, v2, v3, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
