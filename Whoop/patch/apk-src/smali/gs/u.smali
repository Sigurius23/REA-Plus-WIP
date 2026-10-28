.class public final Lgs/u;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lgs/w;

.field public final c:Lro/i;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lgs/w;Lro/i;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lgs/u;->b:Lgs/w;

    iput-object p2, p0, Lgs/u;->c:Lro/i;

    iput-object p3, p0, Lgs/u;->d:Lct/a;

    iput-object p4, p0, Lgs/u;->e:Ljava/lang/Integer;

    return-void
.end method

.method public static Y(Lgs/j;Lro/i;Ljava/lang/Integer;)Lgs/u;
    .locals 3

    sget-object v0, Lgs/j;->v:Lgs/j;

    if-eq p0, v0, :cond_1

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
    if-ne p0, v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lro/i;->E()I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_7

    new-instance v1, Lgs/w;

    invoke-direct {v1, p0}, Lgs/w;-><init>(Lgs/j;)V

    new-instance v2, Lgs/u;

    if-ne p0, v0, :cond_4

    sget-object p0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_2

    :cond_4
    sget-object v0, Lgs/j;->u:Lgs/j;

    if-ne p0, v0, :cond_5

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object p0

    goto :goto_2

    :cond_5
    sget-object v0, Lgs/j;->t:Lgs/j;

    if-ne p0, v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object p0

    :goto_2
    invoke-direct {v2, v1, p1, p0, p2}, Lgs/u;-><init>(Lgs/w;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v2

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
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lro/i;->E()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
