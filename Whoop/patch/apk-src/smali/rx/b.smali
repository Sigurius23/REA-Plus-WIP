.class public final Lrx/b;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# instance fields
.field public final a:Lcom/squareup/moshi/JsonAdapter;


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;)V
    .locals 0

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lrx/b;->a:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lrx/b;->a:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lqx/c0;->J()Lqx/c0;

    return-void

    :cond_0
    iget-object v0, p0, Lrx/b;->a:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lrx/b;->a:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".nullSafe()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
