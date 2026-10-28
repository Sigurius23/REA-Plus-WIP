.class public final enum Lng3/c;
.super Lng3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "DAY_OF_QUARTER"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lng3/k;)Lng3/s;
    .locals 9

    invoke-interface {p1, p0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lng3/g;->x:Lng3/d;

    invoke-interface {p1, v0}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v4, v0, v2

    const-wide/16 v5, 0x5b

    if-nez v4, :cond_1

    sget-object v0, Lng3/a;->c0:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    invoke-static {v0, v1}, Lkg3/e;->isLeapYear(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v2, v3, v5, v6}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    const-wide/16 v0, 0x5a

    invoke-static {v2, v3, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    const-wide/16 v7, 0x2

    cmp-long p1, v0, v7

    if-nez p1, :cond_2

    invoke-static {v2, v3, v5, v6}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/16 v4, 0x3

    cmp-long p1, v0, v4

    if-eqz p1, :cond_4

    const-wide/16 v4, 0x4

    cmp-long p1, v0, v4

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lng3/c;->range()Lng3/s;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const-wide/16 v0, 0x5c

    invoke-static {v2, v3, v0, v1}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v0, "Unsupported field: DayOfQuarter"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lng3/k;)Z
    .locals 1

    sget-object v0, Lng3/a;->V:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->Z:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->c0:Lng3/a;

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

    invoke-virtual {p0, p1}, Lng3/c;->e(Lng3/k;)J

    move-result-wide v0

    invoke-virtual {p0}, Lng3/c;->range()Lng3/s;

    move-result-object v2

    invoke-virtual {v2, p2, p3, p0}, Lng3/s;->b(JLng3/m;)V

    sget-object v2, Lng3/a;->V:Lng3/a;

    invoke-interface {p1, v2}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v3

    sub-long/2addr p2, v0

    add-long/2addr p2, v3

    invoke-interface {p1, p2, p3, v2}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/HashMap;Llg3/u;)Lng3/k;
    .locals 13

    sget-object v0, Lng3/a;->c0:Lng3/a;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    sget-object v2, Lng3/g;->x:Lng3/d;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-eqz v1, :cond_6

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v1, v0, Lng3/a;->x:Lng3/s;

    invoke-virtual {v1, v4, v5, v0}, Lng3/s;->a(JLng3/m;)I

    move-result v1

    sget-object v4, Lng3/g;->w:Lng3/c;

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sget-object v6, Llg3/u;->y:Llg3/u;

    const/4 v7, 0x3

    const-wide/16 v8, 0x1

    const/4 v10, 0x1

    if-ne p2, v6, :cond_1

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v1, v10, v10}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p2

    invoke-static {v11, v12, v8, v9}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v10

    invoke-static {v10, v11, v7}, Lcom/squareup/wire/n;->X(JI)J

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Ljg3/d;->y0(J)Ljg3/d;

    move-result-object p2

    invoke-static {v4, v5, v8, v9}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v3

    invoke-virtual {p2, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p2

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lng3/d;->range()Lng3/s;

    move-result-object v6

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v6, v11, v12, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    sget-object v6, Llg3/u;->w:Llg3/u;

    if-ne p2, v6, :cond_5

    const/16 p2, 0x5b

    if-ne v3, v10, :cond_3

    sget-object v6, Lkg3/e;->w:Lkg3/e;

    int-to-long v11, v1

    invoke-static {v11, v12}, Lkg3/e;->isLeapYear(J)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    const/16 p2, 0x5a

    goto :goto_0

    :cond_3
    const/4 v6, 0x2

    if-ne v3, v6, :cond_4

    goto :goto_0

    :cond_4
    const/16 p2, 0x5c

    :goto_0
    int-to-long v11, p2

    invoke-static {v8, v9, v11, v12}, Lng3/s;->c(JJ)Lng3/s;

    move-result-object p2

    invoke-virtual {p2, v4, v5, p0}, Lng3/s;->b(JLng3/m;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lng3/c;->range()Lng3/s;

    move-result-object p2

    invoke-virtual {p2, v4, v5, p0}, Lng3/s;->b(JLng3/m;)V

    :goto_1
    sub-int/2addr v3, v10

    mul-int/2addr v3, v7

    add-int/2addr v3, v10

    invoke-static {v1, v3, v10}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p2

    sub-long/2addr v4, v8

    invoke-virtual {p2, v4, v5}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object p2

    :goto_2
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :cond_6
    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(Lng3/k;)J
    .locals 4

    invoke-interface {p1, p0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lng3/a;->V:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->f(Lng3/m;)I

    move-result v0

    sget-object v1, Lng3/a;->Z:Lng3/a;

    invoke-interface {p1, v1}, Lng3/k;->f(Lng3/m;)I

    move-result v1

    sget-object v2, Lng3/a;->c0:Lng3/a;

    invoke-interface {p1, v2}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v2

    add-int/lit8 v1, v1, -0x1

    div-int/lit8 v1, v1, 0x3

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    invoke-static {v2, v3}, Lkg3/e;->isLeapYear(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr v1, p1

    sget-object p1, Lng3/g;->E:[I

    aget p1, p1, v1

    sub-int/2addr v0, p1

    int-to-long v0, v0

    return-wide v0

    :cond_1
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v0, "Unsupported field: DayOfQuarter"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final range()Lng3/s;
    .locals 4

    const-wide/16 v0, 0x5a

    const-wide/16 v2, 0x5c

    invoke-static {v0, v1, v2, v3}, Lng3/s;->d(JJ)Lng3/s;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DayOfQuarter"

    return-object v0
.end method
