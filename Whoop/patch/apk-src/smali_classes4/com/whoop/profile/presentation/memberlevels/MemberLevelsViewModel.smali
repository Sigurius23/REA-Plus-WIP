.class public final Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/data/repositories/AchievementsRepository;",
        "achievementsRepository",
        "Lsr2/y;",
        "urlProvider",
        "<init>",
        "(Lcom/whoop/data/repositories/AchievementsRepository;Lsr2/y;)V",
        "",
        "levelId",
        "Ll83/a0;",
        "getMemberLevels",
        "(I)V",
        "Lcom/whoop/data/repositories/AchievementsRepository;",
        "Landroidx/lifecycle/u0;",
        "",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "_memberLevelsLiveData",
        "Landroidx/lifecycle/u0;",
        "",
        "profileHelpUrl",
        "Ljava/lang/String;",
        "getProfileHelpUrl",
        "()Ljava/lang/String;",
        "Landroidx/lifecycle/p0;",
        "getMemberLevelsLiveData",
        "()Landroidx/lifecycle/p0;",
        "memberLevelsLiveData",
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
.field private final _memberLevelsLiveData:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final achievementsRepository:Lcom/whoop/data/repositories/AchievementsRepository;

.field private final profileHelpUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/AchievementsRepository;Lsr2/y;)V
    .locals 1

    const-string v0, "achievementsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->achievementsRepository:Lcom/whoop/data/repositories/AchievementsRepository;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->_memberLevelsLiveData:Landroidx/lifecycle/u0;

    invoke-virtual {p2}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "/url-mapping-service/v1/PROFILE_LEVELS"

    invoke-static {p1, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->profileHelpUrl:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getAchievementsRepository$p(Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;)Lcom/whoop/data/repositories/AchievementsRepository;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->achievementsRepository:Lcom/whoop/data/repositories/AchievementsRepository;

    return-object p0
.end method

.method public static final synthetic access$get_memberLevelsLiveData$p(Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;)Landroidx/lifecycle/u0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->_memberLevelsLiveData:Landroidx/lifecycle/u0;

    return-object p0
.end method


# virtual methods
.method public final getMemberLevels(I)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel$getMemberLevels$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel$getMemberLevels$1;-><init>(Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final getMemberLevelsLiveData()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->_memberLevelsLiveData:Landroidx/lifecycle/u0;

    return-object v0
.end method

.method public final getProfileHelpUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;->profileHelpUrl:Ljava/lang/String;

    return-object v0
.end method
