.class public final Lec3/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/a2;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lec3/e2;->a:J

    iput-wide p3, p0, Lec3/e2;->b:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    const-string v3, " ms) cannot be negative"

    if-ltz v2, :cond_1

    cmp-long p1, p3, v0

    if-ltz p1, :cond_0

    return-void

    :cond_0
    const-string p1, "replayExpiration("

    invoke-static {p3, p4, p1, v3}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const-string p3, "stopTimeout("

    invoke-static {p1, p2, p3, v3}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a(Lfc3/y;)Lec3/l;
    .locals 4

    new-instance v0, Lec3/d2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lec3/d2;-><init>(Lec3/e2;Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, La6/p;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, La6/p;-><init>(IILq83/d;)V

    new-instance v1, Lec3/a0;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v0, p1}, Lec3/a0;-><init>(ILc93/m;Lec3/l;)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lec3/e2;

    if-eqz v0, :cond_0

    check-cast p1, Lec3/e2;

    iget-wide v0, p1, Lec3/e2;->a:J

    iget-wide v2, p0, Lec3/e2;->a:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lec3/e2;->b:J

    iget-wide v2, p1, Lec3/e2;->b:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-wide v0, p0, Lec3/e2;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lec3/e2;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ln83/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ln83/c;-><init>(I)V

    const-wide/16 v1, 0x0

    iget-wide v3, p0, Lec3/e2;->a:J

    cmp-long v1, v3, v1

    const-string v2, "ms"

    if-lez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "stopTimeout="

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    const-wide v3, 0x7fffffffffffffffL

    iget-wide v5, p0, Lec3/e2;->b:J

    cmp-long v1, v5, v3

    if-gez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "replayExpiration="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SharingStarted.WhileSubscribed("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
