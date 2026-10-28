.class public final Ll80/o$b;
.super Ll80/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll80/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0013\u001a\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Ll80/o$b;",
        "Ll80/o;",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "destination",
        "from",
        "<init>",
        "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V",
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
        "a",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "b",
        "activation_release"
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
.field private final a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

.field private final b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ll80/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ll80/o$b;->a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iput-object p2, p0, Ll80/o$b;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Ll80/o$b;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;
    .locals 1

    iget-object v0, p0, Ll80/o$b;->a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    return-object v0
.end method

.method public final b()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;
    .locals 1

    iget-object v0, p0, Ll80/o$b;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll80/o$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll80/o$b;

    iget-object v1, p0, Ll80/o$b;->a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v3, p1, Ll80/o$b;->a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll80/o$b;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object p1, p1, Ll80/o$b;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ll80/o$b;->a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ll80/o$b;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Ll80/o$b;->a:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v1, p0, Ll80/o$b;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "GoBackToPreviousDestination(destination="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", from="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
