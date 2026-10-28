.class public Lod1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/whoop/service/network/model/cycles/Activity;

.field private b:Lpg3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpg3/v0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/model/cycles/Activity;Lpg3/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/cycles/Activity;",
            "Lpg3/v0<",
            "+",
            "Lcom/whoop/service/network/model/cycles/Activity;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/k;->a:Lcom/whoop/service/network/model/cycles/Activity;

    iput-object p2, p0, Lod1/k;->b:Lpg3/v0;

    iget-object p1, p2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lpg3/v0;->b:Ljava/lang/Object;

    if-eqz p1, :cond_0

    check-cast p1, Lcom/whoop/service/network/model/cycles/Activity;

    iput-object p1, p0, Lod1/k;->a:Lcom/whoop/service/network/model/cycles/Activity;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lod1/k;->b:Lpg3/v0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lpg3/v0;->a:Lud3/x0;

    iget v0, v0, Lud3/x0;->z:I

    const/16 v1, 0x28a

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lod1/k;->b:Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->a:Lud3/x0;

    iget v0, v0, Lud3/x0;->z:I

    const/16 v1, 0x199

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lod1/k;->b:Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    return v0
.end method

.method public d()Z
    .locals 3

    invoke-virtual {p0}, Lod1/k;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lod1/k;->b:Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->c:Lud3/a1;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "message"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Duration unreasonably long"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_1
    return v1
.end method
