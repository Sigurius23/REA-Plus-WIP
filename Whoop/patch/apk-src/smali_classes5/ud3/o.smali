.class public final Lud3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lud3/t;

.field public static final c:Lud3/n;

.field public static final d:Ljava/util/LinkedHashMap;

.field public static final e:Lud3/o;

.field public static final f:Lud3/o;

.field public static final g:Lud3/o;

.field public static final h:Lud3/o;

.field public static final i:Lud3/o;

.field public static final j:Lud3/o;

.field public static final k:Lud3/o;

.field public static final l:Lud3/o;

.field public static final m:Lud3/o;

.field public static final n:Lud3/o;

.field public static final o:Lud3/o;

.field public static final p:Lud3/o;

.field public static final q:Lud3/o;

.field public static final r:Lud3/o;

.field public static final s:Lud3/o;

.field public static final t:Lud3/o;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lud3/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lud3/o;->b:Lud3/t;

    new-instance v1, Lud3/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lud3/o;->c:Lud3/n;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, Lud3/o;->d:Ljava/util/LinkedHashMap;

    const-string v1, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->e:Lud3/o;

    const-string v1, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->f:Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->g:Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->h:Lud3/o;

    const-string v1, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->i:Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_FALLBACK_SCSV"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->j:Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->k:Lud3/o;

    const-string v1, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->l:Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->m:Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->n:Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->o:Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->p:Lud3/o;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->q:Lud3/o;

    const-string v1, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->r:Lud3/o;

    const-string v1, "TLS_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->s:Lud3/o;

    const-string v1, "TLS_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    move-result-object v1

    sput-object v1, Lud3/o;->t:Lud3/o;

    const-string v1, "TLS_AES_128_CCM_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    const-string v1, "TLS_AES_128_CCM_8_SHA256"

    invoke-static {v0, v1}, Lud3/t;->a(Lud3/t;Ljava/lang/String;)Lud3/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/o;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lud3/o;->a:Ljava/lang/String;

    return-object v0
.end method
