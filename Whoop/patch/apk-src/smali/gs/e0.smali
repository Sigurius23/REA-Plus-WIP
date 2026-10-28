.class public final Lgs/e0;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lgs/f0;

.field public final c:Lct/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lgs/f0;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lgs/e0;->b:Lgs/f0;

    iput-object p2, p0, Lgs/e0;->c:Lct/a;

    iput-object p3, p0, Lgs/e0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static Y(Lgs/f0;Ljava/lang/Integer;)Lgs/e0;
    .locals 2

    iget-object v0, p0, Lgs/f0;->a:Lgs/b0;

    sget-object v1, Lgs/b0;->l:Lgs/b0;

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object v1, Lgs/b0;->k:Lgs/b0;

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    :goto_0
    new-instance v1, Lgs/e0;

    invoke-direct {v1, p0, v0, p1}, Lgs/e0;-><init>(Lgs/f0;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant TINK the value of idRequirement must be non-null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unknown Variant: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
