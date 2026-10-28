.class public final Lud3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:Lud3/e0;

.field public final b:Lud3/d0;

.field public final c:Ljava/lang/String;

.field public final d:Lud3/m0;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Lud3/d0;

.field public final h:Lud3/c0;

.field public final i:J

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "OkHttp-Sent-Millis"

    sput-object v0, Lud3/e;->k:Ljava/lang/String;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "OkHttp-Received-Millis"

    sput-object v0, Lud3/e;->l:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lne3/p0;)V
    .locals 11

    const-string v0, "Cache corruption for "

    const-string v1, "rawSource"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v1

    const-wide v2, 0x7fffffffffffffffL

    .line 3
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x0

    .line 4
    :try_start_1
    new-instance v6, Lcom/iterable/iterableapi/v;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lcom/iterable/iterableapi/v;-><init>(I)V

    invoke-virtual {v6, v5, v4}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-object v6, v5

    :goto_0
    if-eqz v6, :cond_7

    .line 5
    :try_start_2
    iput-object v6, p0, Lud3/e;->a:Lud3/e0;

    .line 6
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v0

    .line 7
    iput-object v0, p0, Lud3/e;->c:Ljava/lang/String;

    .line 8
    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-direct {v0, v4, v6}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    .line 9
    invoke-static {v1}, Lrg/a;->t(Lne3/j0;)I

    move-result v7

    move v8, v6

    :goto_1
    if-ge v8, v7, :cond_0

    .line 10
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v9

    .line 11
    invoke-virtual {v0, v9}, Lkotlin/jvm/internal/k0;->c(Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    .line 12
    :cond_0
    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v0

    iput-object v0, p0, Lud3/e;->b:Lud3/d0;

    .line 13
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {v0}, Landroidx/room/c1;->I(Ljava/lang/String;)Lae3/k;

    move-result-object v0

    .line 15
    iget-object v7, v0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v7, Lud3/m0;

    iput-object v7, p0, Lud3/e;->d:Lud3/m0;

    .line 16
    iget v7, v0, Lae3/k;->b:I

    iput v7, p0, Lud3/e;->e:I

    .line 17
    iget-object v0, v0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lud3/e;->f:Ljava/lang/String;

    .line 18
    new-instance v0, Lkotlin/jvm/internal/k0;

    invoke-direct {v0, v4, v6}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    .line 19
    invoke-static {v1}, Lrg/a;->t(Lne3/j0;)I

    move-result v4

    :goto_2
    if-ge v6, v4, :cond_1

    .line 20
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v7

    .line 21
    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/k0;->c(Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 22
    :cond_1
    sget-object v4, Lud3/e;->k:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/k0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 23
    sget-object v7, Lud3/e;->l:Ljava/lang/String;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/k0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 24
    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    const-wide/16 v9, 0x0

    if-eqz v6, :cond_2

    .line 26
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    goto :goto_3

    :cond_2
    move-wide v6, v9

    :goto_3
    iput-wide v6, p0, Lud3/e;->i:J

    if-eqz v8, :cond_3

    .line 27
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    :cond_3
    iput-wide v9, p0, Lud3/e;->j:J

    .line 28
    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v0

    iput-object v0, p0, Lud3/e;->g:Lud3/d0;

    .line 29
    iget-object v0, p0, Lud3/e;->a:Lud3/e0;

    invoke-virtual {v0}, Lud3/e0;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 30
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_5

    .line 32
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v0

    .line 33
    sget-object v4, Lud3/o;->b:Lud3/t;

    invoke-virtual {v4, v0}, Lud3/t;->c(Ljava/lang/String;)Lud3/o;

    move-result-object v0

    .line 34
    invoke-static {v1}, Lud3/e;->a(Lne3/j0;)Ljava/util/List;

    move-result-object v4

    .line 35
    invoke-static {v1}, Lud3/e;->a(Lne3/j0;)Ljava/util/List;

    move-result-object v5

    .line 36
    invoke-virtual {v1}, Lne3/j0;->o()Z

    move-result v6

    if-nez v6, :cond_4

    .line 37
    sget-object v6, Lud3/c1;->x:Lud3/t;

    .line 38
    invoke-virtual {v1, v2, v3}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lud3/t;->d(Ljava/lang/String;)Lud3/c1;

    move-result-object v1

    goto :goto_4

    .line 40
    :cond_4
    sget-object v1, Lud3/c1;->G:Lud3/c1;

    .line 41
    :goto_4
    invoke-static {v4}, Lwd3/h;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 42
    new-instance v3, Lud3/c0;

    invoke-static {v5}, Lwd3/h;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lm83/p;

    const/16 v6, 0xf

    invoke-direct {v5, v2, v6}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v3, v1, v0, v4, v5}, Lud3/c0;-><init>(Lud3/c1;Lud3/o;Ljava/util/List;Lc93/a;)V

    .line 43
    iput-object v3, p0, Lud3/e;->h:Lud3/c0;

    goto :goto_5

    .line 44
    :cond_5
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 45
    :cond_6
    iput-object v5, p0, Lud3/e;->h:Lud3/c0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :goto_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    .line 47
    :cond_7
    :try_start_3
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    .line 49
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    .line 50
    const-string v2, "cache corruption"

    const/4 v3, 0x5

    invoke-virtual {v0, v2, v3, v1}, Lfe3/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 51
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    :goto_6
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Lud3/x0;)V
    .locals 9

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iget-object v0, p1, Lud3/x0;->w:Lud3/o0;

    .line 55
    iget-object v1, v0, Lud3/o0;->a:Lud3/e0;

    .line 56
    iput-object v1, p0, Lud3/e;->a:Lud3/e0;

    .line 57
    iget-object v1, p1, Lud3/x0;->I:Lud3/x0;

    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 59
    iget-object v1, v1, Lud3/x0;->w:Lud3/o0;

    .line 60
    iget-object v1, v1, Lud3/o0;->c:Lud3/d0;

    .line 61
    iget-object v2, p1, Lud3/x0;->F:Lud3/d0;

    .line 62
    invoke-static {v2}, Lrg/a;->u(Lud3/d0;)Ljava/util/Set;

    move-result-object v3

    .line 63
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lud3/d0;->x:Lud3/d0;

    goto :goto_1

    .line 64
    :cond_0
    new-instance v4, Lkotlin/jvm/internal/k0;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    .line 65
    invoke-virtual {v1}, Lud3/d0;->size()I

    move-result v5

    :goto_0
    if-ge v6, v5, :cond_2

    .line 66
    invoke-virtual {v1, v6}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v7

    .line 67
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 68
    invoke-virtual {v1, v6}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v4}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v1

    .line 70
    :goto_1
    iput-object v1, p0, Lud3/e;->b:Lud3/d0;

    .line 71
    iget-object v0, v0, Lud3/o0;->b:Ljava/lang/String;

    .line 72
    iput-object v0, p0, Lud3/e;->c:Ljava/lang/String;

    .line 73
    iget-object v0, p1, Lud3/x0;->x:Lud3/m0;

    .line 74
    iput-object v0, p0, Lud3/e;->d:Lud3/m0;

    .line 75
    iget v0, p1, Lud3/x0;->z:I

    .line 76
    iput v0, p0, Lud3/e;->e:I

    .line 77
    iget-object v0, p1, Lud3/x0;->y:Ljava/lang/String;

    .line 78
    iput-object v0, p0, Lud3/e;->f:Ljava/lang/String;

    .line 79
    iput-object v2, p0, Lud3/e;->g:Lud3/d0;

    .line 80
    iget-object v0, p1, Lud3/x0;->E:Lud3/c0;

    .line 81
    iput-object v0, p0, Lud3/e;->h:Lud3/c0;

    .line 82
    iget-wide v0, p1, Lud3/x0;->L:J

    .line 83
    iput-wide v0, p0, Lud3/e;->i:J

    .line 84
    iget-wide v0, p1, Lud3/x0;->M:J

    .line 85
    iput-wide v0, p0, Lud3/e;->j:J

    return-void
.end method

.method public static a(Lne3/j0;)Ljava/util/List;
    .locals 7

    invoke-static {p0}, Lrg/a;->t(Lne3/j0;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    :try_start_0
    const-string v1, "X.509"

    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    const-wide v4, 0x7fffffffffffffffL

    invoke-virtual {p0, v4, v5}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lne3/h;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v6, Lne3/l;->z:Lne3/k;

    invoke-static {v4}, Lne3/a;->a(Ljava/lang/String;)[B

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v6, Lne3/l;

    invoke-direct {v6, v4}, Lne3/l;-><init>([B)V

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_2

    invoke-virtual {v5, v6}, Lne3/h;->l1(Lne3/l;)V

    new-instance v4, Lne3/g;

    invoke-direct {v4, v5}, Lne3/g;-><init>(Lne3/h;)V

    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Corrupt certificate in cache entry"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object v2

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Lne3/h0;Ljava/util/List;)V
    .locals 3

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lne3/h0;->h0(J)Lne3/i;

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v1

    sget-object v2, Lne3/l;->z:Lne3/k;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const v2, -0x499602d2

    invoke-static {v2, v1}, Lne3/k;->c(I[B)Lne3/l;

    move-result-object v1

    iget-object v1, v1, Lne3/l;->w:[B

    invoke-static {v1}, Lne3/a;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p0, v0}, Lne3/h0;->writeByte(I)Lne3/i;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(Lb9/b;)V
    .locals 11

    iget-object v0, p0, Lud3/e;->a:Lud3/e0;

    iget-object v1, p0, Lud3/e;->h:Lud3/c0;

    iget-object v2, p0, Lud3/e;->g:Lud3/d0;

    iget-object v3, p0, Lud3/e;->b:Lud3/d0;

    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Lb9/b;->s(I)Lne3/n0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    :try_start_0
    iget-object v5, v0, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {p1, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 v5, 0xa

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v6, p0, Lud3/e;->c:Ljava/lang/String;

    invoke-virtual {p1, v6}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v3}, Lud3/d0;->size()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {p1, v6, v7}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v3}, Lud3/d0;->size()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v7, v4

    :goto_0
    const-string v8, ": "

    if-ge v7, v6, :cond_0

    :try_start_1
    invoke-virtual {v3, v7}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1, v9}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v8}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v3, v7}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v8}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    invoke-interface {p1, v5}, Lne3/i;->writeByte(I)Lne3/i;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    iget-object v3, p0, Lud3/e;->d:Lud3/m0;

    iget v6, p0, Lud3/e;->e:I

    iget-object v7, p0, Lud3/e;->f:Ljava/lang/String;

    const-string v9, "protocol"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "message"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lud3/m0;->y:Lud3/m0;

    if-ne v3, v10, :cond_1

    const-string v3, "HTTP/1.0"

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, "HTTP/1.1"

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const/16 v3, 0x20

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v2}, Lud3/d0;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    int-to-long v6, v3

    invoke-virtual {p1, v6, v7}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v2}, Lud3/d0;->size()I

    move-result v3

    :goto_2
    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v4}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v8}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v2, v4}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v6}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    invoke-interface {p1, v5}, Lne3/i;->writeByte(I)Lne3/i;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    sget-object v2, Lud3/e;->k:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v8}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-wide v2, p0, Lud3/e;->i:J

    invoke-interface {p1, v2, v3}, Lne3/i;->h0(J)Lne3/i;

    invoke-interface {p1, v5}, Lne3/i;->writeByte(I)Lne3/i;

    sget-object v2, Lud3/e;->l:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v8}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-wide v2, p0, Lud3/e;->j:J

    invoke-interface {p1, v2, v3}, Lne3/i;->h0(J)Lne3/i;

    invoke-interface {p1, v5}, Lne3/i;->writeByte(I)Lne3/i;

    invoke-virtual {v0}, Lud3/e0;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v1, Lud3/c0;->b:Lud3/o;

    iget-object v0, v0, Lud3/o;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v1}, Lud3/c0;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lud3/e;->b(Lne3/h0;Ljava/util/List;)V

    iget-object v0, v1, Lud3/c0;->c:Ljava/util/List;

    invoke-static {p1, v0}, Lud3/e;->b(Lne3/h0;Ljava/util/List;)V

    iget-object v0, v1, Lud3/c0;->a:Lud3/c1;

    iget-object v0, v0, Lud3/c1;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    invoke-virtual {p1}, Lne3/h0;->close()V

    return-void

    :goto_3
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
