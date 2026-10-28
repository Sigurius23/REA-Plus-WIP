.class public final Lo30/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Ln30/d;


# direct methods
.method public constructor <init>(Ln30/d;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo30/e;->w:Ln30/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 8

    const-string v0, "acsPublicKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agreementInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Lhm/d;

    const/16 v0, 0x17

    invoke-direct {v1, v0}, Lhm/d;-><init>(I)V

    invoke-static {p1, p2}, Ljw/e;->c(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v2

    const/4 p1, 0x0

    invoke-static {p1}, Lhm/d;->i([B)[B

    move-result-object v3

    invoke-static {p1}, Lhm/d;->i([B)[B

    move-result-object v4

    sget-object p1, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p3, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1}, Lxw/b;->c([B)Lxw/b;

    move-result-object p1

    invoke-virtual {p1}, Lxw/a;->a()[B

    move-result-object p1

    invoke-static {p1}, Lhm/d;->i([B)[B

    move-result-object v5

    const/16 p1, 0x100

    invoke-static {p1}, Ls2/a;->A(I)[B

    move-result-object v6

    const/4 p1, 0x0

    new-array v7, p1, [B

    invoke-virtual/range {v1 .. v7}, Lhm/d;->g(Ljavax/crypto/spec/SecretKeySpec;[B[B[B[B[B)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lo30/e;->w:Ln30/d;

    check-cast p3, Ln30/c;

    invoke-virtual {p3, p2}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_1

    check-cast p1, Ljavax/crypto/SecretKey;

    return-object p1

    :cond_1
    new-instance p1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {p1, p2}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
