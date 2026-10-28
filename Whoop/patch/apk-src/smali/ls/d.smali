.class public final Lls/d;
.super Lfs/k;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lls/c;


# direct methods
.method public constructor <init>(ILls/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lls/d;->a:I

    iput-object p2, p0, Lls/d;->b:Lls/c;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/internal/l0;
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/internal/l0;-><init>(IZ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    sget-object v1, Lls/c;->d:Lls/c;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lls/d;->b:Lls/c;

    sget-object v1, Lls/c;->d:Lls/c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lls/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lls/d;

    iget v0, p1, Lls/d;->a:I

    iget v2, p0, Lls/d;->a:I

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lls/d;->b:Lls/c;

    iget-object v0, p0, Lls/d;->b:Lls/c;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lls/d;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lls/d;->b:Lls/c;

    const-class v2, Lls/d;

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AesSiv Parameters (variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lls/d;->b:Lls/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lls/d;->a:I

    const-string v2, "-byte key)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
