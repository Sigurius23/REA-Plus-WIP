.class public Lor2/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(D)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    double-to-long p1, p1

    .line 4
    iput-wide p1, p0, Lor2/z1;->a:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lor2/z1;->a:J

    return-void
.end method


# virtual methods
.method public a()Lor2/z1;
    .locals 3

    new-instance v0, Lor2/z1;

    invoke-virtual {p0}, Lor2/z1;->c()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lor2/z1;-><init>(J)V

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lor2/z1;->a:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lor2/z1;->a:J

    invoke-static {v0, v1}, Lor2/v1;->a(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lor2/z1;

    iget-wide v2, p0, Lor2/z1;->a:J

    iget-wide v4, p1, Lor2/z1;->a:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lor2/z1;->a:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/whoop/ui/f;->c(Lor2/z1;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lor2/z1;->a:J

    const-string v3, ")"

    invoke-static {v1, v2, v3, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
