.class public final Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;",
        "",
        "<init>",
        "()V",
        "convert",
        "",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "levels",
        "Lcom/whoop/domain/model/RecordsDto;",
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
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
    invoke-direct {p0}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final convert(Lcom/whoop/domain/model/RecordsDto;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;"
        }
    .end annotation

    const-string v0, "levels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/RecordsDto;->getRecords()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    new-instance v2, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getMinExperience()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getMaxExperience()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getLevelId()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getBadgeUrl()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getMiniBadgeUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->getTier()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v9, 0x1

    invoke-direct/range {v2 .. v9}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
