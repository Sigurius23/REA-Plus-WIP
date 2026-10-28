.class public final Lm7/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:D

.field public final c:D

.field public final d:Lr7/s;

.field public final e:Lr7/s;

.field public final f:Lr7/s;


# direct methods
.method public constructor <init>(Ljava/time/Instant;DDLr7/s;Lr7/s;Lr7/s;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/q;->a:Ljava/time/Instant;

    iput-wide p2, p0, Lm7/q;->b:D

    iput-wide p4, p0, Lm7/q;->c:D

    iput-object p6, p0, Lm7/q;->d:Lr7/s;

    iput-object p7, p0, Lm7/q;->e:Lr7/s;

    iput-object p8, p0, Lm7/q;->f:Lr7/s;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-wide v0, -0x3fa9800000000000L    # -90.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p8

    const-string v0, "latitude"

    invoke-static {p1, p8, v0}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-wide p2, 0x4056800000000000L    # 90.0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2, v0}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-wide p2, -0x3f99800000000000L    # -180.0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const-string p3, "longitude"

    invoke-static {p1, p2, p3}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-wide p4, 0x4066800000000000L    # 180.0

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2, p3}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    if-eqz p6, :cond_0

    invoke-virtual {p6}, Lr7/s;->b()Lr7/s;

    move-result-object p1

    const-string p2, "horizontalAccuracy"

    invoke-static {p6, p1, p2}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_0
    if-eqz p7, :cond_1

    invoke-virtual {p7}, Lr7/s;->b()Lr7/s;

    move-result-object p1

    const-string p2, "verticalAccuracy"

    invoke-static {p7, p1, p2}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/q;

    iget-object v1, p1, Lm7/q;->a:Ljava/time/Instant;

    iget-object v3, p0, Lm7/q;->a:Ljava/time/Instant;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lm7/q;->b:D

    iget-wide v5, p1, Lm7/q;->b:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_6

    iget-wide v3, p0, Lm7/q;->c:D

    iget-wide v5, p1, Lm7/q;->c:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_6

    iget-object v1, p0, Lm7/q;->d:Lr7/s;

    iget-object v3, p1, Lm7/q;->d:Lr7/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/q;->e:Lr7/s;

    iget-object v3, p1, Lm7/q;->e:Lr7/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/q;->f:Lr7/s;

    iget-object p1, p1, Lm7/q;->f:Lr7/s;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0

    :cond_6
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lm7/q;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lm7/q;->b:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lm7/q;->c:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lm7/q;->d:Lr7/s;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lr7/s;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lm7/q;->e:Lr7/s;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lr7/s;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm7/q;->f:Lr7/s;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lr7/s;->hashCode()I

    move-result v2

    :cond_2
    add-int/2addr v0, v2

    return v0
.end method
