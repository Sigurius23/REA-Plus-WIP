.class public final Lys/d;
.super Lns/t;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/lang/Integer;

.field public final c:Lys/c;

.field public final d:Lys/c;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lys/c;Lys/c;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lys/d;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lys/d;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lys/d;->c:Lys/c;

    iput-object p4, p0, Lys/d;->d:Lys/c;

    iput-object p5, p0, Lys/d;->e:Ljava/lang/Integer;

    iput-object p6, p0, Lys/d;->f:Ljava/lang/Integer;

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

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lys/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lys/d;

    iget-object v0, p1, Lys/d;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lys/d;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lys/d;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lys/d;->b:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lys/d;->c:Lys/c;

    iget-object v2, p0, Lys/d;->c:Lys/c;

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lys/d;->d:Lys/c;

    iget-object v2, p0, Lys/d;->d:Lys/c;

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lys/d;->e:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lys/d;->e:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lys/d;->f:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lys/d;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v5, p0, Lys/d;->e:Ljava/lang/Integer;

    iget-object v6, p0, Lys/d;->f:Ljava/lang/Integer;

    const-class v0, Lys/d;

    iget-object v1, p0, Lys/d;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lys/d;->b:Ljava/lang/Integer;

    iget-object v3, p0, Lys/d;->c:Lys/c;

    iget-object v4, p0, Lys/d;->d:Lys/c;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AesCtrHmacStreaming Parameters (IKM size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lys/d;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/d;->b:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "-byte AES key, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/d;->c:Lys/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for HKDF, "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for HMAC, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/d;->e:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/d;->f:Ljava/lang/Integer;

    const-string v2, "-byte ciphertexts)"

    invoke-static {v0, v1, v2}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
