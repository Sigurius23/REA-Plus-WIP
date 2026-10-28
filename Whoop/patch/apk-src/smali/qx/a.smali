.class public final Lqx/a;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lqx/d;

.field public final synthetic b:Lcom/squareup/moshi/JsonAdapter;

.field public final synthetic c:Lqx/d;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lqx/d;Lcom/squareup/moshi/JsonAdapter;Lqx/l0;Lqx/d;Ljava/util/Set;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Lqx/a;->a:Lqx/d;

    iput-object p2, p0, Lqx/a;->b:Lcom/squareup/moshi/JsonAdapter;

    iput-object p4, p0, Lqx/a;->c:Lqx/d;

    iput-object p5, p0, Lqx/a;->d:Ljava/util/Set;

    iput-object p6, p0, Lqx/a;->e:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lqx/a;->c:Lqx/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lqx/a;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v1, v0, Lqx/d;->g:Z

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v1

    sget-object v2, Lqx/w;->I:Lqx/w;

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :try_start_0
    invoke-virtual {v0, p1}, Lqx/d;->b(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_2
    new-instance v1, Lcom/squareup/moshi/JsonDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " at "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lqx/a;->a:Lqx/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lqx/a;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v1, v0, Lqx/d;->g:Z

    if-nez v1, :cond_1

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lqx/c0;->J()Lqx/c0;

    return-void

    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lqx/d;->d(Lqx/c0;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of v0, p2, Ljava/io/IOException;

    if-eqz v0, :cond_2

    check-cast p2, Ljava/io/IOException;

    throw p2

    :cond_2
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JsonAdapter"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lqx/a;->d:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqx/a;->e:Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
