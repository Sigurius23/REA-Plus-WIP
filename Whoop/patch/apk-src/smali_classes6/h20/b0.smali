.class public final Lh20/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh20/d0;


# instance fields
.field public final a:Lq20/i;


# direct methods
.method public constructor <init>(Lq20/i;)V
    .locals 1

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/b0;->a:Lq20/i;

    return-void
.end method


# virtual methods
.method public final a()Ly00/j5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Lq20/y;
    .locals 1

    iget-object v0, p0, Lh20/b0;->a:Lq20/i;

    return-object v0
.end method

.method public final c()Ly00/u5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh20/b0;->a:Lq20/i;

    iget-object v0, v0, Lq20/i;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ly00/d5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh20/b0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/b0;

    iget-object v1, p0, Lh20/b0;->a:Lq20/i;

    iget-object p1, p1, Lh20/b0;->a:Lq20/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh20/b0;->a:Lq20/i;

    iget-object v0, v0, Lq20/i;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lh20/b0;->a:Lq20/i;

    invoke-virtual {v0}, Lq20/i;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "External(paymentSelection="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/b0;->a:Lq20/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
