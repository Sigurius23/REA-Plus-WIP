.class public final Lcom/whoop/data/repositories/OnboardingRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ.\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u000e\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/data/repositories/OnboardingRepository;",
        "",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Ltd1/b;",
        "whoopStrap",
        "Lcom/whoop/service/network/MembershipV0Api;",
        "membershipV0Api",
        "<init>",
        "(Ltr2/n;Lrr2/c;Ltd1/b;Lcom/whoop/service/network/MembershipV0Api;)V",
        "",
        "getStrapGeneration",
        "()Ljava/lang/String;",
        "serialNumber",
        "strapSignature",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "fetchOnboardingInfo",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lrr2/c;",
        "Ltd1/b;",
        "Lcom/whoop/service/network/MembershipV0Api;",
        "getStrapSignature",
        "getStrapSerial",
        "strapSerial",
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
.field private final crashReporter:Lrr2/c;

.field private final logger:Ltr2/n;

.field private final membershipV0Api:Lcom/whoop/service/network/MembershipV0Api;

.field private final whoopStrap:Ltd1/b;


# direct methods
.method public constructor <init>(Ltr2/n;Lrr2/c;Ltd1/b;Lcom/whoop/service/network/MembershipV0Api;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipV0Api"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/OnboardingRepository;->logger:Ltr2/n;

    iput-object p2, p0, Lcom/whoop/data/repositories/OnboardingRepository;->crashReporter:Lrr2/c;

    iput-object p3, p0, Lcom/whoop/data/repositories/OnboardingRepository;->whoopStrap:Ltd1/b;

    iput-object p4, p0, Lcom/whoop/data/repositories/OnboardingRepository;->membershipV0Api:Lcom/whoop/service/network/MembershipV0Api;

    return-void
.end method

.method public static synthetic fetchOnboardingInfo$default(Lcom/whoop/data/repositories/OnboardingRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/repositories/OnboardingRepository;->fetchOnboardingInfo(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getStrapSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/OnboardingRepository;->whoopStrap:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public final fetchOnboardingInfo(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "received onboarding response "

    instance-of v1, p3, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;

    iget v2, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;

    invoke-direct {v1, p0, p3}, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;-><init>(Lcom/whoop/data/repositories/OnboardingRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/remote/domain/request/onboarding/StrapDetailsRequestBody;

    iget-object p2, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lcom/whoop/data/remote/domain/request/onboarding/StrapDetailsRequestBody;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapSerial()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, p1

    :goto_1
    if-nez p2, :cond_4

    invoke-direct {p0}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapSignature()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_4
    move-object v6, p2

    :goto_2
    invoke-direct {p3, v3, v6}, Lcom/whoop/data/remote/domain/request/onboarding/StrapDetailsRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/whoop/data/repositories/OnboardingRepository;->logger:Ltr2/n;

    const-string v6, "fetching onboarding info"

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v3, v6, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :try_start_1
    iget-object v3, p0, Lcom/whoop/data/repositories/OnboardingRepository;->membershipV0Api:Lcom/whoop/service/network/MembershipV0Api;

    const-string v6, "create-account"

    if-nez p1, :cond_5

    invoke-virtual {p0}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapSerial()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :catch_1
    move-exception v0

    move-object p2, v0

    move-object p1, p3

    goto :goto_5

    :cond_5
    :goto_3
    if-nez p2, :cond_6

    invoke-direct {p0}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapSignature()Ljava/lang/String;

    move-result-object p2

    :cond_6
    const/4 v7, 0x0

    iput-object v7, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->L$0:Ljava/lang/Object;

    iput-object v7, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->L$1:Ljava/lang/Object;

    iput-object p3, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->L$2:Ljava/lang/Object;

    iput v5, v1, Lcom/whoop/data/repositories/OnboardingRepository$fetchOnboardingInfo$1;->label:I

    invoke-interface {v3, v6, p1, p2, v1}, Lcom/whoop/service/network/MembershipV0Api;->fetchGetOnboardingInfoV0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v2, :cond_7

    return-object v2

    :cond_7
    move-object v8, p3

    move-object p3, p1

    move-object p1, v8

    :goto_4
    :try_start_2
    check-cast p3, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;

    iget-object p2, p0, Lcom/whoop/data/repositories/OnboardingRepository;->logger:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->toOnboardingInfoResponse()Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    move-result-object p2

    sget-object p3, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {p3, p2}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_5
    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/request/onboarding/StrapDetailsRequestBody;->getStrapSerial()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/request/onboarding/StrapDetailsRequestBody;->getStrapSignature()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to fetch onboarding info  - strapSerial "

    const-string v1, " - strapSignature "

    invoke-static {v0, p3, v1, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Lcom/whoop/data/repositories/OnboardingRepository;->logger:Ltr2/n;

    iget-object v0, p0, Lcom/whoop/data/repositories/OnboardingRepository;->crashReporter:Lrr2/c;

    invoke-static {p2, p1, p3, v0}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object v2

    sget-object v1, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object p1, Lcom/whoop/network/exception/DomainException;->x:Lcom/whoop/network/exception/DomainException$a;

    invoke-virtual {p1, p2}, Lcom/whoop/network/exception/DomainException$a;->a(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method

.method public final getStrapGeneration()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapSerial()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "unknown"

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/data/repositories/OnboardingRepository;->getStrapSerial()Ljava/lang/String;

    move-result-object v0

    const-string v1, "4"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Gen4"

    return-object v0

    :cond_1
    const-string v0, "Gen3"

    return-object v0
.end method

.method public final getStrapSerial()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/OnboardingRepository;->whoopStrap:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const-string v0, ""

    return-object v0
.end method
