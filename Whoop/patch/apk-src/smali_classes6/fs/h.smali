.class public final Lfs/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvs/u3;

.field public final b:Ljava/util/List;

.field public final c:Lss/a;


# direct methods
.method public constructor <init>(Lvs/u3;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfs/h;->a:Lvs/u3;

    iput-object p2, p0, Lfs/h;->b:Ljava/util/List;

    sget-object p1, Lss/a;->b:Lss/a;

    iput-object p1, p0, Lfs/h;->c:Lss/a;

    return-void
.end method

.method public static final a(Lvs/u3;)Lfs/h;
    .locals 6

    invoke-virtual {p0}, Lvs/u3;->C()I

    move-result v0

    if-lez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lvs/u3;->C()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lvs/u3;->D()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvs/t3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-static {v2}, Lfs/h;->d(Lvs/t3;)Lts/o;

    move-result-object v3

    new-instance v4, Lfs/g;

    invoke-virtual {v2}, Lvs/t3;->G()Lvs/n3;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_1

    const/4 v5, 0x3

    if-ne v2, v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/security/GeneralSecurityException;

    const-string v3, "Unknown key status"

    invoke-direct {v2, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_1
    invoke-direct {v4, v3}, Lfs/g;-><init>(Lts/o;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lfs/h;

    invoke-direct {v1, p0, v0}, Lfs/h;-><init>(Lvs/u3;Ljava/util/List;)V

    return-object v1

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Lfs/f;Lps/b;)Lfs/h;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [B

    iget-object p0, p0, Lfs/f;->b:Ljava/lang/Object;

    check-cast p0, Ljava/io/ByteArrayInputStream;

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {p0, v1}, Lvs/f2;->D(Ljava/io/ByteArrayInputStream;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/f2;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    invoke-virtual {v1}, Lvs/f2;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p0

    const-string v2, "empty keyset"

    if-eqz p0, :cond_1

    :try_start_1
    invoke-virtual {v1}, Lvs/f2;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p0

    invoke-virtual {p1, p0, v0}, Lps/b;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object p1

    invoke-static {p0, p1}, Lvs/u3;->H([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvs/u3;

    move-result-object p0

    invoke-virtual {p0}, Lvs/u3;->C()I

    move-result p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    if-lez p1, :cond_0

    invoke-static {p0}, Lfs/h;->a(Lvs/u3;)Lfs/h;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    throw p1
.end method

.method public static d(Lvs/t3;)Lts/o;
    .locals 5

    invoke-virtual {p0}, Lvs/t3;->E()I

    move-result v0

    invoke-virtual {p0}, Lvs/t3;->F()Lvs/h4;

    move-result-object v1

    sget-object v2, Lvs/h4;->E:Lvs/h4;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lvs/t3;->D()Lvs/m3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lvs/t3;->D()Lvs/m3;

    move-result-object v2

    invoke-virtual {v2}, Lvs/m3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {p0}, Lvs/t3;->D()Lvs/m3;

    move-result-object v3

    invoke-virtual {v3}, Lvs/m3;->D()Lvs/l3;

    move-result-object v3

    invoke-virtual {p0}, Lvs/t3;->F()Lvs/h4;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    iget-object v1, v0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/q0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcom/google/crypto/tink/internal/o0;

    iget-object v3, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v3, Lct/a;

    const-class v4, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v2, v4, v3}, Lcom/google/crypto/tink/internal/o0;-><init>(Ljava/lang/Class;Lct/a;)V

    iget-object v1, v1, Lcom/google/crypto/tink/internal/q0;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/google/crypto/tink/internal/q;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/internal/q;-><init>(Lcom/google/crypto/tink/internal/k0;)V

    return-object v0

    :cond_1
    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/internal/z;->a(Lcom/google/crypto/tink/internal/k0;)Lts/o;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/crypto/tink/internal/TinkBugException;

    const-string v1, "Creating a protokey serialization failed"

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 14

    sget v0, Lfs/o;->a:I

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/y;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    const-string v2, "No wrapper found for "

    if-eqz v1, :cond_13

    sget v3, Lfs/r;->a:I

    iget-object v3, p0, Lfs/h;->a:Lvs/u3;

    invoke-virtual {v3}, Lvs/u3;->E()I

    move-result v4

    invoke-virtual {v3}, Lvs/u3;->D()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    move v8, v6

    move v9, v8

    move v10, v7

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    sget-object v12, Lvs/n3;->y:Lvs/n3;

    if-eqz v11, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lvs/t3;

    invoke-virtual {v11}, Lvs/t3;->G()Lvs/n3;

    move-result-object v13

    if-eq v13, v12, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v11}, Lvs/t3;->H()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-virtual {v11}, Lvs/t3;->F()Lvs/h4;

    move-result-object v12

    sget-object v13, Lvs/h4;->x:Lvs/h4;

    if-eq v12, v13, :cond_5

    invoke-virtual {v11}, Lvs/t3;->G()Lvs/n3;

    move-result-object v12

    sget-object v13, Lvs/n3;->x:Lvs/n3;

    if-eq v12, v13, :cond_4

    invoke-virtual {v11}, Lvs/t3;->E()I

    move-result v12

    if-ne v12, v4, :cond_2

    if-nez v9, :cond_1

    move v9, v7

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset contains multiple primary keys"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_2
    invoke-virtual {v11}, Lvs/t3;->D()Lvs/m3;

    move-result-object v11

    invoke-virtual {v11}, Lvs/m3;->D()Lvs/l3;

    move-result-object v11

    sget-object v12, Lvs/l3;->E:Lvs/l3;

    if-eq v11, v12, :cond_3

    move v10, v6

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v11}, Lvs/t3;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "key %d has unknown status"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v11}, Lvs/t3;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "key %d has unknown prefix"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v11}, Lvs/t3;->E()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "key %d has no key data"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-eqz v8, :cond_12

    if-nez v9, :cond_9

    if-eqz v10, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_3
    new-instance v4, Lb30/m;

    invoke-direct {v4, v1}, Lb30/m;-><init>(Ljava/lang/Class;)V

    iget-object v5, v4, Lb30/m;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    if-eqz v5, :cond_11

    iget-object v5, p0, Lfs/h;->c:Lss/a;

    iput-object v5, v4, Lb30/m;->F:Ljava/lang/Object;

    move v5, v6

    :goto_4
    iget-object v8, p0, Lfs/h;->b:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ge v5, v9, :cond_d

    invoke-virtual {v3, v5}, Lvs/u3;->B(I)Lvs/t3;

    move-result-object v9

    invoke-virtual {v9}, Lvs/t3;->G()Lvs/n3;

    move-result-object v10

    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lfs/g;

    if-eqz v8, :cond_b

    iget-object v8, v8, Lfs/g;->a:Lts/o;

    :try_start_1
    sget-object v10, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    invoke-virtual {v10, v8, v1}, Lcom/google/crypto/tink/internal/y;->b(Lts/o;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v9}, Lvs/t3;->E()I

    move-result v10

    invoke-virtual {v3}, Lvs/u3;->E()I

    move-result v11

    if-ne v10, v11, :cond_a

    invoke-virtual {v4, v8, v9, v7}, Lb30/m;->k(Ljava/lang/Object;Lvs/t3;Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {v4, v8, v9, v6}, Lb30/m;->k(Ljava/lang/Object;Lvs/t3;Z)V

    goto :goto_5

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to get primitive "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for key of type "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Lvs/t3;->D()Lvs/m3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", see https://developers.google.com/tink/faq/registration_errors"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key parsing of key with index "

    const-string v1, " and type_url "

    invoke-static {v5, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lvs/t3;->D()Lvs/m3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " failed, unable to get primitive"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_4

    :cond_d
    iget-object v1, v4, Lb30/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    if-eqz v1, :cond_10

    new-instance v3, La33/d;

    iget-object v5, v4, Lb30/m;->E:Ljava/lang/Object;

    check-cast v5, Lcom/google/crypto/tink/internal/j0;

    iget-object v6, v4, Lb30/m;->F:Ljava/lang/Object;

    check-cast v6, Lss/a;

    iget-object v7, v4, Lb30/m;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Class;

    invoke-direct {v3, v1, v5, v6, v7}, La33/d;-><init>(Ljava/util/Map;Lcom/google/crypto/tink/internal/j0;Lss/a;Ljava/lang/Class;)V

    iput-object v0, v4, Lb30/m;->y:Ljava/lang/Object;

    sget v0, Lfs/o;->a:I

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/i0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/i0;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfs/l;

    invoke-interface {p1}, Lfs/l;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Lfs/l;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1, v3}, Lfs/l;->c(La33/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Input primitive type of the wrapper doesn\'t match the type of primitives in the provided PrimitiveSet"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p1, v2}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "build cannot be called twice"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lqg3/d;Lps/b;)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iget-object v2, p0, Lfs/h;->a:Lvs/u3;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object v3

    invoke-virtual {p2, v3, v1}, Lps/b;->a([B[B)[B

    move-result-object v3

    :try_start_0
    invoke-virtual {p2, v3, v1}, Lps/b;->b([B[B)[B

    move-result-object p2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {p2, v1}, Lvs/u3;->H([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvs/u3;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/x;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_1

    invoke-static {}, Lvs/f2;->C()Lvs/e2;

    move-result-object p2

    array-length v1, v3

    invoke-static {v3, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v1, Lvs/f2;

    invoke-static {v1, v0}, Lvs/f2;->z(Lvs/f2;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-static {v2}, Lfs/r;->a(Lvs/u3;)Lvs/y3;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v1, Lvs/f2;

    invoke-static {v1, v0}, Lvs/f2;->A(Lvs/f2;Lvs/y3;)V

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p2

    check-cast p2, Lvs/f2;

    iget-object v0, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences$Editor;

    iget-object p1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object p2

    invoke-static {p2}, Lse/a;->K([B)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to write to SharedPreferences"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "cannot encrypt keyset"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid keyset, corrupted key material"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfs/h;->a:Lvs/u3;

    invoke-static {v0}, Lfs/r;->a(Lvs/u3;)Lvs/y3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
