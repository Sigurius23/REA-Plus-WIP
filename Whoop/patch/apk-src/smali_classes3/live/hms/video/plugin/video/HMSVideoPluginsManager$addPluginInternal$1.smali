.class final Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/plugin/video/HMSVideoPluginsManager;->addPluginInternal(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.plugin.video.HMSVideoPluginsManager$addPluginInternal$1"
    f = "HMSVideoPluginsManager.kt"
    l = {
        0x8a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $name:Ljava/lang/String;

.field final synthetic $plugin:Llive/hms/video/plugin/video/HMSVideoPlugin;

.field final synthetic $resultListener:Llive/hms/video/sdk/HMSActionResultListener;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;


# direct methods
.method public constructor <init>(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/plugin/video/HMSVideoPluginsManager;",
            "Llive/hms/video/plugin/video/HMSVideoPlugin;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    iput-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$plugin:Llive/hms/video/plugin/video/HMSVideoPlugin;

    iput-object p3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    iput-object p4, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$name:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;

    iget-object v1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$plugin:Llive/hms/video/plugin/video/HMSVideoPlugin;

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    iget-object v4, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$name:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;-><init>(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const-string v0, "HMSVideoPluginsManager"

    const-string v1, "source set on processor "

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->label:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/sdk/HMSActionResultListener;

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v6, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$1:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    iget-object v7, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/plugin/video/HMSVideoPlugin;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v7, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$plugin:Llive/hms/video/plugin/video/HMSVideoPlugin;

    iget-object v6, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$name:Ljava/lang/String;

    iget-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    :try_start_1
    iput-object v7, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$0:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$2:Ljava/lang/Object;

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->L$3:Ljava/lang/Object;

    iput v5, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->label:I

    invoke-interface {v7, p0}, Llive/hms/video/plugin/video/HMSVideoPlugin;->init(Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_2

    return-object v2

    :cond_2
    move-object v2, p1

    :goto_0
    invoke-static {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getPlugins$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getPluginsObjectList$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object p1

    invoke-virtual {p1, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getPluginsMap$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    invoke-interface {p1, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getSetProcessor$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "setting video processor"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$setVideoProcessor(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->getSource()Lhms/webrtc/VideoSource;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6, v5}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$setSetProcessor$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Z)V

    :cond_3
    invoke-interface {v2}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    invoke-static {v6}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getAnalytics$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    move-result-object p1

    invoke-virtual {p1, v3}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->addPluginSuccess(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p1, v4

    goto :goto_2

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_4

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    iget-object v1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$plugin:Llive/hms/video/plugin/video/HMSVideoPlugin;

    invoke-virtual {v0, v1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    sget-object v5, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v6, Llive/hms/video/error/ErrorFactory$Action;->PLUGIN:Llive/hms/video/error/ErrorFactory$Action;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Plugin error "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :cond_4
    return-object v4
.end method
