.class public final Lio/getstream/android/video/generated/models/LimitsSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u000e\u0008\u0003\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010JB\u0010\u0018\u001a\u00020\u00002\u000e\u0008\u0003\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0004H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000e\u0010\u000cR\u0015\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/LimitsSettingsResponse;",
        "",
        "maxParticipantsExcludeRoles",
        "",
        "",
        "maxDurationSeconds",
        "",
        "maxParticipants",
        "maxParticipantsExcludeOwner",
        "",
        "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V",
        "getMaxDurationSeconds",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMaxParticipants",
        "getMaxParticipantsExcludeOwner",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getMaxParticipantsExcludeRoles",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/LimitsSettingsResponse;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final maxDurationSeconds:Ljava/lang/Integer;

.field private final maxParticipants:Ljava/lang/Integer;

.field private final maxParticipantsExcludeOwner:Ljava/lang/Boolean;

.field private final maxParticipantsExcludeRoles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "max_participants_exclude_roles"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_duration_seconds"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_participants"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "max_participants_exclude_owner"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "maxParticipantsExcludeRoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 7
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/LimitsSettingsResponse;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/LimitsSettingsResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->copy(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/LimitsSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/LimitsSettingsResponse;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "max_participants_exclude_roles"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_duration_seconds"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_participants"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "max_participants_exclude_owner"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/getstream/android/video/generated/models/LimitsSettingsResponse;"
        }
    .end annotation

    const-string v0, "maxParticipantsExcludeRoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMaxDurationSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMaxParticipants()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMaxParticipantsExcludeOwner()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMaxParticipantsExcludeRoles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeRoles:Ljava/util/List;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxDurationSeconds:Ljava/lang/Integer;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipants:Ljava/lang/Integer;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/LimitsSettingsResponse;->maxParticipantsExcludeOwner:Ljava/lang/Boolean;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "LimitsSettingsResponse(maxParticipantsExcludeRoles="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxDurationSeconds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxParticipants="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxParticipantsExcludeOwner="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
