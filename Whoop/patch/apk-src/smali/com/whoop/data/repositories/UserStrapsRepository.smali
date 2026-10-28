.class public final Lcom/whoop/data/repositories/UserStrapsRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0008\u0008\u0002\u0010\"\u001a\u00020\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\'R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010)R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u001d\u00104\u001a\u0008\u0012\u0004\u0012\u000200038\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u001a\u0010;\u001a\u00020\u00168FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008:\u0010\u0014\u001a\u0004\u00088\u00109R\u0016\u0010?\u001a\u0004\u0018\u00010<8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u0011\u0010A\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008@\u00109\u00a8\u0006C\u00b2\u0006\u000c\u0010B\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/data/repositories/UserStrapsRepository;",
        "",
        "Lod1/u;",
        "userContext",
        "Ltd1/b;",
        "whoopStrap",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "remoteDataSource",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "membershipV2Api",
        "Lbc3/c0;",
        "coroutineScope",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "<init>",
        "(Lod1/u;Ltd1/b;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lbc3/c0;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/FeatureFlagRepository;)V",
        "Ll83/a0;",
        "retrieveCachedStrapGenerationStatus",
        "()V",
        "observeUserAndStrapUpdates",
        "",
        "recordUserStrap",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/WhoopStrapInfo;",
        "strapInfo",
        "shouldRecordStrap",
        "(Lcom/whoop/domain/model/WhoopStrapInfo;)Z",
        "fetchUserStraps",
        "Lcom/whoop/data/remote/domain/response/growth/UserStraps;",
        "userStraps",
        "updateStrapGenerationStatus",
        "(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)V",
        "mustFetch",
        "updateUserStrapsData",
        "(Z)V",
        "Lod1/u;",
        "Ltd1/b;",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "Lbc3/c0;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
        "Lec3/p1;",
        "Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;",
        "_strapGenerationStatus",
        "Lec3/p1;",
        "Lec3/f2;",
        "strapGenerationStatus",
        "Lec3/f2;",
        "getStrapGenerationStatus",
        "()Lec3/f2;",
        "getUsingHarvard",
        "()Z",
        "getUsingHarvard$annotations",
        "usingHarvard",
        "",
        "getLastRecordedStrapSerial",
        "()Ljava/lang/String;",
        "lastRecordedStrapSerial",
        "getUsingCopley",
        "usingCopley",
        "previouslyUsedOlderGen",
        "core_release"
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
.field private final _strapGenerationStatus:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lbc3/c0;

.field private final featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final logger:Ltr2/n;

.field private final membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

.field private final preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field private final remoteDataSource:Lcom/whoop/data/remote/RemoteDataSource;

.field private final strapGenerationStatus:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final userContext:Lod1/u;

.field private final whoopStrap:Ltd1/b;


# direct methods
.method public constructor <init>(Lod1/u;Ltd1/b;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lbc3/c0;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/FeatureFlagRepository;)V
    .locals 1

    const-string v0, "userContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteDataSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipV2Api"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->userContext:Lod1/u;

    iput-object p2, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->whoopStrap:Ltd1/b;

    iput-object p3, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->remoteDataSource:Lcom/whoop/data/remote/RemoteDataSource;

    iput-object p4, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

    iput-object p5, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->coroutineScope:Lbc3/c0;

    iput-object p6, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iput-object p7, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "UserStrapsRepository"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->logger:Ltr2/n;

    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_NO_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->_strapGenerationStatus:Lec3/p1;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->strapGenerationStatus:Lec3/f2;

    invoke-direct {p0}, Lcom/whoop/data/repositories/UserStrapsRepository;->retrieveCachedStrapGenerationStatus()V

    invoke-direct {p0}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates()V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/data/repositories/UserStrapsRepository;Lod1/u$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$2(Lcom/whoop/data/repositories/UserStrapsRepository;Lod1/u$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchUserStraps(Lcom/whoop/data/repositories/UserStrapsRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->fetchUserStraps(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/repositories/UserStrapsRepository;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getPreferenceHelper$p(Lcom/whoop/data/repositories/UserStrapsRepository;)Lcom/whoop/data/local/prefs/PreferenceHelper;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    return-object p0
.end method

.method public static final synthetic access$getRemoteDataSource$p(Lcom/whoop/data/repositories/UserStrapsRepository;)Lcom/whoop/data/remote/RemoteDataSource;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->remoteDataSource:Lcom/whoop/data/remote/RemoteDataSource;

    return-object p0
.end method

.method public static final synthetic access$recordUserStrap(Lcom/whoop/data/repositories/UserStrapsRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->recordUserStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/repositories/UserStrapsRepository;Ltd1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$6(Lcom/whoop/data/repositories/UserStrapsRepository;Ltd1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(La11/g;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lod1/u$a;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$0(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/data/repositories/e;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/repositories/UserStrapsRepository;->updateStrapGenerationStatus$lambda$0(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)Z

    move-result p0

    return p0
.end method

.method private final fetchUserStraps(Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p1, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;

    iget v1, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/UserStrapsRepository;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->I$0:I

    iput v3, v0, Lcom/whoop/data/repositories/UserStrapsRepository$fetchUserStraps$1;->label:I

    invoke-interface {p1, v0}, Lcom/whoop/service/network/MembershipV2Api;->fetchUserStraps(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;

    invoke-static {p1}, Lcom/whoop/data/remote/domain/response/growth/UserStrapsKt;->toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;)Lcom/whoop/data/remote/domain/response/growth/UserStraps;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/remote/domain/response/growth/UserStraps;

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/UserStrapsRepository;->updateStrapGenerationStatus(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)V

    :cond_4
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v3, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->logger:Ltr2/n;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "Error fetching user straps"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic g(Lcom/whoop/data/repositories/e;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final getLastRecordedStrapSerial()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "LastRecordedStrapSerial"

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getUsingHarvard$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic h(Lcom/whoop/data/repositories/f;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ltd1/e;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/repositories/UserStrapsRepository;->observeUserAndStrapUpdates$lambda$4(Ltd1/e;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final observeUserAndStrapUpdates()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->userContext:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->j()Lxg3/g;

    move-result-object v0

    new-instance v1, La11/g;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->n(Lbh3/g;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/e;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/16 v3, 0x8

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->whoopStrap:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->i()Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->n(Lbh3/g;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/e;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/16 v3, 0x9

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method private static final observeUserAndStrapUpdates$lambda$0(Lod1/u$a;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Lod1/u$a;->d()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final observeUserAndStrapUpdates$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final observeUserAndStrapUpdates$lambda$2(Lcom/whoop/data/repositories/UserStrapsRepository;Lod1/u$a;)Ll83/a0;
    .locals 2

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/whoop/data/repositories/UserStrapsRepository;->updateUserStrapsData$default(Lcom/whoop/data/repositories/UserStrapsRepository;ZILjava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final observeUserAndStrapUpdates$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final observeUserAndStrapUpdates$lambda$4(Ltd1/e;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Ltd1/e;->isReady()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final observeUserAndStrapUpdates$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final observeUserAndStrapUpdates$lambda$6(Lcom/whoop/data/repositories/UserStrapsRepository;Ltd1/e;)Ll83/a0;
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->updateUserStrapsData(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final observeUserAndStrapUpdates$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final recordUserStrap(Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;

    iget v1, v0, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->label:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object v0, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;

    iget-object v0, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v1, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->I$0:I

    iget-object v2, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;

    iget-object v2, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->whoopStrap:Ltd1/b;

    invoke-interface {p1}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->shouldRecordStrap(Lcom/whoop/domain/model/WhoopStrapInfo;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v10

    :goto_2
    if-eqz p1, :cond_7

    new-instance v1, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getCpuId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v4, v2

    iget-object v2, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->logger:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$response$2$1;

    invoke-direct {v5, p0, v3, v10}, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$response$2$1;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)V

    iput-object p1, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$0:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$1:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->I$0:I

    iput v4, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->label:I

    const/4 v3, 0x0

    const-string v4, "Error recording user strap"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto :goto_4

    :cond_5
    move-object v2, p1

    move-object p1, v1

    move v1, v11

    :goto_3
    check-cast p1, Lu02/a;

    new-instance v3, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$response$2$2;

    invoke-direct {v3, p0, v2, v10}, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$response$2$2;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    iput-object v10, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$0:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->L$1:Ljava/lang/Object;

    iput v1, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->I$0:I

    iput v9, v6, Lcom/whoop/data/repositories/UserStrapsRepository$recordUserStrap$1;->label:I

    invoke-static {p1, v3, v6}, Lu02/b;->g(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_4
    return-object v0

    :cond_6
    :goto_5
    move-object v10, p1

    check-cast v10, Lu02/a;

    :cond_7
    instance-of p1, v10, Lu02/a$c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final retrieveCachedStrapGenerationStatus()V
    .locals 7

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "StrapGenerationStatus"

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->values()[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v2, :cond_1

    aget-object v5, v1, v3

    invoke-interface {v5}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object v5, v4

    :goto_1
    if-eqz v5, :cond_2

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->_strapGenerationStatus:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v4, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method private final shouldRecordStrap(Lcom/whoop/domain/model/WhoopStrapInfo;)Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->whoopStrap:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    invoke-virtual {v0}, Ltd1/e;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->isSerialNumberValid()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/data/repositories/UserStrapsRepository;->getLastRecordedStrapSerial()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final updateStrapGenerationStatus(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)V
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/UserStraps;->getLastSeenStrap()Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;->getGeneration()Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;->HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    new-instance v2, La6/l0;

    const/4 v4, 0x5

    invoke-direct {v2, p1, v4}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    if-eqz v0, :cond_3

    invoke-static {v2}, Lcom/whoop/data/repositories/UserStrapsRepository;->updateStrapGenerationStatus$lambda$1(Ll83/h;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->UPGRADED_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    goto :goto_4

    :cond_2
    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->NEW_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    goto :goto_4

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/UserStraps;->getPreviousStraps()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;->getGeneration()Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    move-result-object v2

    sget-object v4, Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;->HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    if-ne v2, v4, :cond_5

    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->DOWNGRADED_COPLEY:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    goto :goto_4

    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/UserStraps;->getOrderedStrap()Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;->getGeneration()Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    move-result-object p1

    goto :goto_3

    :cond_7
    move-object p1, v1

    :goto_3
    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;->HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    if-ne p1, v0, :cond_8

    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_AWAITING_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    goto :goto_4

    :cond_8
    sget-object p1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_NO_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    :goto_4
    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v2, "StrapGenerationStatus"

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->getSerializedValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->_strapGenerationStatus:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->logger:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Strap generation status set to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final updateStrapGenerationStatus$lambda$0(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/growth/UserStraps;->getPreviousStraps()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;->getGeneration()Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    move-result-object v0

    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;->KENMORE:Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    if-ne v0, v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static final updateStrapGenerationStatus$lambda$1(Ll83/h;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic updateUserStrapsData$default(Lcom/whoop/data/repositories/UserStrapsRepository;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->updateUserStrapsData(Z)V

    return-void
.end method


# virtual methods
.method public final getStrapGenerationStatus()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->strapGenerationStatus:Lec3/f2;

    return-object v0
.end method

.method public final getUsingCopley()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->strapGenerationStatus:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->getUsingCopley()Z

    move-result v0

    return v0
.end method

.method public final getUsingHarvard()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->strapGenerationStatus:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->getUsingHarvard()Z

    move-result v0

    return v0
.end method

.method public final updateUserStrapsData(Z)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/UserStrapsRepository;->coroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/UserStrapsRepository$updateUserStrapsData$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/UserStrapsRepository$updateUserStrapsData$1;-><init>(Lcom/whoop/data/repositories/UserStrapsRepository;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
