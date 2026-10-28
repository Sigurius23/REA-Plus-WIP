.class public final Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/ProfileInteractor;->performAction(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.ProfileInteractor$performAction$$inlined$flatMapLatest$1"
    f = "ProfileInteractor.kt"
    l = {
        0xc0,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/ProfileInteractor;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/profile/domain/ProfileInteractor;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-direct {v0, p3, v1}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/profile/domain/ProfileInteractor;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lqw2/b;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    instance-of v5, p1, Lqw2/b$f;

    if-eqz v5, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {p1}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getScopeCoordinator$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lwm0/a;

    move-result-object p1

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->I$0:I

    iput v3, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->label:I

    const-string v3, "CommunityFollowerRefreshScope"

    invoke-virtual {p1, v3, p0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_4

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {p1}, Lcom/whoop/profile/domain/ProfileInteractor;->access$loadProfile(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/l;

    move-result-object p1

    goto :goto_3

    :cond_4
    instance-of v5, p1, Lqw2/b$b;

    if-eqz v5, :cond_5

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    check-cast p1, Lqw2/b$b;

    invoke-virtual {p1}, Lqw2/b$b;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/whoop/profile/domain/ProfileInteractor;->access$handleInteraction(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/navigation/models/GenericInteraction;)Lec3/l;

    move-result-object p1

    goto :goto_3

    :cond_5
    instance-of v5, p1, Lqw2/b$d;

    if-eqz v5, :cond_7

    check-cast p1, Lqw2/b$d;

    invoke-virtual {p1}, Lqw2/b$d;->c()Lj02/s;

    move-result-object v3

    if-eqz v3, :cond_6

    new-instance p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    invoke-direct {p1, v3}, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;-><init>(Lj02/s;)V

    goto :goto_1

    :cond_6
    new-instance v3, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;

    invoke-virtual {p1}, Lqw2/b$d;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v3, p1, v4, v2, v4}, Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v3

    :goto_1
    new-instance v3, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;

    invoke-direct {v3, p1}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;-><init>(Lcom/whoop/profile/domain/ProfileNavigationEffect;)V

    new-instance p1, La6/u;

    const/4 v5, 0x1

    invoke-direct {p1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_7
    instance-of v5, p1, Lqw2/b$a;

    if-eqz v5, :cond_9

    new-instance v5, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object p1

    const-string v6, "network"

    invoke-static {p1, v6, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$NetworkError;

    goto :goto_2

    :cond_8
    sget-object p1, Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;

    :goto_2
    invoke-direct {v5, p1}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;)V

    new-instance p1, La6/u;

    const/4 v3, 0x1

    invoke-direct {p1, v5, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_9
    sget-object p1, Lec3/k;->w:Lec3/k;

    :goto_3
    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$$inlined$flatMapLatest$1;->label:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_4
    return-object v0

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
