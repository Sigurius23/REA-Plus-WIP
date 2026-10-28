.class public final Lc43/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lio/getstream/android/video/generated/models/ReactionResponse;

.field public final c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/ReactionResponse;J)V
    .locals 1

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc43/o;->a:Ljava/lang/String;

    iput-object p2, p0, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    iput-wide p3, p0, Lc43/o;->c:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc43/o;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lc43/o;

    iget-object v1, p0, Lc43/o;->a:Ljava/lang/String;

    iget-object v2, p1, Lc43/o;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    iget-object v2, p1, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-wide v1, p0, Lc43/o;->c:J

    iget-wide v3, p1, Lc43/o;->c:J

    cmp-long p1, v1, v3

    if-eqz p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lc43/o;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ReactionResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lc43/o;->c:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Reaction(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc43/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isConsumed=false)"

    iget-wide v2, p0, Lc43/o;->c:J

    invoke-static {v2, v3, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
