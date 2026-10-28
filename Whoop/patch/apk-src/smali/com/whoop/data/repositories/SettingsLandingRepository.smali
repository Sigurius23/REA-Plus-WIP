.class public final Lcom/whoop/data/repositories/SettingsLandingRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/data/repositories/SettingsLandingRepository;",
        "",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "membershipV2Api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V",
        "",
        "source",
        "",
        "communityId",
        "Lcom/whoop/domain/model/ReferralContentV2;",
        "getReferralContentV2",
        "(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "getMembershipV2Api",
        "()Lcom/whoop/service/network/MembershipV2Api;",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
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
.field private final logger:Ltr2/n;

.field private final membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V
    .locals 1

    const-string v0, "membershipV2Api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/SettingsLandingRepository;->membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

    iput-object p2, p0, Lcom/whoop/data/repositories/SettingsLandingRepository;->logger:Ltr2/n;

    return-void
.end method

.method public static synthetic getReferralContentV2$default(Lcom/whoop/data/repositories/SettingsLandingRepository;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-string p1, "Individual"

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/repositories/SettingsLandingRepository;->getReferralContentV2(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getLogger()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/SettingsLandingRepository;->logger:Ltr2/n;

    return-object v0
.end method

.method public final getMembershipV2Api()Lcom/whoop/service/network/MembershipV2Api;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/SettingsLandingRepository;->membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

    return-object v0
.end method

.method public final getReferralContentV2(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/ReferralContentV2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;

    iget v1, v0, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;-><init>(Lcom/whoop/data/repositories/SettingsLandingRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->label:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    iget-object p1, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->L$0:Ljava/lang/Object;

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

    iget-object v2, p0, Lcom/whoop/data/repositories/SettingsLandingRepository;->logger:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$2;

    invoke-direct {v5, p0, p1, p2, v9}, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$2;-><init>(Lcom/whoop/data/repositories/SettingsLandingRepository;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)V

    iput-object v9, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->L$0:Ljava/lang/Object;

    iput-object v9, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->L$1:Ljava/lang/Object;

    iput p3, v6, Lcom/whoop/data/repositories/SettingsLandingRepository$getReferralContentV2$1;->label:I

    const/4 v3, 0x0

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

    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->toReferralContentV2()Lcom/whoop/domain/model/ReferralContentV2;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v9
.end method
