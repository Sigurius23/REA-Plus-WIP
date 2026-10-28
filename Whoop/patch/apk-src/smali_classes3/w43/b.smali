.class public final Lw43/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc93/m;

.field public final b:Ltx/a;


# direct methods
.method public constructor <init>(Lc93/m;Ltx/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw43/b;->a:Lc93/m;

    iput-object p2, p0, Lw43/b;->b:Ltx/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lw43/b;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lw43/b;

    iget-object v0, p0, Lw43/b;->a:Lc93/m;

    iget-object v1, p1, Lw43/b;->a:Lc93/m;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lw43/b;->b:Ltx/a;

    iget-object p1, p1, Lw43/b;->b:Ltx/a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    const-wide/16 v2, 0xfa

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    const-wide/16 v2, 0x7d0

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lw43/b;->a:Lc93/m;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lw43/b;->b:Ltx/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StreamRetryPolicy(minRetries=1, maxRetries=3, minBackoffMills=250, maxBackoffMills=2000, initialDelayMillis=0, giveUpFunction="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lw43/b;->a:Lc93/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextBackOffDelayFunction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw43/b;->b:Ltx/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
