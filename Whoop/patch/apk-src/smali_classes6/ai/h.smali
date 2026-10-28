.class public final Lai/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/j2;
.implements Lf1/j;
.implements Len/f;
.implements Loa/d;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:J

.field public y:J

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lai/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IJI)V
    .locals 2

    iput p4, p0, Lai/h;->w:I

    packed-switch p4, :pswitch_data_0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iget-object p4, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast p4, Lp9/a;

    if-nez p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-static {p4}, Lva3/g;->i(Z)V

    .line 15
    iput-wide p2, p0, Lai/h;->x:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    .line 16
    iput-wide p2, p0, Lai/h;->y:J

    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iget-object p4, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast p4, Lko/a;

    if-nez p4, :cond_1

    const/4 p4, 0x1

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    invoke-static {p4}, Llo/a;->i(Z)V

    .line 19
    iput-wide p2, p0, Lai/h;->x:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    .line 20
    iput-wide p2, p0, Lai/h;->y:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(JLd1/j;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lai/h;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p3, p0, Lai/h;->E:Ljava/lang/Object;

    .line 4
    iput-wide p1, p0, Lai/h;->x:J

    .line 5
    new-instance p3, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    invoke-direct {p3, v0, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 6
    iput-object p3, p0, Lai/h;->z:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "maxSize <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(JLe1/i;Lf1/a1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lai/h;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p3, p0, Lai/h;->z:Ljava/lang/Object;

    iput-object p4, p0, Lai/h;->E:Ljava/lang/Object;

    iput-wide p1, p0, Lai/h;->y:J

    const-wide/16 p1, 0x0

    .line 12
    iput-wide p1, p0, Lai/h;->x:J

    return-void
.end method

.method public constructor <init>(Ld0/i2;Ld0/v0;J)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lai/h;->w:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lai/h;->z:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lai/h;->E:Ljava/lang/Object;

    .line 24
    invoke-interface {p1}, Ld0/i2;->i()I

    move-result p2

    invoke-interface {p1}, Ld0/i2;->l()I

    move-result p1

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    iput-wide p1, p0, Lai/h;->x:J

    mul-long/2addr p3, v0

    .line 25
    iput-wide p3, p0, Lai/h;->y:J

    return-void
.end method

.method public constructor <init>(Lio/sentry/transport/f;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lai/h;->w:I

    const-string v0, "dateProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai/h;->E:Ljava/lang/Object;

    .line 9
    new-instance p1, Ljava/util/LinkedHashMap;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object p1, p0, Lai/h;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BJJ)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lai/h;->w:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lai/h;->z:Ljava/lang/Object;

    .line 28
    iput-object p2, p0, Lai/h;->E:Ljava/lang/Object;

    .line 29
    iput-wide p3, p0, Lai/h;->x:J

    .line 30
    iput-wide p5, p0, Lai/h;->y:J

    return-void
.end method


# virtual methods
.method public b(JLf1/v;I)Z
    .locals 6

    iget-object p4, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast p4, Le1/i;

    invoke-virtual {p4}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly2/y;

    if-eqz p4, :cond_2

    iget-object v0, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v0, Lf1/a1;

    iget-wide v1, p0, Lai/h;->y:J

    invoke-interface {p4}, Ly2/y;->g()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Lf1/b1;

    iget-object v3, v0, Lf1/b1;->f:Las1/j;

    if-eqz v3, :cond_1

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v5, Lh2/b;

    invoke-direct {v5, p1, p2}, Lh2/b;-><init>(J)V

    invoke-virtual {v3, v4, p4, v5, p3}, Las1/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-wide p1, p0, Lai/h;->x:J

    invoke-static {v0, v1, v2}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Ld0/r;Ld0/r;Ld0/r;)J
    .locals 2

    const/4 p1, 0x7

    int-to-long p1, p1

    iget-wide v0, p0, Lai/h;->x:J

    mul-long/2addr p1, v0

    iget-wide v0, p0, Lai/h;->y:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public d()Lt9/e0;
    .locals 5

    .line 3
    iget-wide v0, p0, Lai/h;->x:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    .line 4
    new-instance v0, Lt9/t;

    iget-object v1, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast v1, Lt9/v;

    iget-wide v2, p0, Lai/h;->x:J

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lt9/t;-><init>(Ljava/lang/Object;JI)V

    return-object v0
.end method

.method public d()Lwm/p;
    .locals 4

    .line 1
    iget-wide v0, p0, Lai/h;->x:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    .line 2
    new-instance v0, Lwm/l;

    iget-object v1, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast v1, Lt9/v;

    iget-wide v2, p0, Lai/h;->x:J

    invoke-direct {v0, v1, v2, v3}, Lwm/l;-><init>(Lt9/v;J)V

    return-object v0
.end method

.method public e(J)V
    .locals 2

    iget v0, p0, Lai/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v0, Lt9/u;

    iget-object v0, v0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lx8/t;->d([JJZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Lai/h;->y:J

    return-void

    :pswitch_0
    iget-object v0, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v0, Lso/q;

    iget-object v0, v0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Llo/y;->e([JJZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Lai/h;->y:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v0, Lf1/a1;

    check-cast v0, Lf1/b1;

    iget-object v0, v0, Lf1/b1;->h:Lf1/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/d0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 10

    iget-object v0, p0, Lai/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/i2;

    invoke-virtual {p0, p1, p2}, Lai/h;->q(J)J

    move-result-wide v2

    move-object v4, p0

    move-wide v5, p1

    move-object v7, p3

    move-object v9, p4

    move-object v8, p5

    invoke-virtual/range {v4 .. v9}, Lai/h;->r(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v6

    move-object v4, v7

    move-object v5, v9

    invoke-interface/range {v1 .. v6}, Ld0/g2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public j(Lt9/o;)J
    .locals 6

    iget-wide v0, p0, Lai/h;->y:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const-wide/16 v2, -0x1

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    neg-long v0, v0

    iput-wide v2, p0, Lai/h;->y:J

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public k(Lwm/j;)J
    .locals 6

    iget-wide v0, p0, Lai/h;->y:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const-wide/16 v2, -0x1

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    neg-long v0, v0

    iput-wide v2, p0, Lai/h;->y:J

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 10

    iget-object v0, p0, Lai/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/i2;

    invoke-virtual {p0, p1, p2}, Lai/h;->q(J)J

    move-result-wide v2

    move-object v4, p0

    move-wide v5, p1

    move-object v7, p3

    move-object v9, p4

    move-object v8, p5

    invoke-virtual/range {v4 .. v9}, Lai/h;->r(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v6

    move-object v4, v7

    move-object v5, v9

    invoke-interface/range {v1 .. v6}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public n(JLf1/v;)Z
    .locals 9

    iget-object v0, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast v0, Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ly2/y;

    if-eqz v2, :cond_2

    iget-object v0, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v0, Lf1/a1;

    iget-wide v3, p0, Lai/h;->y:J

    invoke-interface {v2}, Ly2/y;->g()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v3, v4}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    iget-wide v5, p0, Lai/h;->x:J

    const/4 v8, 0x0

    move-object v1, v0

    check-cast v1, Lf1/b1;

    move-wide v3, p1

    move-object v7, p3

    invoke-virtual/range {v1 .. v8}, Lf1/b1;->d(Ly2/y;JJLf1/v;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-wide v3, p0, Lai/h;->x:J

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public o(Ljava/lang/Object;Ljava/lang/Object;Lai/g;)V
    .locals 6

    move-object v1, p1

    check-cast v1, Lai/b;

    check-cast p2, Lai/g;

    iget-object p1, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast p1, Ld1/j;

    iget-object p1, p1, Ld1/j;->x:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lai/j;

    iget-object v2, p2, Lai/g;->a:Lrh/j;

    iget-object v3, p2, Lai/g;->b:Ljava/util/Map;

    iget-wide v4, p2, Lai/g;->c:J

    invoke-virtual/range {v0 .. v5}, Lai/j;->o(Lai/b;Lrh/j;Ljava/util/Map;J)V

    return-void
.end method

.method public p()J
    .locals 5

    iget-wide v0, p0, Lai/h;->y:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v4, v3}, Lai/h;->s(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iput-wide v1, p0, Lai/h;->y:J

    :cond_1
    iget-wide v0, p0, Lai/h;->y:J

    return-wide v0
.end method

.method public q(J)J
    .locals 10

    iget-wide v0, p0, Lai/h;->x:J

    iget-wide v2, p0, Lai/h;->y:J

    add-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    return-wide v2

    :cond_0
    div-long v4, p1, v0

    const/4 v6, 0x7

    int-to-long v6, v6

    const-wide/16 v8, 0x1

    sub-long/2addr v6, v8

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    iget-object v6, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v6, Ld0/v0;

    sget-object v7, Ld0/v0;->w:Ld0/v0;

    if-eq v6, v7, :cond_2

    const/4 v6, 0x2

    int-to-long v6, v6

    rem-long v6, v4, v6

    cmp-long v2, v6, v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    add-long/2addr v4, v8

    mul-long/2addr v4, v0

    sub-long/2addr v4, p1

    return-wide v4

    :cond_2
    :goto_0
    mul-long/2addr v4, v0

    sub-long/2addr p1, v4

    return-wide p1
.end method

.method public r(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 10

    iget-wide v0, p0, Lai/h;->y:J

    add-long/2addr p1, v0

    iget-wide v2, p0, Lai/h;->x:J

    cmp-long p1, p1, v2

    if-lez p1, :cond_0

    sub-long v5, v2, v0

    move-object v4, p0

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-virtual/range {v4 .. v9}, Lai/h;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v8, p4

    return-object v8
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 5

    const-string v0, "sizeOf("

    :try_start_0
    move-object v1, p1

    check-cast v1, Lai/b;

    move-object v1, p2

    check-cast v1, Lai/g;

    iget-wide v1, v1, Lai/g;->c:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    return-wide v1

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ") returned a negative value: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lai/h;->y:J

    throw p1
.end method

.method public t()Lio/sentry/protocol/DebugImage;
    .locals 6

    iget-wide v0, p0, Lai/h;->x:J

    iget-object v2, p0, Lai/h;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v3, Lio/sentry/protocol/DebugImage;

    invoke-direct {v3}, Lio/sentry/protocol/DebugImage;-><init>()V

    invoke-virtual {v3, v2}, Lio/sentry/protocol/DebugImage;->setCodeId(Ljava/lang/String;)V

    iget-object v4, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Lio/sentry/protocol/DebugImage;->setCodeFile(Ljava/lang/String;)V

    invoke-static {v2}, Luf/c0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    move-object v2, v4

    :cond_1
    invoke-virtual {v3, v2}, Lio/sentry/protocol/DebugImage;->setDebugId(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v4, "0x%x"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lio/sentry/protocol/DebugImage;->setImageAddr(Ljava/lang/String;)V

    iget-wide v4, p0, Lai/h;->y:J

    sub-long/2addr v4, v0

    invoke-virtual {v3, v4, v5}, Lio/sentry/protocol/DebugImage;->setImageSize(J)V

    const-string v0, "elf"

    invoke-virtual {v3, v0}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    return-object v3
.end method

.method public u(J)V
    .locals 7

    iget-object v0, p0, Lai/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    :goto_0
    invoke-virtual {p0}, Lai/h;->p()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-lez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lai/h;->p()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "sizeOf() is returning inconsistent values"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lai/h;->p()J

    move-result-wide v3

    invoke-virtual {p0, v2, v1}, Lai/h;->s(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lai/h;->y:J

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lai/h;->o(Ljava/lang/Object;Ljava/lang/Object;Lai/g;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
