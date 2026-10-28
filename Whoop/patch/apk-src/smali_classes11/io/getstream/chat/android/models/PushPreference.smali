.class public final Lio/getstream/chat/android/models/PushPreference;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/models/PushPreference;",
        "",
        "level",
        "Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "disabledUntil",
        "Ljava/util/Date;",
        "<init>",
        "(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;)V",
        "getLevel",
        "()Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "getDisabledUntil",
        "()Ljava/util/Date;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final disabledUntil:Ljava/util/Date;

.field private final level:Lio/getstream/chat/android/models/PushPreferenceLevel;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    iput-object p2, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/PushPreference;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/models/PushPreference;->copy(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;)Lio/getstream/chat/android/models/PushPreference;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/PushPreferenceLevel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;)Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/PushPreference;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/PushPreference;-><init>(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/PushPreference;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/PushPreference;

    iget-object v1, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    iget-object v3, p1, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDisabledUntil()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    return-object v0
.end method

.method public final getLevel()Lio/getstream/chat/android/models/PushPreferenceLevel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/models/PushPreferenceLevel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/PushPreference;->level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    iget-object v1, p0, Lio/getstream/chat/android/models/PushPreference;->disabledUntil:Ljava/util/Date;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "PushPreference(level="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledUntil="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
