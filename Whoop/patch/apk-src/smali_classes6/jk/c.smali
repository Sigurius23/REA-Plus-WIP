.class public final Ljk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lre/j0;
    .locals 1

    new-instance v0, Lre/j0;

    invoke-direct {v0, p0}, Lre/j0;-><init>(Ljk/c;)V

    return-object v0
.end method

.method public b()Lre/t0;
    .locals 1

    new-instance v0, Lre/t0;

    invoke-direct {v0, p0}, Lre/t0;-><init>(Ljk/c;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ljk/c;->a:Ljava/lang/String;

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ljk/c;->b:Ljava/lang/String;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ljk/c;->a:Ljava/lang/String;

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ljk/c;->b:Ljava/lang/String;

    return-void
.end method

.method public g()Lorg/json/JSONObject;
    .locals 4

    iget-object v0, p0, Ljk/c;->b:Ljava/lang/String;

    iget-object v1, p0, Ljk/c;->a:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    if-eqz v1, :cond_1

    :try_start_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "source_name"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "source_version"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    const-string v0, "JSON Serialization of ingestion metadata object failed"

    sget-object v1, Lhk/a;->a:Lhk/a;

    invoke-virtual {v1, v0}, Lhk/a;->error(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-object v2
.end method
