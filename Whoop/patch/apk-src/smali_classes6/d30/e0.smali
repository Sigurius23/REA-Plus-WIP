.class public final Ld30/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Lh2/c;


# direct methods
.method public constructor <init>(JJLh2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld30/e0;->a:J

    iput-wide p3, p0, Ld30/e0;->b:J

    iput-object p5, p0, Ld30/e0;->c:Lh2/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ld30/e0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ld30/e0;

    iget-wide v0, p0, Ld30/e0;->a:J

    iget-wide v2, p1, Ld30/e0;->a:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Ld30/e0;->b:J

    iget-wide v2, p1, Ld30/e0;->b:J

    invoke-static {v0, v1, v2, v3}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ld30/e0;->c:Lh2/c;

    iget-object p1, p1, Ld30/e0;->c:Lh2/c;

    invoke-virtual {v0, p1}, Lh2/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Ld30/e0;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Ld30/e0;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Ld30/e0;->c:Lh2/c;

    invoke-virtual {v1}, Lh2/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Ld30/e0;->a:J

    invoke-static {v0, v1}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Ld30/e0;->b:J

    invoke-static {v1, v2}, Ly3/l;->b(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, ", size="

    const-string v3, ", boundsInWindow="

    const-string v4, "CoordinateSnapshot(positionInWindow="

    invoke-static {v4, v0, v2, v1, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ld30/e0;->c:Lh2/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
