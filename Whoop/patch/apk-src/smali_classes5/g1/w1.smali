.class public final Lg1/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(JJJJJJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/w1;->a:J

    iput-wide p3, p0, Lg1/w1;->b:J

    iput-wide p5, p0, Lg1/w1;->c:J

    iput-wide p7, p0, Lg1/w1;->d:J

    iput-wide p9, p0, Lg1/w1;->e:J

    iput-wide p11, p0, Lg1/w1;->f:J

    iput-wide p13, p0, Lg1/w1;->g:J

    move-wide p1, p15

    iput-wide p1, p0, Lg1/w1;->h:J

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lg1/w1;->i:J

    move-wide/from16 p1, p19

    iput-wide p1, p0, Lg1/w1;->j:J

    return-void
.end method


# virtual methods
.method public final a(ZZLandroidx/compose/runtime/Composer;)Lp1/c1;
    .locals 1

    check-cast p3, Lp1/q;

    const v0, -0x58e774ae

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iget-wide p1, p0, Lg1/w1;->g:J

    goto :goto_0

    :cond_0
    iget-wide p1, p0, Lg1/w1;->h:J

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-wide p1, p0, Lg1/w1;->i:J

    goto :goto_0

    :cond_2
    iget-wide p1, p0, Lg1/w1;->j:J

    :goto_0
    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {v0, p3}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public final b(ZZLandroidx/compose/runtime/Composer;)Lp1/c1;
    .locals 1

    check-cast p3, Lp1/q;

    const v0, 0x5de6a124

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iget-wide p1, p0, Lg1/w1;->c:J

    goto :goto_0

    :cond_0
    iget-wide p1, p0, Lg1/w1;->d:J

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-wide p1, p0, Lg1/w1;->e:J

    goto :goto_0

    :cond_2
    iget-wide p1, p0, Lg1/w1;->f:J

    :goto_0
    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {v0, p3}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_c

    const-class v2, Lg1/w1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg1/w1;

    iget-wide v2, p0, Lg1/w1;->a:J

    iget-wide v4, p1, Lg1/w1;->a:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, Lg1/w1;->b:J

    iget-wide v4, p1, Lg1/w1;->b:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, Lg1/w1;->c:J

    iget-wide v4, p1, Lg1/w1;->c:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, Lg1/w1;->d:J

    iget-wide v4, p1, Lg1/w1;->d:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, Lg1/w1;->e:J

    iget-wide v4, p1, Lg1/w1;->e:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, Lg1/w1;->f:J

    iget-wide v4, p1, Lg1/w1;->f:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, Lg1/w1;->g:J

    iget-wide v4, p1, Lg1/w1;->g:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, Lg1/w1;->h:J

    iget-wide v4, p1, Lg1/w1;->h:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-wide v2, p0, Lg1/w1;->i:J

    iget-wide v4, p1, Lg1/w1;->i:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-wide v2, p0, Lg1/w1;->j:J

    iget-wide v4, p1, Lg1/w1;->j:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_b

    return v1

    :cond_b
    return v0

    :cond_c
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Lg1/w1;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lg1/w1;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->e:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->f:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->g:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->h:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lg1/w1;->i:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lg1/w1;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
