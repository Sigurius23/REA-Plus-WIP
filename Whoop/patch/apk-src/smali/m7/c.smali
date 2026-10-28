.class public final Lm7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e0;


# static fields
.field public static final e:Lr7/h0;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Lr7/h0;

.field public final d:Ln7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lse/a;->M()Lr7/h0;

    move-result-object v0

    sput-object v0, Lm7/c;->e:Lr7/h0;

    new-instance v0, Lg40/f4;

    sget-object v1, Lr7/k;->y:Lr7/e;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lg40/f4;-><init>(I)V

    const/4 v1, 0x5

    const-string v2, "BasalCaloriesBurned"

    const-string v3, "energy"

    invoke-static {v1, v2, v3, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/h0;Ln7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/c;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/c;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/c;->c:Lr7/h0;

    iput-object p4, p0, Lm7/c;->d:Ln7/c;

    invoke-virtual {p3}, Lr7/h0;->b()Lr7/h0;

    move-result-object p1

    const-string p2, "bmr"

    invoke-static {p3, p1, p2}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p1, Lm7/c;->e:Lr7/h0;

    invoke-static {p3, p1, p2}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/c;->d:Ln7/c;

    return-object v0
.end method

.method public final d()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/c;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/c;

    iget-object v1, p1, Lm7/c;->c:Lr7/h0;

    iget-object v3, p0, Lm7/c;->c:Lr7/h0;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/c;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/c;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/c;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/c;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/c;->d:Ln7/c;

    iget-object p1, p1, Lm7/c;->d:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/c;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm7/c;->c:Lr7/h0;

    invoke-virtual {v0}, Lr7/h0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/c;->a:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v2, p0, Lm7/c;->b:Ljava/time/ZoneOffset;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm7/c;->d:Ln7/c;

    invoke-virtual {v1}, Ln7/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
