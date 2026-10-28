.class public final Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;",
        "",
        "<init>",
        "()V",
        "fromTeamType",
        "",
        "teamType",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "toTeamType",
        "value",
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
.method public final fromTeamType(Lcom/whoop/domain/model/teams/TeamType;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamType;->getValue()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamType;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toTeamType(Ljava/lang/String;)Lcom/whoop/domain/model/teams/TeamType;
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v1, p1, v0, v2}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "all"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/domain/model/teams/TeamType;->ALL:Lcom/whoop/domain/model/teams/TeamType;

    return-object p1

    :cond_0
    const-string v0, "elite"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/domain/model/teams/TeamType;->ELITE:Lcom/whoop/domain/model/teams/TeamType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    return-object p1
.end method
