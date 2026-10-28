.class public final Lq30/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:J

.field public static final synthetic h:I


# instance fields
.field public final a:Lo30/d;

.field public final b:Ln30/d;

.field public final c:Lq83/j;

.field public final d:Lq30/w0;

.field public final e:Ljavax/crypto/SecretKey;

.field public final f:Lq/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lq30/t0;->g:J

    return-void
.end method

.method public constructor <init>(Lo30/d;Ljava/lang/String;Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ln30/d;Lo30/e;Lq83/j;Lq30/n;)V
    .locals 2

    new-instance v0, Lq30/w0;

    invoke-direct {v0, p5, p6, p8}, Lq30/w0;-><init>(Ljava/lang/String;Ln30/d;Lq83/j;)V

    const-string v1, "messageTransformer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "errorReporter"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "creqExecutorConfig"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sdkReferenceId"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "acsUrl"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "workContext"

    invoke-static {p8, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/t0;->a:Lo30/d;

    iput-object p6, p0, Lq30/t0;->b:Ln30/d;

    iput-object p8, p0, Lq30/t0;->c:Lq83/j;

    iput-object v0, p0, Lq30/t0;->d:Lq30/w0;

    invoke-virtual {p7, p4, p3, p2}, Lo30/e;->a(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object p2

    iput-object p2, p0, Lq30/t0;->e:Ljavax/crypto/SecretKey;

    new-instance p3, Lq/f;

    invoke-direct {p3, p1, p2, p6, p9}, Lq/f;-><init>(Lo30/d;Ljavax/crypto/SecretKey;Ln30/d;Lq30/n;)V

    iput-object p3, p0, Lq30/t0;->f:Lq/f;

    return-void
.end method

.method public static final a(Lq30/t0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lq30/t0;->a:Lo30/d;

    iget-object v0, v0, Lq30/t0;->e:Ljavax/crypto/SecretKey;

    check-cast v2, Lo30/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "secretKey"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "acsTransID"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lgw/i;->K:Lgw/i;

    sget-object v6, Lo30/b;->z:Lgw/f;

    iget-object v4, v5, Lgw/a;->w:Ljava/lang/String;

    sget-object v7, Lgw/a;->x:Lgw/a;

    iget-object v7, v7, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lgw/k;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v16, v3

    invoke-direct/range {v4 .. v30}, Lgw/k;-><init>(Lgw/a;Lgw/f;Lgw/h;Ljava/lang/String;Ljava/util/HashSet;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/lang/String;Lnw/d;Lgw/d;Lxw/b;Lxw/b;Lxw/b;ILxw/b;Lxw/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;Lxw/b;)V

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-byte v5, v2, Lo30/b;->x:B

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const-string v7, "%03d"

    invoke-static {v3, v7, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "sdkCounterStoA"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lgw/l;

    new-instance v5, Lgw/r;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1}, Lgw/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, v5}, Lgw/l;-><init>(Lgw/k;Lgw/r;)V

    new-instance v1, Lo30/g;

    const-string v5, "getEncryptionMethod(...)"

    iget-object v4, v4, Lgw/k;->O:Lgw/f;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    sget-object v5, Lgw/f;->I:Lgw/f;

    if-ne v5, v4, :cond_0

    iget v4, v5, Lgw/f;->y:I

    div-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    invoke-static {v0, v5, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_0
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v5, "AES"

    invoke-direct {v4, v0, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {v1, v4}, Ljw/c;-><init>(Ljavax/crypto/SecretKey;)V

    invoke-virtual {v3, v1}, Lgw/l;->b(Lgw/j;)V

    iget-byte v0, v2, Lo30/b;->x:B

    add-int/2addr v0, v6

    int-to-byte v0, v0

    iput-byte v0, v2, Lo30/b;->x:B

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Lgw/l;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "serialize(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SDK to ACS counter is zero"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The JWE algorithm \"alg\" cannot be \"none\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Lr30/b;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lq30/s0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq30/s0;

    iget v1, v0, Lq30/s0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq30/s0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq30/s0;

    invoke-direct {v0, p0, p2}, Lq30/s0;-><init>(Lq30/t0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lq30/s0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq30/s0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lq30/s0;->w:Lr30/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ln43/a;

    const/4 v2, 0x0

    const/16 v4, 0xb

    invoke-direct {p2, p0, p1, v2, v4}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lq30/s0;->w:Lr30/b;

    iput v3, v0, Lq30/s0;->z:I

    sget-wide v2, Lq30/t0;->g:J

    invoke-static {v2, v3, p2, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lq30/t;

    if-nez p2, :cond_4

    invoke-static {p1}, Lng3/n;->f(Lr30/b;)Lq30/s;

    move-result-object p1

    return-object p1

    :cond_4
    return-object p2
.end method
