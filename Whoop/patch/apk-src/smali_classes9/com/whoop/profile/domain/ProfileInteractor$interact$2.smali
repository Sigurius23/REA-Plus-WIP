.class final Lcom/whoop/profile/domain/ProfileInteractor$interact$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/ProfileInteractor;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        "previousState",
        "internal",
        "Lcom/whoop/profile/domain/ProfileInternalDomainAction;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.ProfileInteractor$interact$2"
    f = "ProfileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/ProfileInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/ProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileInteractor$interact$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileInternalDomainAction;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/ProfileDomainState;",
            "Lcom/whoop/profile/domain/ProfileInternalDomainAction;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileDomainState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-direct {v0, v1, p3}, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/profile/domain/ProfileDomainState;

    check-cast p2, Lcom/whoop/profile/domain/ProfileInternalDomainAction;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->invoke(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileInternalDomainAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/domain/ProfileDomainState;

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->label:I

    if-nez v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;

    if-eqz p1, :cond_0

    check-cast v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;->getDomainState()Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v1

    :goto_0
    move-object v2, v1

    goto/16 :goto_1

    :cond_0
    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;

    if-eqz p1, :cond_1

    check-cast v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v6

    const/16 v11, 0x1ef

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;

    if-eqz p1, :cond_2

    check-cast v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;->getDialogType()Lcom/whoop/profile/domain/ProfileDialogType;

    move-result-object v2

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;

    if-eqz p1, :cond_3

    check-cast v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;->getNavigation()Lcom/whoop/profile/domain/ProfileNavigationEffect;

    move-result-object v7

    const/16 v11, 0x1df

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$ClearSideEffects;

    if-eqz p1, :cond_4

    const/16 v11, 0x1df

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v1

    goto :goto_0

    :cond_4
    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;

    if-eqz p1, :cond_5

    check-cast v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;->getResult()Lcom/whoop/profile/domain/ProfileReportResult;

    move-result-object v9

    const/16 v11, 0x17f

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v1

    goto :goto_0

    :cond_5
    instance-of p1, v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$SyncInFlightCardButton;

    if-eqz p1, :cond_6

    goto/16 :goto_0

    :goto_1
    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$interact$2;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {p1}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getInFlightCardButtonIdHolder$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    const/16 v12, 0x1bf

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
