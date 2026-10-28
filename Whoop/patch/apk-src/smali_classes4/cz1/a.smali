.class public final Lcz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcz1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "previousCount",
        "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "currentData",
        "",
        "b",
        "(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Z",
        "a",
        "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Ljava/lang/String;",
        "Ll83/a0;",
        "c",
        "(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)V",
        "Lfi0/a;",
        "milestone-pill-arch-mini_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz1/a;->a:Lfi0/a;

    return-void
.end method

.method private final a(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Lcom/whoop/navigation/AchievementsScreenModel;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/navigation/AchievementsScreenModel;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/navigation/AchievementsScreenModel;->getMilestoneType()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method private final b(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getCount()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_2
    move p2, v1

    :goto_1
    if-le p2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)V
    .locals 8

    const-string v0, "currentData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcz1/a;->a:Lfi0/a;

    invoke-direct {p0, p1, p2}, Lcz1/a;->b(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v2, "achievement_progress"

    invoke-direct {v0, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lcz1/a;->a(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "achievement_name"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    invoke-virtual {p2}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getCount()Ljava/lang/String;

    move-result-object v6

    const-string v4, "milestone_pill"

    const-string v5, "Achievements"

    const-string v2, "achievements"

    const-string v3, "view"

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
