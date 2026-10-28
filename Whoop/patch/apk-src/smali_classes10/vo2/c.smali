.class public final Lvo2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001c\u001a\u0004\u0008 \u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u0015\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "Lvo2/c;",
        "",
        "Lvo2/a;",
        "currentDialogType",
        "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;",
        "response",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "",
        "cartId",
        "<init>",
        "(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lvo2/a;",
        "b",
        "()Lvo2/a;",
        "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;",
        "c",
        "()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;",
        "Z",
        "getManualRefresh",
        "()Z",
        "d",
        "getDisplayRefreshingSpinner",
        "e",
        "Ljava/lang/String;",
        "universal-checkout_release"
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
.field private final a:Lvo2/a;

.field private final b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

.field private final c:Z

.field private final d:Z

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "cartId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvo2/c;->a:Lvo2/a;

    .line 3
    iput-object p2, p0, Lvo2/c;->b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    .line 4
    iput-boolean p3, p0, Lvo2/c;->c:Z

    .line 5
    iput-boolean p4, p0, Lvo2/c;->d:Z

    .line 6
    iput-object p5, p0, Lvo2/c;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 7
    const-string p5, ""

    :cond_4
    move-object p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p6}, Lvo2/c;-><init>(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvo2/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lvo2/a;
    .locals 1

    iget-object v0, p0, Lvo2/c;->a:Lvo2/a;

    return-object v0
.end method

.method public final c()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;
    .locals 1

    iget-object v0, p0, Lvo2/c;->b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvo2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvo2/c;

    iget-object v1, p0, Lvo2/c;->a:Lvo2/a;

    iget-object v3, p1, Lvo2/c;->a:Lvo2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvo2/c;->b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    iget-object v3, p1, Lvo2/c;->b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lvo2/c;->c:Z

    iget-boolean v3, p1, Lvo2/c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lvo2/c;->d:Z

    iget-boolean v3, p1, Lvo2/c;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lvo2/c;->e:Ljava/lang/String;

    iget-object p1, p1, Lvo2/c;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lvo2/c;->a:Lvo2/a;

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

    iget-object v3, p0, Lvo2/c;->b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lvo2/c;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lvo2/c;->d:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lvo2/c;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lvo2/c;->a:Lvo2/a;

    iget-object v1, p0, Lvo2/c;->b:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;

    iget-boolean v2, p0, Lvo2/c;->c:Z

    iget-boolean v3, p0, Lvo2/c;->d:Z

    iget-object v4, p0, Lvo2/c;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ExternalWebCheckoutDomainState(currentDialogType="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manualRefresh="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingSpinner="

    const-string v1, ", cartId="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
