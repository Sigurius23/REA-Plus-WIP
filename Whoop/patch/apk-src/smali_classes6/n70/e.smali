.class public final Ln70/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0081\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJF\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!R\u0011\u0010$\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Ln70/e;",
        "",
        "",
        "currentStepIndex",
        "stepTotal",
        "previousFlowStepTotal",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "currentDestination",
        "Ln70/d;",
        "navigationAction",
        "<init>",
        "(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V",
        "a",
        "(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)Ln70/e;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "d",
        "b",
        "g",
        "c",
        "f",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "e",
        "Ln70/d;",
        "()Ln70/d;",
        "h",
        "()Z",
        "isOnLastScreen",
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
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

.field private final e:Ln70/d;


# direct methods
.method public constructor <init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ln70/e;->a:I

    .line 3
    iput p2, p0, Ln70/e;->b:I

    .line 4
    iput p3, p0, Ln70/e;->c:I

    .line 5
    iput-object p4, p0, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    .line 6
    iput-object p5, p0, Ln70/e;->e:Ln70/d;

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    return-void
.end method

.method public static synthetic b(Ln70/e;IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILjava/lang/Object;)Ln70/e;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Ln70/e;->a:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Ln70/e;->b:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Ln70/e;->c:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Ln70/e;->e:Ln70/d;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Ln70/e;->a(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)Ln70/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)Ln70/e;
    .locals 6

    new-instance v0, Ln70/e;

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    return-object v0
.end method

.method public final c()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;
    .locals 1

    iget-object v0, p0, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ln70/e;->a:I

    return v0
.end method

.method public final e()Ln70/d;
    .locals 1

    iget-object v0, p0, Ln70/e;->e:Ln70/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln70/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln70/e;

    iget v1, p0, Ln70/e;->a:I

    iget v3, p1, Ln70/e;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ln70/e;->b:I

    iget v3, p1, Ln70/e;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ln70/e;->c:I

    iget v3, p1, Ln70/e;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v3, p1, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ln70/e;->e:Ln70/d;

    iget-object p1, p1, Ln70/e;->e:Ln70/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ln70/e;->c:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ln70/e;->b:I

    return v0
.end method

.method public final h()Z
    .locals 3

    iget v0, p0, Ln70/e;->b:I

    if-lez v0, :cond_0

    iget v1, p0, Ln70/e;->a:I

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-ne v1, v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Ln70/e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ln70/e;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Ln70/e;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ln70/e;->e:Ln70/d;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Ln70/e;->a:I

    iget v1, p0, Ln70/e;->b:I

    iget v2, p0, Ln70/e;->c:I

    iget-object v3, p0, Ln70/e;->d:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v4, p0, Ln70/e;->e:Ln70/d;

    const-string v5, ", stepTotal="

    const-string v6, ", previousFlowStepTotal="

    const-string v7, "ActivationProgressResult(currentStepIndex="

    invoke-static {v0, v1, v7, v5, v6}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentDestination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigationAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
