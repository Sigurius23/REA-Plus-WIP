.class final Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->startFeatureFlagPeriodicFetch()V
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
    c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1"
    f = "FeatureFlagRepositoryImpl.kt"
    l = {
        0x105,
        0x108,
        0x10d,
        0x10e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    invoke-direct {p1, v0, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v6, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->label:I

    const-wide/16 v6, 0x64

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    invoke-static {p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->access$getUserContext$p(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;)Lod1/u;

    move-result-object p1

    invoke-virtual {p1}, Lod1/u;->i()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    iput v5, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->access$fetchFeatureFlags(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->getLogger()Ltr2/n;

    move-result-object v1

    const-string v6, "end fetching feature flags success = "

    invoke-static {v6, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    new-array v6, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    invoke-virtual {p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->getLogger()Ltr2/n;

    move-result-object p1

    const-string v1, "skipped fetching flags: no user"

    new-array v6, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_3
    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    iput v4, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->access$periodicFetchOnboardingFlags(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    iget-object p1, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->this$0:Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    invoke-static {p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->access$getFetchInterval$p(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;)J

    move-result-wide v6

    iput v3, p0, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl$startFeatureFlagPeriodicFetch$1;->label:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_5
    return-object v0
.end method
