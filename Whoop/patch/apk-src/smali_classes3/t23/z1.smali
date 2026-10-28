.class public final Lt23/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/getstream/video/android/model/User;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/lang/String;

.field public final d:Ljg3/i;

.field public final e:Ljg3/i;

.field public final f:Ljg3/i;


# direct methods
.method public constructor <init>(Lio/getstream/video/android/model/User;Ljava/util/Map;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;I)V
    .locals 0

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    const-string p7, "custom"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "createdAt"

    invoke-static {p4, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "updatedAt"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    iput-object p2, p0, Lt23/z1;->b:Ljava/util/Map;

    iput-object p3, p0, Lt23/z1;->c:Ljava/lang/String;

    iput-object p4, p0, Lt23/z1;->d:Ljg3/i;

    iput-object p5, p0, Lt23/z1;->e:Ljg3/i;

    iput-object p6, p0, Lt23/z1;->f:Ljg3/i;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt23/z1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lt23/z1;

    iget-object v0, p0, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    iget-object v1, p1, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    invoke-virtual {v0, v1}, Lio/getstream/video/android/model/User;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lt23/z1;->b:Ljava/util/Map;

    iget-object v1, p1, Lt23/z1;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lt23/z1;->c:Ljava/lang/String;

    iget-object v1, p1, Lt23/z1;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lt23/z1;->d:Ljg3/i;

    iget-object v1, p1, Lt23/z1;->d:Ljg3/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lt23/z1;->e:Ljg3/i;

    iget-object v1, p1, Lt23/z1;->e:Ljg3/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lt23/z1;->f:Ljg3/i;

    iget-object p1, p1, Lt23/z1;->f:Ljg3/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt23/z1;->b:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lt23/z1;->c:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lt23/z1;->d:Ljg3/i;

    invoke-static {v3, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v3, p0, Lt23/z1;->e:Ljg3/i;

    invoke-static {v3, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v1, p0, Lt23/z1;->f:Ljg3/i;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3c1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MemberState(user="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", custom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/z1;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/z1;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/z1;->d:Ljg3/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/z1;->e:Ljg3/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deletedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/z1;->f:Ljg3/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", acceptedAt=null, rejectedAt=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
