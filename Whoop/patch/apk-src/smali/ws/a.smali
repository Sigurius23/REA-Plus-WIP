.class public final Lws/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lws/a;

.field public static final d:Lws/a;

.field public static final e:Lws/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/security/spec/ECParameterSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lws/a;

    const-string v1, "NIST_P256"

    sget-object v2, Lcom/google/crypto/tink/internal/e;->a:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Lws/a;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Lws/a;->c:Lws/a;

    new-instance v0, Lws/a;

    const-string v1, "NIST_P384"

    sget-object v2, Lcom/google/crypto/tink/internal/e;->b:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Lws/a;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Lws/a;->d:Lws/a;

    new-instance v0, Lws/a;

    const-string v1, "NIST_P521"

    sget-object v2, Lcom/google/crypto/tink/internal/e;->c:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Lws/a;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Lws/a;->e:Lws/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lws/a;->b:Ljava/security/spec/ECParameterSpec;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lws/a;->a:Ljava/lang/String;

    return-object v0
.end method
