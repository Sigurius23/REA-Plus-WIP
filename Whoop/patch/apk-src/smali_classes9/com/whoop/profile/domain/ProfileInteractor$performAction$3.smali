.class final Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/profile/domain/ProfileInternalDomainAction;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.ProfileInteractor$performAction$3"
    f = "ProfileInteractor.kt"
    l = {
        0x8f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $cardButtonId:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/ProfileInteractor;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/profile/domain/ProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->$cardButtonId:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p2, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->$cardButtonId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-direct {p2, v0, v1, p3}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    iput-object p1, p2, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->L$0:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->$cardButtonId:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {p1}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getInFlightCardButtonIdHolder$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Lcom/whoop/profile/domain/ProfileInternalDomainAction$SyncInFlightCardButton;->INSTANCE:Lcom/whoop/profile/domain/ProfileInternalDomainAction$SyncInFlightCardButton;

    iput-object v2, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/profile/domain/ProfileInteractor$performAction$3;->label:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
