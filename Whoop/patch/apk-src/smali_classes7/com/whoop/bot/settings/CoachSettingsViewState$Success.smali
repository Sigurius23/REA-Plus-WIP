.class public final Lcom/whoop/bot/settings/CoachSettingsViewState$Success;
.super Lcom/whoop/bot/settings/CoachSettingsViewState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/bot/settings/CoachSettingsViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Success"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J5\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsViewState$Success;",
        "Lcom/whoop/bot/settings/CoachSettingsViewState;",
        "displayState",
        "Lcom/whoop/bot/settings/CoachSettingsDisplayState;",
        "coachingModeState",
        "Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;",
        "concisenessState",
        "Lcom/whoop/bot/settings/CoachSettingsConciseState;",
        "recommendedActivitiesState",
        "Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;",
        "<init>",
        "(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V",
        "getDisplayState",
        "()Lcom/whoop/bot/settings/CoachSettingsDisplayState;",
        "getCoachingModeState",
        "()Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;",
        "getConcisenessState",
        "()Lcom/whoop/bot/settings/CoachSettingsConciseState;",
        "getRecommendedActivitiesState",
        "()Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

.field private final concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

.field private final displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

.field private final recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V
    .locals 1

    const-string v0, "displayState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedActivitiesState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/bot/settings/CoachSettingsViewState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    iput-object p4, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsViewState$Success;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->copy(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/bot/settings/CoachSettingsDisplayState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    return-object v0
.end method

.method public final component2()Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    return-object v0
.end method

.method public final component3()Lcom/whoop/bot/settings/CoachSettingsConciseState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    return-object v0
.end method

.method public final component4()Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    return-object v0
.end method

.method public final copy(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)Lcom/whoop/bot/settings/CoachSettingsViewState$Success;
    .locals 1

    const-string v0, "displayState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedActivitiesState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;-><init>(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    iget-object p1, p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCoachingModeState()Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    return-object v0
.end method

.method public final getConcisenessState()Lcom/whoop/bot/settings/CoachSettingsConciseState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    return-object v0
.end method

.method public final getDisplayState()Lcom/whoop/bot/settings/CoachSettingsDisplayState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    return-object v0
.end method

.method public final getRecommendedActivitiesState()Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    invoke-virtual {v0}, Lcom/whoop/bot/settings/CoachSettingsDisplayState;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/bot/settings/CoachSettingsConciseState;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    invoke-virtual {v1}, Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->displayState:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->coachingModeState:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    iget-object v2, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->concisenessState:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    iget-object v3, p0, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;->recommendedActivitiesState:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Success(displayState="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", coachingModeState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", concisenessState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", recommendedActivitiesState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
