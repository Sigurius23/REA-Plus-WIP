.class public final synthetic Lcom/iterable/iterableapi/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/iterable/iterableapi/o;


# direct methods
.method public synthetic constructor <init>(Lcom/iterable/iterableapi/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/z1;->a:Lcom/iterable/iterableapi/o;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 9

    iget-object v0, p0, Lcom/iterable/iterableapi/z1;->a:Lcom/iterable/iterableapi/o;

    :try_start_0
    const-string v1, "newAuthToken"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v2, Lcom/iterable/iterableapi/o;

    iget-object v3, v0, Lcom/iterable/iterableapi/o;->a:Ljava/lang/String;

    iget-object v4, v0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    iget-object v5, v0, Lcom/iterable/iterableapi/o;->c:Lorg/json/JSONObject;

    iget-object v6, v0, Lcom/iterable/iterableapi/o;->d:Ljava/lang/String;

    iget-object v8, v0, Lcom/iterable/iterableapi/o;->g:Lcom/iterable/iterableapi/f0;

    invoke-direct/range {v2 .. v8}, Lcom/iterable/iterableapi/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V

    new-instance p1, Lcom/iterable/iterableapi/a2;

    invoke-direct {p1}, Lcom/iterable/iterableapi/a2;-><init>()V

    filled-new-array {v2}, [Lcom/iterable/iterableapi/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
