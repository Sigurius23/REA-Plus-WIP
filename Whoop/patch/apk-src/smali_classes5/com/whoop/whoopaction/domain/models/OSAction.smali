.class public final Lcom/whoop/whoopaction/domain/models/OSAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/Action;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/OSAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J5\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/OSAction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "type",
        "Lcom/whoop/whoopaction/domain/models/OSActionType;",
        "parameters",
        "Lcom/whoop/whoopaction/domain/models/OSActionParameters;",
        "onSuccess",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onError",
        "<init>",
        "(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "getType",
        "()Lcom/whoop/whoopaction/domain/models/OSActionType;",
        "getParameters",
        "()Lcom/whoop/whoopaction/domain/models/OSActionParameters;",
        "getOnSuccess",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "getOnError",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
        "whoop-action_release"
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
    with = Luw2/d;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/OSAction$Companion;


# instance fields
.field private final onError:Lcom/whoop/navigation/models/GenericInteraction;

.field private final onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

.field private final parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

.field private final type:Lcom/whoop/whoopaction/domain/models/OSActionType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/domain/models/OSAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/OSAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/OSAction;->Companion:Lcom/whoop/whoopaction/domain/models/OSAction$Companion;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/whoopaction/domain/models/OSAction;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    .line 3
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    .line 4
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    .line 5
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/models/OSAction;-><init>(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/OSAction;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/models/OSAction;->copy(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/OSAction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/whoopaction/domain/models/OSActionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    return-object v0
.end method

.method public final component2()Lcom/whoop/whoopaction/domain/models/OSActionParameters;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/OSAction;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/models/OSAction;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/models/OSAction;-><init>(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/OSAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/OSAction;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getOnError()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getOnSuccess()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getParameters()Lcom/whoop/whoopaction/domain/models/OSActionParameters;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    return-object v0
.end method

.method public final getType()Lcom/whoop/whoopaction/domain/models/OSActionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->type:Lcom/whoop/whoopaction/domain/models/OSActionType;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->parameters:Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/OSAction;->onError:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "OSAction(type="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parameters="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onSuccess="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onError="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
