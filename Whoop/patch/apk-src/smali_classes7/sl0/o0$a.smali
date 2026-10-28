.class final Lsl0/o0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/o0;->q(Lnl0/f;Lc93/m;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;ZLc93/a;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.AiConversationScreenContentKt$AiConversationScreenContent$6$1"
    f = "AiConversationScreenContent.kt"
    l = {
        0x4a,
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ln0/u;

.field final synthetic F:Ly3/c;

.field final synthetic G:Landroid/content/res/Configuration;

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field final synthetic z:Lnl0/f;


# direct methods
.method public constructor <init>(ZLcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/f;Ln0/u;Ly3/c;Landroid/content/res/Configuration;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lnl0/f;",
            "Ln0/u;",
            "Ly3/c;",
            "Landroid/content/res/Configuration;",
            "Lq83/d<",
            "-",
            "Lsl0/o0$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lsl0/o0$a;->x:Z

    iput-object p2, p0, Lsl0/o0$a;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lsl0/o0$a;->z:Lnl0/f;

    iput-object p4, p0, Lsl0/o0$a;->E:Ln0/u;

    iput-object p5, p0, Lsl0/o0$a;->F:Ly3/c;

    iput-object p6, p0, Lsl0/o0$a;->G:Landroid/content/res/Configuration;

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

    new-instance v0, Lsl0/o0$a;

    iget-boolean v1, p0, Lsl0/o0$a;->x:Z

    iget-object v2, p0, Lsl0/o0$a;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v3, p0, Lsl0/o0$a;->z:Lnl0/f;

    iget-object v4, p0, Lsl0/o0$a;->E:Ln0/u;

    iget-object v5, p0, Lsl0/o0$a;->F:Ly3/c;

    iget-object v6, p0, Lsl0/o0$a;->G:Landroid/content/res/Configuration;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lsl0/o0$a;-><init>(ZLcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/f;Ln0/u;Ly3/c;Landroid/content/res/Configuration;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/o0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/o0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/o0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/o0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/o0$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lsl0/o0$a;->x:Z

    if-nez p1, :cond_7

    iget-object p1, p0, Lsl0/o0$a;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "coach-message-streaming-android-v2"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lsl0/o0$a;->z:Lnl0/f;

    invoke-virtual {p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    if-gt p1, v2, :cond_3

    iget-object p1, p0, Lsl0/o0$a;->z:Lnl0/f;

    invoke-virtual {p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    :cond_3
    iget-object p1, p0, Lsl0/o0$a;->E:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget-object p1, p1, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/g;

    if-eqz p1, :cond_4

    check-cast p1, Ln0/o;

    iget p1, p1, Ln0/o;->a:I

    iget-object v1, p0, Lsl0/o0$a;->z:Lnl0/f;

    invoke-virtual {v1}, Lnl0/f;->c()Lnl0/a;

    move-result-object v1

    invoke-virtual {v1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lsl0/o0$a;->E:Ln0/u;

    iget-object v1, p0, Lsl0/o0$a;->z:Lnl0/f;

    invoke-virtual {v1}, Lnl0/f;->c()Lnl0/a;

    move-result-object v1

    invoke-virtual {v1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    const/4 v4, 0x0

    if-gez v1, :cond_5

    move v1, v4

    :cond_5
    iput v3, p0, Lsl0/o0$a;->w:I

    invoke-virtual {p1, v1, v4, p0}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    iget-object p1, p0, Lsl0/o0$a;->E:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->d()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lsl0/o0$a;->E:Ln0/u;

    iget-object v1, p0, Lsl0/o0$a;->F:Ly3/c;

    iget-object v3, p0, Lsl0/o0$a;->G:Landroid/content/res/Configuration;

    iget v3, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v3, v3

    invoke-interface {v1, v3}, Ly3/c;->q0(F)F

    move-result v1

    iput v2, p0, Lsl0/o0$a;->w:I

    invoke-static {p1, v1, p0}, Lh0/q3;->d(Lh0/x2;FLs83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
