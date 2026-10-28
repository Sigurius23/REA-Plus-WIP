.class public final Lt43/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/c0;

.field public final b:Lio/getstream/video/android/model/User;

.field public final c:Ljg3/i;

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lt23/c0;Lio/getstream/android/video/generated/models/PermissionRequestEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/PermissionRequestEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-static {v0}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/PermissionRequestEvent;->getCreatedAt()Ljg3/i;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/PermissionRequestEvent;->getPermissions()Ljava/util/List;

    move-result-object p2

    const-string v2, "createdAt"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "permissions"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt43/a;->a:Lt23/c0;

    iput-object v0, p0, Lt43/a;->b:Lio/getstream/video/android/model/User;

    iput-object v1, p0, Lt43/a;->c:Ljg3/i;

    iput-object p2, p0, Lt43/a;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt43/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lt43/a;

    iget-object v0, p0, Lt43/a;->a:Lt23/c0;

    iget-object v1, p1, Lt43/a;->a:Lt23/c0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lt43/a;->b:Lio/getstream/video/android/model/User;

    iget-object v1, p1, Lt43/a;->b:Lio/getstream/video/android/model/User;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lt43/a;->c:Ljg3/i;

    iget-object v1, p1, Lt43/a;->c:Ljg3/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lt43/a;->d:Ljava/util/List;

    iget-object p1, p1, Lt43/a;->d:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lt43/a;->a:Lt23/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt43/a;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v2}, Lio/getstream/video/android/model/User;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lt43/a;->c:Ljg3/i;

    invoke-static {v0, v2, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v1, p0, Lt43/a;->d:Ljava/util/List;

    const/16 v2, 0x3c1

    invoke-static {v0, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PermissionRequest(call="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt43/a;->a:Lt23/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt43/a;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt43/a;->c:Ljg3/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt43/a;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", grantedAt=null, rejectedAt=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
