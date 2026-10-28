.class public abstract Lzs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/d0;

.field public static final b:Lcom/google/crypto/tink/internal/b0;

.field public static final c:Lcom/google/crypto/tink/internal/m;

.field public static final d:Lcom/google/crypto/tink/internal/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    new-instance v1, Lxs/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/d0;

    const-class v3, Lys/d;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v2, Lzs/b;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v1, Lxs/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v2, Lzs/b;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v1, Lxs/a;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lys/a;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lzs/b;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lzs/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lzs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lzs/b;->d:Lcom/google/crypto/tink/internal/k;

    return-void
.end method

.method public static a(Lvs/g2;)Lys/c;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lys/c;->e:Lys/c;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse HashType: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lvs/g2;->b()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lys/c;->d:Lys/c;

    return-object p0

    :cond_2
    sget-object p0, Lys/c;->c:Lys/c;

    return-object p0
.end method

.method public static b(Lvs/t;I)Lys/d;
    .locals 1

    invoke-static {}, Lys/d;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/t;->F()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/t;->D()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/t;->G()Lvs/g2;

    move-result-object p1

    invoke-static {p1}, Lzs/b;->a(Lvs/g2;)Lys/c;

    move-result-object p1

    iput-object p1, v0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/t;->H()Lvs/s2;

    move-result-object p1

    invoke-virtual {p1}, Lvs/s2;->C()Lvs/g2;

    move-result-object p1

    invoke-static {p1}, Lzs/b;->a(Lvs/g2;)Lys/c;

    move-result-object p1

    iput-object p1, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/t;->H()Lvs/s2;

    move-result-object p0

    invoke-virtual {p0}, Lvs/s2;->D()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, v0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/k0;->l()Lys/d;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lys/c;)Lvs/g2;
    .locals 3

    sget-object v0, Lys/c;->c:Lys/c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lvs/g2;->y:Lvs/g2;

    return-object p0

    :cond_0
    sget-object v0, Lys/c;->d:Lys/c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lvs/g2;->E:Lvs/g2;

    return-object p0

    :cond_1
    sget-object v0, Lys/c;->e:Lys/c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lvs/g2;->F:Lvs/g2;

    return-object p0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to serialize HashType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lys/d;)Lvs/t;
    .locals 3

    invoke-static {}, Lvs/t;->I()Lvs/s;

    move-result-object v0

    iget-object v1, p0, Lys/d;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lvs/s;->g(I)V

    iget-object v1, p0, Lys/d;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lvs/s;->h(I)V

    iget-object v1, p0, Lys/d;->c:Lys/c;

    invoke-static {v1}, Lzs/b;->c(Lys/c;)Lvs/g2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/s;->i(Lvs/g2;)V

    invoke-static {}, Lvs/s2;->E()Lvs/r2;

    move-result-object v1

    iget-object v2, p0, Lys/d;->d:Lys/c;

    invoke-static {v2}, Lzs/b;->c(Lys/c;)Lvs/g2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/r2;->g(Lvs/g2;)V

    iget-object p0, p0, Lys/d;->e:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1, p0}, Lvs/r2;->h(I)V

    invoke-virtual {v0, v1}, Lvs/s;->j(Lvs/r2;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/t;

    return-object p0
.end method
