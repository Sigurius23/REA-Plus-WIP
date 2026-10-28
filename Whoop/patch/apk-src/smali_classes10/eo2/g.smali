.class public final Leo2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001BI\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0003\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0016\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u0007\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0019\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001b\u0010\u000f\u00a8\u0006#"
    }
    d2 = {
        "Leo2/g;",
        "",
        "",
        "isLoading",
        "isError",
        "Leo2/a;",
        "data",
        "isUpdating",
        "Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;",
        "errorKind",
        "",
        "errorSupportText",
        "<init>",
        "(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;)V",
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
        "d",
        "c",
        "Leo2/a;",
        "()Leo2/a;",
        "e",
        "Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;",
        "()Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;",
        "f",
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
.field private final a:Z

.field private final b:Z

.field private final c:Leo2/a;

.field private final d:Z

.field private final e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Leo2/g;->a:Z

    .line 3
    iput-boolean p2, p0, Leo2/g;->b:Z

    .line 4
    iput-object p3, p0, Leo2/g;->c:Leo2/a;

    .line 5
    iput-boolean p4, p0, Leo2/g;->d:Z

    .line 6
    iput-object p5, p0, Leo2/g;->e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    .line 7
    iput-object p6, p0, Leo2/g;->f:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v1, 0x0

    if-eqz p8, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move-object p7, v1

    :goto_0
    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p7, p6

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p7}, Leo2/g;-><init>(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Leo2/a;
    .locals 1

    iget-object v0, p0, Leo2/g;->c:Leo2/a;

    return-object v0
.end method

.method public final b()Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;
    .locals 1

    iget-object v0, p0, Leo2/g;->e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Leo2/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Leo2/g;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Leo2/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Leo2/g;

    iget-boolean v1, p0, Leo2/g;->a:Z

    iget-boolean v3, p1, Leo2/g;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Leo2/g;->b:Z

    iget-boolean v3, p1, Leo2/g;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Leo2/g;->c:Leo2/a;

    iget-object v3, p1, Leo2/g;->c:Leo2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Leo2/g;->d:Z

    iget-boolean v3, p1, Leo2/g;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Leo2/g;->e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    iget-object v3, p1, Leo2/g;->e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Leo2/g;->f:Ljava/lang/String;

    iget-object p1, p1, Leo2/g;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Leo2/g;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Leo2/g;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Leo2/g;->c:Leo2/a;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Leo2/a;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Leo2/g;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Leo2/g;->e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Leo2/g;->f:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Leo2/g;->a:Z

    iget-boolean v1, p0, Leo2/g;->b:Z

    iget-object v2, p0, Leo2/g;->c:Leo2/a;

    iget-boolean v3, p0, Leo2/g;->d:Z

    iget-object v4, p0, Leo2/g;->e:Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    iget-object v5, p0, Leo2/g;->f:Ljava/lang/String;

    const-string v6, ", isError="

    const-string v7, ", data="

    const-string v8, "CartViewState(isLoading="

    invoke-static {v8, v6, v7, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isUpdating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", errorKind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorSupportText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
