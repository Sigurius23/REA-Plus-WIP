.class public final Ld40/n;
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

.field public final i:Lg1/c1;


# direct methods
.method public constructor <init>(JJJJJJJJLg1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld40/n;->a:J

    iput-wide p3, p0, Ld40/n;->b:J

    iput-wide p5, p0, Ld40/n;->c:J

    iput-wide p7, p0, Ld40/n;->d:J

    iput-wide p9, p0, Ld40/n;->e:J

    iput-wide p11, p0, Ld40/n;->f:J

    iput-wide p13, p0, Ld40/n;->g:J

    move-wide p1, p15

    iput-wide p1, p0, Ld40/n;->h:J

    move-object/from16 p1, p17

    iput-object p1, p0, Ld40/n;->i:Lg1/c1;

    return-void
.end method

.method public static a(Ld40/n;JJJJJJJLg1/c1;I)Ld40/n;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_0

    iget-wide v2, v0, Ld40/n;->e:J

    move-wide v13, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p9

    :goto_0
    iget-wide v2, v0, Ld40/n;->f:J

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_1

    iget-wide v4, v0, Ld40/n;->h:J

    move-wide/from16 v19, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v19, p13

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ld40/n;

    move-wide/from16 v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    move-wide/from16 v17, p11

    move-object/from16 v21, p15

    move-wide v15, v2

    invoke-direct/range {v4 .. v21}, Ld40/n;-><init>(JJJJJJJJLg1/c1;)V

    return-object v4
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld40/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld40/n;

    iget-wide v3, p0, Ld40/n;->a:J

    iget-wide v5, p1, Ld40/n;->a:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Ld40/n;->b:J

    iget-wide v5, p1, Ld40/n;->b:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Ld40/n;->c:J

    iget-wide v5, p1, Ld40/n;->c:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Ld40/n;->d:J

    iget-wide v5, p1, Ld40/n;->d:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Ld40/n;->e:J

    iget-wide v5, p1, Ld40/n;->e:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Ld40/n;->f:J

    iget-wide v5, p1, Ld40/n;->f:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Ld40/n;->g:J

    iget-wide v5, p1, Ld40/n;->g:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Ld40/n;->h:J

    iget-wide v5, p1, Ld40/n;->h:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ld40/n;->i:Lg1/c1;

    iget-object p1, p1, Ld40/n;->i:Lg1/c1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Ld40/n;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Ld40/n;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/n;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/n;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/n;->e:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/n;->f:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/n;->g:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/n;->h:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Ld40/n;->a:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Ld40/n;->b:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Ld40/n;->c:J

    invoke-static {v2, v3}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Ld40/n;->d:J

    invoke-static {v3, v4}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Ld40/n;->e:J

    invoke-static {v4, v5}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, Ld40/n;->f:J

    invoke-static {v5, v6}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v5

    iget-wide v6, p0, Ld40/n;->g:J

    invoke-static {v6, v7}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v6

    iget-wide v7, p0, Ld40/n;->h:J

    invoke-static {v7, v8}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v7

    const-string v8, ", componentBorder="

    const-string v9, ", componentDivider="

    const-string v10, "StripeColors(component="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", onComponent="

    const-string v8, ", subtitle="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", textCursor="

    const-string v2, ", placeholderText="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", appBarIcon="

    const-string v2, ", materialColors="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
