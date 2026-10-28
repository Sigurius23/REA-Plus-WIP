.class public final Liw1/a$d;
.super Liw1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Liw1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010 \u001a\u0004\u0008!\u0010\u0010R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u0019\u0010#R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008$\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Liw1/a$d;",
        "Liw1/a;",
        "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
        "payloadV2",
        "Llw1/j;",
        "paymentOption",
        "",
        "promoCode",
        "",
        "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
        "orderOptions",
        "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
        "stepPrefetchContent",
        "<init>",
        "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Llw1/j;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V",
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
        "b",
        "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
        "Llw1/j;",
        "c",
        "()Llw1/j;",
        "Ljava/lang/String;",
        "d",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "e",
        "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
        "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
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

.field private final b:Llw1/j;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Llw1/j;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;",
            "Llw1/j;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;",
            "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
            ")V"
        }
    .end annotation

    const-string v0, "payloadV2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOption"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stepPrefetchContent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Liw1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Liw1/a$d;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iput-object p2, p0, Liw1/a$d;->b:Llw1/j;

    iput-object p3, p0, Liw1/a$d;->c:Ljava/lang/String;

    iput-object p4, p0, Liw1/a$d;->d:Ljava/util/List;

    iput-object p5, p0, Liw1/a$d;->e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Liw1/a$d;->d:Ljava/util/List;

    return-object v0
.end method

.method public final b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;
    .locals 1

    iget-object v0, p0, Liw1/a$d;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    return-object v0
.end method

.method public final c()Llw1/j;
    .locals 1

    iget-object v0, p0, Liw1/a$d;->b:Llw1/j;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Liw1/a$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;
    .locals 1

    iget-object v0, p0, Liw1/a$d;->e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Liw1/a$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Liw1/a$d;

    iget-object v1, p0, Liw1/a$d;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iget-object v3, p1, Liw1/a$d;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Liw1/a$d;->b:Llw1/j;

    iget-object v3, p1, Liw1/a$d;->b:Llw1/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Liw1/a$d;->c:Ljava/lang/String;

    iget-object v3, p1, Liw1/a$d;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Liw1/a$d;->d:Ljava/util/List;

    iget-object v3, p1, Liw1/a$d;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Liw1/a$d;->e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    iget-object p1, p1, Liw1/a$d;->e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Liw1/a$d;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Liw1/a$d;->b:Llw1/j;

    invoke-virtual {v2}, Llw1/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Liw1/a$d;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Liw1/a$d;->d:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Liw1/a$d;->e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Liw1/a$d;->a:Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    iget-object v1, p0, Liw1/a$d;->b:Llw1/j;

    iget-object v2, p0, Liw1/a$d;->c:Ljava/lang/String;

    iget-object v3, p0, Liw1/a$d;->d:Ljava/util/List;

    iget-object v4, p0, Liw1/a$d;->e:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PlaceOrderV2(payloadV2="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentOption="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", promoCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", orderOptions="

    const-string v1, ", stepPrefetchContent="

    invoke-static {v2, v0, v1, v5, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
