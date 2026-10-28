.class public final Ljo2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001BS\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0003\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0017\u0010\"R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001a\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Ljo2/b;",
        "",
        "",
        "isLoading",
        "isError",
        "",
        "stripeInitializationErrorMessage",
        "isConfigured",
        "cartId",
        "",
        "configuredId",
        "Lq20/e;",
        "initialSavedPaymentMethod",
        "<init>",
        "(ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lq20/e;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "()Z",
        "b",
        "e",
        "c",
        "Ljava/lang/String;",
        "d",
        "getCartId",
        "f",
        "Ljava/lang/Long;",
        "()Ljava/lang/Long;",
        "g",
        "Lq20/e;",
        "()Lq20/e;",
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
.field private final a:Z

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/Long;

.field private final g:Lq20/e;


# direct methods
.method public constructor <init>(ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lq20/e;)V
    .locals 1

    const-string v0, "cartId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Ljo2/b;->a:Z

    .line 3
    iput-boolean p2, p0, Ljo2/b;->b:Z

    .line 4
    iput-object p3, p0, Ljo2/b;->c:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Ljo2/b;->d:Z

    .line 6
    iput-object p5, p0, Ljo2/b;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Ljo2/b;->f:Ljava/lang/Long;

    .line 8
    iput-object p7, p0, Ljo2/b;->g:Lq20/e;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lq20/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x1

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    const/4 v1, 0x0

    if-eqz p9, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 p9, p8, 0x4

    const/4 v2, 0x0

    if-eqz p9, :cond_2

    move-object p3, v2

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_4

    if-nez p1, :cond_3

    if-nez p2, :cond_3

    move p4, v0

    goto :goto_0

    :cond_3
    move p4, v1

    :cond_4
    :goto_0
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_5

    .line 9
    const-string p5, ""

    :cond_5
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_6

    move-object p6, v2

    :cond_6
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_7

    move-object p8, v2

    :goto_1
    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_2

    :cond_7
    move-object p8, p7

    goto :goto_1

    .line 10
    :goto_2
    invoke-direct/range {p1 .. p8}, Ljo2/b;-><init>(ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lq20/e;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Ljo2/b;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Lq20/e;
    .locals 1

    iget-object v0, p0, Ljo2/b;->g:Lq20/e;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljo2/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Ljo2/b;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Ljo2/b;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljo2/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljo2/b;

    iget-boolean v1, p0, Ljo2/b;->a:Z

    iget-boolean v3, p1, Ljo2/b;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ljo2/b;->b:Z

    iget-boolean v3, p1, Ljo2/b;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ljo2/b;->c:Ljava/lang/String;

    iget-object v3, p1, Ljo2/b;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Ljo2/b;->d:Z

    iget-boolean v3, p1, Ljo2/b;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ljo2/b;->e:Ljava/lang/String;

    iget-object v3, p1, Ljo2/b;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ljo2/b;->f:Ljava/lang/Long;

    iget-object v3, p1, Ljo2/b;->f:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ljo2/b;->g:Lq20/e;

    iget-object p1, p1, Ljo2/b;->g:Lq20/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Ljo2/b;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ljo2/b;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ljo2/b;->c:Ljava/lang/String;

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

    iget-boolean v2, p0, Ljo2/b;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ljo2/b;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ljo2/b;->f:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ljo2/b;->g:Lq20/e;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lq20/e;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-boolean v0, p0, Ljo2/b;->a:Z

    iget-boolean v1, p0, Ljo2/b;->b:Z

    iget-object v2, p0, Ljo2/b;->c:Ljava/lang/String;

    iget-boolean v3, p0, Ljo2/b;->d:Z

    iget-object v4, p0, Ljo2/b;->e:Ljava/lang/String;

    iget-object v5, p0, Ljo2/b;->f:Ljava/lang/Long;

    iget-object v6, p0, Ljo2/b;->g:Lq20/e;

    const-string v7, ", isError="

    const-string v8, ", stripeInitializationErrorMessage="

    const-string v9, "StripeFlowControllerFlowData(isLoading="

    invoke-static {v9, v7, v8, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isConfigured="

    const-string v7, ", cartId="

    invoke-static {v0, v2, v1, v3, v7}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", configuredId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialSavedPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
