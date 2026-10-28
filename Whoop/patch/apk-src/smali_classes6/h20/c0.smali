.class public final Lh20/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh20/d0;


# instance fields
.field public final a:Lq20/t;


# direct methods
.method public constructor <init>(Lq20/t;)V
    .locals 1

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/c0;->a:Lq20/t;

    return-void
.end method


# virtual methods
.method public final a()Ly00/j5;
    .locals 1

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    invoke-virtual {v0}, Lq20/t;->k()Ly00/j5;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lq20/y;
    .locals 1

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    return-object v0
.end method

.method public final c()Ly00/u5;
    .locals 1

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    invoke-virtual {v0}, Lq20/t;->s()Ly00/u5;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    instance-of v1, v0, Lq20/n;

    if-nez v1, :cond_1

    instance-of v1, v0, Lq20/s;

    if-nez v1, :cond_1

    instance-of v1, v0, Lq20/o;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lq20/t;->i()Ly00/d5;

    move-result-object v0

    iget-object v0, v0, Ly00/d5;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ly00/d5;
    .locals 1

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    invoke-virtual {v0}, Lq20/t;->i()Ly00/d5;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh20/c0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/c0;

    iget-object v1, p0, Lh20/c0;->a:Lq20/t;

    iget-object p1, p1, Lh20/c0;->a:Lq20/t;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    invoke-virtual {v0}, Lq20/t;->i()Ly00/d5;

    move-result-object v0

    iget-object v0, v0, Ly00/d5;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lh20/c0;->a:Lq20/t;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "New(paymentSelection="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/c0;->a:Lq20/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
