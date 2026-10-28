.class public final Low/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Low/i;

.field public static final k:Low/t;

.field public static final l:Low/u;


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Lf1/p1;

.field public final d:Lrw/q;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Z

.field public final h:Low/i;

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Low/i;->d:Low/i;

    sput-object v0, Low/m;->j:Low/i;

    sget-object v0, Low/x;->w:Low/t;

    sput-object v0, Low/m;->k:Low/t;

    sget-object v0, Low/x;->x:Low/u;

    sput-object v0, Low/m;->l:Low/u;

    return-void
.end method

.method public constructor <init>(Lqw/c;Low/a;Ljava/util/HashMap;ZZLow/i;IZILjava/util/ArrayList;Low/x;Low/x;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Low/m;->a:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Low/m;->b:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v0, p3

    move-object p3, p2

    new-instance p2, Lf1/p1;

    invoke-direct {p2, v0, p8, p13}, Lf1/p1;-><init>(Ljava/util/HashMap;ZLjava/util/ArrayList;)V

    iput-object p2, p0, Low/m;->c:Lf1/p1;

    iput-boolean p4, p0, Low/m;->f:Z

    iput-boolean p5, p0, Low/m;->g:Z

    iput-object p6, p0, Low/m;->h:Low/i;

    iput p7, p0, Low/m;->i:I

    new-instance p7, Ljava/util/ArrayList;

    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    sget-object p4, Lrw/s;->A:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Low/x;->w:Low/t;

    if-ne p11, p4, :cond_0

    sget-object p4, Lrw/j;->c:Lrw/h;

    goto :goto_0

    :cond_0
    new-instance p4, Lrw/h;

    const/4 p5, 0x1

    invoke-direct {p4, p11, p5}, Lrw/h;-><init>(Ljava/lang/Object;I)V

    :goto_0
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p7, p10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object p4, Lrw/s;->p:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->g:Lrw/r;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->d:Lrw/r;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->e:Lrw/r;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->f:Lrw/r;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p4, 0x1

    if-ne p9, p4, :cond_1

    sget-object p4, Lrw/s;->k:Lrw/g;

    goto :goto_1

    :cond_1
    new-instance p4, Low/j;

    const/4 p5, 0x2

    invoke-direct {p4, p5}, Low/j;-><init>(I)V

    :goto_1
    new-instance p5, Lrw/r;

    sget-object p6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class p8, Ljava/lang/Long;

    invoke-direct {p5, p6, p8, p4}, Lrw/r;-><init>(Ljava/lang/Class;Ljava/lang/Class;Low/z;)V

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Low/j;

    const/4 p6, 0x0

    invoke-direct {p5, p6}, Low/j;-><init>(I)V

    new-instance p6, Lrw/r;

    sget-object p8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class p9, Ljava/lang/Double;

    invoke-direct {p6, p8, p9, p5}, Lrw/r;-><init>(Ljava/lang/Class;Ljava/lang/Class;Low/z;)V

    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Low/j;

    const/4 p6, 0x1

    invoke-direct {p5, p6}, Low/j;-><init>(I)V

    new-instance p6, Lrw/r;

    sget-object p8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class p9, Ljava/lang/Float;

    invoke-direct {p6, p8, p9, p5}, Lrw/r;-><init>(Ljava/lang/Class;Ljava/lang/Class;Low/z;)V

    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Low/x;->x:Low/u;

    if-ne p12, p5, :cond_2

    sget-object p5, Lrw/i;->b:Lrw/h;

    goto :goto_2

    :cond_2
    new-instance p5, Lrw/i;

    invoke-direct {p5, p12}, Lrw/i;-><init>(Low/x;)V

    new-instance p6, Lrw/h;

    const/4 p8, 0x0

    invoke-direct {p6, p5, p8}, Lrw/h;-><init>(Ljava/lang/Object;I)V

    move-object p5, p6

    :goto_2
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lrw/s;->h:Lrw/q;

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lrw/s;->i:Lrw/q;

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Low/k;

    const/4 p6, 0x0

    invoke-direct {p5, p4, p6}, Low/k;-><init>(Low/z;I)V

    invoke-virtual {p5}, Low/z;->a()Low/y;

    move-result-object p5

    new-instance p6, Lrw/q;

    const/4 p8, 0x0

    const-class p9, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p6, p9, p5, p8}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Low/k;

    const/4 p6, 0x1

    invoke-direct {p5, p4, p6}, Low/k;-><init>(Low/z;I)V

    invoke-virtual {p5}, Low/z;->a()Low/y;

    move-result-object p4

    new-instance p5, Lrw/q;

    const/4 p6, 0x0

    const-class p8, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-direct {p5, p8, p4, p6}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->j:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->l:Lrw/r;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->q:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->r:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->m:Lrw/g;

    new-instance p5, Lrw/q;

    const-class p8, Ljava/math/BigDecimal;

    invoke-direct {p5, p8, p4, p6}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->n:Lrw/g;

    new-instance p5, Lrw/q;

    const-class p8, Ljava/math/BigInteger;

    invoke-direct {p5, p8, p4, p6}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->o:Lrw/g;

    new-instance p5, Lrw/q;

    const-class p8, Lqw/i;

    invoke-direct {p5, p8, p4, p6}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->s:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->t:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->v:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->w:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->y:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->u:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->b:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/b;->e:Lrw/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->x:Lrw/h;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean p4, Luw/c;->a:Z

    if-eqz p4, :cond_3

    sget-object p4, Luw/c;->e:Lrw/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Luw/c;->d:Lrw/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Luw/c;->f:Lrw/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object p4, Lrw/b;->d:Lrw/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->a:Lrw/q;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, Lrw/c;

    const/4 p5, 0x0

    invoke-direct {p4, p2, p5}, Lrw/c;-><init>(Lf1/p1;I)V

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, Lrw/c;

    const/4 p5, 0x1

    invoke-direct {p4, p2, p5}, Lrw/c;-><init>(Lf1/p1;I)V

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Lrw/q;

    invoke-direct {p5, p2}, Lrw/q;-><init>(Lf1/p1;)V

    iput-object p5, p0, Low/m;->d:Lrw/q;

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Lrw/s;->B:Lrw/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p4, p1

    new-instance p1, Lrw/p;

    move-object p6, p13

    invoke-direct/range {p1 .. p6}, Lrw/p;-><init>(Lf1/p1;Low/h;Lqw/c;Lrw/q;Ljava/util/ArrayList;)V

    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Low/m;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 9

    new-instance v0, Lvw/a;

    invoke-direct {v0, p2}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    new-instance p1, Lww/a;

    invoke-direct {p1, v1}, Lww/a;-><init>(Ljava/io/StringReader;)V

    const/4 v1, 0x2

    iget v2, p0, Low/m;->i:I

    if-nez v2, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-eqz v3, :cond_d

    iput v3, p1, Lww/a;->O:I

    const-string v4, "AssertionError (GSON 2.13.1): "

    const-string v5, "Type adapter \'"

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eqz v2, :cond_2

    iput v2, p1, Lww/a;->O:I

    goto :goto_1

    :cond_2
    throw p2

    :cond_3
    if-ne v3, v1, :cond_4

    iput v6, p1, Lww/a;->O:I

    :cond_4
    :goto_1
    :try_start_0
    invoke-virtual {p1}, Lww/a;->o0()I

    const/4 v6, 0x0

    invoke-virtual {p0, v0}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v1

    iget-object v0, v0, Lvw/a;->a:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Lqw/g;->l(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    if-eqz v2, :cond_6

    invoke-virtual {v7, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    new-instance v7, Ljava/lang/ClassCastException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' returned wrong type; requested "

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but got instance of "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\nVerify that the adapter was registered for the correct type."

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v7
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_b

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_6

    :cond_6
    :goto_2
    if-eqz v3, :cond_7

    iput v3, p1, Lww/a;->O:I

    move-object p2, v2

    goto :goto_7

    :cond_7
    throw p2

    :goto_3
    :try_start_1
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_4
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_5
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    if-eqz v6, :cond_b

    if-eqz v3, :cond_a

    iput v3, p1, Lww/a;->O:I

    :goto_7
    if-eqz p2, :cond_9

    :try_start_2
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result p1

    const/16 v0, 0xa

    if-ne p1, v0, :cond_8

    goto :goto_a

    :cond_8
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string p2, "JSON document was not fully consumed."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/nimbusds/jose/shaded/gson/stream/MalformedJsonException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    :catch_4
    move-exception p1

    goto :goto_8

    :catch_5
    move-exception p1

    goto :goto_9

    :goto_8
    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_9
    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_9
    :goto_a
    return-object p2

    :cond_a
    throw p2

    :cond_b
    :try_start_3
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_b
    if-eqz v3, :cond_c

    iput v3, p1, Lww/a;->O:I

    throw v0

    :cond_c
    throw p2

    :cond_d
    throw p2
.end method

.method public final c(Lvw/a;)Low/z;
    .locals 8

    iget-object v0, p0, Low/m;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Low/z;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Low/m;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Low/z;

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    new-instance v4, Low/l;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    iput-object v5, v4, Low/l;->a:Low/z;

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, p0, Low/m;->e:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Low/a0;

    invoke-interface {v5, p0, p1}, Low/a0;->a(Low/m;Lvw/a;)Low/z;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v6, v4, Low/l;->a:Low/z;

    if-nez v6, :cond_4

    iput-object v5, v4, Low/l;->a:Low/z;

    invoke-interface {v2, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Delegate is already set"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_6
    if-eqz v5, :cond_8

    if-eqz v3, :cond_7

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    :cond_7
    return-object v5

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GSON (2.13.1) cannot handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_9
    throw p1
.end method

.method public final d(Ljava/util/Map;Ljava/lang/Class;Lww/b;)V
    .locals 5

    const-string v0, "AssertionError (GSON 2.13.1): "

    new-instance v1, Lvw/a;

    invoke-direct {v1, p2}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p0, v1}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object p2

    iget v1, p3, Lww/b;->H:I

    iget v2, p0, Low/m;->i:I

    if-eqz v2, :cond_0

    invoke-virtual {p3, v2}, Lww/b;->J(I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    const/4 v2, 0x1

    iput v2, p3, Lww/b;->H:I

    :cond_1
    :goto_0
    iget-boolean v2, p3, Lww/b;->I:Z

    iget-boolean v3, p3, Lww/b;->K:Z

    iget-boolean v4, p0, Low/m;->g:Z

    iput-boolean v4, p3, Lww/b;->I:Z

    iget-boolean v4, p0, Low/m;->f:Z

    iput-boolean v4, p3, Lww/b;->K:Z

    :try_start_0
    invoke-virtual {p2, p3, p1}, Low/z;->c(Lww/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, v1}, Lww/b;->J(I)V

    iput-boolean v2, p3, Lww/b;->I:Z

    iput-boolean v3, p3, Lww/b;->K:Z

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p3, v1}, Lww/b;->J(I)V

    iput-boolean v2, p3, Lww/b;->I:Z

    iput-boolean v3, p3, Lww/b;->K:Z

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Low/m;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Low/m;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Low/m;->c:Lf1/p1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
