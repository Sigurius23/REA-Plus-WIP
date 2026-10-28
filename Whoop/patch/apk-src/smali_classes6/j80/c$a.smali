.class public final Lj80/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj80/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj80/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lj80/c$a;",
        "Lj80/c;",
        "Lp90/e;",
        "card",
        "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;",
        "upcycleVariant",
        "",
        "userCountryCode",
        "<init>",
        "(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V",
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
        "Lp90/e;",
        "()Lp90/e;",
        "b",
        "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;",
        "()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;",
        "c",
        "Ljava/lang/String;",
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
.field private final a:Lp90/e;

.field private final b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V
    .locals 1

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj80/c$a;->a:Lp90/e;

    .line 3
    iput-object p2, p0, Lj80/c$a;->b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    .line 4
    iput-object p3, p0, Lj80/c$a;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lj80/c$a;-><init>(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lp90/e;
    .locals 1

    iget-object v0, p0, Lj80/c$a;->a:Lp90/e;

    return-object v0
.end method

.method public final b()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;
    .locals 1

    iget-object v0, p0, Lj80/c$a;->b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj80/c$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj80/c$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj80/c$a;

    iget-object v1, p0, Lj80/c$a;->a:Lp90/e;

    iget-object v3, p1, Lj80/c$a;->a:Lp90/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj80/c$a;->b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    iget-object v3, p1, Lj80/c$a;->b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj80/c$a;->c:Ljava/lang/String;

    iget-object p1, p1, Lj80/c$a;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lj80/c$a;->a:Lp90/e;

    invoke-virtual {v0}, Lp90/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj80/c$a;->b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj80/c$a;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lj80/c$a;->a:Lp90/e;

    iget-object v1, p0, Lj80/c$a;->b:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    iget-object v2, p0, Lj80/c$a;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "OnPaymentInfoSubmitted(card="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upcycleVariant="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userCountryCode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
