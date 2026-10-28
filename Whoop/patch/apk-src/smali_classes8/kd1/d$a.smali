.class final Lkd1/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd1/d;->r(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.util.AuthenticatedWebViewKt$AuthenticatedWebView$2$1"
    f = "AuthenticatedWebView.kt"
    l = {
        0x49
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field K:I

.field L:I

.field final synthetic M:Lj92/t;

.field final synthetic N:Ljava/lang/String;

.field final synthetic O:Lzr2/a;

.field final synthetic P:Lod1/u;

.field final synthetic Q:Ly92/a;

.field final synthetic R:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj92/t;Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj92/t;",
            "Ljava/lang/String;",
            "Lzr2/a;",
            "Lod1/u;",
            "Ly92/a;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lq83/d<",
            "-",
            "Lkd1/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkd1/d$a;->M:Lj92/t;

    iput-object p2, p0, Lkd1/d$a;->N:Ljava/lang/String;

    iput-object p3, p0, Lkd1/d$a;->O:Lzr2/a;

    iput-object p4, p0, Lkd1/d$a;->P:Lod1/u;

    iput-object p5, p0, Lkd1/d$a;->Q:Ly92/a;

    iput-object p6, p0, Lkd1/d$a;->R:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lkd1/d$a;

    iget-object v1, p0, Lkd1/d$a;->M:Lj92/t;

    iget-object v2, p0, Lkd1/d$a;->N:Ljava/lang/String;

    iget-object v3, p0, Lkd1/d$a;->O:Lzr2/a;

    iget-object v4, p0, Lkd1/d$a;->P:Lod1/u;

    iget-object v5, p0, Lkd1/d$a;->Q:Ly92/a;

    iget-object v6, p0, Lkd1/d$a;->R:Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lkd1/d$a;-><init>(Lj92/t;Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lkd1/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd1/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd1/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd1/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lkd1/d$a;->L:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v9, :cond_0

    iget v0, p0, Lkd1/d$a;->J:I

    iget-object v1, p0, Lkd1/d$a;->I:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p0, Lkd1/d$a;->G:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v2, p0, Lkd1/d$a;->F:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v3, p0, Lkd1/d$a;->E:Ljava/lang/Object;

    check-cast v3, Ly92/a;

    iget-object v4, p0, Lkd1/d$a;->z:Ljava/lang/Object;

    check-cast v4, Lod1/u;

    iget-object v5, p0, Lkd1/d$a;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v10, p0, Lkd1/d$a;->x:Ljava/lang/Object;

    check-cast v10, Lzr2/a;

    iget-object v11, p0, Lkd1/d$a;->w:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v4

    move-object v4, v3

    move-object v3, v11

    move-object v11, v1

    move-object v12, v2

    move-object v2, v5

    move-object v1, v10

    move v10, v0

    move-object v0, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lkd1/d$a;->M:Lj92/t;

    iget-object v1, p0, Lkd1/d$a;->N:Ljava/lang/String;

    invoke-static {v0, v1}, Lkd1/d;->O(Lj92/t;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lkd1/d;->N()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lkd1/d$a;->O:Lzr2/a;

    iget-object v2, p0, Lkd1/d$a;->N:Ljava/lang/String;

    iget-object v3, p0, Lkd1/d$a;->P:Lod1/u;

    iget-object v4, p0, Lkd1/d$a;->Q:Ly92/a;

    iget-object v5, p0, Lkd1/d$a;->R:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v11, v0

    move-object v12, v5

    move v10, v8

    :cond_2
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v5, "new-auth-user-storage-android"

    invoke-interface {v12, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    const/4 v13, 0x0

    iput-object v13, p0, Lkd1/d$a;->w:Ljava/lang/Object;

    iput-object v1, p0, Lkd1/d$a;->x:Ljava/lang/Object;

    iput-object v2, p0, Lkd1/d$a;->y:Ljava/lang/Object;

    iput-object v3, p0, Lkd1/d$a;->z:Ljava/lang/Object;

    iput-object v4, p0, Lkd1/d$a;->E:Ljava/lang/Object;

    iput-object v12, p0, Lkd1/d$a;->F:Ljava/lang/Object;

    iput-object v11, p0, Lkd1/d$a;->G:Ljava/lang/Object;

    iput-object v13, p0, Lkd1/d$a;->H:Ljava/lang/Object;

    iput-object v13, p0, Lkd1/d$a;->I:Ljava/lang/Object;

    iput v10, p0, Lkd1/d$a;->J:I

    iput v8, p0, Lkd1/d$a;->K:I

    iput v9, p0, Lkd1/d$a;->L:I

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lkd1/d;->M(Ljava/lang/String;Lzr2/a;Ljava/lang/String;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    :goto_1
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v5

    invoke-virtual {v5, v2, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
