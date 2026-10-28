.class public final Lqn1/d$k;
.super Lqn1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqn1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lqn1/d$k;",
        "Lqn1/d;",
        "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;",
        "cacheResponse",
        "",
        "playShimmer",
        "",
        "userCategory",
        "<init>",
        "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;",
        "()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;",
        "b",
        "Z",
        "()Z",
        "c",
        "Ljava/lang/String;",
        "home-notifications-center_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

.field private final b:Z

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "cacheResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lqn1/d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lqn1/d$k;->a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    .line 3
    iput-boolean p2, p0, Lqn1/d$k;->b:Z

    .line 4
    iput-object p3, p0, Lqn1/d$k;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lqn1/d$k;-><init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;
    .locals 1

    iget-object v0, p0, Lqn1/d$k;->a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lqn1/d$k;->b:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn1/d$k;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqn1/d$k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqn1/d$k;

    iget-object v1, p0, Lqn1/d$k;->a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    iget-object v3, p1, Lqn1/d$k;->a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lqn1/d$k;->b:Z

    iget-boolean v3, p1, Lqn1/d$k;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lqn1/d$k;->c:Ljava/lang/String;

    iget-object p1, p1, Lqn1/d$k;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqn1/d$k;->a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-virtual {v0}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lqn1/d$k;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lqn1/d$k;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lqn1/d$k;->a:Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    iget-boolean v1, p0, Lqn1/d$k;->b:Z

    iget-object v2, p0, Lqn1/d$k;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Success(cacheResponse="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", playShimmer="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", userCategory="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
