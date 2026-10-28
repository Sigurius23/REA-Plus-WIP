.class final Lcom/whoop/bot/settings/CoachSettingsInternalState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsInternalState;",
        "",
        "state",
        "Lcom/whoop/bot/settings/CoachSettingsDomainState;",
        "response",
        "Lcom/whoop/bot/settings/CoachSettingsResponse;",
        "lastToggle",
        "Lcom/whoop/bot/settings/InternalEvent$Toggle;",
        "<init>",
        "(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)V",
        "getState",
        "()Lcom/whoop/bot/settings/CoachSettingsDomainState;",
        "getResponse",
        "()Lcom/whoop/bot/settings/CoachSettingsResponse;",
        "getLastToggle",
        "()Lcom/whoop/bot/settings/InternalEvent$Toggle;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
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


# instance fields
.field private final lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

.field private final response:Lcom/whoop/bot/settings/CoachSettingsResponse;

.field private final state:Lcom/whoop/bot/settings/CoachSettingsDomainState;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInternalState;-><init>(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/bot/settings/CoachSettingsDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    return-object v0
.end method

.method public final component2()Lcom/whoop/bot/settings/CoachSettingsResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    return-object v0
.end method

.method public final component3()Lcom/whoop/bot/settings/InternalEvent$Toggle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    return-object v0
.end method

.method public final copy(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)Lcom/whoop/bot/settings/CoachSettingsInternalState;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInternalState;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInternalState;-><init>(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/settings/CoachSettingsInternalState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsInternalState;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    iget-object p1, p1, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLastToggle()Lcom/whoop/bot/settings/InternalEvent$Toggle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    return-object v0
.end method

.method public final getResponse()Lcom/whoop/bot/settings/CoachSettingsResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    return-object v0
.end method

.method public final getState()Lcom/whoop/bot/settings/CoachSettingsDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    invoke-virtual {v1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/bot/settings/InternalEvent$Toggle;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->state:Lcom/whoop/bot/settings/CoachSettingsDomainState;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->response:Lcom/whoop/bot/settings/CoachSettingsResponse;

    iget-object v2, p0, Lcom/whoop/bot/settings/CoachSettingsInternalState;->lastToggle:Lcom/whoop/bot/settings/InternalEvent$Toggle;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CoachSettingsInternalState(state="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastToggle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
