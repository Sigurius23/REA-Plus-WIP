.class public final Lv70/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008 \u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lv70/d;",
        "",
        "Lv70/b;",
        "currentDialogType",
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
        "response",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "<init>",
        "(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)V",
        "a",
        "(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)Lv70/d;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lv70/b;",
        "c",
        "()Lv70/b;",
        "b",
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
        "e",
        "()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
        "Z",
        "getManualRefresh",
        "()Z",
        "d",
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
.field private final a:Lv70/b;

.field private final b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

.field private final c:Z

.field private final d:Z


# direct methods
.method public constructor <init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv70/d;->a:Lv70/b;

    .line 3
    iput-object p2, p0, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    .line 4
    iput-boolean p3, p0, Lv70/d;->c:Z

    .line 5
    iput-boolean p4, p0, Lv70/d;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lv70/d;-><init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)V

    return-void
.end method

.method public static synthetic b(Lv70/d;Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZILjava/lang/Object;)Lv70/d;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lv70/d;->a:Lv70/b;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lv70/d;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lv70/d;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lv70/d;->a(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)Lv70/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)Lv70/d;
    .locals 1

    new-instance v0, Lv70/d;

    invoke-direct {v0, p1, p2, p3, p4}, Lv70/d;-><init>(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)V

    return-object v0
.end method

.method public final c()Lv70/b;
    .locals 1

    iget-object v0, p0, Lv70/d;->a:Lv70/b;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lv70/d;->d:Z

    return v0
.end method

.method public final e()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;
    .locals 1

    iget-object v0, p0, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv70/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv70/d;

    iget-object v1, p0, Lv70/d;->a:Lv70/b;

    iget-object v3, p1, Lv70/d;->a:Lv70/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    iget-object v3, p1, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lv70/d;->c:Z

    iget-boolean v3, p1, Lv70/d;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lv70/d;->d:Z

    iget-boolean p1, p1, Lv70/d;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lv70/d;->a:Lv70/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lv70/d;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lv70/d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lv70/d;->a:Lv70/b;

    iget-object v1, p0, Lv70/d;->b:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    iget-boolean v2, p0, Lv70/d;->c:Z

    iget-boolean v3, p0, Lv70/d;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "OrderConfirmationDomainState(currentDialogType="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manualRefresh="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingSpinner="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
