.class public final Lm7/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Lr7/q0;


# direct methods
.method public constructor <init>(Ljava/time/Instant;Lr7/q0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/z0;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/z0;->b:Lr7/q0;

    sget-object p1, Lr7/q0;->z:Ljava/util/LinkedHashMap;

    iget-object v0, p2, Lr7/q0;->x:Lr7/p0;

    invoke-static {v0, p1}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr7/q0;

    const-string v0, "speed"

    invoke-static {p2, p1, v0}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p1, Lm7/a1;->g:Lr7/q0;

    invoke-static {p2, p1, v0}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/z0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/z0;

    iget-object v1, p1, Lm7/z0;->a:Ljava/time/Instant;

    iget-object v3, p0, Lm7/z0;->a:Ljava/time/Instant;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/z0;->b:Lr7/q0;

    iget-object p1, p1, Lm7/z0;->b:Lr7/q0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm7/z0;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm7/z0;->b:Lr7/q0;

    invoke-virtual {v1}, Lr7/q0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
