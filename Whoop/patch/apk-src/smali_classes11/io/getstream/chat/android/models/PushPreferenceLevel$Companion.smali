.class public final Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/PushPreferenceLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;",
        "",
        "<init>",
        "()V",
        "all",
        "Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "getAll",
        "()Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "mentions",
        "getMentions",
        "none",
        "getNone",
        "fromValue",
        "value",
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
    invoke-direct {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromValue(Ljava/lang/String;)Lio/getstream/chat/android/models/PushPreferenceLevel;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->getAll()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/PushPreferenceLevel;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->getAll()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->getMentions()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/PushPreferenceLevel;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->getMentions()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->getNone()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/PushPreferenceLevel;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->getNone()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object p1

    return-object p1

    :cond_2
    if-nez p1, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    new-instance v0, Lio/getstream/chat/android/models/PushPreferenceLevel;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/models/PushPreferenceLevel;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final getAll()Lio/getstream/chat/android/models/PushPreferenceLevel;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/models/PushPreferenceLevel;->access$getAll$cp()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v0

    return-object v0
.end method

.method public final getMentions()Lio/getstream/chat/android/models/PushPreferenceLevel;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/models/PushPreferenceLevel;->access$getMentions$cp()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v0

    return-object v0
.end method

.method public final getNone()Lio/getstream/chat/android/models/PushPreferenceLevel;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/models/PushPreferenceLevel;->access$getNone$cp()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v0

    return-object v0
.end method
