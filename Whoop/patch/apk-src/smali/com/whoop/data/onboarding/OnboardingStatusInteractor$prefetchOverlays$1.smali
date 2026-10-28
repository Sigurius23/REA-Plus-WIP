.class final Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->prefetchOverlays()V
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
    c = "com.whoop.data.onboarding.OnboardingStatusInteractor$prefetchOverlays$1"
    f = "OnboardingStatusInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

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

    new-instance p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p1, v0, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$prefetchOverlays$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getPrefetcher$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lom0/c;

    move-result-object p1

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchEntry;

    const-string v1, "onboarding-overlay"

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v5, 0xa

    const/4 v6, 0x0

    const-string v1, "onboarding-service/v1/overlay/all"

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/cache/api/prefetch/PrefetchEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lom0/a;->a(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lom0/c;->g(Lom0/c;Lcom/whoop/cache/api/prefetch/PrefetchList;ZILjava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
