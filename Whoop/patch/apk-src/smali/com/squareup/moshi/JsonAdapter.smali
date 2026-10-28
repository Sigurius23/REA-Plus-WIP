.class public abstract Lcom/squareup/moshi/JsonAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final failOnUnknown()Lcom/squareup/moshi/JsonAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqx/r;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lqx/r;-><init>(Lcom/squareup/moshi/JsonAdapter;I)V

    return-object v0
.end method

.method public abstract fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
.end method

.method public final fromJson(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lne3/h;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lne3/h;->u1(Ljava/lang/String;)V

    .line 4
    new-instance p1, Lqx/x;

    invoke-direct {p1, v0}, Lqx/x;-><init>(Lne3/j;)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonAdapter;->isLenient()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lqx/x;->k()Lqx/w;

    move-result-object p1

    sget-object v1, Lqx/w;->J:Lqx/w;

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    const-string v0, "JSON document was not fully consumed."

    invoke-direct {p1, v0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final fromJson(Lne3/j;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne3/j;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    new-instance v0, Lqx/x;

    invoke-direct {v0, p1}, Lqx/x;-><init>(Lne3/j;)V

    .line 9
    invoke-virtual {p0, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Lqx/a0;

    invoke-direct {v0, p1}, Lqx/a0;-><init>(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public indent(Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lqx/n0;

    invoke-direct {v0, p0, p1}, Lqx/n0;-><init>(Lcom/squareup/moshi/JsonAdapter;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "indent == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isLenient()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final lenient()Lcom/squareup/moshi/JsonAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqx/r;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lqx/r;-><init>(Lcom/squareup/moshi/JsonAdapter;I)V

    return-object v0
.end method

.method public final nonNull()Lcom/squareup/moshi/JsonAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lrx/a;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lrx/a;

    invoke-direct {v0, p0}, Lrx/a;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method public final nullSafe()Lcom/squareup/moshi/JsonAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lrx/b;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lrx/b;

    invoke-direct {v0, p0}, Lrx/b;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    return-object v0
.end method

.method public final serializeNulls()Lcom/squareup/moshi/JsonAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqx/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqx/r;-><init>(Lcom/squareup/moshi/JsonAdapter;I)V

    return-object v0
.end method

.method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Lne3/h;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lne3/i;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-virtual {v0}, Lne3/h;->S0()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final toJson(Lne3/i;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne3/i;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    new-instance v0, Lqx/y;

    invoke-direct {v0, p1}, Lqx/y;-><init>(Lne3/i;)V

    .line 7
    invoke-virtual {p0, v0, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract toJson(Lqx/c0;Ljava/lang/Object;)V
.end method

.method public final toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqx/b0;

    invoke-direct {v0}, Lqx/b0;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lqx/b0;->S0()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
