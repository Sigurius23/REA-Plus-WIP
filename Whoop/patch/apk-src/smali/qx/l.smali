.class public final Lqx/l;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# static fields
.field public static final d:Lqx/f;


# instance fields
.field public final a:Ltx/f;

.field public final b:[Lqx/k;

.field public final c:Lqx/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqx/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqx/f;-><init>(I)V

    sput-object v0, Lqx/l;->d:Lqx/f;

    return-void
.end method

.method public constructor <init>(Ltx/f;Ljava/util/TreeMap;)V
    .locals 1

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lqx/l;->a:Ltx/f;

    invoke-virtual {p2}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {p2}, Ljava/util/TreeMap;->size()I

    move-result v0

    new-array v0, v0, [Lqx/k;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lqx/k;

    iput-object p1, p0, Lqx/l;->b:[Lqx/k;

    invoke-virtual {p2}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p2}, Ljava/util/TreeMap;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object p1

    iput-object p1, p0, Lqx/l;->c:Lqx/v;

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lqx/l;->a:Ltx/f;

    invoke-virtual {v0}, Ltx/f;->U()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lqx/l;->c:Lqx/v;

    invoke-virtual {p1, v1}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b0()V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lqx/l;->b:[Lqx/k;

    aget-object v1, v2, v1

    invoke-virtual {v1, p1, v0}, Lqx/k;->a(Lcom/squareup/moshi/JsonReader;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :goto_1
    invoke-static {p1}, Lrx/f;->j(Ljava/lang/reflect/InvocationTargetException;)V

    const/4 p1, 0x0

    throw p1

    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    iget-object v0, p0, Lqx/l;->b:[Lqx/k;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, v3, Lqx/k;->a:Ljava/lang/String;

    invoke-virtual {p1, v4}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    invoke-virtual {v3, p1, p2}, Lqx/k;->b(Lqx/c0;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JsonAdapter("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lqx/l;->a:Ltx/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
