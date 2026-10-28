.class public final Lcom/whoop/universalcheckout/features/cart/domain/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u000eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u000e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/c;",
        "",
        "Lcom/whoop/universalcheckout/features/cart/domain/b;",
        "state",
        "",
        "isUpdating",
        "",
        "cartId",
        "storeDomain",
        "<init>",
        "(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)V",
        "a",
        "(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/c;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/universalcheckout/features/cart/domain/b;",
        "d",
        "()Lcom/whoop/universalcheckout/features/cart/domain/b;",
        "b",
        "Z",
        "f",
        "()Z",
        "c",
        "Ljava/lang/String;",
        "e",
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
.field private final a:Lcom/whoop/universalcheckout/features/cart/domain/b;

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    .line 3
    iput-boolean p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    .line 4
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lcom/whoop/universalcheckout/features/cart/domain/b$c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b$c;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/cart/domain/c;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/cart/domain/c;->a(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/c;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/c;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/cart/domain/c;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/whoop/universalcheckout/features/cart/domain/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    iget-boolean v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b;

    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->b:Z

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/c;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CartDomainResultState(state="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isUpdating="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", cartId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", storeDomain="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
