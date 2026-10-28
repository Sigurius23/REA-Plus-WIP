.class public final Lws/k;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lws/h;

.field public final c:Lct/a;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lws/h;Lct/a;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lws/k;->b:Lws/h;

    iput-object p2, p0, Lws/k;->c:Lct/a;

    iput-object p3, p0, Lws/k;->d:Lct/a;

    iput-object p4, p0, Lws/k;->e:Ljava/lang/Integer;

    return-void
.end method

.method public static Y(Lws/g;Lct/a;Ljava/lang/Integer;)Lws/k;
    .locals 5

    iget-object v0, p1, Lct/a;->a:[B

    new-instance v1, Lws/h;

    invoke-direct {v1, p0}, Lws/h;-><init>(Lws/g;)V

    sget-object v2, Lws/g;->e:Lws/g;

    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "For given Variant "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " the value of idRequirement must be non-null"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    array-length v3, v0

    const/16 v4, 0x20

    if-ne v3, v4, :cond_8

    new-instance v0, Lws/k;

    if-ne p0, v2, :cond_4

    sget-object p0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_3

    :cond_4
    sget-object v2, Lws/g;->c:Lws/g;

    if-eq p0, v2, :cond_7

    sget-object v2, Lws/g;->d:Lws/g;

    if-ne p0, v2, :cond_5

    goto :goto_2

    :cond_5
    sget-object v2, Lws/g;->b:Lws/g;

    if-ne p0, v2, :cond_6

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object p0

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unknown Variant: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object p0

    :goto_3
    invoke-direct {v0, v1, p1, p0, p2}, Lws/k;-><init>(Lws/h;Lct/a;Lct/a;Ljava/lang/Integer;)V

    return-object v0

    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Ed25519 key must be constructed with key of length 32 bytes, not "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p2, v0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final V()Lct/a;
    .locals 1

    iget-object v0, p0, Lws/k;->d:Lct/a;

    return-object v0
.end method

.method public final z()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lws/k;->e:Ljava/lang/Integer;

    return-object v0
.end method
