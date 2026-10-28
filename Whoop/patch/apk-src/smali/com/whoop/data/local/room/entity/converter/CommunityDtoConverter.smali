.class public final Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;",
        "",
        "<init>",
        "()V",
        "fromCommunityDto",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "value",
        "",
        "communityDtoToString",
        "dto",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final communityDtoToString(Lcom/whoop/domain/model/teams/CommunityDto;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final fromCommunityDto(Ljava/lang/String;)Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-class v0, Lcom/whoop/domain/model/teams/CommunityDto;

    invoke-static {p1, v0}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/domain/model/teams/CommunityDto;

    return-object p1
.end method
