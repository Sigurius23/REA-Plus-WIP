.class public final Lcoil/compose/AsyncImagePainter$State$Error;
.super Lch/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "coil/compose/AsyncImagePainter$State$Error",
        "Lch/f;",
        "Ln2/a;",
        "painter",
        "Ln2/a;",
        "a",
        "()Ln2/a;",
        "coil-compose-base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lmh/e;

.field private final painter:Ln2/a;


# direct methods
.method public constructor <init>(Ln2/a;Lmh/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcoil/compose/AsyncImagePainter$State$Error;->painter:Ln2/a;

    iput-object p2, p0, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    return-void
.end method

.method public static b(Lcoil/compose/AsyncImagePainter$State$Error;Ln2/a;)Lcoil/compose/AsyncImagePainter$State$Error;
    .locals 1

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lcoil/compose/AsyncImagePainter$State$Error;

    invoke-direct {p0, p1, v0}, Lcoil/compose/AsyncImagePainter$State$Error;-><init>(Ln2/a;Lmh/e;)V

    return-object p0
.end method


# virtual methods
.method public final a()Ln2/a;
    .locals 1

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter$State$Error;->painter:Ln2/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcoil/compose/AsyncImagePainter$State$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Error;

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter$State$Error;->painter:Ln2/a;

    iget-object v3, p1, Lcoil/compose/AsyncImagePainter$State$Error;->painter:Ln2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    iget-object p1, p1, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter$State$Error;->painter:Ln2/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    invoke-virtual {v1}, Lmh/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter$State$Error;->painter:Ln2/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
