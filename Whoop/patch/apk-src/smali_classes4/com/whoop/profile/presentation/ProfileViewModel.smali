.class public final Lcom/whoop/profile/presentation/ProfileViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/profile/domain/ProfileInteractor;",
        "interactor",
        "Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Lbc3/c0;)V",
        "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;",
        "Lcom/whoop/profile/domain/ProfileDomainAction;",
        "toDomainAction",
        "(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/ProfileDomainAction;",
        "event",
        "Ll83/a0;",
        "sendViewEvent",
        "(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V",
        "Lcom/whoop/profile/domain/ProfileInteractor;",
        "Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;",
        "Lbc3/c0;",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/o1;",
        "Lec3/t1;",
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        "domainStateFlow",
        "Lec3/t1;",
        "Lec3/l;",
        "Lcom/whoop/profile/presentation/ProfileViewState;",
        "viewState",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final coroutineScope:Lbc3/c0;

.field private final domainStateFlow:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final eventFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final interactor:Lcom/whoop/profile/domain/ProfileInteractor;

.field private final reducer:Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

.field private final viewState:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->interactor:Lcom/whoop/profile/domain/ProfileInteractor;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->reducer:Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->coroutineScope:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->eventFlow:Lec3/o1;

    .line 6
    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewModel$special$$inlined$map$1;

    invoke-direct {v0, p2, p0}, Lcom/whoop/profile/presentation/ProfileViewModel$special$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/profile/presentation/ProfileViewModel;)V

    .line 7
    invoke-virtual {p1, v0}, Lcom/whoop/profile/domain/ProfileInteractor;->profileStateFlow(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, p3, p2, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->domainStateFlow:Lec3/t1;

    .line 9
    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewModel$special$$inlined$map$2;

    invoke-direct {v0, p1, p0}, Lcom/whoop/profile/presentation/ProfileViewModel$special$$inlined$map$2;-><init>(Lec3/l;Lcom/whoop/profile/presentation/ProfileViewModel;)V

    .line 10
    invoke-static {v0, p3, p2, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->viewState:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileViewModel;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$getEventFlow$p(Lcom/whoop/profile/presentation/ProfileViewModel;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->eventFlow:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic access$getReducer$p(Lcom/whoop/profile/presentation/ProfileViewModel;)Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->reducer:Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    return-object p0
.end method

.method public static final synthetic access$toDomainAction(Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/ProfileDomainAction;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/presentation/ProfileViewModel;->toDomainAction(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/ProfileDomainAction;

    move-result-object p0

    return-object p0
.end method

.method private final toDomainAction(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/ProfileDomainAction;
    .locals 2

    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$Refresh;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/profile/domain/ProfileDomainAction$Refresh;->INSTANCE:Lcom/whoop/profile/domain/ProfileDomainAction$Refresh;

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$Report;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/profile/domain/ProfileDomainAction$Report;->INSTANCE:Lcom/whoop/profile/domain/ProfileDomainAction$Report;

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;

    if-eqz v0, :cond_2

    sget-object p1, Lcom/whoop/profile/domain/ProfileDomainAction$DismissReportDialog;->INSTANCE:Lcom/whoop/profile/domain/ProfileDomainAction$DismissReportDialog;

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$DismissDesignModal;

    if-eqz v0, :cond_4

    sget-object p1, Lcom/whoop/profile/domain/ProfileDomainAction$DismissModal;->INSTANCE:Lcom/whoop/profile/domain/ProfileDomainAction$DismissModal;

    return-object p1

    :cond_4
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/whoop/profile/domain/ProfileDomainAction$PerformAction;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;->getCardButtonId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/profile/domain/ProfileDomainAction$PerformAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    return-object v0

    :cond_5
    instance-of p1, p1, Lcom/whoop/profile/presentation/ProfileEvent$ConsumeSideEffects;

    if-eqz p1, :cond_6

    sget-object p1, Lcom/whoop/profile/domain/ProfileDomainAction$ConsumeSideEffects;->INSTANCE:Lcom/whoop/profile/domain/ProfileDomainAction$ConsumeSideEffects;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->viewState:Lec3/l;

    return-object v0
.end method

.method public final sendViewEvent(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewModel;->coroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewModel$sendViewEvent$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/profile/presentation/ProfileViewModel$sendViewEvent$1;-><init>(Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
