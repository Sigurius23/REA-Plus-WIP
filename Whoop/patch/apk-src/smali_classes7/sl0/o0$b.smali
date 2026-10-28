.class final Lsl0/o0$b;
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
    c = "com.whoop.bot.view.AiConversationScreenContentKt$AiConversationScreenContent$7$1"
    f = "AiConversationScreenContent.kt"
    l = {
        0x5f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Z

.field final synthetic G:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field final synthetic H:Ln0/u;

.field w:I

.field x:I

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZLcom/whoop/data/repositories/FeatureFlagChecker;Ln0/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Ln0/u;",
            "Lq83/d<",
            "-",
            "Lsl0/o0$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lsl0/o0$b;->F:Z

    iput-object p2, p0, Lsl0/o0$b;->G:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lsl0/o0$b;->H:Ln0/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lsl0/o0$b;

    iget-boolean v0, p0, Lsl0/o0$b;->F:Z

    iget-object v1, p0, Lsl0/o0$b;->G:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v2, p0, Lsl0/o0$b;->H:Ln0/u;

    invoke-direct {p1, v0, v1, v2, p2}, Lsl0/o0$b;-><init>(ZLcom/whoop/data/repositories/FeatureFlagChecker;Ln0/u;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lsl0/o0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/o0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/o0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/o0$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/o0$b;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lsl0/o0$b;->z:Ljava/lang/Object;

    check-cast v1, Ln0/g;

    iget-object v1, p0, Lsl0/o0$b;->y:Ljava/lang/Object;

    check-cast v1, Ln0/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lsl0/o0$b;->F:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lsl0/o0$b;->G:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "coach-message-streaming-android-v2"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    :goto_0
    iget-object p1, p0, Lsl0/o0$b;->H:Ln0/u;

    invoke-static {p1}, Lsl0/o0;->L(Ln0/u;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lsl0/o0$b;->H:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lsl0/o0$b;->H:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget p1, p1, Ln0/n;->n:I

    sub-int/2addr p1, v2

    if-ltz p1, :cond_2

    iget-object v1, p0, Lsl0/o0$b;->H:Ln0/u;

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v1, v1, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/g;

    if-eqz v1, :cond_2

    iget-object v3, p0, Lsl0/o0$b;->H:Ln0/u;

    check-cast v1, Ln0/o;

    iget v4, v1, Ln0/o;->p:I

    iget v1, v1, Ln0/o;->o:I

    add-int/2addr v4, v1

    const/4 v1, 0x0

    iput-object v1, p0, Lsl0/o0$b;->y:Ljava/lang/Object;

    iput-object v1, p0, Lsl0/o0$b;->z:Ljava/lang/Object;

    iput p1, p0, Lsl0/o0$b;->w:I

    const/4 v1, 0x0

    iput v1, p0, Lsl0/o0$b;->x:I

    iput v2, p0, Lsl0/o0$b;->E:I

    invoke-virtual {v3, p1, v4, p0}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
