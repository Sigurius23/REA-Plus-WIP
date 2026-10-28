.class public final Lrv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0086@\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\"H\u0086@\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0019\u0010&\u001a\u00020\u00182\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010(H\u0086@\u00a2\u0006\u0004\u0008)\u0010\u001cJ$\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020*2\u0008\u0008\u0002\u0010-\u001a\u00020,H\u0086@\u00a2\u0006\u0004\u0008/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0004\u00081\u00102J \u00106\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0082@\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u00088\u0010\u001cJ\u0019\u0010;\u001a\u00020\u00182\u0008\u0010:\u001a\u0004\u0018\u000109H\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u000109H\u0002\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u0008?\u0010\u001cJ\u0019\u0010B\u001a\u00020\u00182\u0008\u0010A\u001a\u0004\u0018\u00010@H\u0002\u00a2\u0006\u0004\u0008B\u0010CJ\u000f\u0010D\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008D\u0010\u001eJ\u0011\u0010E\u001a\u0004\u0018\u00010@H\u0002\u00a2\u0006\u0004\u0008E\u0010FJ\u0019\u0010G\u001a\u00020\u00182\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0004\u0008G\u0010\'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010KR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u001a\u0010^\u001a\u0008\u0012\u0004\u0012\u00020$0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010]R\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010]R\u0017\u0010d\u001a\u0008\u0012\u0004\u0012\u00020$0b8F\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010cR\u0019\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090b8F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010cR\u0019\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0b8F\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010cR\u0014\u0010h\u001a\u0002038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010gR\u0014\u0010j\u001a\u0002038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008i\u0010gR\u0014\u0010k\u001a\u0002038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010g\u00a8\u0006l"
    }
    d2 = {
        "Lrv1/a;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lod1/u;",
        "userContext",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "remoteDataSource",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "membershipV2Api",
        "Lcom/whoop/service/network/RmaServiceApi;",
        "rmaServiceApi",
        "Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;",
        "reactivationModalApi",
        "Lcom/whoop/payments/domain/PaymentsApi;",
        "paymentsApi",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Lbc3/c0;",
        "applicationCoroutineScope",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lod1/u;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lcom/whoop/service/network/RmaServiceApi;Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;Lcom/whoop/payments/domain/PaymentsApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "u",
        "(Lq83/d;)Ljava/lang/Object;",
        "M",
        "()V",
        "",
        "Lcom/whoop/payments/domain/models/PaymentsResponse;",
        "y",
        "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;",
        "A",
        "Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;",
        "info",
        "R",
        "(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V",
        "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;",
        "z",
        "",
        "communityId",
        "",
        "source",
        "Lcom/whoop/service/network/model/WhoopOffer;",
        "B",
        "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "O",
        "()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;",
        "",
        "commitStatus",
        "commitAffiliate",
        "w",
        "(ZZLq83/d;)Ljava/lang/Object;",
        "v",
        "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;",
        "status",
        "S",
        "(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V",
        "P",
        "()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;",
        "t",
        "Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;",
        "affiliate",
        "Q",
        "(Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;)V",
        "r",
        "N",
        "()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;",
        "q",
        "Lod1/u;",
        "x",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "Lcom/whoop/service/network/RmaServiceApi;",
        "E",
        "Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;",
        "F",
        "Lcom/whoop/payments/domain/PaymentsApi;",
        "G",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "H",
        "Lbc3/c0;",
        "I",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "J",
        "Ltr2/n;",
        "logger",
        "Landroidx/lifecycle/u0;",
        "K",
        "Landroidx/lifecycle/u0;",
        "_membershipInfoLiveData",
        "L",
        "_membershipStatusLiveData",
        "_affiliateLiveData",
        "Landroidx/lifecycle/p0;",
        "()Landroidx/lifecycle/p0;",
        "membershipInfoLiveData",
        "membershipStatusLiveData",
        "affiliateLiveData",
        "()Z",
        "statusFromMsv2",
        "D",
        "affiliateFromMsv2",
        "skipMsv1",
        "membership_release"
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
.field private final E:Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

.field private final F:Lcom/whoop/payments/domain/PaymentsApi;

.field private final G:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field private final H:Lbc3/c0;

.field private final I:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final J:Ltr2/n;

.field private final K:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final L:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final M:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final w:Lod1/u;

.field private final x:Lcom/whoop/data/remote/RemoteDataSource;

.field private final y:Lcom/whoop/service/network/MembershipV2Api;

.field private final z:Lcom/whoop/service/network/RmaServiceApi;


# direct methods
.method public constructor <init>(Lod1/u;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lcom/whoop/service/network/RmaServiceApi;Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;Lcom/whoop/payments/domain/PaymentsApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "userContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteDataSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipV2Api"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rmaServiceApi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactivationModalApi"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentsApi"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationCoroutineScope"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv1/a;->w:Lod1/u;

    iput-object p2, p0, Lrv1/a;->x:Lcom/whoop/data/remote/RemoteDataSource;

    iput-object p3, p0, Lrv1/a;->y:Lcom/whoop/service/network/MembershipV2Api;

    iput-object p4, p0, Lrv1/a;->z:Lcom/whoop/service/network/RmaServiceApi;

    iput-object p5, p0, Lrv1/a;->E:Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    iput-object p6, p0, Lrv1/a;->F:Lcom/whoop/payments/domain/PaymentsApi;

    iput-object p7, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iput-object p8, p0, Lrv1/a;->H:Lbc3/c0;

    iput-object p9, p0, Lrv1/a;->I:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "MembershipRepository"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lrv1/a;->J:Ltr2/n;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lrv1/a;->K:Landroidx/lifecycle/u0;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lrv1/a;->L:Landroidx/lifecycle/u0;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lrv1/a;->M:Landroidx/lifecycle/u0;

    return-void
.end method

.method public static synthetic C(Lrv1/a;ILjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, "app"

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lrv1/a;->B(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final D()Z
    .locals 2

    iget-object v0, p0, Lrv1/a;->I:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "membership-affiliate-from-msv2-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private final H()Z
    .locals 2

    invoke-direct {p0}, Lrv1/a;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lrv1/a;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrv1/a;->I:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "card-expiration-status-from-msv2-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final I()Z
    .locals 2

    iget-object v0, p0, Lrv1/a;->I:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "membership-status-from-msv2-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static final K(Lrv1/a;Lod1/u$a;)Ll83/a0;
    .locals 2

    iget-object p1, p0, Lrv1/a;->J:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Clearing data"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lrv1/a;->R(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V

    invoke-direct {p0, p1}, Lrv1/a;->S(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V

    invoke-direct {p0}, Lrv1/a;->r()V

    iget-object v0, p0, Lrv1/a;->H:Lbc3/c0;

    new-instance v1, Lrv1/a$o;

    invoke-direct {v1, p0, p1}, Lrv1/a$o;-><init>(Lrv1/a;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, p1, p1, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final N()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;
    .locals 5

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "AffiliateType"

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/AffiliateType;->Companion:Lcom/whoop/data/remote/domain/response/growth/AffiliateType$Companion;

    invoke-virtual {v2, v0}, Lcom/whoop/data/remote/domain/response/growth/AffiliateType$Companion;->fromStringOrDefault(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/AffiliateType;

    move-result-object v0

    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;->Companion:Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus$Companion;

    iget-object v3, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v4, "AffiliateStatus"

    invoke-virtual {v3, v4}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus$Companion;->fromStringOrDefault(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;-><init>(Lcom/whoop/data/remote/domain/response/growth/AffiliateType;Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;)V

    return-object v1
.end method

.method private final P()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;
    .locals 3

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "MembershipStatus"

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsContains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->Companion:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;

    iget-object v2, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v2, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;->fromStringOrDefault(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    move-result-object v0

    return-object v0
.end method

.method private final Q(Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;)V
    .locals 4

    iget-object v0, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Affiliate set to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;->getType()Lcom/whoop/data/remote/domain/response/growth/AffiliateType;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/growth/AffiliateType;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const-string v3, "AffiliateType"

    invoke-virtual {v0, v3, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;->getStatus()Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;->getValue()Ljava/lang/String;

    move-result-object v1

    :cond_1
    const-string v2, "AffiliateStatus"

    invoke-virtual {v0, v2, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "AffiliateCached"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putBooleanValueIntoMainPrefs(Ljava/lang/String;Z)V

    iget-object v0, p0, Lrv1/a;->M:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final S(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V
    .locals 3

    iget-object v0, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Membership status set to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v0, "MembershipStatus"

    if-nez p1, :cond_0

    iget-object v1, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whoop/data/local/prefs/PreferenceHelper;->removeFromMainPrefs([Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lrv1/a;->L:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lrv1/a;Lod1/u$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrv1/a;->K(Lrv1/a;Lod1/u$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrf/p;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrv1/a;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic c(Lrv1/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lrv1/a;->t(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lrv1/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lrv1/a;->v(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lrv1/a;ZZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrv1/a;->w(ZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lrv1/a;)Z
    .locals 0

    invoke-direct {p0}, Lrv1/a;->D()Z

    move-result p0

    return p0
.end method

.method public static final synthetic g(Lrv1/a;)Lcom/whoop/service/network/MembershipV2Api;
    .locals 0

    iget-object p0, p0, Lrv1/a;->y:Lcom/whoop/service/network/MembershipV2Api;

    return-object p0
.end method

.method public static final synthetic j(Lrv1/a;)Lcom/whoop/payments/domain/PaymentsApi;
    .locals 0

    iget-object p0, p0, Lrv1/a;->F:Lcom/whoop/payments/domain/PaymentsApi;

    return-object p0
.end method

.method public static final synthetic l(Lrv1/a;)Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;
    .locals 0

    iget-object p0, p0, Lrv1/a;->E:Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    return-object p0
.end method

.method public static final synthetic n(Lrv1/a;)Lcom/whoop/service/network/RmaServiceApi;
    .locals 0

    iget-object p0, p0, Lrv1/a;->z:Lcom/whoop/service/network/RmaServiceApi;

    return-object p0
.end method

.method public static final synthetic o(Lrv1/a;)Z
    .locals 0

    invoke-direct {p0}, Lrv1/a;->H()Z

    move-result p0

    return p0
.end method

.method public static final synthetic p(Lrv1/a;)Z
    .locals 0

    invoke-direct {p0}, Lrv1/a;->I()Z

    move-result p0

    return p0
.end method

.method private final q(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V
    .locals 8

    if-nez p1, :cond_0

    iget-object p1, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v6, "SubscriptionType"

    const-string v7, "AnnualSavings"

    const-string v0, "CheckoutOrigin"

    const-string v1, "NextBillDate"

    const-string v2, "SubscriptionExpiration"

    const-string v3, "UpgradeStatus"

    const-string v4, "UpgradeOrderStatusUrl"

    const-string v5, "UpcycleStatus"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/whoop/data/local/prefs/PreferenceHelper;->removeFromMainPrefs([Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;->getCheckoutOrigin()Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->getSerializedValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CheckoutOrigin"

    invoke-virtual {v0, v2, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "NextBillDate"

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;->getNextBillDateTimestamp()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final r()V
    .locals 4

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "AffiliateStatus"

    const-string v2, "AffiliateCached"

    const-string v3, "AffiliateType"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->removeFromMainPrefs([Ljava/lang/String;)V

    iget-object v0, p0, Lrv1/a;->M:Landroidx/lifecycle/u0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final t(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrv1/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrv1/a$a;

    iget v1, v0, Lrv1/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrv1/a$a;

    invoke-direct {v0, p0, p1}, Lrv1/a$a;-><init>(Lrv1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lrv1/a$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrv1/a$a;->z:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget v0, v6, Lrv1/a$a;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrv1/a;->J:Ltr2/n;

    const-string v1, "Fetching affiliate"

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {p1}, Lod1/u;->g()I

    move-result p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v5, Lrv1/a$b;

    invoke-direct {v5, p0, v9}, Lrv1/a$b;-><init>(Lrv1/a;Lq83/d;)V

    iput p1, v6, Lrv1/a$a;->w:I

    iput v3, v6, Lrv1/a$a;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch affiliate"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_7

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;->toMembershipAffiliate()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    move-result-object v9

    if-nez v9, :cond_5

    :cond_4
    return-object v2

    :cond_5
    iget-object p1, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {p1}, Lod1/u;->g()I

    move-result p1

    if-eq p1, v0, :cond_6

    iget-object p1, p0, Lrv1/a;->J:Ltr2/n;

    const-string v0, "Active user changed during affiliate fetch; discarding response"

    new-array v1, v10, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2

    :cond_6
    invoke-direct {p0, v9}, Lrv1/a;->Q(Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;)V

    return-object v2

    :cond_7
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_8

    return-object v2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final v(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrv1/a$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrv1/a$d;

    iget v1, v0, Lrv1/a$d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$d;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrv1/a$d;

    invoke-direct {v0, p0, p1}, Lrv1/a$d;-><init>(Lrv1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lrv1/a$d;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrv1/a$d;->z:I

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget v0, v6, Lrv1/a$d;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrv1/a;->J:Ltr2/n;

    const-string v1, "Fetching membership status"

    new-array v3, v9, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {p1}, Lod1/u;->g()I

    move-result p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v5, Lrv1/a$e;

    invoke-direct {v5, p0, v10}, Lrv1/a$e;-><init>(Lrv1/a;Lq83/d;)V

    iput p1, v6, Lrv1/a$d;->w:I

    iput v3, v6, Lrv1/a$d;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch membership status"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_4

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->Companion:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;

    invoke-virtual {v1, p1}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;->fromStringOrDefault(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    move-result-object v10

    goto :goto_3

    :cond_4
    instance-of v1, p1, Lu02/a$b$a;

    if-eqz v1, :cond_5

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    const/16 v1, 0x194

    if-ne p1, v1, :cond_6

    sget-object v10, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->INVALID:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    goto :goto_3

    :cond_5
    instance-of p1, p1, Lu02/a$b$b;

    if-eqz p1, :cond_9

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    if-nez v10, :cond_7

    return-object p1

    :cond_7
    iget-object v1, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {v1}, Lod1/u;->g()I

    move-result v1

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lrv1/a;->J:Ltr2/n;

    const-string v1, "Active user changed during membership status fetch; discarding response"

    new-array v2, v9, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1

    :cond_8
    invoke-direct {p0, v10}, Lrv1/a;->S(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final w(ZZLq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lrv1/a$f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lrv1/a$f;

    iget v1, v0, Lrv1/a$f;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$f;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrv1/a$f;

    invoke-direct {v0, p0, p3}, Lrv1/a$f;-><init>(Lrv1/a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lrv1/a$f;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrv1/a$f;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget p1, v0, Lrv1/a$f;->y:I

    iget-boolean p2, v0, Lrv1/a$f;->x:Z

    iget-boolean v0, v0, Lrv1/a$f;->w:Z

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v4, p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lrv1/a;->J:Ltr2/n;

    const-string v2, "Fetching membership info"

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {p3, v2, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p3, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {p3}, Lod1/u;->g()I

    move-result p3

    :try_start_1
    iget-object v2, p0, Lrv1/a;->x:Lcom/whoop/data/remote/RemoteDataSource;

    iput-boolean p1, v0, Lrv1/a$f;->w:Z

    iput-boolean p2, v0, Lrv1/a$f;->x:Z

    iput p3, v0, Lrv1/a$f;->y:I

    iput v5, v0, Lrv1/a$f;->F:I

    invoke-interface {v2, v0}, Lcom/whoop/data/remote/RemoteDataSource;->getMembershipInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v10, v0

    move v0, p1

    move p1, p3

    move-object p3, v10

    :goto_1
    check-cast p3, Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;->toMembershipInfo()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;

    move-result-object v1

    iget-object v2, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {v2}, Lod1/u;->g()I

    move-result v2

    if-eq v2, p1, :cond_4

    iget-object p1, p0, Lrv1/a;->J:Ltr2/n;

    const-string p2, "Active user changed during membership fetch; discarding response"

    new-array p3, v4, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_4
    invoke-virtual {p0, v1}, Lrv1/a;->R(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;->getMembershipStatus()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    move-result-object p1

    invoke-direct {p0, p1}, Lrv1/a;->S(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;->toMembershipAffiliate()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    move-result-object p1

    invoke-direct {p0, p1}, Lrv1/a;->Q(Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v6, p0, Lrv1/a;->J:Ltr2/n;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-string v5, "Error fetching membership info for user"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    :cond_6
    :goto_3
    return-object v3
.end method


# virtual methods
.method public final A(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrv1/a$k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrv1/a$k;

    iget v1, v0, Lrv1/a$k;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$k;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrv1/a$k;

    invoke-direct {v0, p0, p1}, Lrv1/a$k;-><init>(Lrv1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lrv1/a$k;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrv1/a$k;->y:I

    const/4 v9, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v5, Lrv1/a$l;

    invoke-direct {v5, p0, v9}, Lrv1/a$l;-><init>(Lrv1/a;Lq83/d;)V

    iput p1, v6, Lrv1/a$k;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_4

    return-object v9

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/network/model/TrialDetailsModel;

    invoke-virtual {p1}, Lcom/whoop/service/network/model/TrialDetailsModel;->toTrialDetails()Lcom/whoop/data/remote/domain/response/growth/TrialDetails;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final B(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/WhoopOffer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lrv1/a$m;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lrv1/a$m;

    iget v1, v0, Lrv1/a$m;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$m;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrv1/a$m;

    invoke-direct {v0, p0, p3}, Lrv1/a$m;-><init>(Lrv1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lrv1/a$m;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrv1/a$m;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lrv1/a$m;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v5, Lrv1/a$n;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, p2, v3}, Lrv1/a$n;-><init>(Lrv1/a;ILjava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lrv1/a$m;->x:Ljava/lang/Object;

    iput p1, v6, Lrv1/a$m;->w:I

    iput p3, v6, Lrv1/a$m;->E:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    invoke-static {p3}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lrv1/a;->M:Landroidx/lifecycle/u0;

    return-object v0
.end method

.method public final F()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lrv1/a;->K:Landroidx/lifecycle/u0;

    return-object v0
.end method

.method public final G()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lrv1/a;->L:Landroidx/lifecycle/u0;

    return-object v0
.end method

.method public final M()V
    .locals 4

    iget-object v0, p0, Lrv1/a;->H:Lbc3/c0;

    new-instance v1, Lrv1/a$s;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lrv1/a$s;-><init>(Lrv1/a;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final O()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;
    .locals 5

    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "CheckoutOrigin"

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsContains(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v3, "MembershipStatus"

    invoke-virtual {v0, v3}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const/4 v4, 0x2

    invoke-static {v3, v1, v2, v4, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromMainPrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v4, "NextBillDate"

    invoke-virtual {v3, v4}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/AffiliateInfoDto;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;->toMembershipInfo()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;

    move-result-object v0

    return-object v0
.end method

.method public final R(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V
    .locals 3

    iget-object v0, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Membership info set to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, p1}, Lrv1/a;->q(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lrv1/a;->K:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lrv1/a;->w:Lod1/u;

    invoke-virtual {p1}, Lod1/u;->k()Lxg3/g;

    move-result-object p1

    new-instance v0, Lrf/p;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lcom/whoop/data/onboarding/c;

    const/16 v2, 0x12

    invoke-direct {v1, v0, v2}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-direct {p0}, Lrv1/a;->P()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lrv1/a;->L:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lrv1/a;->O()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lrv1/a;->K:Landroidx/lifecycle/u0;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Lrv1/a;->G:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v2, "AffiliateCached"

    invoke-virtual {v1, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsContains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lrv1/a;->M:Landroidx/lifecycle/u0;

    invoke-direct {p0}, Lrv1/a;->N()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x3

    const/4 v3, 0x0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lrv1/a;->H()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_7

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lrv1/a;->I()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lrv1/a;->H:Lbc3/c0;

    new-instance v0, Lrv1/a$q;

    invoke-direct {v0, p0, v3}, Lrv1/a$q;-><init>(Lrv1/a;Lq83/d;)V

    invoke-static {p1, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    invoke-direct {p0}, Lrv1/a;->D()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lrv1/a;->H:Lbc3/c0;

    new-instance v0, Lrv1/a$r;

    invoke-direct {v0, p0, v3}, Lrv1/a$r;-><init>(Lrv1/a;Lq83/d;)V

    invoke-static {p1, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_6
    return-void

    :cond_7
    :goto_0
    iget-object p1, p0, Lrv1/a;->H:Lbc3/c0;

    new-instance v0, Lrv1/a$p;

    invoke-direct {v0, p0, v3}, Lrv1/a$p;-><init>(Lrv1/a;Lq83/d;)V

    invoke-static {p1, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public final u(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrv1/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrv1/a$c;-><init>(Lrv1/a;Lq83/d;)V

    invoke-static {v0, p1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final y(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/payments/domain/models/PaymentsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrv1/a$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrv1/a$g;

    iget v1, v0, Lrv1/a$g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$g;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrv1/a$g;

    invoke-direct {v0, p0, p1}, Lrv1/a$g;-><init>(Lrv1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lrv1/a$g;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrv1/a$g;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v5, Lrv1/a$h;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lrv1/a$h;-><init>(Lrv1/a;Lq83/d;)V

    iput p1, v6, Lrv1/a$g;->y:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrv1/a$i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrv1/a$i;

    iget v1, v0, Lrv1/a$i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrv1/a$i;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lrv1/a$i;

    invoke-direct {v0, p0, p1}, Lrv1/a$i;-><init>(Lrv1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lrv1/a$i;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lrv1/a$i;->y:I

    const/4 v9, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lrv1/a;->J:Ltr2/n;

    new-instance v5, Lrv1/a$j;

    invoke-direct {v5, p0, v9}, Lrv1/a$j;-><init>(Lrv1/a;Lq83/d;)V

    iput p1, v6, Lrv1/a$i;->y:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch Reactivation Modal"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;

    return-object p1

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    return-object v9

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
