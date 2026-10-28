.class public final Llw1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001e\u001a\u0004\u0008\u0015\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Llw1/j;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "options",
        "",
        "optionSelected",
        "Lcom/whoop/payments/domain/models/Card;",
        "card",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "I",
        "Lcom/whoop/payments/domain/models/Card;",
        "()Lcom/whoop/payments/domain/models/Card;",
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource;",
            ">;"
        }
    .end annotation
.end field

.field private final c:I

.field private final d:Lcom/whoop/payments/domain/models/Card;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/util/TextResource;",
            ">;I",
            "Lcom/whoop/payments/domain/models/Card;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llw1/j;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Llw1/j;->b:Ljava/util/List;

    iput p3, p0, Llw1/j;->c:I

    iput-object p4, p0, Llw1/j;->d:Lcom/whoop/payments/domain/models/Card;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/payments/domain/models/Card;
    .locals 1

    iget-object v0, p0, Llw1/j;->d:Lcom/whoop/payments/domain/models/Card;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Llw1/j;->c:I

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llw1/j;->b:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Llw1/j;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llw1/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llw1/j;

    iget-object v1, p0, Llw1/j;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Llw1/j;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llw1/j;->b:Ljava/util/List;

    iget-object v3, p1, Llw1/j;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llw1/j;->c:I

    iget v3, p1, Llw1/j;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llw1/j;->d:Lcom/whoop/payments/domain/models/Card;

    iget-object p1, p1, Llw1/j;->d:Lcom/whoop/payments/domain/models/Card;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llw1/j;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llw1/j;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Llw1/j;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Llw1/j;->d:Lcom/whoop/payments/domain/models/Card;

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Llw1/j;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Llw1/j;->b:Ljava/util/List;

    iget v2, p0, Llw1/j;->c:I

    iget-object v3, p0, Llw1/j;->d:Lcom/whoop/payments/domain/models/Card;

    const-string v4, ", options="

    const-string v5, ", optionSelected="

    const-string v6, "PaymentOptionsViewState(title="

    invoke-static {v0, v6, v4, v5, v1}, Lte0/d;->p(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", card="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
