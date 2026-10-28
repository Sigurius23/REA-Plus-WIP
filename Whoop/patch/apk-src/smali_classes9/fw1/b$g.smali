.class public final Lfw1/b$g;
.super Lfw1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfw1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0018\u0010!R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\"\u001a\u0004\u0008\u001c\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lfw1/b$g;",
        "Lfw1/b;",
        "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
        "payloadV2",
        "",
        "promoCode",
        "Lcom/whoop/payments/domain/models/Card;",
        "card",
        "",
        "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
        "orderOptions",
        "path",
        "<init>",
        "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;)V",
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
        "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
        "d",
        "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
        "b",
        "Ljava/lang/String;",
        "e",
        "c",
        "Lcom/whoop/payments/domain/models/Card;",
        "()Lcom/whoop/payments/domain/models/Card;",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "membership_release"
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
.field private final a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/whoop/payments/domain/models/Card;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
            "Ljava/lang/String;",
            "Lcom/whoop/payments/domain/models/Card;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "payloadV2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lfw1/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lfw1/b$g;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iput-object p2, p0, Lfw1/b$g;->b:Ljava/lang/String;

    iput-object p3, p0, Lfw1/b$g;->c:Lcom/whoop/payments/domain/models/Card;

    iput-object p4, p0, Lfw1/b$g;->d:Ljava/util/List;

    iput-object p5, p0, Lfw1/b$g;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/payments/domain/models/Card;
    .locals 1

    iget-object v0, p0, Lfw1/b$g;->c:Lcom/whoop/payments/domain/models/Card;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfw1/b$g;->d:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfw1/b$g;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;
    .locals 1

    iget-object v0, p0, Lfw1/b$g;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfw1/b$g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfw1/b$g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfw1/b$g;

    iget-object v1, p0, Lfw1/b$g;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iget-object v3, p1, Lfw1/b$g;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfw1/b$g;->b:Ljava/lang/String;

    iget-object v3, p1, Lfw1/b$g;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lfw1/b$g;->c:Lcom/whoop/payments/domain/models/Card;

    iget-object v3, p1, Lfw1/b$g;->c:Lcom/whoop/payments/domain/models/Card;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lfw1/b$g;->d:Ljava/util/List;

    iget-object v3, p1, Lfw1/b$g;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lfw1/b$g;->e:Ljava/lang/String;

    iget-object p1, p1, Lfw1/b$g;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lfw1/b$g;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfw1/b$g;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfw1/b$g;->c:Lcom/whoop/payments/domain/models/Card;

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfw1/b$g;->d:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lfw1/b$g;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lfw1/b$g;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iget-object v1, p0, Lfw1/b$g;->b:Ljava/lang/String;

    iget-object v2, p0, Lfw1/b$g;->c:Lcom/whoop/payments/domain/models/Card;

    iget-object v3, p0, Lfw1/b$g;->d:Ljava/util/List;

    iget-object v4, p0, Lfw1/b$g;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PlaceOrderV2(payloadV2="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", promoCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", card="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", orderOptions="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
