.class public final Lm7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/g0;


# static fields
.field public static final g:Lr7/k;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Ljava/time/Instant;

.field public final d:Ljava/time/ZoneOffset;

.field public final e:Lr7/k;

.field public final f:Ln7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Le4/a;->A()Lr7/k;

    move-result-object v0

    sput-object v0, Lm7/a;->g:Lr7/k;

    new-instance v0, Lg40/f4;

    sget-object v1, Lr7/k;->y:Lr7/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lg40/f4;-><init>(I)V

    const/4 v1, 0x5

    const-string v2, "ActiveCaloriesBurned"

    const-string v3, "energy"

    invoke-static {v1, v2, v3, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k;Ln7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/a;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/a;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/a;->c:Ljava/time/Instant;

    iput-object p4, p0, Lm7/a;->d:Ljava/time/ZoneOffset;

    iput-object p5, p0, Lm7/a;->e:Lr7/k;

    iput-object p6, p0, Lm7/a;->f:Ln7/c;

    invoke-virtual {p5}, Lr7/k;->c()Lr7/k;

    move-result-object p2

    const-string p4, "energy"

    invoke-static {p5, p2, p4}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p2, Lm7/a;->g:Lr7/k;

    invoke-static {p5, p2, p4}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startTime must be before endTime."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/a;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/a;->f:Ln7/c;

    return-object v0
.end method

.method public final e()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/a;->c:Ljava/time/Instant;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/a;

    iget-object v1, p1, Lm7/a;->e:Lr7/k;

    iget-object v3, p0, Lm7/a;->e:Lr7/k;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/a;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/a;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/a;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/a;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/a;->c:Ljava/time/Instant;

    iget-object v3, p1, Lm7/a;->c:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm7/a;->d:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/a;->d:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm7/a;->f:Ln7/c;

    iget-object p1, p1, Lm7/a;->f:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/a;->d:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final getStartTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/a;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lm7/a;->e:Lr7/k;

    invoke-virtual {v0}, Lr7/k;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/a;->a:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lm7/a;->b:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lm7/a;->c:Ljava/time/Instant;

    invoke-static {v3, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v3, p0, Lm7/a;->d:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm7/a;->f:Ln7/c;

    invoke-virtual {v1}, Ln7/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
