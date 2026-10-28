.class final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->l1(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;Ljava/lang/String;)V
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
    c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$showConnected$2$1"
    f = "BleConnectStrapActivity.kt"
    l = {
        0x202
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->h(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {p1, v0, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object p1

    iput v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->w:I

    invoke-virtual {p1, p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->I(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f;

    sget-object v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$c;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->k0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->b0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v0, "membership-adjustment-android"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    new-instance v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/b;

    invoke-direct {v1, v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/b;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    invoke-virtual {p1, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->E(Lc93/a;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->D()V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-virtual {p1}, Lhj0/f;->finish()V

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$a;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->K()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
