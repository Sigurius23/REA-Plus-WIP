.class public final Lq7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/Instant;


# direct methods
.method public constructor <init>(Ljava/time/Instant;Ljava/time/Instant;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/a;->a:Ljava/time/Instant;

    iput-object p2, p0, Lq7/a;->b:Ljava/time/Instant;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lq7/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lq7/a;

    iget-object v0, p1, Lq7/a;->a:Ljava/time/Instant;

    iget-object v1, p0, Lq7/a;->a:Ljava/time/Instant;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lq7/a;->b:Ljava/time/Instant;

    iget-object p1, p1, Lq7/a;->b:Ljava/time/Instant;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lq7/a;->a:Ljava/time/Instant;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/time/Instant;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lq7/a;->b:Ljava/time/Instant;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/time/Instant;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    return v1
.end method
