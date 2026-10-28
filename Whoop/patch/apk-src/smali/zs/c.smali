.class public abstract Lzs/c;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    new-instance v1, Lzs/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lzs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/d0;

    const-class v3, Lys/g;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v2, Lzs/c;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v1, Lzs/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lzs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v2, Lzs/c;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v1, Lzs/a;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lzs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lys/e;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lzs/c;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lzs/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lzs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lzs/c;->d:Lcom/google/crypto/tink/internal/k;

    return-void
.end method

.method public static a(Lvs/l0;I)Lys/g;
    .locals 2

    invoke-static {}, Lys/g;->b()Lzt/q;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lzt/q;->x:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/l0;->E()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lzt/q;->y:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/l0;->C()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {p0}, Lvs/l0;->F()Lvs/g2;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    sget-object p0, Lys/c;->h:Lys/c;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to parse HashType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lvs/g2;->b()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p0, Lys/c;->g:Lys/c;

    goto :goto_0

    :cond_2
    sget-object p0, Lys/c;->f:Lys/c;

    :goto_0
    iput-object p0, v0, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Lzt/q;->p()Lys/g;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lys/g;)Lvs/l0;
    .locals 3

    invoke-static {}, Lvs/l0;->G()Lvs/k0;

    move-result-object v0

    iget-object v1, p0, Lys/g;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lvs/k0;->g(I)V

    iget-object v1, p0, Lys/g;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lvs/k0;->h(I)V

    iget-object p0, p0, Lys/g;->c:Lys/c;

    sget-object v1, Lys/c;->f:Lys/c;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lvs/g2;->y:Lvs/g2;

    goto :goto_0

    :cond_0
    sget-object v1, Lys/c;->g:Lys/c;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Lvs/g2;->E:Lvs/g2;

    goto :goto_0

    :cond_1
    sget-object v1, Lys/c;->h:Lys/c;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p0, Lvs/g2;->F:Lvs/g2;

    :goto_0
    invoke-virtual {v0, p0}, Lvs/k0;->i(Lvs/g2;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/l0;

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
