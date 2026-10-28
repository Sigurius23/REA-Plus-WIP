.class public final Lys/g;
.super Lns/t;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/lang/Integer;

.field public final c:Lys/c;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lys/c;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lys/g;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lys/g;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lys/g;->c:Lys/c;

    iput-object p4, p0, Lys/g;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static b()Lzt/q;
    .locals 3

    new-instance v0, Lzt/q;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzt/q;-><init>(IZ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->y:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->z:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->E:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lys/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lys/g;

    iget-object v0, p1, Lys/g;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lys/g;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lys/g;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lys/g;->b:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lys/g;->c:Lys/c;

    iget-object v2, p0, Lys/g;->c:Lys/c;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lys/g;->d:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lys/g;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lys/g;->c:Lys/c;

    iget-object v1, p0, Lys/g;->d:Ljava/lang/Integer;

    const-class v2, Lys/g;

    iget-object v3, p0, Lys/g;->a:Ljava/lang/Integer;

    iget-object v4, p0, Lys/g;->b:Ljava/lang/Integer;

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AesGcmHkdfStreaming Parameters (IKM size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lys/g;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/g;->b:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "-byte AES GCM key, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/g;->c:Lys/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for HKDF "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lys/g;->d:Ljava/lang/Integer;

    const-string v2, "-byte ciphertexts)"

    invoke-static {v0, v1, v2}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
