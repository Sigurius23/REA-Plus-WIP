.class public final Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;",
        "",
        "qt/e",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lne3/l;

.field public static final c:Ljava/util/List;

.field public static final d:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;


# instance fields
.field public final a:Lcom/google/crypto/tink/internal/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/16 v2, 0x2a

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    new-instance v2, Lne3/l;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Lne3/l;-><init>([B)V

    sput-object v2, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Lne3/l;

    const-string v0, "*"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:Ljava/util/List;

    new-instance v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    new-instance v1, Lcom/google/crypto/tink/internal/k0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/google/crypto/tink/internal/k0;-><init>(I)V

    invoke-direct {v0, v1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;-><init>(Lcom/google/crypto/tink/internal/k0;)V

    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/internal/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Lcom/google/crypto/tink/internal/k0;

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [C

    const/4 v2, 0x0

    const/16 v3, 0x2e

    aput-char v3, v1, v2

    const/4 v3, 0x6

    invoke-static {p0, v1, v2, v3}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p0}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    const-string v0, "domain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Lcom/google/crypto/tink/internal/k0;

    iget-object v2, v1, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    invoke-virtual {v2, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v5

    :goto_0
    :try_start_0
    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/k0;->L()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v3

    :try_start_1
    iput-object v3, v1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    if-eqz v2, :cond_2

    goto :goto_1

    :catch_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v2, v4

    goto :goto_0

    :goto_2
    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    throw p1

    :cond_1
    :try_start_2
    iget-object v2, v1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    :goto_3
    iget-object v2, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v2, Lne3/l;

    if-eqz v2, :cond_14

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v3, v2, [Lne3/l;

    move v6, v5

    :goto_4
    if-ge v6, v2, :cond_3

    sget-object v7, Lne3/l;->z:Lne3/k;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v7

    aput-object v7, v3, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_3
    move v6, v5

    :goto_5
    const-string v7, "bytes"

    const/4 v8, 0x0

    if-ge v6, v2, :cond_6

    iget-object v9, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v9, Lne3/l;

    if-eqz v9, :cond_5

    invoke-static {v9, v3, v6}, Lqt/e;->d(Lne3/l;[Lne3/l;I)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_6
    move-object v9, v8

    :goto_6
    if-le v2, v4, :cond_9

    invoke-virtual {v3}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lne3/l;

    array-length v10, v6

    sub-int/2addr v10, v4

    move v11, v5

    :goto_7
    if-ge v11, v10, :cond_9

    sget-object v12, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Lne3/l;

    aput-object v12, v6, v11

    iget-object v12, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v12, Lne3/l;

    if-eqz v12, :cond_8

    invoke-static {v12, v6, v11}, Lqt/e;->d(Lne3/l;[Lne3/l;I)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_9
    move-object v12, v8

    :goto_8
    if-eqz v12, :cond_c

    sub-int/2addr v2, v4

    move v6, v5

    :goto_9
    if-ge v6, v2, :cond_c

    iget-object v7, v1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v7, Lne3/l;

    if-eqz v7, :cond_b

    invoke-static {v7, v3, v6}, Lqt/e;->d(Lne3/l;[Lne3/l;I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_a

    goto :goto_a

    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_b
    const-string p1, "exceptionBytes"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_c
    move-object v7, v8

    :goto_a
    const/4 v1, 0x6

    const/16 v2, 0x2e

    if-eqz v7, :cond_d

    const-string v3, "!"

    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v6, v4, [C

    aput-char v2, v6, v5

    invoke-static {v3, v6, v5, v1}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v1

    goto :goto_c

    :cond_d
    if-nez v9, :cond_e

    if-nez v12, :cond_e

    sget-object v1, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:Ljava/util/List;

    goto :goto_c

    :cond_e
    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v9, :cond_f

    new-array v6, v4, [C

    aput-char v2, v6, v5

    invoke-static {v9, v6, v5, v1}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v6

    goto :goto_b

    :cond_f
    move-object v6, v3

    :goto_b
    if-eqz v12, :cond_10

    new-array v3, v4, [C

    aput-char v2, v3, v5

    invoke-static {v12, v3, v5, v1}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v3

    :cond_10
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    if-le v1, v2, :cond_11

    move-object v1, v6

    goto :goto_c

    :cond_11
    move-object v1, v3

    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/16 v6, 0x21

    if-ne v2, v3, :cond_12

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v6, :cond_12

    return-object v8

    :cond_12
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_13

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_d
    sub-int/2addr v0, v1

    goto :goto_e

    :cond_13
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v4

    goto :goto_d

    :goto_e
    invoke-static {p1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    invoke-static {p1, v0}, Lxb3/k;->q(Lxb3/i;I)Lxb3/i;

    move-result-object p1

    const-string v0, "."

    const/16 v1, 0x3e

    invoke-static {p1, v0, v8, v8, v1}, Lxb3/k;->y(Lxb3/i;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to load "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " resource."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1
.end method
