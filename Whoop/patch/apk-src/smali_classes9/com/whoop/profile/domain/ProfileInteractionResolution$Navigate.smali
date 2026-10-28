.class public final Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;
.super Lcom/whoop/profile/domain/ProfileInteractionResolution;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/ProfileInteractionResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Navigate"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0019\u001a\u0004\u0008\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;",
        "Lcom/whoop/profile/domain/ProfileInteractionResolution;",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "<init>",
        "(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "component1",
        "()Lcom/whoop/navigation/e;",
        "component2",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "copy",
        "(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final destination:Lcom/whoop/navigation/e;


# direct methods
.method public constructor <init>(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/profile/domain/ProfileInteractionResolution;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    iput-object p2, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->copy(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    invoke-direct {v0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->destination:Lcom/whoop/navigation/e;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Navigate(destination="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
