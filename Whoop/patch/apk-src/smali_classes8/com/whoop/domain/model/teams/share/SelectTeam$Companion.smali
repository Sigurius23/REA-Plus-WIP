.class public final Lcom/whoop/domain/model/teams/share/SelectTeam$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/share/SelectTeam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/share/SelectTeam$Companion;",
        "",
        "<init>",
        "()V",
        "fromDto",
        "Lcom/whoop/domain/model/teams/share/SelectTeam;",
        "dto",
        "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
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
    invoke-direct {p0}, Lcom/whoop/domain/model/teams/share/SelectTeam$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromDto(Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;)Lcom/whoop/domain/model/teams/share/SelectTeam;
    .locals 4

    const-string v0, "dto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/teams/share/SelectTeam;

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;->getId()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;->getAvatar()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, p1

    :goto_0
    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/domain/model/teams/share/SelectTeam;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
