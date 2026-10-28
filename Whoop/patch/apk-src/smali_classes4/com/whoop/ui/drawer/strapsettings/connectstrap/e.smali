.class public final Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ+\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u0082@\u00a2\u0006\u0004\u0008\'\u0010(J#\u0010-\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00160+\u00a2\u0006\u0004\u0008-\u0010.J\'\u00102\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020!2\u0008\u00101\u001a\u0004\u0018\u000100\u00a2\u0006\u0004\u00082\u00103J\r\u00104\u001a\u00020\u0018\u00a2\u0006\u0004\u00084\u00105J\u001b\u00108\u001a\u00020\u00182\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001806\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020&H\u0086@\u00a2\u0006\u0004\u0008:\u0010(J\r\u0010;\u001a\u00020\u0018\u00a2\u0006\u0004\u0008;\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010?R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u0010BR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010FR\u001d\u0010L\u001a\u0008\u0012\u0004\u0012\u00020H0G8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008@\u0010KR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010M\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;",
        "Landroidx/lifecycle/w1;",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/repositories/OnboardingRepository;",
        "onboardingRepository",
        "Lor2/c;",
        "appDiagnostics",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "remoteDataSource",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Ltd1/b;",
        "whoopStrapProxy",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;",
        "membershipAdjustmentApi",
        "<init>",
        "(Ltr2/n;Lcom/whoop/data/repositories/OnboardingRepository;Lor2/c;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/data/local/prefs/PreferenceHelper;Ltd1/b;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;)V",
        "Lqm2/l;",
        "viewEvent",
        "Ll83/a0;",
        "H",
        "(Lqm2/l;)V",
        "Lqm2/t;",
        "event",
        "G",
        "(Lqm2/t;)V",
        "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "onboardingInfo",
        "",
        "strapSerial",
        "",
        "F",
        "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/lang/String;)Ljava/util/Map;",
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/f;",
        "w",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "isOnboarding",
        "Lxg3/g;",
        "viewEvents",
        "A",
        "(ZLxg3/g;)V",
        "strapSignature",
        "Lst0/v;",
        "strapGen",
        "y",
        "(Ljava/lang/String;Ljava/lang/String;Lst0/v;)V",
        "D",
        "()V",
        "Lkotlin/Function0;",
        "onSuccess",
        "E",
        "(Lc93/a;)V",
        "I",
        "K",
        "Ltr2/n;",
        "x",
        "Lcom/whoop/data/repositories/OnboardingRepository;",
        "Lor2/c;",
        "z",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Ltd1/b;",
        "Lci2/b;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;",
        "Landroidx/lifecycle/u0;",
        "Lqm2/q;",
        "J",
        "Landroidx/lifecycle/u0;",
        "()Landroidx/lifecycle/u0;",
        "viewStateLiveData",
        "Z",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final E:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field private final F:Ltd1/b;

.field private final G:Lci2/b;

.field private final H:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final I:Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;

.field private final J:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private K:Z

.field private final w:Ltr2/n;

.field private final x:Lcom/whoop/data/repositories/OnboardingRepository;

.field private final y:Lor2/c;

.field private final z:Lcom/whoop/data/remote/RemoteDataSource;


# direct methods
.method public constructor <init>(Ltr2/n;Lcom/whoop/data/repositories/OnboardingRepository;Lor2/c;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/data/local/prefs/PreferenceHelper;Ltd1/b;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appDiagnostics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteDataSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProxy"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipAdjustmentApi"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->w:Ltr2/n;

    iput-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->x:Lcom/whoop/data/repositories/OnboardingRepository;

    iput-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->y:Lor2/c;

    iput-object p4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z:Lcom/whoop/data/remote/RemoteDataSource;

    iput-object p5, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->E:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iput-object p6, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->F:Ltd1/b;

    iput-object p7, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->G:Lci2/b;

    iput-object p8, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->H:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p9, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->I:Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->J:Landroidx/lifecycle/u0;

    return-void
.end method

.method private static final B(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lqm2/l;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->H(Lqm2/l;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final F(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getStrapMembershipStatus()Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;->getValue()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "Account Type"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap()Z

    move-result v0

    const-string v2, "No"

    const-string v3, "Yes"

    if-nez v0, :cond_0

    move-object v4, v2

    move-object v0, v3

    goto :goto_0

    :cond_0
    move-object v0, v2

    move-object v4, v0

    :goto_0
    new-instance v2, Ll83/k;

    const-string v5, "New Strap?"

    invoke-direct {v2, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getRequireTeamCode()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    new-instance v0, Ll83/k;

    const-string v4, "Invite Code Required?"

    invoke-direct {v0, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getTeamInfo()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    const-string v3, ""

    :cond_3
    new-instance v4, Ll83/k;

    const-string v5, "Team Name"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->x:Lcom/whoop/data/repositories/OnboardingRepository;

    invoke-virtual {v3}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapGeneration()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ll83/k;

    const-string v6, "Strap Generation"

    invoke-direct {v5, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v3, "strap_serial"

    invoke-direct {v6, v3, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getNumScooterTrialMonths()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v3, "free_months_applied"

    invoke-direct {p2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    move-object v7, p2

    move-object v3, v0

    goto :goto_3

    :cond_4
    const/4 p2, 0x0

    goto :goto_2

    :goto_3
    filled-new-array/range {v1 .. v7}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final G(Lqm2/t;)V
    .locals 7

    iget-boolean v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->K:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lqm2/t;->b()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    const-string v1, ""

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    :cond_1
    invoke-virtual {p1}, Lqm2/t;->b()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v2

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lqm2/t;->a()Lst0/v;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->y(Ljava/lang/String;Ljava/lang/String;Lst0/v;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->J:Landroidx/lifecycle/u0;

    new-instance v1, Lqm2/u;

    invoke-virtual {p1}, Lqm2/t;->a()Lst0/v;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lqm2/u;-><init>(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final H(Lqm2/l;)V
    .locals 1

    instance-of v0, p1, Lqm2/t;

    if-eqz v0, :cond_0

    check-cast p1, Lqm2/t;

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->G(Lqm2/t;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic g(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lqm2/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->B(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lqm2/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lpf/b;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic l(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lor2/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->y:Lor2/c;

    return-object p0
.end method

.method public static final synthetic o(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->w:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic p(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->I:Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;

    return-object p0
.end method

.method public static final synthetic q(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/repositories/OnboardingRepository;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->x:Lcom/whoop/data/repositories/OnboardingRepository;

    return-object p0
.end method

.method public static final synthetic r(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/local/prefs/PreferenceHelper;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->E:Lcom/whoop/data/local/prefs/PreferenceHelper;

    return-object p0
.end method

.method public static final synthetic t(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/remote/RemoteDataSource;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z:Lcom/whoop/data/remote/RemoteDataSource;

    return-object p0
.end method

.method public static final synthetic u(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltd1/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->F:Ltd1/b;

    return-object p0
.end method

.method public static final synthetic v(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/lang/String;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->F(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final w(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;

    iget v1, v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;

    invoke-direct {v0, p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v0, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->w:Ljava/lang/Object;

    check-cast v0, Ljk0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->G:Lci2/b;

    invoke-interface {p1}, Lci2/b;->a()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljk0/d;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v1

    :goto_2
    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_4
    move-object p1, v1

    :goto_3
    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_5

    goto :goto_6

    :cond_5
    if-eqz p1, :cond_d

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_6

    goto :goto_6

    :cond_6
    move-object v4, v1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v5, v2

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->w:Ltr2/n;

    move v7, v5

    new-instance v5, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$b;

    invoke-direct {v5, p0, v3, p1, v4}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$b;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object v4, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->w:Ljava/lang/Object;

    iput-object v4, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->x:Ljava/lang/Object;

    iput-object v4, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->y:Ljava/lang/Object;

    iput v7, v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_4
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_9

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    sget-object p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$c;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$c;

    return-object p1

    :cond_8
    sget-object p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;

    return-object p1

    :cond_9
    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_c

    instance-of v0, p1, Lu02/a$b$a;

    if-eqz v0, :cond_b

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    const/16 v0, 0x194

    if-eq p1, v0, :cond_a

    goto :goto_5

    :cond_a
    sget-object p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;

    return-object p1

    :cond_b
    :goto_5
    sget-object p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$a;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$a;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    :goto_6
    sget-object p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$a;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$a;

    return-object p1
.end method


# virtual methods
.method public final A(ZLxg3/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lxg3/g<",
            "Lqm2/l;",
            ">;)V"
        }
    .end annotation

    const-string v0, "viewEvents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->K:Z

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object p1

    invoke-virtual {p2, p1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance p2, Lpf/b;

    const/16 v0, 0xf

    invoke-direct {p2, p0, v0}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lo52/m0;

    const/16 v1, 0xe

    invoke-direct {v0, p2, v1}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method public final D()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final E(Lc93/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onSuccess"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->G:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v3, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;

    const/4 v8, 0x0

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lc93/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final I(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->H:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "membership-adjustment-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/f$b;

    return-object p1
.end method

.method public final K()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->G:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->G0()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->F:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->l()V

    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Lst0/v;)V
    .locals 7

    const-string v0, "strapSerial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapSignature"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Ljava/lang/String;Ljava/lang/String;Lst0/v;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final z()Landroidx/lifecycle/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/u0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->J:Landroidx/lifecycle/u0;

    return-object v0
.end method
