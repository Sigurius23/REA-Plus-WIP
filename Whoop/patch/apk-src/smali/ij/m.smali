.class public final Lij/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/amplitude/android/engagement/a;

.field public final c:Landroid/os/HandlerThread;

.field public final d:Landroid/os/Handler;

.field public e:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

.field public f:Lzt/q;

.field public g:Lzt/q;

.field public final h:Lij/j;

.field public i:Lij/n;

.field public final j:Lwe/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/amplitude/android/engagement/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/m;->a:Landroid/content/Context;

    iput-object p2, p0, Lij/m;->b:Lcom/amplitude/android/engagement/a;

    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "JSThread"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    iput-object p1, p0, Lij/m;->c:Landroid/os/HandlerThread;

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lij/m;->d:Landroid/os/Handler;

    new-instance p1, Lij/j;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/m;->h:Lij/j;

    new-instance p1, Lwe/o;

    invoke-direct {p1, p0, p2}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lij/m;->j:Lwe/o;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance p2, Landroidx/lifecycle/m;

    const/16 v1, 0x9

    invoke-direct {p2, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object p2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "Interrupted while waiting for bundle initialization"

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lc93/m;)V
    .locals 3

    const-string v0, "js"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lh6/l;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, p2, v2}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lij/m;->d:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;
    .locals 2

    iget-object v0, p0, Lij/m;->e:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    if-nez v0, :cond_0

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v1, "jsContext is null but expected it to be non-null; maybe initialization failed?"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lij/m;->e:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    return-object v0
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Lij/m;->b:Lcom/amplitude/android/engagement/a;

    const-string v1, "Failed to serialize to JSON string: "

    const-string v2, "window.engagement.init(\""

    :try_start_0
    invoke-virtual {p0}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "__GS_PLATFORM__ = \'android\';"

    invoke-virtual {v3, v4}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v3, p0, Lij/m;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "engagement.js"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    const-string v4, "context.assets.open(\"engagement.js\")"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v3, Ljava/io/BufferedReader;

    const/16 v4, 0x2000

    invoke-direct {v3, v5, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v3}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    invoke-virtual {p0}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v4}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluateModule(Ljava/lang/String;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/amplitude/android/engagement/a;->a:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\", "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->b:Lcom/amplitude/android/engagement/AmplitudeInitOptions;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    sget-object v2, Lwj/b;->a:Lad3/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/amplitude/android/engagement/AmplitudeInitOptions;->Companion:Lcom/amplitude/android/engagement/b;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/b;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/j;

    invoke-virtual {v2, v5, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_4
    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-static {v3, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_2
    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v2, "Failed to load JS bundle"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :cond_2
    :goto_3
    return-void
.end method

.method public final d()V
    .locals 6

    new-instance v0, Lij/f;

    invoke-direct {v0, p0}, Lij/f;-><init>(Lij/m;)V

    new-instance v1, Ljj/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "fetch"

    iget-object v3, v0, Lij/f;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljj/b;

    const/4 v2, 0x1

    iget-object v4, p0, Lij/m;->b:Lcom/amplitude/android/engagement/a;

    invoke-direct {v1, v4, v2}, Ljj/b;-><init>(Lcom/amplitude/android/engagement/a;I)V

    const-string v2, "showDebugToolbar"

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljj/b;

    const/4 v2, 0x0

    invoke-direct {v1, v4, v2}, Ljj/b;-><init>(Lcom/amplitude/android/engagement/a;I)V

    const-string v2, "hideDebugToolbar"

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljj/b;

    invoke-direct {v1}, Ljj/b;-><init>()V

    const-string v2, "isElementVisible"

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lij/m;->f:Lzt/q;

    const/4 v2, 0x0

    const-string v3, "globalBridge"

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Lzt/q;->A(Lij/p;)V

    iget-object v0, p0, Lij/m;->f:Lzt/q;

    if-eqz v0, :cond_3

    sget-object v1, Lij/c;->y:Lij/c;

    new-instance v4, Lij/p;

    const-string v5, "base64Encode"

    invoke-direct {v4, v5, v1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lzt/q;->A(Lij/p;)V

    iget-object v0, p0, Lij/m;->f:Lzt/q;

    if-eqz v0, :cond_2

    sget-object v1, Lij/c;->z:Lij/c;

    new-instance v4, Lij/p;

    const-string v5, "base64Decode"

    invoke-direct {v4, v5, v1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lzt/q;->A(Lij/p;)V

    iget-object v0, p0, Lij/m;->f:Lzt/q;

    if-eqz v0, :cond_1

    sget-object v1, Lij/c;->E:Lij/c;

    new-instance v2, Lij/p;

    const-string v3, "getRandomBase64"

    invoke-direct {v2, v3, v1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lzt/q;->A(Lij/p;)V

    invoke-virtual {p0}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lij/m;->h:Lij/j;

    invoke-virtual {v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->setConsole(Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final e()V
    .locals 9

    sget-object v0, Lij/q;->a:Lad3/r;

    new-instance v1, Lij/p;

    const-string v0, "clickElement"

    sget-object v2, Lij/c;->F:Lij/c;

    invoke-direct {v1, v0, v2}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lij/p;

    const-string v0, "getDefaultUIMode"

    sget-object v3, Lij/c;->G:Lij/c;

    invoke-direct {v2, v0, v3}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Lij/p;

    new-instance v0, Lhj/q;

    const/4 v4, 0x3

    iget-object v5, p0, Lij/m;->b:Lcom/amplitude/android/engagement/a;

    invoke-direct {v0, v5, v4}, Lhj/q;-><init>(Lcom/amplitude/android/engagement/a;I)V

    const-string v4, "closeStep"

    invoke-direct {v3, v4, v0}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v4, Lij/p;

    new-instance v0, Lij/c;

    invoke-direct {v0, v5}, Lij/c;-><init>(Lcom/amplitude/android/engagement/a;)V

    const-string v6, "linkExecutable"

    invoke-direct {v4, v6, v0}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    move-object v0, v5

    new-instance v5, Lij/p;

    const-string v6, "appReviewExecutable"

    sget-object v7, Lij/c;->H:Lij/c;

    invoke-direct {v5, v6, v7}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v6, Lij/p;

    new-instance v7, Lhj/q;

    const/4 v8, 0x4

    invoke-direct {v7, v0, v8}, Lhj/q;-><init>(Lcom/amplitude/android/engagement/a;I)V

    const-string v0, "renderNudge"

    invoke-direct {v6, v0, v7}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    filled-new-array/range {v1 .. v6}, [Lij/p;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lij/p;

    iget-object v2, p0, Lij/m;->g:Lzt/q;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lzt/q;->A(Lij/p;)V

    goto :goto_0

    :cond_0
    const-string v0, "nudgeServicesBridge"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method
