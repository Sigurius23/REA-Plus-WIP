.class public final enum Lng3/f;
.super Lng3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "WEEK_BASED_YEAR"

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lng3/k;)Lng3/s;
    .locals 0

    sget-object p1, Lng3/a;->c0:Lng3/a;

    iget-object p1, p1, Lng3/a;->x:Lng3/s;

    return-object p1
.end method

.method public final b(Lng3/k;)Z
    .locals 1

    sget-object v0, Lng3/a;->W:Lng3/a;

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
    .locals 4

    invoke-virtual {p0, p1}, Lng3/f;->b(Lng3/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lng3/a;->c0:Lng3/a;

    iget-object v0, v0, Lng3/a;->x:Lng3/s;

    sget-object v1, Lng3/g;->z:Lng3/f;

    invoke-virtual {v0, p2, p3, v1}, Lng3/s;->a(JLng3/m;)I

    move-result p2

    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object p3

    sget-object v0, Lng3/a;->R:Lng3/a;

    invoke-virtual {p3, v0}, Ljg3/d;->f(Lng3/m;)I

    move-result v1

    invoke-static {p3}, Lng3/g;->f(Ljg3/d;)I

    move-result p3

    const/16 v2, 0x35

    if-ne p3, v2, :cond_0

    invoke-static {p2}, Lng3/g;->h(I)I

    move-result v2

    const/16 v3, 0x34

    if-ne v2, v3, :cond_0

    move p3, v3

    :cond_0
    const/4 v2, 0x4

    const/4 v3, 0x1

    invoke-static {p2, v3, v2}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljg3/d;->f(Lng3/m;)I

    move-result v0

    sub-int/2addr v1, v0

    sub-int/2addr p3, v3

    mul-int/lit8 p3, p3, 0x7

    add-int/2addr p3, v1

    int-to-long v0, p3

    invoke-virtual {p2, v0, v1}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p2

    invoke-interface {p1, p2}, Lng3/j;->j(Ljg3/d;)Lng3/j;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string p2, "Unsupported field: WeekBasedYear"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lng3/k;)J
    .locals 2

    invoke-interface {p1, p0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object p1

    invoke-static {p1}, Lng3/g;->g(Ljg3/d;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_0
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v0, "Unsupported field: WeekBasedYear"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final range()Lng3/s;
    .locals 1

    sget-object v0, Lng3/a;->c0:Lng3/a;

    iget-object v0, v0, Lng3/a;->x:Lng3/s;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WeekBasedYear"

    return-object v0
.end method
