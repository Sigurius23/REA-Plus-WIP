.class public final Lo30/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String;


# instance fields
.field public final a:Ln30/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lo30/a;->x:[Lo30/a;

    const-string v0, "EC"

    sput-object v0, Lo30/f;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ln30/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo30/f;->a:Ln30/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/security/KeyPair;
    .locals 3

    :try_start_0
    sget-object v0, Lo30/f;->b:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    new-instance v1, Ljava/security/spec/ECGenParameterSpec;

    sget-object v2, Lnw/a;->y:Lnw/a;

    iget-object v2, v2, Lnw/a;->x:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lo30/f;->a:Ln30/c;

    invoke-virtual {v2, v1}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "getOrElse(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/security/KeyPair;

    return-object v0

    :cond_1
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
