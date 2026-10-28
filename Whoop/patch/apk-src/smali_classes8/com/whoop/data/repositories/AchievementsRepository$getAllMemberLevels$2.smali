.class final Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/AchievementsRepository;->getAllMemberLevels(ILq83/d;)Ljava/lang/Object;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/data/remote/commons/Resource;",
        "",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.AchievementsRepository$getAllMemberLevels$2"
    f = "AchievementsRepository.kt"
    l = {
        0x16
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $levelId:I

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/AchievementsRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/AchievementsRepository;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/AchievementsRepository;",
            "I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->this$0:Lcom/whoop/data/repositories/AchievementsRepository;

    iput p2, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->$levelId:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;

    iget-object v0, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->this$0:Lcom/whoop/data/repositories/AchievementsRepository;

    iget v1, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->$levelId:I

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;-><init>(Lcom/whoop/data/repositories/AchievementsRepository;ILq83/d;)V

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
            "Lcom/whoop/data/remote/commons/Resource<",
            "+",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->this$0:Lcom/whoop/data/repositories/AchievementsRepository;

    invoke-virtual {p1}, Lcom/whoop/data/repositories/AchievementsRepository;->getRemoteDataSource()Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object p1

    iget v1, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->$levelId:I

    iput v2, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->label:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/data/remote/RemoteDataSource;->getAllProgressLevels(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object v1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->Companion:Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;

    invoke-virtual {v1, p1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;->convert(Lcom/whoop/domain/model/RecordsDto;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_1
    iget-object p1, p0, Lcom/whoop/data/repositories/AchievementsRepository$getAllMemberLevels$2;->this$0:Lcom/whoop/data/repositories/AchievementsRepository;

    invoke-virtual {p1}, Lcom/whoop/data/repositories/AchievementsRepository;->getLogger()Ltr2/n;

    move-result-object v2

    const/16 v4, 0x8

    const/4 v5, 0x0

    const-string v1, "Error fetching all member levels"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    sget-object v6, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method
