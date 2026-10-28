.class public final Luj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Luj/a;->a:J

    iput-wide p3, p0, Luj/a;->b:J

    iput-wide p5, p0, Luj/a;->c:J

    iput-wide p7, p0, Luj/a;->d:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Luj/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Luj/a;

    iget-wide v3, p0, Luj/a;->a:J

    iget-wide v5, p1, Luj/a;->a:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Luj/a;->b:J

    iget-wide v5, p1, Luj/a;->b:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Luj/a;->c:J

    iget-wide v5, p1, Luj/a;->c:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Luj/a;->d:J

    iget-wide v5, p1, Luj/a;->d:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Luj/a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Luj/a;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Luj/a;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Luj/a;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ButtonColors(background="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Luj/a;->a:J

    const-string v3, ", border="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Luj/a;->b:J

    const-string v3, ", content="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Luj/a;->c:J

    const-string v3, ", shadow="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Luj/a;->d:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
