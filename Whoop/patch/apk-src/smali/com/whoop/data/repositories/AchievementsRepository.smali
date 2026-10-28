.class public final Lcom/whoop/data/repositories/AchievementsRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/data/repositories/AchievementsRepository;",
        "",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "remoteDataSource",
        "<init>",
        "(Ltr2/n;Lcom/whoop/data/remote/RemoteDataSource;)V",
        "",
        "levelId",
        "Lcom/whoop/data/remote/commons/Resource;",
        "",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "getAllMemberLevels",
        "(ILq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "getRemoteDataSource",
        "()Lcom/whoop/data/remote/RemoteDataSource;",
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

.field private final remoteDataSource:Lcom/whoop/data/remote/RemoteDataSource;


# direct methods
.method public constructor <init>(Ltr2/n;Lcom/whoop/data/remote/RemoteDataSource;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteDataSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/AchievementsRepository;->logger:Ltr2/n;

    iput-object p2, p0, Lcom/whoop/data/repositories/AchievementsRepository;->remoteDataSource:Lcom/whoop/data/remote/RemoteDataSource;

    return-void
.end method


# virtual methods
.method public final getAllMemberLevels(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "+",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;-><init>(Lcom/whoop/data/repositories/AchievementsRepository;ILq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getLogger()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/AchievementsRepository;->logger:Ltr2/n;

    return-object v0
.end method

.method public final getRemoteDataSource()Lcom/whoop/data/remote/RemoteDataSource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/AchievementsRepository;->remoteDataSource:Lcom/whoop/data/remote/RemoteDataSource;

    return-object v0
.end method
