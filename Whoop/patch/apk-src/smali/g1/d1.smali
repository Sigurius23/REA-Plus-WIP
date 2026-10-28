.class public abstract Lg1/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lep0/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg1/d1;->a:Lp1/u2;

    return-void
.end method

.method public static final a(Lg1/c1;J)J
    .locals 3

    invoke-virtual {p0}, Lg1/c1;->f()J

    move-result-wide v0

    iget-object v2, p0, Lg1/c1;->i:Lp1/k1;

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg1/c1;->d()J

    move-result-wide p0

    return-wide p0

    :cond_0
    iget-object v0, p0, Lg1/c1;->b:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lg1/c1;->d()J

    move-result-wide p0

    return-wide p0

    :cond_1
    invoke-virtual {p0}, Lg1/c1;->g()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide p0, p0, Li2/x;->a:J

    return-wide p0

    :cond_2
    iget-object v0, p0, Lg1/c1;->d:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide p0, p0, Li2/x;->a:J

    return-wide p0

    :cond_3
    invoke-virtual {p0}, Lg1/c1;->b()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p0, p0, Lg1/c1;->j:Lp1/k1;

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide p0, p0, Li2/x;->a:J

    return-wide p0

    :cond_4
    invoke-virtual {p0}, Lg1/c1;->h()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lg1/c1;->e()J

    move-result-wide p0

    return-wide p0

    :cond_5
    invoke-virtual {p0}, Lg1/c1;->c()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p0, p0, Lg1/c1;->l:Lp1/k1;

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide p0, p0, Li2/x;->a:J

    return-wide p0

    :cond_6
    sget-wide p0, Li2/x;->n:J

    return-wide p0
.end method

.method public static final b(JLandroidx/compose/runtime/Composer;)J
    .locals 2

    check-cast p2, Lp1/q;

    const v0, -0x22cddc11

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-static {v0, p0, p1}, Lg1/d1;->a(Lg1/c1;J)J

    move-result-wide p0

    const-wide/16 v0, 0x10

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {p2, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide p0, p0, Li2/x;->a:J

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    return-wide p0
.end method

.method public static c(JJJJ)Lg1/c1;
    .locals 28

    const-wide v0, 0xff3700b3L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v5

    const-wide v0, 0xff03dac6L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v7

    const-wide v0, 0xff121212L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v11

    sget-wide v17, Li2/x;->b:J

    sget-wide v21, Li2/x;->f:J

    new-instance v2, Lg1/c1;

    const/16 v27, 0x0

    move-wide v9, v7

    move-wide/from16 v19, v17

    move-wide/from16 v25, v17

    move-wide/from16 v3, p0

    move-wide/from16 v13, p2

    move-wide/from16 v15, p4

    move-wide/from16 v23, p6

    invoke-direct/range {v2 .. v27}, Lg1/c1;-><init>(JJJJJJJJJJJJZ)V

    return-object v2
.end method

.method public static d(JJJJI)Lg1/c1;
    .locals 29

    move/from16 v0, p8

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide v1, 0xff6200eeL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p0

    :goto_0
    const-wide v1, 0xff3700b3L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v6

    const-wide v1, 0xff03dac6L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v8

    const-wide v1, 0xff018786L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v10

    sget-wide v12, Li2/x;->f:J

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    move-wide v14, v12

    goto :goto_1

    :cond_1
    move-wide/from16 v14, p2

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    const-wide v1, 0xffb00020L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    move-wide/from16 v16, v1

    goto :goto_2

    :cond_2
    move-wide/from16 v16, p4

    :goto_2
    sget-wide v20, Li2/x;->b:J

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_3

    move-wide/from16 v24, v20

    goto :goto_3

    :cond_3
    move-wide/from16 v24, p6

    :goto_3
    new-instance v3, Lg1/c1;

    const/16 v28, 0x1

    move-wide/from16 v18, v12

    move-wide/from16 v22, v20

    move-wide/from16 v26, v12

    invoke-direct/range {v3 .. v28}, Lg1/c1;-><init>(JJJJJJJJJJJJZ)V

    return-object v3
.end method
