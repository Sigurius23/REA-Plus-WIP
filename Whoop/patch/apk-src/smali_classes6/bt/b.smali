.class public final Lbt/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbt/c;


# static fields
.field public static final d:Lwe/o;


# instance fields
.field public final a:Lat/w;

.field public final b:[B

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/w;->w:Lat/w;

    sget-object v2, Lts/g;->c:Lts/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->x:Lat/w;

    sget-object v2, Lts/g;->d:Lts/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->y:Lat/w;

    sget-object v2, Lts/g;->e:Lts/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->z:Lat/w;

    sget-object v2, Lts/g;->f:Lts/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->E:Lat/w;

    sget-object v2, Lts/g;->g:Lts/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lbt/b;->d:Lwe/o;

    return-void
.end method

.method public constructor <init>(Lat/w;[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbt/b;->a:Lat/w;

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lbt/b;->b:[B

    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lbt/b;->c:[B

    return-void
.end method

.method public static a(Lat/w;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string p0, "HmacSha512"

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No getJavaxHmacName for given hash "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " known"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string p0, "HmacSha384"

    return-object p0

    :cond_2
    const-string p0, "HmacSha256"

    return-object p0

    :cond_3
    const-string p0, "HmacSha1"

    return-object p0
.end method

.method public static b(Lts/e;)Lbt/b;
    .locals 4

    iget-object v0, p0, Lts/e;->b:Lts/h;

    iget-object v1, v0, Lts/h;->c:Lct/a;

    new-instance v2, Lbt/b;

    sget-object v3, Lbt/b;->d:Lwe/o;

    iget-object v0, v0, Lts/h;->b:Lts/g;

    invoke-virtual {v3, v0}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/w;

    iget-object p0, p0, Lts/e;->c:Lro/i;

    iget-object p0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p0, Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [B

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    :goto_0
    invoke-direct {v2, v0, p0, v1}, Lbt/b;-><init>(Lat/w;[B[B)V

    return-object v2
.end method
