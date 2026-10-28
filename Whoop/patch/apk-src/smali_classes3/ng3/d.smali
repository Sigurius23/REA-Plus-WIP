.class public final enum Lng3/d;
.super Lng3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "QUARTER_OF_YEAR"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final b(Lng3/k;)Z
    .locals 1

    sget-object v0, Lng3/a;->Z:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lkg3/d;->a(Lng3/k;)Lkg3/d;

    move-result-object p1

    sget-object v0, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {p1, v0}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lng3/j;J)Lng3/j;
    .locals 5

    invoke-virtual {p0, p1}, Lng3/d;->e(Lng3/k;)J

    move-result-wide v0

    invoke-virtual {p0}, Lng3/d;->range()Lng3/s;

    move-result-object v2

    invoke-virtual {v2, p2, p3, p0}, Lng3/s;->b(JLng3/m;)V

    sget-object v2, Lng3/a;->Z:Lng3/a;

    invoke-interface {p1, v2}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v3

    sub-long/2addr p2, v0

    const-wide/16 v0, 0x3

    mul-long/2addr p2, v0

    add-long/2addr p2, v3

    invoke-interface {p1, p2, p3, v2}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lng3/k;)J
    .locals 4

    invoke-interface {p1, p0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->Z:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3

    div-long/2addr v0, v2

    return-wide v0

    :cond_0
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v0, "Unsupported field: QuarterOfYear"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final range()Lng3/s;
    .locals 4

    const-wide/16 v0, 0x1

    const-wide/16 v2, 0x4

    invoke-static {v0, v1, v2, v3}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "QuarterOfYear"

    return-object v0
.end method
