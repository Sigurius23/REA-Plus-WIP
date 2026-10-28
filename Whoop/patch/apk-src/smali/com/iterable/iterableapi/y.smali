.class public final Lcom/iterable/iterableapi/y;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lcom/iterable/iterableapi/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/iterable/iterableapi/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lcom/iterable/iterableapi/y;->w:Lcom/iterable/iterableapi/y;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "AndroidKeyStore"

    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    const-string v2, "IterableDataEncryptor"

    const-string v3, "Failed to initialize AndroidKeyStore"

    invoke-static {v2, v3, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    const-string v1, "PKCS12"

    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v1

    sget-object v2, Lcom/iterable/iterableapi/z;->a:[C

    invoke-virtual {v1, v0, v2}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    return-object v1
.end method
