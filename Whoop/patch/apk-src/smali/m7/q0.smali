.class public final Lm7/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/u0;


# static fields
.field public static final g:Lr7/h0;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Ljava/time/Instant;

.field public final d:Ljava/time/ZoneOffset;

.field public final e:Ljava/util/List;

.field public final f:Ln7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lse/a;->N()Lr7/h0;

    move-result-object v0

    sput-object v0, Lm7/q0;->g:Lr7/h0;

    new-instance v0, Lm7/l0;

    sget-object v1, Lr7/h0;->y:Lr7/d0;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lm7/l0;-><init>(I)V

    const/4 v1, 0x2

    const-string v2, "PowerSeries"

    const-string v3, "power"

    invoke-static {v1, v2, v3, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lm7/l0;-><init>(I)V

    const/4 v1, 0x3

    invoke-static {v1, v2, v3, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lm7/l0;-><init>(I)V

    const/4 v1, 0x4

    invoke-static {v1, v2, v3, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/q0;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/q0;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/q0;->c:Ljava/time/Instant;

    iput-object p4, p0, Lm7/q0;->d:Ljava/time/ZoneOffset;

    iput-object p5, p0, Lm7/q0;->e:Ljava/util/List;

    iput-object p6, p0, Lm7/q0;->f:Ln7/c;

    invoke-virtual {p1, p3}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startTime must not be after endTime."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm7/q0;->e:Ljava/util/List;

    return-object v0
.end method

.method public final b()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/q0;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/q0;->f:Ln7/c;

    return-object v0
.end method

.method public final e()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/q0;->c:Ljava/time/Instant;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/q0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/q0;

    iget-object v1, p1, Lm7/q0;->a:Ljava/time/Instant;

    iget-object v3, p0, Lm7/q0;->a:Ljava/time/Instant;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/q0;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/q0;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/q0;->c:Ljava/time/Instant;

    iget-object v3, p1, Lm7/q0;->c:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/q0;->d:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/q0;->d:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm7/q0;->e:Ljava/util/List;

    iget-object v3, p1, Lm7/q0;->e:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm7/q0;->f:Ln7/c;

    iget-object p1, p1, Lm7/q0;->f:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/q0;->d:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final getStartTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/q0;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lm7/q0;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lm7/q0;->b:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lm7/q0;->c:Ljava/time/Instant;

    invoke-static {v3, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v3, p0, Lm7/q0;->d:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/q0;->e:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lm7/q0;->f:Ln7/c;

    invoke-virtual {v1}, Ln7/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
