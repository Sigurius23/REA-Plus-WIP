.class public final Ld0/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/g2;


# instance fields
.field public final w:Ld0/i2;

.field public final x:Ld0/v0;

.field public final y:J

.field public final z:J


# direct methods
.method public constructor <init>(Ld0/i2;Ld0/v0;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/l2;->w:Ld0/i2;

    iput-object p2, p0, Ld0/l2;->x:Ld0/v0;

    invoke-interface {p1}, Ld0/i2;->i()I

    move-result p2

    invoke-interface {p1}, Ld0/i2;->l()I

    move-result p1

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    iput-wide p1, p0, Ld0/l2;->y:J

    mul-long/2addr p3, v0

    iput-wide p3, p0, Ld0/l2;->z:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b(J)J
    .locals 8

    iget-wide v0, p0, Ld0/l2;->z:J

    add-long v2, p1, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    return-wide v4

    :cond_0
    add-long/2addr p1, v0

    iget-wide v0, p0, Ld0/l2;->y:J

    div-long v2, p1, v0

    iget-object v6, p0, Ld0/l2;->x:Ld0/v0;

    sget-object v7, Ld0/v0;->w:Ld0/v0;

    if-eq v6, v7, :cond_2

    const/4 v6, 0x2

    int-to-long v6, v6

    rem-long v6, v2, v6

    cmp-long v4, v6, v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    mul-long/2addr v2, v0

    sub-long/2addr v2, p1

    return-wide v2

    :cond_2
    :goto_0
    mul-long/2addr v2, v0

    sub-long/2addr p1, v2

    return-wide p1
.end method

.method public final c(Ld0/r;Ld0/r;Ld0/r;)J
    .locals 0

    const-wide p1, 0x7fffffffffffffffL

    return-wide p1
.end method

.method public final d(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 10

    iget-wide v0, p0, Ld0/l2;->z:J

    add-long/2addr p1, v0

    iget-wide v2, p0, Ld0/l2;->y:J

    cmp-long p1, p1, v2

    if-lez p1, :cond_0

    iget-object v4, p0, Ld0/l2;->w:Ld0/i2;

    sub-long v5, v2, v0

    move-object v7, p3

    move-object v9, p4

    move-object v8, p5

    invoke-interface/range {v4 .. v9}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v9, p4

    return-object v9
.end method

.method public final h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 9

    invoke-virtual {p0, p1, p2}, Ld0/l2;->b(J)J

    move-result-wide v1

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    move-object v8, p4

    move-object v7, p5

    invoke-virtual/range {v3 .. v8}, Ld0/l2;->d(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v5

    move-object p1, v3

    move-object v3, v6

    move-object v4, v8

    iget-object v0, p1, Ld0/l2;->w:Ld0/i2;

    invoke-interface/range {v0 .. v5}, Ld0/g2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p2

    return-object p2
.end method

.method public final m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 9

    invoke-virtual {p0, p1, p2}, Ld0/l2;->b(J)J

    move-result-wide v1

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    move-object v8, p4

    move-object v7, p5

    invoke-virtual/range {v3 .. v8}, Ld0/l2;->d(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v5

    move-object p1, v3

    move-object v3, v6

    move-object v4, v8

    iget-object v0, p1, Ld0/l2;->w:Ld0/i2;

    invoke-interface/range {v0 .. v5}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p2

    return-object p2
.end method
