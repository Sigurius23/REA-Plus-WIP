.class public abstract Lcom/google/crypto/tink/shaded/protobuf/x;
.super Lcom/google/crypto/tink/shaded/protobuf/a;
.source "SourceFile"


# static fields
.field private static final MEMOIZED_SERIALIZED_SIZE_MASK:I = 0x7fffffff

.field private static final MUTABLE_FLAG_MASK:I = -0x80000000

.field static final UNINITIALIZED_HASH_CODE:I = 0x0

.field static final UNINITIALIZED_SERIALIZED_SIZE:I = 0x7fffffff

.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private memoizedSerializedSize:I

.field protected unknownFields:Lcom/google/crypto/tink/shaded/protobuf/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/d1;->f:Lcom/google/crypto/tink/shaded/protobuf/d1;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/d1;

    return-void
.end method

.method public static h(Lcom/google/crypto/tink/shaded/protobuf/x;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->o(Lcom/google/crypto/tink/shaded/protobuf/x;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException;-><init>()V

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 3

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->l()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    return-object v0
.end method

.method public static varargs n(Ljava/lang/reflect/Method;Lcom/google/crypto/tink/shaded/protobuf/x;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final o(Lcom/google/crypto/tink/shaded/protobuf/x;Z)Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    if-ne v1, v0, :cond_0

    return v0

    :cond_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    :cond_2
    return v0
.end method

.method public static t(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 3

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/h;

    iget-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/h;->z:[B

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->j()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    const/4 v2, 0x1

    invoke-static {v0, v1, p1, v2}, Landroidx/datastore/preferences/protobuf/l;->f([BIIZ)Lcom/google/crypto/tink/shaded/protobuf/j;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/x;->v(Lcom/google/crypto/tink/shaded/protobuf/x;Landroidx/datastore/preferences/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/j;->a(I)V

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->h(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object p0
.end method

.method public static u(Lcom/google/crypto/tink/shaded/protobuf/x;[BLcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 6

    array-length v4, p1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->s()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    new-instance v5, Landroidx/health/platform/client/proto/d;

    invoke-direct {v5, p2}, Landroidx/health/platform/client/proto/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/p;)V

    const/4 v3, 0x0

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->g(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V

    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/x;->h(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object v1

    :catch_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->f()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :catch_1
    move-exception v0

    move-object p0, v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_0
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception v0

    move-object p0, v0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3
    move-exception v0

    move-object p0, v0

    iget-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->w:Z

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, p1

    :cond_1
    throw p0
.end method

.method public static v(Lcom/google/crypto/tink/shaded/protobuf/x;Landroidx/datastore/preferences/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->s()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->a(Landroidx/datastore/preferences/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->f(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_0
    throw p0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_1
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3
    move-exception p0

    iget-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->w:Z

    if-eqz p1, :cond_2

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, p1

    :cond_2
    throw p0
.end method

.method public static w(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->q()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/x;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->l()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/google/crypto/tink/shaded/protobuf/a1;)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->e(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->e(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_1

    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "serialized size must be non-negative, was "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int v2, v0, v1

    if-eq v2, v1, :cond_3

    and-int p1, v0, v1

    return p1

    :cond_3
    if-nez p1, :cond_4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->e(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-interface {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->e(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result p1

    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->x(I)V

    return p1
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->r()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->i(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/x;)Z

    move-result p1

    return p1
.end method

.method public final g(Lcom/google/crypto/tink/shaded/protobuf/m;)V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->a(Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->j(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->j(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result v0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    :cond_1
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method public final i()Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/v;

    return-object v0
.end method

.method public abstract j(I)Ljava/lang/Object;
.end method

.method public final l()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public final m()Lcom/google/crypto/tink/shaded/protobuf/v0;
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/v0;

    return-object v0
.end method

.method public final p()Z
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q()V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    return-void
.end method

.method public final r()Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/v;

    return-object v0
.end method

.method public final s()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->d(Lcom/google/crypto/tink/shaded/protobuf/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(I)V
    .locals 2

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->memoizedSerializedSize:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "serialized size must be non-negative, was "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y()Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/v;

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->f(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-object v0
.end method
