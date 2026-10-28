.class public final Lm7/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e0;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Lr7/c0;

.field public final d:Ln7/c;


# direct methods
.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/c0;Ln7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/o0;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/o0;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/o0;->c:Lr7/c0;

    iput-object p4, p0, Lm7/o0;->d:Ln7/c;

    invoke-virtual {p3}, Lr7/c0;->a()D

    move-result-wide p1

    const-string p4, "percentage"

    invoke-static {p1, p2, p4}, Ls2/e;->Z(DLjava/lang/String;)V

    invoke-virtual {p3}, Lr7/c0;->a()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-wide/high16 p2, 0x4059000000000000L    # 100.0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2, p4}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/o0;->d:Ln7/c;

    return-object v0
.end method

.method public final d()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/o0;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/o0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/o0;

    iget-object v1, p1, Lm7/o0;->c:Lr7/c0;

    iget-object v3, p0, Lm7/o0;->c:Lr7/c0;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/o0;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/o0;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/o0;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/o0;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/o0;->d:Ln7/c;

    iget-object p1, p1, Lm7/o0;->d:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/o0;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm7/o0;->c:Lr7/c0;

    invoke-virtual {v0}, Lr7/c0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/o0;->a:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v2, p0, Lm7/o0;->b:Ljava/time/ZoneOffset;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm7/o0;->d:Ln7/c;

    invoke-virtual {v1}, Ln7/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
