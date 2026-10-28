.class public final Lps/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lps/c;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    sget-object v0, Lps/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lps/c;->d(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lps/c;->b(Ljava/lang/String;)V

    const/4 p0, 0x1

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    monitor-exit v0

    return p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 3

    invoke-static {p0}, Lat/c0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "AES"

    const-string v1, "AndroidKeyStore"

    invoke-static {v0, v1}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v0

    new-instance v1, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/16 p0, 0x100

    invoke-virtual {v1, p0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p0

    const-string v1, "GCM"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p0

    const-string v1, "NoPadding"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    return-void
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 5

    invoke-static {p0}, Lat/c0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lps/c;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v2, "AndroidKeyStore"

    invoke-static {v2}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2, p0}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v2

    monitor-exit v1

    return v2

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Ljava/security/GeneralSecurityException;

    invoke-direct {v3, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :goto_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v2
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    const-string v1, "c"

    const-string v2, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    const-wide/high16 v3, 0x4044000000000000L    # 40.0

    mul-double/2addr v1, v3

    double-to-int v1, v1

    int-to-long v1, v1

    :try_start_4
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    sget-object v1, Lps/c;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_5
    const-string v2, "AndroidKeyStore"

    invoke-static {v2}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v2, p0}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p0

    monitor-exit v1

    return p0

    :catchall_1
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lps/b;
    .locals 4

    :try_start_0
    sget-object v0, Lps/c;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Lps/b;

    invoke-static {p1}, Lat/c0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lps/b;-><init>(Ljava/lang/String;)V

    const/16 p1, 0xa

    invoke-static {p1}, Lse/b;->W(I)[B

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [B

    invoke-virtual {v1, p1, v2}, Lps/b;->a([B[B)[B

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lps/b;->b([B[B)[B

    move-result-object v2

    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/KeyStoreException;

    const-string v1, "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"

    invoke-direct {p1, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
