.class public final Lvd2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ<\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010 \u001a\u0004\u0008!\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lvd2/b;",
        "",
        "Lvd2/d;",
        "currentScreenType",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "settingsScreenResponse",
        "",
        "isLoadingMoreHistory",
        "",
        "accNextToken",
        "<init>",
        "(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)V",
        "a",
        "(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)Lvd2/b;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lvd2/d;",
        "c",
        "()Lvd2/d;",
        "b",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "d",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "Z",
        "e",
        "()Z",
        "Ljava/lang/String;",
        "getAccNextToken",
        "shepherd_release"
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
.field private final a:Lvd2/d;

.field private final b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

.field private final c:Z

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "currentScreenType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvd2/b;->a:Lvd2/d;

    .line 3
    iput-object p2, p0, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    .line 4
    iput-boolean p3, p0, Lvd2/b;->c:Z

    .line 5
    iput-object p4, p0, Lvd2/b;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lvd2/d$g;->a:Lvd2/d$g;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lvd2/b;-><init>(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lvd2/b;->a:Lvd2/d;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lvd2/b;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lvd2/b;->d:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lvd2/b;->a(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)Lvd2/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)Lvd2/b;
    .locals 1

    const-string v0, "currentScreenType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvd2/b;

    invoke-direct {v0, p1, p2, p3, p4}, Lvd2/b;-><init>(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)V

    return-object v0
.end method

.method public final c()Lvd2/d;
    .locals 1

    iget-object v0, p0, Lvd2/b;->a:Lvd2/d;

    return-object v0
.end method

.method public final d()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;
    .locals 1

    iget-object v0, p0, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lvd2/b;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvd2/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvd2/b;

    iget-object v1, p0, Lvd2/b;->a:Lvd2/d;

    iget-object v3, p1, Lvd2/b;->a:Lvd2/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    iget-object v3, p1, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lvd2/b;->c:Z

    iget-boolean v3, p1, Lvd2/b;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lvd2/b;->d:Ljava/lang/String;

    iget-object p1, p1, Lvd2/b;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lvd2/b;->a:Lvd2/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lvd2/b;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lvd2/b;->d:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lvd2/b;->a:Lvd2/d;

    iget-object v1, p0, Lvd2/b;->b:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    iget-boolean v2, p0, Lvd2/b;->c:Z

    iget-object v3, p0, Lvd2/b;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ShepherdNotificationHistoryDomainState(currentScreenType="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", settingsScreenResponse="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoadingMoreHistory="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", accNextToken="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
