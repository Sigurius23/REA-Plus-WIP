.class public final Lvt/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(ILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lvt/b;->a:Ljava/lang/String;

    iput-wide p3, p0, Lvt/b;->b:J

    iput p1, p0, Lvt/b;->c:I

    return-void
.end method

.method public static a()Lae3/k;
    .locals 3

    new-instance v0, Lae3/k;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lae3/k;-><init>(I)V

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lae3/k;->c:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p1, p0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lvt/b;

    if-eqz v0, :cond_3

    check-cast p1, Lvt/b;

    iget v0, p1, Lvt/b;->c:I

    iget-object v1, p1, Lvt/b;->a:Ljava/lang/String;

    iget-object v2, p0, Lvt/b;->a:Ljava/lang/String;

    if-nez v2, :cond_1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-wide v1, p0, Lvt/b;->b:J

    iget-wide v3, p1, Lvt/b;->b:J

    cmp-long p1, v1, v3

    if-nez p1, :cond_3

    iget p1, p0, Lvt/b;->c:I

    if-nez p1, :cond_2

    if-nez v0, :cond_3

    goto :goto_1

    :cond_2
    invoke-static {p1, v0}, Le4/p;->c(II)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lvt/b;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v1, v2

    mul-int/2addr v1, v2

    const/16 v3, 0x20

    iget-wide v4, p0, Lvt/b;->b:J

    ushr-long v6, v4, v3

    xor-long v3, v6, v4

    long-to-int v3, v3

    xor-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget v2, p0, Lvt/b;->c:I

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Le4/p;->e(I)I

    move-result v0

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TokenResult{token="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lvt/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tokenExpirationTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lvt/b;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", responseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lvt/b;->c:I

    invoke-static {v1}, Lvl/b;->A(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
