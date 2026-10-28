.class public final Lcom/whoop/design/item/DesignItemInteraction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/item/DesignItemInteraction$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0008R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0019\u001a\u0004\u0008\u001a\u0010\n\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/design/item/DesignItemInteraction;",
        "",
        "actionArgument",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "<init>",
        "(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "component1",
        "()Ljava/lang/Object;",
        "component2",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "copy",
        "(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/item/DesignItemInteraction;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Object;",
        "getActionArgument",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Companion",
        "a",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lm91/j;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/item/DesignItemInteraction$a;


# instance fields
.field private final actionArgument:Ljava/lang/Object;

.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/item/DesignItemInteraction$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/item/DesignItemInteraction;->Companion:Lcom/whoop/design/item/DesignItemInteraction$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/item/DesignItemInteraction;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/item/DesignItemInteraction;Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/item/DesignItemInteraction;->copy(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/item/DesignItemInteraction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    return-object v0
.end method

.method public final component2()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 1

    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {v0, p1, p2}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/item/DesignItemInteraction;

    iget-object v1, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    iget-object v3, p1, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getActionArgument()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    return-object v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/item/DesignItemInteraction;->actionArgument:Ljava/lang/Object;

    iget-object v1, p0, Lcom/whoop/design/item/DesignItemInteraction;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DesignItemInteraction(actionArgument="

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
