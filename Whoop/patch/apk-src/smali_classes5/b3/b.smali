.class public abstract Lb3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe/j0;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 20
    new-array v0, v0, [I

    iput-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 16
    iget-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    new-instance v2, Lfr/n;

    .line 17
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lb3/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lev/i;Ljava/io/InputStream;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lb3/b;->c:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, Lb3/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lla/b;

    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Lla/b;-><init>(I)V

    .line 24
    iput-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    .line 25
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lb3/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm/a0;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwe/e;Lc93/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb3/b;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lb3/b;->c:Ljava/lang/Object;

    .line 4
    sget-object p2, Lwe/e;->x:Lwe/e;

    sget-object v0, Lwe/e;->y:Lwe/e;

    filled-new-array {p2, v0}, [Lwe/e;

    move-result-object p2

    .line 5
    invoke-static {p2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    .line 6
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "This class should only be used for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", got "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static o(III)F
    .locals 0

    sub-int/2addr p0, p1

    int-to-float p0, p0

    int-to-float p1, p2

    div-float/2addr p0, p1

    return p0
.end method

.method public static x([BLjava/nio/ByteBuffer;)[B
    .locals 5

    array-length v0, p0

    rem-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    array-length v0, p0

    goto :goto_0

    :cond_0
    array-length v0, p0

    add-int/lit8 v0, v0, 0x10

    array-length v1, p0

    rem-int/lit8 v1, v1, 0x10

    sub-int/2addr v0, v1

    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    rem-int/lit8 v2, v1, 0x10

    if-nez v2, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v1, 0x10

    sub-int/2addr v3, v2

    :goto_1
    add-int/2addr v3, v0

    add-int/lit8 v2, v3, 0x10

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    array-length p0, p0

    int-to-long p0, p0

    invoke-virtual {v2, p0, p1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    int-to-long p0, v1

    invoke-virtual {v2, p0, p1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(I)[B
    .locals 6

    iget-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    :try_start_0
    new-array v1, p1, [B

    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v2, p1, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "Unexpected end of stream"

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    sub-int v2, p1, v2

    :goto_0
    if-lez v2, :cond_2

    sub-int v5, p1, v2

    :try_start_1
    invoke-virtual {v0, v1, v5, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-eq v5, v4, :cond_1

    sub-int/2addr v2, v5

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    return-object v1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract B()V
.end method

.method public abstract C(I)[I
.end method

.method public abstract D(Lfr/c;)V
.end method

.method public abstract E()V
.end method

.method public abstract F()V
.end method

.method public abstract G()V
.end method

.method public H()V
    .locals 3

    invoke-virtual {p0}, Lb3/b;->h()V

    invoke-virtual {p0}, Lb3/b;->i()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v1, Ld9/e;

    if-nez v1, :cond_1

    new-instance v1, Ld9/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Ld9/e;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lb3/b;->b:Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v1, Lm/a0;

    iget-object v1, v1, Lm/a0;->K:Landroid/content/Context;

    iget-object v2, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v2, Ld9/e;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public abstract I()V
.end method

.method public J(Ljava/lang/String;Lwe/g;)Ljava/lang/String;
    .locals 4

    const-string v0, "canonicalRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v1, Lwe/e;

    iget-object v1, v1, Lwe/e;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p2, Lwe/g;->d:Lug/b;

    sget-object v3, Lug/t;->x:Lug/t;

    invoke-virtual {v2, v3}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ls3/d;->h(Lwe/g;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p0}, Lb3/b;->t()Lc93/a;

    move-result-object p2

    invoke-static {p1, p2}, Lse/h;->K([BLc93/a;)[B

    move-result-object p1

    invoke-static {p1}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract K()V
.end method

.method public abstract f()V
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, Lb50/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Ld9/e;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v1, Lm/a0;

    iget-object v1, v1, Lm/a0;->K:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public abstract i()Landroid/content/IntentFilter;
.end method

.method public j(J)[B
    .locals 5

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    long-to-int v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-wide/16 v2, 0x1000

    cmp-long v4, p1, v2

    if-lez v4, :cond_0

    move-wide p1, v2

    :cond_0
    long-to-int p1, p1

    new-array p2, p1, [B

    :goto_0
    if-lez v1, :cond_3

    :try_start_0
    iget-object v2, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v2, Ljava/io/InputStream;

    if-le v1, p1, :cond_1

    move v3, p1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v4, 0x0

    invoke-virtual {v2, p2, v4, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    invoke-virtual {v0, p2, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    sub-int/2addr v1, v2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance p2, Lco/nstant/in/cbor/CborException;

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lco/nstant/in/cbor/CborException;

    const-string p2, "Decoding fixed size items is limited to INTMAX"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(Ljava/nio/ByteBuffer;[B[B)[B
    .locals 4

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    new-array v2, v1, [B

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    const/4 v1, 0x0

    if-nez p3, :cond_0

    new-array p3, v1, [B

    :cond_0
    :try_start_0
    iget-object v3, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v3, Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v3, v1, p2}, Landroidx/glance/appwidget/protobuf/l;->d(I[B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/16 v3, 0x20

    new-array v3, v3, [B

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-static {p3, p1}, Lb3/b;->x([BLjava/nio/ByteBuffer;)[B

    move-result-object p3

    invoke-static {v3, p3}, Lse/a;->v([B[B)[B

    move-result-object p3

    invoke-static {p3, v2}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object p3, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast p3, Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p3, p2, v0, p1}, Landroidx/glance/appwidget/protobuf/l;->p([BLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1

    :cond_1
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Ljavax/crypto/AEADBadTagException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/crypto/AEADBadTagException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l(Ljava/nio/ByteBuffer;[B[B[B)V
    .locals 5

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    array-length v1, p3

    add-int/lit8 v1, v1, 0x10

    const-string v2, "Given ByteBuffer output is too small"

    if-lt v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget-object v1, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    array-length v4, p3

    if-lt v3, v4, :cond_1

    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {v1, p2, p1, p3}, Landroidx/glance/appwidget/protobuf/l;->p([BLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p3

    add-int/lit8 p3, p3, -0x10

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    const/4 p3, 0x0

    if-nez p4, :cond_0

    new-array p4, p3, [B

    :cond_0
    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/glance/appwidget/protobuf/l;

    invoke-virtual {v0, p3, p2}, Landroidx/glance/appwidget/protobuf/l;->d(I[B)Ljava/nio/ByteBuffer;

    move-result-object p2

    const/16 p3, 0x20

    new-array p3, p3, [B

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-static {p4, p1}, Lb3/b;->x([BLjava/nio/ByteBuffer;)[B

    move-result-object p2

    invoke-static {p3, p2}, Lse/a;->v([B[B)[B

    move-result-object p2

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p3

    add-int/lit8 p3, p3, 0x10

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    iget-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v1, Lb50/d;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v1, Lb50/d;

    invoke-direct {v1, p0}, Lb50/d;-><init>(Lb3/b;)V

    iput-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public abstract n(I)[I
.end method

.method public p(I)J
    .locals 16

    move-object/from16 v0, p0

    and-int/lit8 v1, p1, 0x1f

    const/4 v4, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    packed-switch v1, :pswitch_data_0

    move v9, v8

    goto :goto_0

    :pswitch_0
    const/4 v9, 0x7

    goto :goto_0

    :pswitch_1
    move v9, v4

    goto :goto_0

    :pswitch_2
    const/4 v9, 0x5

    goto :goto_0

    :pswitch_3
    move v9, v5

    goto :goto_0

    :pswitch_4
    move v9, v6

    goto :goto_0

    :pswitch_5
    move v9, v7

    :goto_0
    invoke-static {v9}, Le4/p;->e(I)I

    move-result v9

    if-eqz v9, :cond_5

    if-eq v9, v8, :cond_4

    const/4 v1, 0x0

    const/16 v10, 0x8

    if-eq v9, v7, :cond_3

    const/16 v11, 0x10

    const/16 v12, 0x18

    if-eq v9, v6, :cond_2

    if-eq v9, v5, :cond_1

    if-ne v9, v4, :cond_0

    const-wide/16 v1, -0x1

    return-wide v1

    :cond_0
    new-instance v1, Lco/nstant/in/cbor/CborException;

    const-string v2, "Reserved additional information"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-virtual {v0, v10}, Lb3/b;->A(I)[B

    move-result-object v9

    aget-byte v1, v9, v1

    and-int/lit16 v1, v1, 0xff

    int-to-long v13, v1

    const/16 v1, 0x38

    shl-long/2addr v13, v1

    aget-byte v1, v9, v8

    and-int/lit16 v1, v1, 0xff

    const/16 p1, 0x5

    const/4 v15, 0x7

    int-to-long v2, v1

    const/16 v1, 0x30

    shl-long v1, v2, v1

    or-long/2addr v1, v13

    aget-byte v3, v9, v7

    and-int/lit16 v3, v3, 0xff

    int-to-long v7, v3

    const/16 v3, 0x28

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    aget-byte v3, v9, v6

    and-int/lit16 v3, v3, 0xff

    int-to-long v6, v3

    const/16 v3, 0x20

    shl-long/2addr v6, v3

    or-long/2addr v1, v6

    aget-byte v3, v9, v5

    and-int/lit16 v3, v3, 0xff

    int-to-long v5, v3

    shl-long/2addr v5, v12

    or-long/2addr v1, v5

    aget-byte v3, v9, p1

    and-int/lit16 v3, v3, 0xff

    int-to-long v5, v3

    shl-long/2addr v5, v11

    or-long/2addr v1, v5

    aget-byte v3, v9, v4

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    shl-long/2addr v3, v10

    or-long/2addr v1, v3

    aget-byte v3, v9, v15

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    or-long/2addr v1, v3

    return-wide v1

    :cond_2
    invoke-virtual {v0, v5}, Lb3/b;->A(I)[B

    move-result-object v2

    aget-byte v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    int-to-long v3, v1

    shl-long/2addr v3, v12

    aget-byte v1, v2, v8

    and-int/lit16 v1, v1, 0xff

    int-to-long v8, v1

    shl-long/2addr v8, v11

    or-long/2addr v3, v8

    aget-byte v1, v2, v7

    and-int/lit16 v1, v1, 0xff

    int-to-long v7, v1

    shl-long/2addr v7, v10

    or-long/2addr v3, v7

    aget-byte v1, v2, v6

    and-int/lit16 v1, v1, 0xff

    int-to-long v1, v1

    or-long/2addr v1, v3

    return-wide v1

    :cond_3
    invoke-virtual {v0, v7}, Lb3/b;->A(I)[B

    move-result-object v2

    aget-byte v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/2addr v1, v10

    int-to-long v3, v1

    aget-byte v1, v2, v8

    and-int/lit16 v1, v1, 0xff

    int-to-long v1, v1

    or-long/2addr v1, v3

    return-wide v1

    :cond_4
    invoke-virtual {v0}, Lb3/b;->z()I

    move-result v1

    int-to-long v1, v1

    return-wide v1

    :cond_5
    int-to-long v1, v1

    return-wide v1

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(I)Ljava/math/BigInteger;
    .locals 14

    and-int/lit8 p1, p1, 0x1f

    const/4 v0, 0x5

    const/4 v1, 0x7

    const/4 v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    packed-switch p1, :pswitch_data_0

    move v7, v6

    goto :goto_0

    :pswitch_0
    move v7, v1

    goto :goto_0

    :pswitch_1
    move v7, v2

    goto :goto_0

    :pswitch_2
    move v7, v0

    goto :goto_0

    :pswitch_3
    move v7, v3

    goto :goto_0

    :pswitch_4
    move v7, v4

    goto :goto_0

    :pswitch_5
    move v7, v5

    :goto_0
    invoke-static {v7}, Le4/p;->e(I)I

    move-result v7

    if-eqz v7, :cond_5

    if-eq v7, v6, :cond_4

    const/4 p1, 0x0

    const/16 v8, 0x8

    if-eq v7, v5, :cond_3

    const/16 v9, 0x10

    const/16 v10, 0x18

    if-eq v7, v4, :cond_2

    if-eq v7, v3, :cond_1

    if-ne v7, v2, :cond_0

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lco/nstant/in/cbor/CborException;

    const-string v0, "Reserved additional information"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v7, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p0, v8}, Lb3/b;->A(I)[B

    move-result-object v11

    aget-byte v12, v11, p1

    and-int/lit16 v12, v12, 0xff

    int-to-long v12, v12

    invoke-static {v12, v13}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v12

    const/16 v13, 0x38

    invoke-virtual {v12, v13}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    aget-byte v6, v11, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v12, v6

    invoke-static {v12, v13}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v6

    const/16 v12, 0x30

    invoke-virtual {v6, v12}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    aget-byte v5, v11, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v12, v5

    invoke-static {v12, v13}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    const/16 v7, 0x28

    invoke-virtual {v5, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    aget-byte v4, v11, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v6, v4

    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    const/16 v6, 0x20

    invoke-virtual {v4, v6}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    aget-byte v3, v11, v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v5, v3

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    aget-byte v0, v11, v0

    and-int/lit16 v0, v0, 0xff

    int-to-long v4, v0

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    aget-byte v2, v11, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    aget-byte v1, v11, v1

    and-int/lit16 v1, v1, 0xff

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0, v3}, Lb3/b;->A(I)[B

    move-result-object v0

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    int-to-long v1, p1

    shl-long/2addr v1, v10

    aget-byte p1, v0, v6

    and-int/lit16 p1, p1, 0xff

    int-to-long v6, p1

    shl-long/2addr v6, v9

    or-long/2addr v1, v6

    aget-byte p1, v0, v5

    and-int/lit16 p1, p1, 0xff

    int-to-long v5, p1

    shl-long/2addr v5, v8

    or-long/2addr v1, v5

    aget-byte p1, v0, v4

    and-int/lit16 p1, p1, 0xff

    int-to-long v3, p1

    or-long v0, v1, v3

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p0, v5}, Lb3/b;->A(I)[B

    move-result-object v0

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    shl-int/2addr p1, v8

    int-to-long v1, p1

    aget-byte p1, v0, v6

    and-int/lit16 p1, p1, 0xff

    int-to-long v3, p1

    or-long v0, v1, v3

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lb3/b;->z()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_5
    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, Lx4/a;

    if-eqz v0, :cond_2

    check-cast p1, Lx4/a;

    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, La0/f1;

    if-nez v0, :cond_0

    new-instance v0, La0/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, La0/f1;

    invoke-virtual {v0, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, Lr/s;

    iget-object v1, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lr/s;-><init>(Landroid/content/Context;Lx4/a;)V

    iget-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v1, La0/f1;

    invoke-virtual {v1, p1, v0}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public s(II)[I
    .locals 2

    if-ltz p1, :cond_1

    if-ltz p2, :cond_1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract t()Lc93/a;
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "text"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb3/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public abstract w()V
.end method

.method public abstract y(I[B)Landroidx/glance/appwidget/protobuf/l;
.end method

.method public z()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Lco/nstant/in/cbor/CborException;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
