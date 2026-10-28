.class public final Lm7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/Instant;

.field public final c:Lr7/s;


# direct methods
.method public constructor <init>(Ljava/time/Instant;Ljava/time/Instant;Lr7/s;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/p;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/p;->b:Ljava/time/Instant;

    iput-object p3, p0, Lm7/p;->c:Lr7/s;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lr7/s;->a()D

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmpg-double p3, v0, p1

    if-gtz p3, :cond_0

    const-wide v0, 0x412e848000000000L    # 1000000.0

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length valid range: 0-1000000."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startTime must be before endTime."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/p;->b:Ljava/time/Instant;

    return-object v0
.end method

.method public final b()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/p;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/p;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/p;

    iget-object v1, p1, Lm7/p;->a:Ljava/time/Instant;

    iget-object v3, p0, Lm7/p;->a:Ljava/time/Instant;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/p;->b:Ljava/time/Instant;

    iget-object v3, p1, Lm7/p;->b:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/p;->c:Lr7/s;

    iget-object p1, p1, Lm7/p;->c:Lr7/s;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm7/p;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/p;->b:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v1, p0, Lm7/p;->c:Lr7/s;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lr7/s;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
