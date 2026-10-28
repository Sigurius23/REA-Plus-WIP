.class public final Lws/i;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lws/k;

.field public final c:Lro/i;


# direct methods
.method public constructor <init>(Lws/k;Lro/i;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lws/i;->b:Lws/k;

    iput-object p2, p0, Lws/i;->c:Lro/i;

    return-void
.end method

.method public static Y(Lws/k;Lro/i;)Lws/i;
    .locals 2

    invoke-virtual {p1}, Lro/i;->E()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lws/k;->c:Lct/a;

    invoke-virtual {v0}, Lct/a;->b()[B

    move-result-object v0

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v1}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->h([B)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->p([B)[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lws/i;

    invoke-direct {v0, p0, p1}, Lws/i;-><init>(Lws/k;Lro/i;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Ed25519 keys mismatch"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ed25519 key must be constructed with key of length 32 bytes, not "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lro/i;->E()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final X()Lgs/b;
    .locals 1

    iget-object v0, p0, Lws/i;->b:Lws/k;

    return-object v0
.end method
