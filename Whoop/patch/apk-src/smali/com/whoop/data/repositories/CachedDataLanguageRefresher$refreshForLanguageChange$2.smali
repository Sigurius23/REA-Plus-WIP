.class final Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->refreshForLanguageChange(Lq83/d;)Ljava/lang/Object;
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
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$2"
    f = "CachedDataLanguageRefresher.kt"
    l = {
        0x2f,
        0x35,
        0x36,
        0x37,
        0x3a,
        0x3e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;

    iget-object v1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-direct {v0, v1, p2}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;-><init>(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_7

    :pswitch_1
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_5

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getAppConfigurationRepository$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lcom/whoop/data/remote/AppConfigurationRepository;

    move-result-object p1

    const-string v2, "language_change"

    iput-object v0, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    invoke-interface {p1, v2, p0}, Lcom/whoop/data/remote/AppConfigurationRepository;->refresh(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v1, :cond_0

    goto/16 :goto_6

    :goto_0
    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {v0}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getLogger$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Ltr2/n;

    move-result-object v0

    const-string v2, "Failed to refresh app configuration for language change"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {v0, v2, p1, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    :goto_1
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    iput-object v5, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_6

    :cond_1
    :goto_2
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getCacheNuke$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Ltm0/a;

    move-result-object p1

    iput-object v5, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    invoke-interface {p1, p0}, Ltm0/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_6

    :cond_2
    :goto_3
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getScopeCoordinator$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lwm0/a;

    move-result-object p1

    const-string v0, "home"

    iput-object v5, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    invoke-virtual {p1, v0, p0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_6

    :cond_3
    :goto_4
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getSportMgr$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lod1/s;

    move-result-object p1

    invoke-virtual {p1}, Lod1/s;->o()V

    :try_start_4
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getActivitiesDao$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lha0/a;

    move-result-object p1

    iput-object v5, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    const/4 v0, 0x5

    iput v0, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    invoke-interface {p1, p0}, Lha0/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1

    if-ne p1, v1, :cond_4

    goto :goto_6

    :catch_1
    :cond_4
    :goto_5
    :try_start_5
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getRecentActivitiesDao$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lha0/e;

    move-result-object p1

    iput-object v5, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->L$0:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->label:I

    invoke-interface {p1, p0}, Lha0/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2

    if-ne p1, v1, :cond_5

    :goto_6
    return-object v1

    :catch_2
    :cond_5
    :goto_7
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getCoilImageLoader$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lbh/e;

    move-result-object p1

    check-cast p1, Lbh/j;

    iget-object p1, p1, Lbh/j;->d:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leh/h;

    if-eqz p1, :cond_7

    iget-object p1, p1, Leh/h;->b:Leh/e;

    monitor-enter p1

    :try_start_6
    invoke-virtual {p1}, Leh/e;->k()V

    iget-object v0, p1, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    new-array v1, v3, [Leh/b;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leh/b;

    array-length v1, v0

    move v2, v3

    :goto_8
    if-ge v2, v1, :cond_6

    aget-object v4, v0, v2

    invoke-virtual {p1, v4}, Leh/e;->T(Leh/b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_6
    iput-boolean v3, p1, Leh/e;->N:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p1

    goto :goto_a

    :goto_9
    :try_start_7
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v0

    :cond_7
    :goto_a
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getCoilImageLoader$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lbh/e;

    move-result-object p1

    check-cast p1, Lbh/j;

    iget-object p1, p1, Lbh/j;->c:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkh/c;

    if-eqz p1, :cond_8

    iget-object v0, p1, Lkh/c;->a:Lkh/g;

    invoke-interface {v0}, Lkh/g;->b()V

    iget-object p1, p1, Lkh/c;->b:Lbd3/v;

    monitor-enter p1

    :try_start_8
    iput v3, p1, Lbd3/v;->x:I

    iget-object v0, p1, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    monitor-exit p1

    goto :goto_b

    :catchall_1
    move-exception v0

    :try_start_9
    monitor-exit p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0

    :cond_8
    :goto_b
    iget-object p1, p0, Lcom/whoop/data/repositories/CachedDataLanguageRefresher$refreshForLanguageChange$2;->this$0:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    invoke-static {p1}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->access$getGlide$p(Lcom/whoop/data/repositories/CachedDataLanguageRefresher;)Lcom/bumptech/glide/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ltl/l;->g()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p1, p1, Lcom/bumptech/glide/b;->w:Lzk/l;

    iget-object p1, p1, Lzk/l;->f:Lio/sentry/android/core/util/a;

    invoke-virtual {p1}, Lio/sentry/android/core/util/a;->a()Lbl/a;

    move-result-object p1

    invoke-interface {p1}, Lbl/a;->clear()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must call this method on a background thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
