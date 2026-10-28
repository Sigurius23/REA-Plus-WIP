.class public final synthetic Lcom/iterable/iterableapi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Lorg/json/JSONObject;

.field public final synthetic w:Lcom/iterable/iterableapi/k;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/iterable/iterableapi/k;Ljava/lang/String;IILorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/h;->w:Lcom/iterable/iterableapi/k;

    iput-object p2, p0, Lcom/iterable/iterableapi/h;->x:Ljava/lang/String;

    iput p3, p0, Lcom/iterable/iterableapi/h;->y:I

    iput p4, p0, Lcom/iterable/iterableapi/h;->z:I

    iput-object p5, p0, Lcom/iterable/iterableapi/h;->E:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Lcom/iterable/iterableapi/h;->y:I

    iget v1, p0, Lcom/iterable/iterableapi/h;->z:I

    iget-object v2, p0, Lcom/iterable/iterableapi/h;->w:Lcom/iterable/iterableapi/k;

    iget-object v3, p0, Lcom/iterable/iterableapi/h;->x:Ljava/lang/String;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "IterableApi"

    const-string v1, "messageId is null"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, v2, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    iget-object v5, p0, Lcom/iterable/iterableapi/h;->E:Lorg/json/JSONObject;

    if-nez v5, :cond_1

    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v2, v4}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v6, "campaignId"

    invoke-virtual {v4, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "templateId"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "messageId"

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "dataFields"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "events/trackPushOpen"

    invoke-virtual {v2, v0, v4}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
