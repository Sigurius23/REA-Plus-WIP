.class public final Lcom/iterable/iterableapi/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile r:Lcom/iterable/iterableapi/k;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/iterable/iterableapi/w;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Z

.field public final j:Lcom/google/crypto/tink/internal/l0;

.field public k:Lcom/iterable/iterableapi/i;

.field public l:Lcom/iterable/iterableapi/d1;

.field public m:Lcom/iterable/iterableapi/c0;

.field public n:Lcom/iterable/iterableapi/s;

.field public final o:Ljava/util/HashMap;

.field public p:Lcom/iterable/iterableapi/o1;

.field public final q:Lcom/iterable/iterableapi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/iterable/iterableapi/k;

    invoke-direct {v0}, Lcom/iterable/iterableapi/k;-><init>()V

    sput-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Laj/c;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(Laj/c;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->o:Ljava/util/HashMap;

    new-instance v0, Lcom/iterable/iterableapi/i;

    invoke-direct {v0, p0}, Lcom/iterable/iterableapi/i;-><init>(Lcom/iterable/iterableapi/k;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->q:Lcom/iterable/iterableapi/i;

    new-instance v0, Lcom/iterable/iterableapi/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/v;-><init>(I)V

    new-instance v1, Lcom/iterable/iterableapi/w;

    invoke-direct {v1, v0}, Lcom/iterable/iterableapi/w;-><init>(Lcom/iterable/iterableapi/v;)V

    iput-object v1, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    return-void
.end method

.method public static f()Lcom/iterable/iterableapi/k;
    .locals 1

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    return-object v0
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const-string p0, "*"

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "***"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "null"

    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "IterableApi"

    const-string v1, "Iterable SDK must be initialized with an API key and user email/userId before calling SDK methods"

    invoke-static {v0, v1}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->k()V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/iterable/iterableapi/d1;->i()V

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->m:Lcom/iterable/iterableapi/c0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/iterable/iterableapi/c0;->w:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "IterableApi must be initialized before calling getEmbeddedManager(). Make sure you call IterableApi#initialize() in Application#onCreate"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Lcom/iterable/iterableapi/s;
    .locals 2

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->n:Lcom/iterable/iterableapi/s;

    if-nez v0, :cond_0

    new-instance v0, Lcom/iterable/iterableapi/s;

    iget-object v1, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    iget-object v1, v1, Lcom/iterable/iterableapi/w;->f:Lcom/iterable/iterableapi/m2;

    invoke-direct {v0, p0, v1}, Lcom/iterable/iterableapi/s;-><init>(Lcom/iterable/iterableapi/k;Lcom/iterable/iterableapi/m2;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->n:Lcom/iterable/iterableapi/s;

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->n:Lcom/iterable/iterableapi/s;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    const-string v1, "com.iterable.iterableapi"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v3, 0x0

    const-string v4, "itbl_deviceid"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/iterable/iterableapi/k;->h:Ljava/lang/String;

    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lcom/iterable/iterableapi/d1;
    .locals 2

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->l:Lcom/iterable/iterableapi/d1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "IterableApi must be initialized before calling getInAppManager(). Make sure you call IterableApi#initialize() in Application#onCreate"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Lcom/iterable/iterableapi/o1;
    .locals 3

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->p:Lcom/iterable/iterableapi/o1;

    if-nez v0, :cond_1

    :try_start_0
    new-instance v0, Lcom/iterable/iterableapi/o1;

    iget-object v1, p0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/o1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/k;->p:Lcom/iterable/iterableapi/o1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "IterableApi"

    const-string v2, "Failed to create IterableKeychain"

    invoke-static {v1, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->p:Lcom/iterable/iterableapi/o1;

    return-object v0
.end method

.method public final h(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/o0;Lcom/iterable/iterableapi/a1;)V
    .locals 7

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {v1, v3}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v0, "messageId"

    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_1

    const-string v0, "deleteAction"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    const-string p2, "messageContext"

    invoke-static {p1, p3}, Lcom/google/crypto/tink/internal/l0;->Q(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/a1;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v3, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "deviceInfo"

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->O()Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v2, "events/inAppConsume"

    iget-object p1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/k;

    iget-object v4, p1, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/google/crypto/tink/internal/l0;->g0(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final k()V
    .locals 7

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/iterable/iterableapi/x1;

    iget-object v2, p0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    iget-object v4, p0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    iget-object v0, v0, Lcom/iterable/iterableapi/w;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lcom/iterable/iterableapi/x1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v0, Lcom/iterable/iterableapi/y1;

    invoke-direct {v0}, Landroid/os/AsyncTask;-><init>()V

    filled-new-array {v1}, [Lcom/iterable/iterableapi/x1;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method

.method public final l(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v1, p0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    iget-object p1, p0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->g()Lcom/iterable/iterableapi/o1;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    const-string v1, "iterable-email"

    invoke-virtual {p1, v1, v0}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    const-string v1, "iterable-user-id"

    invoke-virtual {p1, v1, v0}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    const-string v1, "iterable-unknown-user-id"

    invoke-virtual {p1, v1, v0}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    const-string v1, "iterable-auth-token"

    invoke-virtual {p1, v1, v0}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "IterableApi"

    const-string v0, "Shared preference creation failed. "

    invoke-static {p1, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->b()V

    return-void

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->b()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 2

    new-instance v0, La8/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/iterable/iterableapi/k;->j(Ljava/lang/String;)Ljava/lang/String;

    sget-object p1, Lcom/iterable/iterableapi/u;->a:Lcom/iterable/iterableapi/l1;

    invoke-virtual {v0}, La8/c;->run()V

    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v2, "messageId"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "clickedUrl"

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "events/trackInAppClick"

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/k0;Lcom/iterable/iterableapi/a1;)V
    .locals 4

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/iterable/iterableapi/d1;->d(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {p1, v1}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v2, "messageId"

    invoke-virtual {v0}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "clickedUrl"

    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "closeAction"

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "messageContext"

    invoke-static {v0, p4}, Lcom/google/crypto/tink/internal/l0;->Q(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/a1;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "deviceInfo"

    invoke-virtual {p1}, Lcom/google/crypto/tink/internal/l0;->O()Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "events/trackInAppClose"

    invoke-virtual {p1, p2, v1}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-static {}, Ldt/b;->F()V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "trackInAppClose: could not find an in-app message with ID: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "IterableApi"

    invoke-static {p2, p1}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
