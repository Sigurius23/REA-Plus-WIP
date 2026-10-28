.class public final synthetic Ljj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput p5, p0, Ljj/c;->w:I

    iput-object p1, p0, Ljj/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljj/c;->z:Ljava/lang/Object;

    iput p3, p0, Ljj/c;->x:I

    iput-object p4, p0, Ljj/c;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget v0, p0, Ljj/c;->w:I

    iget-object v1, p0, Ljj/c;->E:Ljava/lang/Object;

    iget-object v2, p0, Ljj/c;->z:Ljava/lang/Object;

    iget-object v3, p0, Ljj/c;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lev/i;

    check-cast v2, Lgm/i;

    iget v0, p0, Ljj/c;->x:I

    check-cast v1, Ljava/lang/Runnable;

    iget-object v4, v3, Lev/i;->f:Ljava/lang/Object;

    check-cast v4, Lom/b;

    const/4 v5, 0x0

    :try_start_0
    iget-object v6, v3, Lev/i;->c:Ljava/lang/Object;

    check-cast v6, Lnm/d;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lmm/d;

    invoke-direct {v7, v6, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    move-object v6, v4

    check-cast v6, Lnm/i;

    invoke-virtual {v6, v7}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    iget-object v6, v3, Lev/i;->a:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    const-string v7, "connectivity"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/net/ConnectivityManager;

    invoke-virtual {v6}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v3, v2, v0}, Lev/i;->g(Lgm/i;I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    new-instance v6, Lb9/x;

    invoke-direct {v6, v3, v2, v0}, Lb9/x;-><init>(Lev/i;Lgm/i;I)V

    check-cast v4, Lnm/i;

    invoke-virtual {v4, v6}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v3, v3, Lev/i;->d:Ljava/lang/Object;

    check-cast v3, Lgm/r;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v2, v0, v5}, Lgm/r;->O(Lgm/i;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    throw v0

    :pswitch_0
    move-object v4, v3

    check-cast v4, Lcom/amplitude/android/engagement/types/Nudge;

    move-object v3, v2

    check-cast v3, Lcom/amplitude/android/engagement/a;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v0, v3, Lcom/amplitude/android/engagement/a;->g:Ljava/util/LinkedHashMap;

    iget-object v8, v3, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v5, "RenderNudgeHandler"

    const-string v6, "Rendering nudge using NudgeViewManager"

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel()Z

    move-result v5

    move v6, v5

    iget v5, p0, Ljj/c;->x:I

    if-eqz v6, :cond_2

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmj/p;

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    iput v5, v1, Lmj/p;->c:I

    :goto_3
    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmj/a;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lmj/a;->a:Lb4/g;

    if-eqz v0, :cond_4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb4/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_2
    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmj/p;

    if-eqz v6, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "Unexpected existing view manager for Nudge; unmounting it. variantId="

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    invoke-virtual {v6}, Lmj/p;->d()V

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmj/p;

    :cond_3
    new-instance v7, Lmj/a;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lmj/p;

    sget-object v0, Lhj/u;->w:Lhj/u;

    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Luj/m;

    invoke-direct/range {v2 .. v7}, Lmj/p;-><init>(Lcom/amplitude/android/engagement/a;Lcom/amplitude/android/engagement/types/Nudge;ILuj/m;Lmj/a;)V

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lmj/p;->c()V

    :cond_4
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
