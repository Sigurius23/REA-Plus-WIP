.class public final Lat/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/q;


# direct methods
.method public static a(Lys/a;)Lat/a;
    .locals 2

    new-instance v0, Lat/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lih0/d0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lys/a;->c:Lro/i;

    iget-object p0, p0, Lys/a;->b:Lys/d;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    iget-object v1, p0, Lys/d;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lys/d;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lys/d;->f:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CTR-HMAC streaming in FIPS-mode."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lys/e;)Lat/a;
    .locals 3

    new-instance v0, Lat/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lys/e;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    iget-object p0, p0, Lys/e;->b:Lys/g;

    iget-object v1, p0, Lys/g;->c:Lys/c;

    sget-object v2, Lys/c;->f:Lys/c;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lys/c;->g:Lys/c;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lys/c;->h:Lys/c;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    iget-object v1, p0, Lys/g;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lys/g;->d:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unknown HKDF algorithm "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
