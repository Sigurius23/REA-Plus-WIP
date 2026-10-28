.class public final Lcom/google/crypto/tink/shaded/protobuf/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/x0;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/k0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/x0;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/x0;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/x0;->c:Lcom/google/crypto/tink/shaded/protobuf/x0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/k0;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x0;->a:Lcom/google/crypto/tink/shaded/protobuf/k0;

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/x0;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/x0;->c:Lcom/google/crypto/tink/shaded/protobuf/x0;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 9

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez v1, :cond_a

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/x0;->a:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/b1;->a:Ljava/lang/Class;

    const-class v2, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/b1;->a:Ljava/lang/Class;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, v1, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/z0;

    move-result-object v3

    iget v1, v3, Lcom/google/crypto/tink/shaded/protobuf/z0;->d:I

    iget-object v4, v3, Lcom/google/crypto/tink/shaded/protobuf/z0;->a:Lcom/google/crypto/tink/shaded/protobuf/a;

    const/4 v5, 0x2

    and-int/2addr v1, v5

    const-string v6, "Protobuf runtime is not correctly loaded."

    if-ne v1, v5, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/b1;->c:Lcom/google/crypto/tink/shaded/protobuf/e1;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/r;->a:Lcom/google/crypto/tink/shaded/protobuf/q;

    new-instance v3, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-direct {v3, v1, v2, v4}, Lcom/google/crypto/tink/shaded/protobuf/s0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/a;)V

    goto/16 :goto_1

    :cond_2
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/b1;->b:Lcom/google/crypto/tink/shaded/protobuf/c1;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/r;->b:Lcom/google/crypto/tink/shaded/protobuf/q;

    if-eqz v2, :cond_3

    new-instance v3, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-direct {v3, v1, v2, v4}, Lcom/google/crypto/tink/shaded/protobuf/s0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/a;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z0;->a()I

    move-result v1

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    if-eq v1, v2, :cond_5

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/u0;->b:Lcom/google/crypto/tink/shaded/protobuf/t0;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/h0;->b:Lcom/google/crypto/tink/shaded/protobuf/g0;

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/b1;->c:Lcom/google/crypto/tink/shaded/protobuf/e1;

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/r;->a:Lcom/google/crypto/tink/shaded/protobuf/q;

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/n0;->b:Lcom/google/crypto/tink/shaded/protobuf/m0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->z(Lcom/google/crypto/tink/shaded/protobuf/z0;Lcom/google/crypto/tink/shaded/protobuf/t0;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/m0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v3

    goto :goto_1

    :cond_5
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/u0;->b:Lcom/google/crypto/tink/shaded/protobuf/t0;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/h0;->b:Lcom/google/crypto/tink/shaded/protobuf/g0;

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/b1;->c:Lcom/google/crypto/tink/shaded/protobuf/e1;

    const/4 v7, 0x0

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/n0;->b:Lcom/google/crypto/tink/shaded/protobuf/m0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->z(Lcom/google/crypto/tink/shaded/protobuf/z0;Lcom/google/crypto/tink/shaded/protobuf/t0;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/m0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v3

    goto :goto_1

    :cond_6
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z0;->a()I

    move-result v1

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    if-eq v1, v2, :cond_8

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/u0;->a:Lcom/google/crypto/tink/shaded/protobuf/t0;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/h0;->a:Lcom/google/crypto/tink/shaded/protobuf/f0;

    move-object v1, v6

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/b1;->b:Lcom/google/crypto/tink/shaded/protobuf/c1;

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/r;->b:Lcom/google/crypto/tink/shaded/protobuf/q;

    if-eqz v7, :cond_7

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/n0;->a:Lcom/google/crypto/tink/shaded/protobuf/m0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->z(Lcom/google/crypto/tink/shaded/protobuf/z0;Lcom/google/crypto/tink/shaded/protobuf/t0;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/m0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v3

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/u0;->a:Lcom/google/crypto/tink/shaded/protobuf/t0;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/h0;->a:Lcom/google/crypto/tink/shaded/protobuf/f0;

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/b1;->b:Lcom/google/crypto/tink/shaded/protobuf/c1;

    const/4 v7, 0x0

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/n0;->a:Lcom/google/crypto/tink/shaded/protobuf/m0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->z(Lcom/google/crypto/tink/shaded/protobuf/z0;Lcom/google/crypto/tink/shaded/protobuf/t0;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/m0;)Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-eqz p1, :cond_9

    return-object p1

    :cond_9
    return-object v3

    :cond_a
    return-object v1
.end method

.method public final c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x0;->b(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object p1

    return-object p1
.end method
