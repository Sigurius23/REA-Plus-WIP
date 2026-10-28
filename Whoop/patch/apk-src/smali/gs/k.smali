.class public final Lgs/k;
.super Lgs/d;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lgs/j;

.field public final f:Lgs/j;


# direct methods
.method public constructor <init>(IIIILgs/j;Lgs/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgs/k;->a:I

    iput p2, p0, Lgs/k;->b:I

    iput p3, p0, Lgs/k;->c:I

    iput p4, p0, Lgs/k;->d:I

    iput-object p5, p0, Lgs/k;->e:Lgs/j;

    iput-object p6, p0, Lgs/k;->f:Lgs/j;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/internal/k0;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    sget-object v1, Lgs/j;->j:Lgs/j;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lgs/k;->e:Lgs/j;

    sget-object v1, Lgs/j;->j:Lgs/j;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgs/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgs/k;

    iget v0, p1, Lgs/k;->a:I

    iget v2, p0, Lgs/k;->a:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lgs/k;->b:I

    iget v2, p0, Lgs/k;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lgs/k;->c:I

    iget v2, p0, Lgs/k;->c:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lgs/k;->d:I

    iget v2, p0, Lgs/k;->d:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lgs/k;->e:Lgs/j;

    iget-object v2, p0, Lgs/k;->e:Lgs/j;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lgs/k;->f:Lgs/j;

    iget-object v0, p0, Lgs/k;->f:Lgs/j;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 8

    iget v0, p0, Lgs/k;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, p0, Lgs/k;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v0, p0, Lgs/k;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v0, p0, Lgs/k;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lgs/k;->e:Lgs/j;

    iget-object v7, p0, Lgs/k;->f:Lgs/j;

    const-class v1, Lgs/k;

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AesCtrHmacAead Parameters (variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lgs/k;->e:Lgs/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgs/k;->f:Lgs/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/k;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte IV, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/k;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/k;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte AES key, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/k;->b:I

    const-string v2, "-byte HMAC key)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
