.class public final enum Lng3/e;
.super Lng3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "WEEK_OF_WEEK_BASED_YEAR"

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lng3/k;)Lng3/s;
    .locals 1

    invoke-interface {p1, p0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object p1

    invoke-static {p1}, Lng3/g;->i(Ljg3/d;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v0, "Unsupported field: WeekOfWeekBasedYear"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
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
    .locals 2

    invoke-virtual {p0}, Lng3/e;->range()Lng3/s;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p0}, Lng3/s;->b(JLng3/m;)V

    invoke-virtual {p0, p1}, Lng3/e;->e(Lng3/k;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide p2

    sget-object v0, Lng3/b;->z:Lng3/b;

    invoke-interface {p1, p2, p3, v0}, Lng3/j;->c(JLng3/r;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/HashMap;Llg3/u;)Lng3/k;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, Lng3/g;->z:Lng3/f;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    sget-object v5, Lng3/a;->R:Lng3/a;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    if-eqz v4, :cond_5

    if-nez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v7, Lng3/a;->c0:Lng3/a;

    iget-object v7, v7, Lng3/a;->x:Lng3/s;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9, v3}, Lng3/s;->a(JLng3/m;)I

    move-result v4

    sget-object v7, Lng3/g;->y:Lng3/e;

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sget-object v9, Llg3/u;->y:Llg3/u;

    const/4 v10, 0x4

    const/4 v11, 0x1

    const-wide/16 v12, 0x1

    if-ne v2, v9, :cond_3

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    const-wide/16 v16, 0x7

    cmp-long v2, v14, v16

    if-lez v2, :cond_1

    sub-long/2addr v14, v12

    div-long v18, v14, v16

    rem-long v14, v14, v16

    add-long/2addr v14, v12

    :goto_0
    move-wide/from16 v16, v12

    move-wide/from16 v12, v18

    goto :goto_1

    :cond_1
    cmp-long v2, v14, v12

    if-gez v2, :cond_2

    div-long v18, v14, v16

    sub-long v18, v18, v12

    rem-long v14, v14, v16

    add-long v14, v14, v16

    goto :goto_0

    :cond_2
    const-wide/16 v18, 0x0

    goto :goto_0

    :goto_1
    invoke-static {v4, v11, v10}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v2

    sub-long v7, v7, v16

    invoke-virtual {v2, v7, v8}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v2

    invoke-virtual {v2, v14, v15, v5}, Ljg3/d;->C0(JLng3/m;)Ljg3/d;

    move-result-object v2

    goto :goto_3

    :cond_3
    move-wide/from16 v16, v12

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v6, v5, Lng3/a;->x:Lng3/s;

    invoke-virtual {v6, v12, v13, v5}, Lng3/s;->a(JLng3/m;)I

    move-result v6

    sget-object v9, Llg3/u;->w:Llg3/u;

    if-ne v2, v9, :cond_4

    invoke-static {v4, v11, v10}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v2

    invoke-static {v2}, Lng3/g;->i(Ljg3/d;)Lng3/s;

    move-result-object v2

    invoke-virtual {v2, v7, v8, v0}, Lng3/s;->b(JLng3/m;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lng3/e;->range()Lng3/s;

    move-result-object v2

    invoke-virtual {v2, v7, v8, v0}, Lng3/s;->b(JLng3/m;)V

    :goto_2
    invoke-static {v4, v11, v10}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v2

    sub-long v7, v7, v16

    invoke-virtual {v2, v7, v8}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v2

    int-to-long v6, v6

    invoke-virtual {v2, v6, v7, v5}, Ljg3/d;->C0(JLng3/m;)Ljg3/d;

    move-result-object v2

    :goto_3
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_5
    :goto_4
    const/4 v1, 0x0

    return-object v1
.end method

.method public final e(Lng3/k;)J
    .locals 2

    invoke-interface {p1, p0}, Lng3/k;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object p1

    invoke-static {p1}, Lng3/g;->f(Ljg3/d;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_0
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v0, "Unsupported field: WeekOfWeekBasedYear"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final range()Lng3/s;
    .locals 4

    const-wide/16 v0, 0x34

    const-wide/16 v2, 0x35

    invoke-static {v0, v1, v2, v3}, Lng3/s;->d(JJ)Lng3/s;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WeekOfWeekBasedYear"

    return-object v0
.end method
