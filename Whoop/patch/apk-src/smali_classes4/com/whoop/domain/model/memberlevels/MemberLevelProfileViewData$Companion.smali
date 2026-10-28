.class public final Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;",
        "",
        "<init>",
        "()V",
        "convert",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;",
        "memberLevelProfile",
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;",
        "currentLevel",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "nextLevel",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final convert(Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
    .locals 14

    const-string v0, "memberLevelProfile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentLevel"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->getMemberLevelDto()Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getLevelId()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->getMemberExperience()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getMinExperience()Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    move v4, p1

    goto :goto_0

    :cond_0
    move v4, v0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getMaxExperience()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getBadgeUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getMiniBadgeUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getTier()Ljava/lang/String;

    move-result-object v8

    if-eqz p3, :cond_1

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getMinExperience()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_1
    move v10, v0

    const/4 p1, 0x0

    if-eqz p3, :cond_2

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getLevelId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    :cond_2
    move-object v9, p1

    :goto_1
    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getBadgeUrl()Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    goto :goto_2

    :cond_3
    move-object v11, p1

    :goto_2
    if-eqz p3, :cond_4

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getMiniBadgeUrl()Ljava/lang/String;

    move-result-object p1

    :cond_4
    move-object v12, p1

    if-eqz p3, :cond_6

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getTier()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v13, p1

    goto :goto_5

    :cond_6
    :goto_4
    const-string p1, ""

    goto :goto_3

    :goto_5
    new-instance v1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    invoke-direct/range {v1 .. v13}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;-><init>(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
