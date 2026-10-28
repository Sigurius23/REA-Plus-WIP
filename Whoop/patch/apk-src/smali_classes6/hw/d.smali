.class public final Lhw/d;
.super Ljw/f;
.source "SourceFile"

# interfaces
.implements Lgw/q;


# instance fields
.field public final f:Lhm/d;


# direct methods
.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 1

    invoke-direct {p0, p1}, Ljw/f;-><init>(Ljavax/crypto/SecretKey;)V

    new-instance p1, Lhm/d;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Lhm/d;-><init>(I)V

    iput-object p1, p0, Lhw/d;->f:Lhm/d;

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v0, p1, Lhm/d;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Lgw/n;[BLxw/b;)Z
    .locals 7

    iget-object v0, p1, Lgw/c;->w:Lgw/a;

    check-cast v0, Lgw/m;

    const-string v1, "Unexpected state"

    iget-object v2, p0, Ljw/f;->d:Ljavax/crypto/SecretKey;

    if-eqz v2, :cond_c

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v3

    const/4 v4, 0x0

    sget-object v5, Ljw/f;->e:Ljava/util/Set;

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    sget-object v3, Lgw/m;->y:Lgw/m;

    invoke-virtual {v3, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x100

    goto :goto_0

    :cond_1
    sget-object v3, Lgw/m;->z:Lgw/m;

    invoke-virtual {v3, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x180

    goto :goto_0

    :cond_2
    sget-object v3, Lgw/m;->E:Lgw/m;

    invoke-virtual {v3, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const/16 v3, 0x200

    :goto_0
    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v6

    if-nez v6, :cond_3

    move v6, v4

    goto :goto_1

    :cond_3
    array-length v6, v6

    mul-int/lit8 v6, v6, 0x8

    :goto_1
    if-lt v6, v3, :cond_9

    :goto_2
    iget-object v0, p0, Lhw/d;->f:Lhm/d;

    invoke-virtual {v0, p1}, Lhm/d;->k(Lgw/c;)Z

    move-result v0

    if-nez v0, :cond_4

    return v4

    :cond_4
    iget-object p1, p1, Lgw/c;->w:Lgw/a;

    check-cast p1, Lgw/m;

    sget-object v0, Lgw/m;->y:Lgw/m;

    invoke-virtual {p1, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "HMACSHA256"

    goto :goto_3

    :cond_5
    sget-object v0, Lgw/m;->z:Lgw/m;

    invoke-virtual {p1, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p1, "HMACSHA384"

    goto :goto_3

    :cond_6
    sget-object v0, Lgw/m;->E:Lgw/m;

    invoke-virtual {p1, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string p1, "HMACSHA512"

    :goto_3
    if-eqz v2, :cond_7

    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, Lla/b;

    iget-object v0, v0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/security/Provider;

    invoke-static {p1, v2, p2, v0}, Ljw/e;->a(Ljava/lang/String;Ljavax/crypto/SecretKey;[BLjava/security/Provider;)[B

    move-result-object p1

    invoke-virtual {p3}, Lxw/a;->a()[B

    move-result-object p2

    invoke-static {p1, p2}, Lvd/f;->h([B[B)Z

    move-result p1

    return p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    invoke-static {p1, v5}, Ljw/e;->m(Lgw/m;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "The secret length for "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " must be at least "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " bits"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    invoke-static {v0, v5}, Ljw/e;->m(Lgw/m;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
