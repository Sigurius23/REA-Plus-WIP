.class public final Laq0/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laq0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Laq0/q$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/domain/model/teams/Team;",
        "team",
        "",
        "parentMessageId",
        "widgetUrl",
        "Laq0/q;",
        "a",
        "(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;Ljava/lang/String;)Laq0/q;",
        "KEY_WIDGET_URL",
        "Ljava/lang/String;",
        "REPORT_ABUSE",
        "REPORT_INAPPROPRIATE",
        "Lyb3/p;",
        "GIPHY_COMMAND_REGEX",
        "Lyb3/p;",
        "community_release"
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
    invoke-direct {p0}, Laq0/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;Ljava/lang/String;)Laq0/q;
    .locals 5

    const-string v0, "team"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laq0/q;

    invoke-direct {v0}, Laq0/q;-><init>()V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/ChatChannel;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const-string v4, "channelId"

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/ChatChannel;->getType()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    const-string v4, "channelType"

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/ChatChannel;->getCid()Ljava/lang/String;

    move-result-object v3

    :cond_2
    const-string v2, "cid"

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "parentMessageId"

    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object p2

    const-string v1, "chatTeamId"

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object p2

    const-string v1, "chatTeamIconUrl"

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Laq0/q;->O0(Laq0/q;)Landroid/os/Bundle;

    move-result-object p1

    const-string p2, "widgetUrl"

    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
