.class public abstract Lus/b;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.HkdfPrfKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    new-instance v1, Lts/b;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/d0;

    const-class v3, Lts/h;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v2, Lus/b;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v1, Lts/b;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v2, Lus/b;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v1, Lts/b;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lts/e;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lus/b;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lts/b;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lus/b;->d:Lcom/google/crypto/tink/internal/k;

    return-void
.end method

.method public static a(Lts/h;)Lvs/m2;
    .locals 3

    invoke-static {}, Lvs/m2;->E()Lvs/l2;

    move-result-object v0

    iget-object v1, p0, Lts/h;->b:Lts/g;

    sget-object v2, Lts/g;->c:Lts/g;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Lvs/g2;->y:Lvs/g2;

    goto :goto_0

    :cond_0
    sget-object v2, Lts/g;->d:Lts/g;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Lvs/g2;->G:Lvs/g2;

    goto :goto_0

    :cond_1
    sget-object v2, Lts/g;->e:Lts/g;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v1, Lvs/g2;->E:Lvs/g2;

    goto :goto_0

    :cond_2
    sget-object v2, Lts/g;->f:Lts/g;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, Lvs/g2;->z:Lvs/g2;

    goto :goto_0

    :cond_3
    sget-object v2, Lts/g;->g:Lts/g;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v1, Lvs/g2;->F:Lvs/g2;

    :goto_0
    invoke-virtual {v0, v1}, Lvs/l2;->g(Lvs/g2;)V

    iget-object p0, p0, Lts/h;->c:Lct/a;

    if-eqz p0, :cond_4

    iget-object v1, p0, Lct/a;->a:[B

    array-length v1, v1

    if-lez v1, :cond_4

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    const/4 v1, 0x0

    array-length v2, p0

    invoke-static {p0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvs/l2;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    :cond_4
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/m2;

    return-object p0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to serialize HashType "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lvs/g2;)Lts/g;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object p0, Lts/g;->d:Lts/g;

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
    sget-object p0, Lts/g;->g:Lts/g;

    return-object p0

    :cond_2
    sget-object p0, Lts/g;->e:Lts/g;

    return-object p0

    :cond_3
    sget-object p0, Lts/g;->f:Lts/g;

    return-object p0

    :cond_4
    sget-object p0, Lts/g;->c:Lts/g;

    return-object p0
.end method
