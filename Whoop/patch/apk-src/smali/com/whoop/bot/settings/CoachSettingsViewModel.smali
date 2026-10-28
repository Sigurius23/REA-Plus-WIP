.class public final Lcom/whoop/bot/settings/CoachSettingsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lcom/whoop/bot/settings/CoachSettingsInteractor;",
        "interactor",
        "Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;",
        "reducer",
        "Lxk0/a;",
        "analyticsHelper",
        "<init>",
        "(Lbc3/c0;Lcom/whoop/bot/settings/CoachSettingsInteractor;Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;Lxk0/a;)V",
        "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
        "viewEvent",
        "Ll83/a0;",
        "sendViewEvent",
        "(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)V",
        "Lbc3/c0;",
        "Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;",
        "Lxk0/a;",
        "Lec3/o1;",
        "viewEvents",
        "Lec3/o1;",
        "Lec3/l;",
        "Lcom/whoop/bot/settings/CoachSettingsViewState;",
        "viewState",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "bot_release"
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
.field private final analyticsHelper:Lxk0/a;

.field private final coroutineScope:Lbc3/c0;

.field private final reducer:Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

.field private final viewEvents:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final viewState:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lcom/whoop/bot/settings/CoachSettingsInteractor;Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;Lxk0/a;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->coroutineScope:Lbc3/c0;

    .line 3
    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->reducer:Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    .line 4
    iput-object p4, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->analyticsHelper:Lxk0/a;

    const/4 p1, 0x6

    const/4 p3, 0x1

    const/4 p4, 0x0

    const/4 v0, 0x0

    .line 5
    invoke-static {p3, p4, v0, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->viewEvents:Lec3/o1;

    .line 6
    new-instance p3, Lcom/whoop/bot/settings/CoachSettingsViewModel$viewState$1;

    invoke-direct {p3, v0}, Lcom/whoop/bot/settings/CoachSettingsViewModel$viewState$1;-><init>(Lq83/d;)V

    .line 7
    new-instance p4, Lec3/a0;

    invoke-direct {p4, p3, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 8
    invoke-static {p4, p2}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 9
    new-instance p2, Lcom/whoop/bot/settings/CoachSettingsViewModel$special$$inlined$map$1;

    invoke-direct {p2, p1, p0}, Lcom/whoop/bot/settings/CoachSettingsViewModel$special$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/bot/settings/CoachSettingsViewModel;)V

    .line 10
    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->viewState:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lcom/whoop/bot/settings/CoachSettingsInteractor;Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;Lxk0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p6, 0x1

    and-int/2addr p5, p6

    if-eqz p5, :cond_0

    .line 11
    new-instance p1, Lor2/m;

    const/4 p5, 0x0

    invoke-direct {p1, p5, p6, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/bot/settings/CoachSettingsViewModel;-><init>(Lbc3/c0;Lcom/whoop/bot/settings/CoachSettingsInteractor;Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;Lxk0/a;)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsHelper$p(Lcom/whoop/bot/settings/CoachSettingsViewModel;)Lxk0/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->analyticsHelper:Lxk0/a;

    return-object p0
.end method

.method public static final synthetic access$getReducer$p(Lcom/whoop/bot/settings/CoachSettingsViewModel;)Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;
    .locals 0

    iget-object p0, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->reducer:Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    return-object p0
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/whoop/bot/settings/CoachSettingsViewModel;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->viewEvents:Lec3/o1;

    return-object p0
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

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->viewState:Lec3/l;

    return-object v0
.end method

.method public final sendViewEvent(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewModel;->coroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/bot/settings/CoachSettingsViewModel$sendViewEvent$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/whoop/bot/settings/CoachSettingsViewModel$sendViewEvent$1;-><init>(Lcom/whoop/bot/settings/CoachSettingsViewEvent;Lcom/whoop/bot/settings/CoachSettingsViewModel;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
