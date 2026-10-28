.class public final Landroidx/health/platform/client/proto/y1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Landroidx/health/platform/client/proto/y1;


# instance fields
.field public final a:Landroidx/health/platform/client/proto/g1;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/health/platform/client/proto/y1;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/y1;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/y1;->c:Landroidx/health/platform/client/proto/y1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Landroidx/health/platform/client/proto/y1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Landroidx/health/platform/client/proto/g1;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/g1;-><init>()V

    iput-object v0, p0, Landroidx/health/platform/client/proto/y1;->a:Landroidx/health/platform/client/proto/g1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/u2;
    .locals 9

    sget-object v0, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_b

    iget-object v0, p0, Landroidx/health/platform/client/proto/y1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/u2;

    if-nez v1, :cond_a

    iget-object v1, p0, Landroidx/health/platform/client/proto/y1;->a:Landroidx/health/platform/client/proto/g1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    const-class v2, Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

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
    iget-object v1, v1, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v1, Landroidx/health/platform/client/proto/f1;

    invoke-virtual {v1, p1}, Landroidx/health/platform/client/proto/f1;->a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/a2;

    move-result-object v3

    iget v1, v3, Landroidx/health/platform/client/proto/a2;->d:I

    iget-object v4, v3, Landroidx/health/platform/client/proto/a2;->a:Landroidx/health/platform/client/proto/a;

    const/4 v5, 0x2

    and-int/2addr v1, v5

    const-string v6, "Protobuf runtime is not correctly loaded."

    if-ne v1, v5, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Landroidx/health/platform/client/proto/v2;->d:Landroidx/health/platform/client/proto/f3;

    sget-object v2, Landroidx/health/platform/client/proto/n0;->a:Landroidx/health/platform/client/proto/m0;

    new-instance v3, Landroidx/health/platform/client/proto/p1;

    invoke-direct {v3, v1, v2, v4}, Landroidx/health/platform/client/proto/p1;-><init>(Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/a;)V

    goto :goto_1

    :cond_2
    sget-object v1, Landroidx/health/platform/client/proto/v2;->b:Landroidx/health/platform/client/proto/d3;

    sget-object v2, Landroidx/health/platform/client/proto/n0;->b:Landroidx/health/platform/client/proto/m0;

    if-eqz v2, :cond_3

    new-instance v3, Landroidx/health/platform/client/proto/p1;

    invoke-direct {v3, v1, v2, v4}, Landroidx/health/platform/client/proto/p1;-><init>(Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/a;)V

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

    iget v1, v3, Landroidx/health/platform/client/proto/a2;->d:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    sget-object v4, Landroidx/health/platform/client/proto/r1;->b:Landroidx/health/platform/client/proto/q1;

    sget-object v5, Landroidx/health/platform/client/proto/d1;->b:Landroidx/health/platform/client/proto/c1;

    sget-object v6, Landroidx/health/platform/client/proto/v2;->d:Landroidx/health/platform/client/proto/f3;

    sget-object v7, Landroidx/health/platform/client/proto/n0;->a:Landroidx/health/platform/client/proto/m0;

    sget-object v8, Landroidx/health/platform/client/proto/l1;->b:Landroidx/health/platform/client/proto/k1;

    invoke-static/range {v3 .. v8}, Landroidx/health/platform/client/proto/o1;->A(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;

    move-result-object v3

    goto :goto_1

    :cond_5
    sget-object v4, Landroidx/health/platform/client/proto/r1;->b:Landroidx/health/platform/client/proto/q1;

    sget-object v5, Landroidx/health/platform/client/proto/d1;->b:Landroidx/health/platform/client/proto/c1;

    sget-object v6, Landroidx/health/platform/client/proto/v2;->d:Landroidx/health/platform/client/proto/f3;

    const/4 v7, 0x0

    sget-object v8, Landroidx/health/platform/client/proto/l1;->b:Landroidx/health/platform/client/proto/k1;

    invoke-static/range {v3 .. v8}, Landroidx/health/platform/client/proto/o1;->A(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;

    move-result-object v3

    goto :goto_1

    :cond_6
    iget v1, v3, Landroidx/health/platform/client/proto/a2;->d:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    sget-object v4, Landroidx/health/platform/client/proto/r1;->a:Landroidx/health/platform/client/proto/q1;

    sget-object v5, Landroidx/health/platform/client/proto/d1;->a:Landroidx/health/platform/client/proto/b1;

    move-object v1, v6

    sget-object v6, Landroidx/health/platform/client/proto/v2;->b:Landroidx/health/platform/client/proto/d3;

    sget-object v7, Landroidx/health/platform/client/proto/n0;->b:Landroidx/health/platform/client/proto/m0;

    if-eqz v7, :cond_7

    sget-object v8, Landroidx/health/platform/client/proto/l1;->a:Landroidx/health/platform/client/proto/k1;

    invoke-static/range {v3 .. v8}, Landroidx/health/platform/client/proto/o1;->A(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;

    move-result-object v3

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    sget-object v4, Landroidx/health/platform/client/proto/r1;->a:Landroidx/health/platform/client/proto/q1;

    sget-object v5, Landroidx/health/platform/client/proto/d1;->a:Landroidx/health/platform/client/proto/b1;

    sget-object v6, Landroidx/health/platform/client/proto/v2;->c:Landroidx/health/platform/client/proto/d3;

    const/4 v7, 0x0

    sget-object v8, Landroidx/health/platform/client/proto/l1;->a:Landroidx/health/platform/client/proto/k1;

    invoke-static/range {v3 .. v8}, Landroidx/health/platform/client/proto/o1;->A(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/u2;

    if-eqz p1, :cond_9

    return-object p1

    :cond_9
    return-object v3

    :cond_a
    return-object v1

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "messageType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
