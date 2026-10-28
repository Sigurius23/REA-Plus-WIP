.class public final Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static addMemberStories(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;->access$addMemberStories$jd(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static updateAllBadgeStatus(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;->access$updateAllBadgeStatus$jd(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
